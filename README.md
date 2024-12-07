# Hackathon FMU 
## Projeto Backend API Rest - Busca peças automativas

"Projeto de gerenciamento de pacientes com integração ao banco de dados PostgreSQL, desenvolvido em Java com Spring Boot."

### 📂 Arquitetura Implementada
![image](https://github.com/user-attachments/assets/bab36a52-f91a-40d4-b1fb-c0009de127bc)

A arquitetura segue o padrão em camadas:

- Controladores REST para expor endpoints.
- Camada de Serviço para encapsular a lógica de negócios.
- Camada de Repositórios para manipulação dos dados.
- Entidades que mapeiam os dados importados do Excel para o banco de dados.

---

## Funcionalidades

- Cadastro manual de peças de suspensão.
- Persistência de dados no banco PostgreSQL.
- API REST para gerenciar os dados cadastrados:
  - Listar todas as peças (GET).

---

## 🛠️ Tecnologias Utilizadas

- **Java** (Spring Boot)
- **PostgreSQL**
- **Maven** para gerenciamento de dependências
- **IntelliJ IDEA** como IDE

---

## 📦 Pré-requisitos

Antes de iniciar, você precisará ter instalado:

- **Java 17+**
- **PostgreSQL**
- **Maven**
- **Git**

---

## 🔧 Configuração do Banco de Dados

1. Certifique-se de que o PostgreSQL está Instalado.

2. Atualize o arquivo application.properties ou application.yml com suas credenciais:
   properties
   ```bash
    spring.datasource.url=jdbc:postgresql://ep-red-band-a5vcpjq2.us-east-2.aws.neon.tech/neondb?sslmode=require
    spring.datasource.username=neondb_owner
    spring.datasource.password=vRILiN7HOA5M
  

---
## 🚀 Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/RenanBeraldi/dev-web-backend.git
   cd nome-do-repositorio

2. Compile e Inicie o Projeto:
    ```bash
   mvn spring-boot:run
   
3. Acesse a Aplicação via `http://localhost:8080.`

---
## 📖 Endpoints Disponíveis

### **GET /pecas**
- Adiciona um novo paciente ao banco de dados.
- **Requisição:**
    - **URL:** `http://localhost:8080/pecas/`
    - **Método:** `GET`
  - **Corpo da requisição:**
    ```json
    [
      {
          "marca": "FIAT",
          "codigoCofap": "BUC03201",
          "codigoOriginal": "4251331",
          "codigoAxios": "011.0285",
          "codigoSampel": "1002",
          "codigoMobensani": "MB 412",
          "codigoBorflex": "702",
          "codigoYibrasil": "FT1072",
          "embalagem": 8.0,
          "nome": "BUCHA DA BANDEJA DA SUSPENSÃO TRASEIRA",
          "modelo": "147",
          "ano": "76 / 82"
      },
      ...
    ]
    ```
