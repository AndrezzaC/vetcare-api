package br.com.andrezzac.vetcareapi.entity;

import br.com.andrezzac.vetcareapi.enums.ContatoPreferencial;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "tutores")
public class Tutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @NotBlank(message = "CPF é obrigatório")
    @Size(min = 11, max = 11, message = "CPF deve conter exatamente 11 caracteres")
    @CPF(message = "Digite um CPF válido")
    private String cpf;

    @NotNull(message = "Data de nascimento é obrigatória")
    @Past(message = "Informe uma data de nascimento válida no passado")
    private LocalDate dataNascimento;

    @NotNull(message = "Telefone é obrigatório")
    @Size(min = 1, message = "É necessário no mínimo um telefone cadastrado")
    private List<String> telefones;

    @NotBlank(message = "Email é obrigatório")
    @Email(message = "E-mail deve possuir um formato válido")
    private String email;

    @NotBlank(message = "Endereço é obrigatório")
    private String endereco;

    @NotNull(message = "Informe um contato preferencial")
    private ContatoPreferencial contatoPreferencial;

}
