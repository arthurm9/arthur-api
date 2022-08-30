package br.com.etec.arthur.arthurapi.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // equals & hash code
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return id.equals(aluno.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

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
