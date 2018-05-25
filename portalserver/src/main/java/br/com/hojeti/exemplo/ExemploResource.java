package br.com.hojeti.exemplo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/exemplo")
public class ExemploResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Exemplo>> lista(){
        Exemplo exemplo = new Exemplo();

        exemplo.setId(1);
        exemplo.setNome("Exemplo Request");
        exemplo.setDescricao("Exemplo de projeto com spring boot + Angular . Request Firs");

        List<Exemplo> exemplos = new ArrayList<Exemplo>();

        exemplos.add(exemplo);

        return new ResponseEntity<List<Exemplo>>(exemplos, HttpStatus.OK);
    }
}
