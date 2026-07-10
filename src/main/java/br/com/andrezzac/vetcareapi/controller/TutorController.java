package br.com.andrezzac.vetcareapi.controller;

import br.com.andrezzac.vetcareapi.entity.Tutor;
import br.com.andrezzac.vetcareapi.service.TutorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tutores")
public class TutorController {

    private final TutorService tutorService;

    public TutorController(TutorService tutorService){
        this.tutorService = tutorService;
    }

    @PostMapping
    public String cadastrarTutor(@RequestBody Tutor tutor){
        return tutorService.cadastrarTutor(tutor);
    }

}

