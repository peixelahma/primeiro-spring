package com.juliodias.primeiro_spring.exercicios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dia20_23_Controller {

    //Aula Dia 22 - Criação de 2 endpoints
    @GetMapping("/ola")
    public String ola() {
        return "Olá ! Minha primeira API com Spring Boot";
    }

    @GetMapping("/status")
    public String status() {
        return "Aplicação Funcionando";
    }

    //Aula Dia 23 - @PathVariable e @RequestParam

    @GetMapping("/clientes/{id}")
    public String clientes(@PathVariable Long id) {
        return "Cliente Consultado: " + id;
    }

    @GetMapping("/contas/{id}/extrato")
    public String contas (
            @PathVariable Long id,
            @RequestParam(required = false) Integer mes,
            @RequestParam(required = false) Long ano) {
        return "Conta Consultado: " + id + "  " + mes + " - " + ano;
    }

    @GetMapping("/saudacao")
    public String saudacao(@RequestParam String nome) {
        return "Ola,  " + nome;
    }
}
