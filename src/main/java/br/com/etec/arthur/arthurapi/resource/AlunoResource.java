package br.com.etec.arthur.arthurapi.resource;

import br.com.etec.arthur.arthurapi.model.Aluno;
import br.com.etec.arthur.arthurapi.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("alunos")
public class AlunoResource {
    @Autowired
    private AlunoRepository alunoRepository;

    // poderia ser "/*" igual ao banco de dados
    @GetMapping("/todos")
    public List<Aluno> listarTodosAlunos() {
        // o método find all é o método que funciona como o select *
        return alunoRepository.findAll();

        //testar usando o chrome -> localhost:8080/cursos/todos
    }
}
