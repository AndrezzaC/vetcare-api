package br.com.andrezzac.vetcareapi.repository;

import br.com.andrezzac.vetcareapi.entity.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorRepository extends JpaRepository<Tutor, Long> {

    boolean existsByCpf(String cpf);

    boolean existsByEmail(String email);
}
