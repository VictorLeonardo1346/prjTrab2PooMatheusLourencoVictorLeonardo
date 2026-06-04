# Sistema de Locação de Veículos

Projeto desenvolvido para a disciplina de Programação Orientada a Objetos (POO) utilizando Java, NetBeans 8.2, Access Database e padrão DAO.

## Objetivo

O sistema realiza o controle de locação de veículos, permitindo:

* Consultar uma locação pelo código;
* Cadastrar uma nova locação;
* Calcular o valor da locação com base nos quilômetros percorridos;
* Aplicar taxa de locação;
* Aplicar desconto para clientes Premium;
* Atualizar os dados da locação no banco de dados.

## Tecnologias Utilizadas

* Java SE
* Java Swing
* NetBeans 8.2
* Microsoft Access
* UCanAccess JDBC Driver
* Programação Orientada a Objetos (POO)
* DAO (Data Access Object)

## Estrutura do Projeto

```text
src/
├── fatec.poo.model
│   └── LocacaoVeiculo.java
│
├── fatec.poo.control
│   ├── DaoLocacaoVeiculo.java
│   └── PreparaConexao.java
│
├── fatec.poo.view
│   └── LocacaoVeiculoGui.java
│
└── fatec.poo.basedados
    └── DB_POO.accdb
```

## Funcionalidades

### Consultar

Permite localizar uma locação cadastrada através do código.

### Alugar

Realiza o cadastro de uma nova locação no banco de dados.

### Liberar

Calcula o valor da locação considerando:

* Quilômetros rodados;
* Valor por quilômetro;
* Taxa de locação;
* Desconto de 10% para clientes Premium.

Após o cálculo, os dados são atualizados na base de dados.

## Banco de Dados

O sistema utiliza o banco Microsoft Access:

```text
DB_POO.accdb
```

Tabela utilizada:

```text
tblLocacao
```

## Autores

Matheus Duarte e
Victor Leonardo

Curso Superior de Análise e Desenvolvimento de Sistemas

FATEC Dom Amaury Castanho – Itu/SP
