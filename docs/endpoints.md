# Endpoints

## Tutores

### POST /tutores

Realiza o cadastro de um novo tutor.

### Exemplo de requisição

```json
{
    "nome": "Adriana",
    "cpf": "12345678900",
    "dataNascimento": "2001-04-07",
    "telefones": [
        "21999999999",
        "21888888888"
    ],
    "email": "adriana@email.com",
    "endereco": "Rio de Janeiro",
    "contatoPreferencial": "WhatsApp"
}
```

### Resposta atual: 

```text
Tutor cadastrado com sucesso!
```

Futuramente este endpoint retornará o Tutor cadastrado.