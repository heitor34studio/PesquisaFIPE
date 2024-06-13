package br.com.alura.PesquisaFIPE.main;

import br.com.alura.PesquisaFIPE.model.DadosArray;
import br.com.alura.PesquisaFIPE.model.DadosQualquerTipo;
import br.com.alura.PesquisaFIPE.model.Veiculo;
import br.com.alura.PesquisaFIPE.service.ConsumoAPI;
import br.com.alura.PesquisaFIPE.service.ConverteDados;
import br.com.alura.PesquisaFIPE.service.ListaOpcoes;


import java.util.*;

public class Main {
    private final Scanner leitura = new Scanner(System.in);
    private final ConsumoAPI consumo= new ConsumoAPI();
    private final ConverteDados conversor = new ConverteDados();
    private final ListaOpcoes listaOpcoes = new ListaOpcoes();

    public void exibeMenu(){
        System.out.println("""
                **** OPÇÕES ****
                1- Carro\s
                2- Moto\s
                3- Caminhão
                \s
                Digite uma das opções acima para escolher o tipo de veículo e pesquisar suas marcas:
               \s""");

        try {
            var opcaoVeiculo = leitura.nextInt();
            leitura.nextLine();
            var escolhaUsuario = listaOpcoes.retornaStringViaNumero(opcaoVeiculo);
            String ENDERECO = "https://parallelum.com.br/fipe/api/v1/" + escolhaUsuario;
            var json = consumo.obterDados(ENDERECO);
            List<DadosQualquerTipo> listaMarcas = conversor.obterLista(json, DadosQualquerTipo.class);
            listaMarcas.forEach(m -> System.out.println("Código: " + m.codigo()
                    + "  Marca: " + m.nome()));
            System.out.println("Informe o código da marca para consulta dos modelos:");
            var opcaoMarca = leitura.nextInt();
            leitura.nextLine();
            var marcaEscolhida = listaMarcas.stream().filter(m -> Integer.parseInt(m.codigo()) ==
                    opcaoMarca).findFirst();
            if (marcaEscolhida.isEmpty()){
                throw new RuntimeException("Opção inválida.");
            }
            ENDERECO += "/" + marcaEscolhida.get().codigo() + "/modelos";
            json = consumo.obterDados(ENDERECO);
            DadosArray modelos = conversor.obterDados(json, DadosArray.class);
            modelos.listaModelos().forEach(m -> System.out.println("Código: " + m.codigo()
                    + "  Modelo: " + m.nome()));
            System.out.println("Informe o código do modelo para consulta dos valores:");
            var opcaoModelo = leitura.nextInt();
            leitura.nextLine();
            var modeloEscolhido = modelos.listaModelos().stream().filter(m -> Integer.parseInt(m.codigo())
                    == opcaoModelo).findFirst();
            if (modeloEscolhido.isEmpty()){
                throw new RuntimeException("Opção inválida.");
            }
            ENDERECO += "/" + modeloEscolhido.get().codigo() + "/anos";
            json = consumo.obterDados(ENDERECO);
            List<DadosQualquerTipo> anos = conversor.obterLista(json, DadosQualquerTipo.class);
            for (DadosQualquerTipo a : anos) {
                String endereco = ENDERECO
                    + "/" + a.codigo();
                json = consumo.obterDados(endereco);
                Veiculo veiculo = conversor.obterDados(json, Veiculo.class);
                System.out.println(veiculo);
            }

        } catch (InputMismatchException e) {
            System.out.println("Valor inserido inválido.");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
