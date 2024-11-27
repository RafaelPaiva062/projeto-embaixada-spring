package com.senai.embaixadasenai.ropository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.senai.embaixadasenai.modelo.VerificacaoCidadaoUsuario;

@RestController
@RequestMapping("/cadastro")
public class CidadaoRository {
   
    @PostMapping
    public ResponseEntity<String> criarUsuario( @RequestBody VerificacaoCidadaoUsuario verificacaoCidadaoUsuario){
     if("BR".equals(verificacaoCidadaoUsuario.getNacionalidade())|| "Brasileiro".equals(verificacaoCidadaoUsuario.getNacionalidade()) )
        {
            if (verificacaoCidadaoUsuario.getCpf() == null || !verificacaoCidadaoUsuario.getCpf().matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
                return ResponseEntity.badRequest().body("CPF é obrigatório e deve ser válido para brasileiros.");
            }
        }else{}
        return ResponseEntity.ok("Usuário criado com sucesso!");   
    }
}
