# Sistema de Login e Cadastro - Backend

Este é um projeto de backend e frontend para um sistema de login e cadastro, desenvolvido em **Java** com **Spring Boot** e **HTML e CSS e Javascript**. Ele implementa conceitos de CRUD, SOLID, DTO e utiliza boas práticas modernas no desenvolvimento de aplicações.

---

## **Tecnologias Utilizadas**
- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- HTML e CSS
- Javascript
- PostgreSQL
- Maven

---

## **Funcionalidades**
1. Cadastro de usuários com:
   - `username`
   - `email`
   - `password`
2. Login de usuários utilizando:
   - `email`
   - `password`

---

## **Como Executar o Projeto**

### **1. Configurações do Banco de Dados**
Certifique-se de ter o PostgreSQL instalado e configure o arquivo `application.properties` com as credenciais corretas:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/sistema_login
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

### **2. Clonar o Repositório**

```bash
git clone https://github.com/seu-usuario/sistema-de-login-cadastro.git
cd sistema-de-login-cadastro
```

### **3. Executar o Projeto**

```bash
./mvnw spring-boot:run
```

A aplicação estará disponível em: `http://localhost:8080`

---

## **Endpoints Disponíveis**

### **1. Cadastro de Usuário**
- **URL:** `/api/usuarios/cadastrar`
- **Método:** `POST`
- **Payload:**

```json
{
  "username": "exemploUsuario",
  "email": "usuario@email.com",
  "password": "senha123"
}
```

- **Resposta:**

```json
{
  "status": "sucesso",
  "mensagem": "Usuário cadastrado com sucesso!"
}
```

---

### **2. Login de Usuário**
- **URL:** `/api/usuarios/login`
- **Método:** `POST`
- **Payload:**

```json
{
  "email": "usuario@email.com",
  "password": "senha123"
}
```

- **Resposta:**

```json
{
  "status": "sucesso",
  "mensagem": "Login realizado com sucesso!"
}
```

---

## **Arquitetura do Projeto**

O projeto segue uma estrutura organizada baseada no modelo MVC (Model-View-Controller):

- **Model:** Contém as entidades do sistema.
- **DTO:** Define os objetos de transporte de dados.
- **Repository:** Interface para comunicação com o banco de dados.
- **Service:** Implementa as regras de negócio.
- **Controller:** Gerencia as requisições e respostas da API.
- **Config:** Contém configurações adicionais como CORS.

---

## **Contribuições**

Contribuições são bem-vindas! Siga os passos abaixo:

1. Fork este repositório.
2. Crie uma nova branch: `git checkout -b minha-feature`
3. Commit suas modificações: `git commit -m 'Minha nova feature'`
4. Push para a branch: `git push origin minha-feature`
5. Abra um Pull Request.

---

## **Licença**

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

