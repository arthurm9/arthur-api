package br.com.etec.arthur.arthurapi.repository;

import br.com.etec.arthur.arthurapi.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// estende do jpa
public interface CursoInterface extends JpaRepository<Curso, Long> {
}
