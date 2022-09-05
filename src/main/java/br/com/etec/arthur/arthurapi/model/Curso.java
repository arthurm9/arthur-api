package br.com.etec.arthur.arthurapi.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return id.equals(curso.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

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

    @OneToMany(mappedBy = "curso")
    private List<Aluno> alunos = new ArrayList<>();

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
