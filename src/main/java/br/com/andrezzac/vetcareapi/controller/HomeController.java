package br.com.andrezzac.vetcareapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class HomeController {

    @GetMapping
    public String home(){
        return "Bem-vindo à VetCare API!";
    }
}
