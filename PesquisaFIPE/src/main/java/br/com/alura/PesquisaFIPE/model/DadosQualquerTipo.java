package br.com.alura.PesquisaFIPE.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosQualquerTipo(@JsonAlias("codigo") String codigo,
                                @JsonAlias("nome") String nome) {
}
