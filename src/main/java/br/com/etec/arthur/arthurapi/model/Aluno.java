package br.com.etec.arthur.arthurapi.model;

import javax.persistence.*;

@Entity
@Table(name = "aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomealuno;

    // getter's and setter's
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNomealuno() {
        return nomealuno;
    }
    public void setNomealuno(String nomealuno) {
        this.nomealuno = nomealuno;
    }

    // private Long cursoid;
}
