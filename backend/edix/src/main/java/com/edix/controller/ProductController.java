package com.edix.controller;

import com.edix.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/product")
public class ProductController {
    private final ProductService productService;

    // API 엔드포인트 메서드 추가 예정
}
