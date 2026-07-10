package br.com.andrezzac.vetcareapi.service;

import br.com.andrezzac.vetcareapi.entity.Tutor;
import br.com.andrezzac.vetcareapi.repository.TutorRepository;
import org.springframework.stereotype.Service;

@Service
public class TutorService {

    private final TutorRepository tutorRepository;

    public TutorService(TutorRepository tutorRepository){
        this.tutorRepository = tutorRepository;
    }

    public String cadastrarTutor(Tutor tutor){

        tutorRepository.save(tutor);

        return "Tutor cadastrado com sucesso!";
    }
}
