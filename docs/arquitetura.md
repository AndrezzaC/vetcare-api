# Arquitetura da VetCare API

## Objetivo

A VetCare API é uma API REST desenvolvida em Java utilizando Spring Boot para gerenciamento de clínicas veterinárias.

## Arquitetura

A aplicação segue a arquitetura em camadas.

## Fluxo da aplicação

```text
Cliente (Postman / Futuro Front-end)
        │
        ▼
   TutorController
        │
        ▼
    TutorService
        │
        ▼
 TutorRepository
        │
        ▼
 PostgreSQL
```

## Responsabilidades

### Controller

Recebe as requisições HTTP da aplicação e encaminha para a camada de Service.

### Service

Contém as regras de negócio da aplicação.

### Repository

Responsável pela comunicação com o banco de dados através do Spring Data JPA.

### Banco de Dados

PostgreSQL 18.

