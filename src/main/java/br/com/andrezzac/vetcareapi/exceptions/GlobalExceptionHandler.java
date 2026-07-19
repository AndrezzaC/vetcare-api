package br.com.andrezzac.vetcareapi.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import tools.jackson.databind.exc.InvalidFormatException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> tratarErroValidacao(MethodArgumentNotValidException excecao){
        String mensagem = excecao
                .getBindingResult()
                .getFieldErrors()
                .getFirst()
                .getDefaultMessage();

                return ResponseEntity
                        .badRequest()
                        .body(mensagem);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<String> tratarErroLeituraJson(HttpMessageNotReadableException excecao){

        InvalidFormatException erro = (InvalidFormatException) excecao.getCause();

        String campo = erro.getPath()
                .getFirst()
                .getPropertyName();

        if("contatoPreferencial".equals(campo)){
            return ResponseEntity
                    .badRequest()
                    .body("Informe um contato preferencial válido");
        }

        if("dataNascimento".equals(campo)){
            return ResponseEntity
                    .badRequest()
                    .body("Informe uma data em um formato válido");
        }

        return ResponseEntity
                .badRequest()
                .body("Não foi possível processar os dados enviados");
    }

    @ExceptionHandler({CpfJaCadastradoException.class, EmailJaCadastradoException.class})
    public ResponseEntity<String> tratarErrosDeCadastro(RuntimeException excecao){

        return ResponseEntity
                .badRequest()
                .body(excecao.getMessage());
    }
}
