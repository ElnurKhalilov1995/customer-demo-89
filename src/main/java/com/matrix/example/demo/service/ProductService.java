package com.matrix.example.demo.service;

import com.matrix.example.demo.dao.repository.ProductRepository;
import com.matrix.example.demo.mapper.ProductMapper;
import com.matrix.example.demo.model.ProductDto;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDto> getProducts() {
        var productEntityList = productRepository.findAll(
                Sort.by(Sort.Direction.DESC, "price")
        );

        return productEntityList.parallelStream()
                .map(ProductMapper.INSTANCE::mapToDto)
                .toList();
    }
}
