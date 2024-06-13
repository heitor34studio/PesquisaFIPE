package br.com.alura.PesquisaFIPE.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosArray(@JsonAlias("modelos") List<DadosQualquerTipo> listaModelos) {
}
