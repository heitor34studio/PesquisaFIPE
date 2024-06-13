# Pesquisa FIPE
![Java Badge](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white) ![Jackson Badge](https://img.shields.io/badge/Jackson-232F3E?style=for-the-badge&logo=Jackson&logoColor=white) ![Maven Badge](https://img.shields.io/badge/Maven-f24d38?style=for-the-badge&logo=Maven&logoColor=white)

O projeto Pesquisa FIPE é uma ferramenta que permite ao usuário pesquisar informações sobre veículos utilizando a API FIPE (Fundação Instituto de Pesquisas Econômicas). O usuário pode selecionar o tipo de veículo, a marca, o modelo e obter informações detalhadas sobre o veículo, como preço, ano e tipo de combustível.

## Índice 

* [Título e Descrição](#pesquisa-fipe)
* [Índice](#índice)
* [Funcionalidades do Projeto](#-funcionalidades-do-projeto)
* [Tecnologias Utilizadas](#%EF%B8%8F-técnicas-e-tecnologias-utilizadas)
* [Acesso ao Projeto](#-acesso-ao-projeto)
* [Abrir e Rodar o Projeto](#%EF%B8%8F-abrir-e-rodar-o-projeto)
* [Detalhamento do Código Java](#-detalhamento-do-código-java)

## 🔨 Funcionalidades do projeto

O Pesquisa FIPE oferece as seguintes funcionalidades:

- Seleção do tipo de veículo (carro, moto, caminhão).
- Exibição das marcas disponíveis para o tipo de veículo selecionado.
- Exibição dos modelos disponíveis para a marca selecionada.
- Exibição das informações detalhadas do veículo selecionado.

## ✔️ Técnicas e tecnologias utilizadas

- `Java`: Linguagem principal utilizada no desenvolvimento do projeto.
- `HttpClient`: Utilizado para fazer requisições HTTP à API de taxas de câmbio.
- `Maven`: Ferramenta de gerenciamento de dependências e build.
- `Spring Framework`: Utilizado para facilitar a criação da aplicação.
- `Jackson`: Biblioteca utilizada para deserializar os dados JSON retornados pela API.

## 📁 Acesso ao projeto

Você pode acessar o código fonte do projeto [aqui](https://github.com/heitor34studio/PesquisaFIPE/tree/main/PesquisaFIPE).

## 🛠️ Abrir e rodar o projeto

Para abrir e rodar o projeto, siga os seguintes passos:

1. Clone o repositório para o seu ambiente local:
    ```sh
    git clone https://github.com/heitor34studio/PesquisaFIPE.git
    ```

2. Navegue até o diretório do projeto:
    ```sh
    cd PesquisaFIPE
    ```

3. Compile o projeto usando Maven:
    ```sh
    mvn clean install
    ```

4. Execute o projeto:
    ```sh
    mvn spring-boot:run
    ```

### Detalhamento do código Java:

O código Java fornecido implementa um programa para pesquisa de informações sobre veículos utilizando a API da FIPE.

#### Main.java
Este arquivo contém a lógica principal do programa. Ele interage com o usuário, realiza consultas à API da FIPE para obter informações sobre marcas, modelos e valores de veículos.

#### Veiculo.java
Representa os dados de um veículo, incluindo seu valor, marca, modelo, ano e combustível. Usa anotações Jackson para mapeamento de campos JSON.

#### DadosArray.java e DadosQualquerTipo.java
São classes de modelo para lidar com respostas JSON que podem ser arrays ou objetos genéricos, respectivamente.

#### ConsumoAPI.java
Realiza requisições HTTP à API da FIPE utilizando `HttpClient` e retorna os dados como strings JSON.

#### ConverteDados.java e IConverteDados.java
São responsáveis por converter dados JSON em objetos Java usando a biblioteca Jackson.

#### ListaOpcoes.java
Gerencia uma lista de opções para que o usuário selecione o tipo de veículo (carro, moto, caminhão) e obtém o caminho correto para fazer a consulta à API da FIPE.

### Exemplo de Uso
Ao executar o programa, o usuário pode escolher o tipo de veículo (carro, moto, caminhão) e depois selecionar a marca, modelo e ano para obter informações detalhadas sobre o veículo desejado.


https://github.com/heitor34studio/PesquisaFIPE/assets/72997122/ccc9203a-5838-47bb-b455-49962f5e0b31


---

Este é o README atualizado para o projeto Pesquisa FIPE. Ele fornece uma visão geral do projeto, suas funcionalidades, tecnologias utilizadas e como acessar e rodar o projeto. Para mais detalhes, você pode explorar os arquivos do código fonte mencionados.
