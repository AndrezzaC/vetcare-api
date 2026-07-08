package br.com.andrezzac.vetcareapi.service;

import br.com.andrezzac.vetcareapi.repository.TutorRepository;
import org.springframework.stereotype.Service;

@Service
public class TutorService {

    private final TutorRepository tutorRepository;

    public TutorService(TutorRepository tutorRepository){
        this.tutorRepository = tutorRepository;
    }

    public String cadastrarTutor(){
        return "Cadastro recebido!";
    }
}
