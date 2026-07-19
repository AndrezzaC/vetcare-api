package br.com.andrezzac.vetcareapi.service;

import br.com.andrezzac.vetcareapi.entity.Tutor;
import br.com.andrezzac.vetcareapi.exceptions.CpfJaCadastradoException;
import br.com.andrezzac.vetcareapi.exceptions.EmailJaCadastradoException;
import br.com.andrezzac.vetcareapi.repository.TutorRepository;
import org.springframework.stereotype.Service;

@Service
public class TutorService {

    private final TutorRepository tutorRepository;

    public TutorService(TutorRepository tutorRepository){
        this.tutorRepository = tutorRepository;
    }

    public String cadastrarTutor(Tutor tutor){

        if (tutorRepository.existsByCpf(tutor.getCpf())){
            throw new CpfJaCadastradoException("Já existe um tutor cadastrado com esse CPF");
        }

        if (tutorRepository.existsByEmail(tutor.getEmail())) {
            throw new EmailJaCadastradoException("Já existe um tutor cadastrado com esse e-mail");
        }

        tutorRepository.save(tutor);

        return "Tutor cadastrado com sucesso!";
    }
}
