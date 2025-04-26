Claro, fiz algumas alterações no texto para que o conteúdo mantenha o mesmo significado, mas com uma redação diferente:

# CRUD Java com Relacionamentos de Entidades

## 📋 Descrição do Projeto
Este projeto exemplifica uma aplicação web desenvolvida em Java, que implementa operações CRUD (Criar, Ler, Atualizar, Excluir) com a utilização de relacionamentos entre diferentes entidades. A aplicação utiliza as seguintes tecnologias:

## 🛠 Tecnologias Utilizadas
- Java 17
- Spring Boot 3.1.0
- Spring Data JPA
- Lombok
- MariaDB
- Maven

## 🏗️ Estrutura e Arquitetura
A arquitetura do projeto segue o padrão MVC (Model-View-Controller), sendo organizada em quatro camadas principais:

1. **Camada de Modelo**: Abrange as entidades que representam as tabelas no banco de dados
2. **Camada de Repositório**: Responsável por executar operações de acesso ao banco de dados
3. **Camada de Serviço**: Implementa a lógica de negócios e as regras de validação
4. **Camada de Apresentação**: Interface web desenvolvida com JSF e XHTML

## 🔗 Relacionamentos Entre Entidades
O projeto demonstra dois tipos de relacionamentos entre entidades:

### Relação Um-para-Muitos (One-to-Many)
- Implementada entre as entidades `Pessoa` e `Telefone`
- Cada Pessoa pode ter múltiplos Telefones
- Cada Telefone está vinculado a uma única Pessoa
- Configuração com operações em cascata para garantir a integridade dos dados

### Relação Muitos-para-Muitos (Many-to-Many)
- Implementada entre as entidades `Aluno` e `Curso`
- Um Aluno pode se matricular em vários Cursos
- Um Curso pode ter múltiplos Alunos matriculados
- A relação é mapeada por meio de uma tabela de junção

## 🚀 Funcionalidades Principais
- Cadastro, visualização, atualização e remoção de entidades
- Validação de dados na camada de serviço
- Navegação entre as entidades relacionadas
- Interface de fácil utilização para gerenciar os relacionamentos
- Tratamento adequado de exceções e mensagens para o usuário

## 📌 Pré-requisitos
Para rodar o projeto localmente, é necessário:

- JDK 11 ou superior
- Servidor de aplicação Java EE (como TomEE, WildFly, GlassFish)
- Maven 3.6 ou superior
- IDE recomendada para o desenvolvimento

## 🔧 Como Configurar e Rodar
1. Faça o clone do repositório
2. Configure as propriedades do banco de dados
3. Execute o build com Maven
4. Faça o deploy no servidor de aplicação
5. Acesse a aplicação no seu navegador

Este projeto está preparado para ser expandido com novas funcionalidades ou integrado a outros sistemas. A estrutura organizada e a arquitetura limpa facilitam tanto a manutenção quanto a evolução do sistema.
