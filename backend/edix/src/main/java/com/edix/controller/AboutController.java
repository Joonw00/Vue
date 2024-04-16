package com.edix.controller;

import com.edix.dto.AboutDTO;
import com.edix.model.About;
import com.edix.service.AboutService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/about")
public class AboutController {
    private final AboutService aboutService;
    @GetMapping
    public List<About> getAllAbouts() {
        return aboutService.findAll();
    }

    @GetMapping("/{id}")
    public About getAboutById(@PathVariable UUID id) {
        return aboutService.findById(id).orElseThrow(() -> new RuntimeException("About not found"));
    }

    @PostMapping
    public About createAbout(@RequestBody About about) {
        return aboutService.save(about);
    }

    @PutMapping("/{id}")
    public About updateAbout(@PathVariable UUID id, @RequestBody AboutDTO aboutDTO) {
        // Optional<About>에서 About 객체를 추출, 없을 경우 RuntimeException 발생
        About about = aboutService.findById(id)
                .orElseThrow(() -> new RuntimeException("About not found"));

        // DTO에서 받은 데이터로 About 객체 업데이트
        about.updateDetails(aboutDTO.getTitle(), aboutDTO.getContent());

        // 업데이트된 About 객체 저장
        return aboutService.save(about);
    }



    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAbout(@PathVariable UUID id) {
        aboutService.deleteById(id);
    }
}