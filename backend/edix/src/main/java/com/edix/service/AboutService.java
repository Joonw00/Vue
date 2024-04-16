package com.edix.service;

import com.edix.model.About;
import com.edix.repository.AboutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

// AboutService.java

@Service
@RequiredArgsConstructor
public class AboutService {
    private final AboutRepository aboutRepository;
    public List<About> findAll() {
        return aboutRepository.findAll();
    }



    public Optional<About> findById(UUID id) {
        return aboutRepository.findById(id);
    }

    public About save(About about) {
        return aboutRepository.save(about);
    }

    public void deleteById(UUID id) {
        aboutRepository.deleteById(id);
    }
}