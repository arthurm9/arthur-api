package br.com.etec.arthur.arthurapi.repository;

import br.com.etec.arthur.arthurapi.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// estende do jpa
public interface AlunoInterface extends JpaRepository<Aluno, Long> {
}
