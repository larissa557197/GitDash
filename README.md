# Projeto de Integração com GitHub API
### Este projeto demonstra a integrção de uma aplicação Spring Boot com a GitHub API, utilizando o OAuth2 para autenticação e autorização, e exibindo informações do usuário e seus repositórios

---

## Funcionalidades
### 1. Clonagem do Repositório: O projeto base foi obtido através da clonagem do repositório fornecido pelo professor
### 2. Configuração de Segurança (SecurityConfig):
    - Implementa a configuração de segurança da aplicação Spring Boot
    - Habilita o fluxo de autenticação OAuth2 com o GitHub
    - Protege todas as rotas da aplicação web, exigindo autenticação para acesso
### 3. Controller GitHub (GitHubController): 
    - Responsável por obter os dados do usuário autenticado na plataforma GitHub
    - Coleta informações como nome, avatar e o link do repositório principal do usuário
    - Esses dados são repassados para a camada de visualizaação (view)
### 4. Propriedades da Aplicação (application.properties):
    - Configuração das credenciais necessárias para a integração com a GitHub API
    - Fornece o Client ID e o Client Secret obtidos ao registrar a aplicação no GitHub
### 5. Visualização do Usuário (user.html):
    - Template HTML que exibe as informações do usuário logado
    - Percorre a lista de repositórios associados ao usuário
    - Para cada repositório, exibe detalhes como nome, descrição e o total de comits
---

## Pré-requisitos
### - Java Development Kit (JDK) 17 ou superior
### - Maven
### - Git
### - Conta do GitHub
### - Credenciais OAuth2 configuradas no GitHub (Client ID e Cliente Secret)

---

## Como Executar
### 1. Clone o repositório:
    ```
    git clone <URL_DO_REPOSITORIO>
    ```
### 2. Configure as credenciais do GitHub:
    - No arquivo `src/main/resources/application.properties`, substitua os placeholders pelos seus Client ID e Client Secret do GitHu
    ```
    # Exemplo de configuração (substitua pelos seus valores)
        github.client.id=SEU_CLIENT_ID
        github.client.secret=SEU_CLIENT_SECRET
    ```
    - Você precisará registrar uma aplicação OAuth no GitHub: `GitHub Developer settings`.
      Certifique-se de configurar a Callback URL corretamente para o seu ambiente do desenvolvimento       (geralmente algo como `http://localhost:8080/login/oauth2/code/github`);
### 3. Compile e execute o projeto:
  ```
  ./mvnw clean package
  java -jar target/<nome-do-seu-jar>.jar

 ```
### 4. Acesse a aplicação no seu navegador em `http://localhost:8080`. Você será redirecionado para a página de login do GitHub para autorizar o acesso. Após a autorização, você verá a página com seus repositórios
