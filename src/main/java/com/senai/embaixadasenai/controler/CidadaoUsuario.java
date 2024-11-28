package com.senai.embaixadasenai.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CidadaoUsuario {
    @GetMapping("")
   public String mensagen(){
    return "Hello Worldsss";
   }
}
