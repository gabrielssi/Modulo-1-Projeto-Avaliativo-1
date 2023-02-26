Gabriel-projeto integrador -LabBeach
Olá desenvolvedores,

Gostaria de compartilhar com vocês o projeto avaliativo que desenvolvi durante o curso FuturoDEV - Senai. Trata-se de uma aplicação para controle das praias da cidade de Florianópolis-SC.

O desafio proposto foi criar o back-end de um sistema de lista de praias, o que me permitiu colocar em prática diversas habilidades em Java, como programação orientada a objetos, manipulação de bancos de dados, uso de frameworks como Spring Boot, entre outras.

Além disso, a aplicação também me permitiu explorar conceitos como API REST, autenticação e autorização, e tratamento de erros, o que é essencial para criar sistemas robustos e seguros.

Gostaria de destacar que o projeto foi desenvolvido com o objetivo de ser escalável e fácil de ser mantido, seguindo boas práticas de desenvolvimento de software.

Espero que esse relato possa inspirar outros desenvolvedores a colocarem em prática seus conhecimentos e habilidades em Java, e a desenvolverem sistemas eficientes e de qualidade.

Forte abraço!

OS REQUISITOS DA APLICAÇÃO SÃO:

Utilização correta do GitHub e escrita do Readme.md Cadastro de bairro Listagem de bairro Exclusão de bairro Cadastro de praia Listagem de praias Edição de praias por identificador Exclusão de um praias por identificador Listagem de praias conforme o status Listagem de praias com acessibilidade Listagens de praias por população no bairro Documentação de código

O ROTEIRO DA APLICAÇÃO

Requisito geral da aplicação: Utilização de Spring: Boot, MVC, Data Criação de API Rest Utilização de Git com GitHub Uso do banco de dados PostgreSQL

Cadastro de bairro: Não permitir cadastro duplicado Não permitir cadastro com campos inválidos

Campos necessários: Identificador da categoria: Único, autogerado. Nome do bairro: Única, tipo texto, preenchimento obrigatório. Descrição do bairro: Tipo texto, preenchimento não obrigatório. População do bairro: Tipo inteiro, preenchimento não obrigatório.

Listagem de bairros: Listar todas os bairros cadastrados com seus respectivos campos

Exclusão de bairro: Deletar um bairro por identificador Não permitir deletar um bairro caso tenha uma praia cadastrada.

Cadastro de praia: Não permitir cadastro duplicado Não permitir cadastro com campos inválidos

Campos necessários: Identificador da praia: Único, autogerado Identificador do bairro: Utilizar categoria válida e já criada Nome da praia: Tipo texto, preenchimento obrigatório Possui acessibilidade: Tipo booleano, preenchimento obrigatório Status da praia (própria, imprópria): Tipo texto, preenchimento obrigatório.

Listagem de praias: Listar todos as praias cadastradas com seus respectivos campos.

Edição de praia: Editar as informações da praia por identificador.

Exclusão de praia: Deletar uma praia por identificador.

Listagem de praias conforme o status Listar praias conforme o status (própria ou imprópria)

Listagem de praias com acessibilidade Listar praias por acessibilidade ( verdadeiro ou falso )

Listagens de praias por população no bairro Listar praias com população até um certo número definido pelo usuário. Ex. praias em bairros com população até 15000 pessoas.

Para iniciar a aplicação:

Configurar o arquivo application.properties na IDE: spring.jpa.database=POSTGRESQL spring.datasource.platform=postgres spring.jpa.show-sql=true spring.jpa.hibernate.ddl-auto=create-drop spring.database.driverClassName=org.postgresql.Driver spring.datasource.url=jdbc:postgresql://localhost:5432/GabrielProjeto1LabBeach spring.datasource.username=(seu usuário) spring.datasource.password=(sua senha) server.port=8080
Crie o banco de dados GabrielProjeto1LabBeach no postgres. --Você pode criar um banco de dados com qualquer nome, mas lembre-se de alterar o mesmo no arquivo application.properties. --RECOMENDAÇÃO: crie o banco de dados com o nome GabrielProjeto1LabBeach para evitar erros de compilação.
Baixar o arquivo e adicionar no Insomnia, realizar as requisições utilizando as infomrações do código.
Contato: gabriel_silva63@estudante.sesisenai.org.br
Autoria de Gabriel Souza da Silva, aluno do curso FuturoDEV - SENAI.
