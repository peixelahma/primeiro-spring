package com.juliodias.primeiro_spring.service;

import com.juliodias.primeiro_spring.dto.ProdutoResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    public ProdutoResponse findById(Long id){
        return new ProdutoResponse(id, "Notebook Lenovo", 4500.00);
    }

    public List<ProdutoResponse>  list() {
        return List.of(
                new ProdutoResponse(1L, "Notebook Lenovo", 4500.00),
                new ProdutoResponse(2L, "Monitor Dell", 1200.00),
                new ProdutoResponse(3L, "Teclado Logitech", 350.00)
        );
    }
}
