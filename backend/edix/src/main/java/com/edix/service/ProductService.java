package com.edix.service;

import com.edix.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// ProductService.java
@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    // 비즈니스 로직 메서드 추가 예정
}
