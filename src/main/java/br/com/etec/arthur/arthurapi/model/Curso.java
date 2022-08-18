package br.com.etec.arthur.arthurapi.model;

import javax.persistence.*;

@Entity
@Table(name = "curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomecurso;

    // getter's and setter's
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNomecurso() {
        return nomecurso;
    }
    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }
}