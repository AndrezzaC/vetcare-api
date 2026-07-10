# Backlog - VetCare API

## MVP (Versão 1)

### Tutores

### Cadastro de Tutor

Status: Em desenvolvimento

##### Concluído

- [x] Criar entidade Tutor
- [x] Criar TutorRepository
- [x] Criar TutorService
- [x] Criar TutorController
- [x] Criar endpoint POST /tutores
- [x] Configurar PostgreSQL
- [x] Configurar Hibernate
- [x] Salvar tutor no banco
- [x] Testar cadastro no Postman

- [x] Validar nome obrigatório
- [x] Validar CPF obrigatório
- [x] Validar tamanho do CPF
- [x] Validar algoritmo do CPF
- [x] Validar e-mail obrigatório
- [x] Validar formato do e-mail
- [x] Validar data de nascimento
- [x] Validar obrigatoriedade de telefone
- [x] Validar quantidade mínima de telefones
- [x] Criar enum ContatoPreferencial

##### Pendente

- [ ] Impedir CPF duplicado
- [ ] Impedir e-mail duplicado
- [ ] Validar formato dos telefones
- [ ] Padronizar respostas da API
- [ ] Ativar Bean Validation no Controller
- [ ] Testar cenários de erro no Postman
- [ ] Retornar Tutor cadastrado

#### Consultar Tutor

- [ ] Buscar por ID
- [ ] Buscar todos os tutores

#### Editar Tutor

- [ ] Atualizar dados do tutor

#### Excluir Tutor

- [ ] Excluir tutor

### Pets

- [ ] Cadastrar pet
- [ ] Editar pet
- [ ] Consultar pet

### Consultas

- [ ] Agendar consulta
- [ ] Cancelar consulta
- [ ] Registrar atendimento

### Vacinas

- [ ] Registrar vacina
- [ ] Consultar histórico de vacinas

### Exames

- [ ] Registrar exame
- [ ] Consultar histórico de exames