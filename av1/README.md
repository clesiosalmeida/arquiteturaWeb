
# 📘 Projeto Spring Boot: Aluno e Curso

Este é um projeto simples de exemplo usando Spring Boot, Spring Data JPA, MariaDB e Lombok, para representar o relacionamento entre as entidades **Aluno** e **Curso** (N:1).

---

## ⚙️ Tecnologias Utilizadas

- Java 17+
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- Lombok
- MariaDB
- Spring Boot DevTools

---

## 🏗️ Relacionamento entre entidades

- Cada **Aluno** está matriculado em **um único Curso**.
- Cada **Curso** pode ter **vários Alunos**.

---

## 🚀 Como executar o projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/seuusuario/seuprojeto.git
   cd seuprojeto
   ```

2. Configure o banco no `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mariadb://localhost:3306/seubanco
   spring.datasource.username=root
   spring.datasource.password=suasenha
   ```

3. Execute o projeto via sua IDE (IntelliJ, Eclipse, VS Code) ou via terminal:
   ```bash
   ./mvnw spring-boot:run
   ```

4. Acesse os endpoints (exemplos):

   - `GET /alunos` → Lista todos os alunos
   - `POST /alunos` → Cria um novo aluno (JSON)
   - `GET /cursos` → Lista todos os cursos
   - `POST /cursos` → Cria um novo curso (JSON)

---

## 📦 Dados de exemplo (data.sql)

O projeto já popula o banco automaticamente com:

- 2 Cursos
- 2 Alunos associados

Você pode editar o arquivo `src/main/resources/data.sql` para modificar os dados.

---

## 🧪 Testando com cURL ou Postman

### Criar Aluno:
```json
POST http://localhost:8080/alunos
{
  "nome": "Carlos Mendes",
  "email": "carlos@exemplo.com",
  "dataNascimento": "1999-12-10",
  "curso": {
    "id": 1
  }
}
```

---

## ✅ Dicas

- Certifique-se de que o **MariaDB** está rodando.
- Você pode ver as queries SQL no console com:
  ```properties
  spring.jpa.show-sql=true
  ```

---

## 👨‍💻 Autor

- Seu Nome
- [@seuusuario](https://github.com/seuusuario)
```

---

Quer que eu gere um pacote `.zip` com todos os arquivos já organizados?  
Ou quer continuar com mais partes (serviços, DTOs, testes etc)?