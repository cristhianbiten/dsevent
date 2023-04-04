# DsEvent
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/cristhianbiten/dsevent/blob/main/LICENSE) 

# Sobre o projeto


Projeto desenvolvido para o desafio do módulo de validação e segurança do Bootcamp Spring da DevSuperior.

O projeto foi desenvolvido utilizando TDD, onde recebemos os testes e criamos a aplicação para que seja aprovada nos testes.

## Modelo conceitual
![Modelo Conceitual](https://github.com/cristhianbiten/assets/blob/main/dsevent.jpg)



## Segurança
Neste sistema, somente as rotas de leitura (GET) de eventos e cidades são públicas (não precisa de login). Usuários CLIENT podem também inserir (POST) novos eventos. Os demais acessos são permitidos apenas a usuários ADMIN.




## Validações

### City
- Nome não pode ser vazio

### Event
- Nome não pode ser vazio
- Data não pode ser passada
- Cidade não pode ser nula


# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- H2
- JUnit
- Spring Security
- Bean Validation
- JWT
- OAuth 2

# Como executar o projeto

## Back end
Pré-requisitos: Java

[Tutorial de instalação Java](https://www.youtube.com/watch?v=QekeJBShCy4)

```bash
# Clonar repositório
git clone https://github.com/cristhianbiten/dsevent.git

# Entrar na pasta do projeto back end
cd dsevent

# Executar o projeto
./mvnw spring-boot:run
```

## Testes manuais
Pré-requisitos: Postman

Collection do Postman
https://www.getpostman.com/collections/e1f59c905aeca84c1ebc

```bash
# Busca cidades
GET /cities

# Inserção de nova cidade
POST /cities
{
  "name": "Porto Alegre",
}

# Busca eventos paginados
GET /events

# Inserção de novo evento
POST /events
{
  "name": "Novo Evento",
   "url": "https://novoevento.com.br",
   "date": "2023-07-15",
   "cityId": 1
}

```


# Autor

Cristhian Bitencourt

https://www.linkedin.com/in/cristhian-bitencourt-588b3317a/
