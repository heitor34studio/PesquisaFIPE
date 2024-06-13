package br.com.alura.PesquisaFIPE.service;

import java.util.Map;

public class ListaOpcoes {
    public String retornaStringViaNumero(int numero){
        Map<Integer, String> listaMoedas = Map.of(
                1, "carros/marcas",
                2, "motos/marcas",
                3, "caminhoes/marcas"
        );

        if (listaMoedas.containsKey(numero)){
            return listaMoedas.get(numero);
        } else {
            throw new RuntimeException("Erro, o número informado, (" + numero + "), não está na lista!");
        }
    }
}
