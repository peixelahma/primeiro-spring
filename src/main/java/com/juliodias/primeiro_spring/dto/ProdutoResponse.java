package com.juliodias.primeiro_spring.dto;

public record ProdutoResponse(
        Long id,
        String nome,
        double preco
) {
}
