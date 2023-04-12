package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;
    private final LocalDate DATA_INICIAL = LocalDate.now();
    private final LocalDate DATA_FINAL = DATA_INICIAL.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return DATA_INICIAL;
    }

    public LocalDate getDataFinal() {
        return DATA_FINAL;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Dev devsInscritos) {
        this.devsInscritos.add(devsInscritos);
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return nome.equals(bootcamp.nome) && descricao.equals(bootcamp.descricao) && DATA_INICIAL.equals(bootcamp.DATA_INICIAL) && DATA_FINAL.equals(bootcamp.DATA_FINAL) && devsInscritos.equals(bootcamp.devsInscritos) && conteudos.equals(bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, DATA_INICIAL, DATA_FINAL, devsInscritos, conteudos);
    }
    
}