package br.com.etec.arthur.arthurapi.resource;

import br.com.etec.arthur.arthurapi.model.Curso;
import br.com.etec.arthur.arthurapi.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("cursos")
public class CursoResource {
    @Autowired
    private CursoRepository cursoRepository;

    // poderia ser "/*" igual ao banco de dados
    @GetMapping("/todos")
    public List<Curso> listarTodosCursos() {
        // o método find all é o método que funciona como o select *
        return cursoRepository.findAll();

        //testar usando o chrome -> localhost:8080/cursos/todos
    }
}