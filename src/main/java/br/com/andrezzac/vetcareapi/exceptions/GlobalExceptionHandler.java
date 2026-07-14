package br.com.andrezzac.vetcareapi.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> tratarErro(MethodArgumentNotValidException excecao){
        String mensagem = excecao
                .getBindingResult()
                .getFieldErrors()
                .getFirst()
                .getDefaultMessage();

                return ResponseEntity
                        .badRequest()
                        .body(mensagem);
    }

}
