CREATE TABLE aluno (
    id BIGINT NOT NULL AUTO_INCREMENT,
    nomealuno VARCHAR(255),
    cursoid BIGINT NOT NULL,
    PRIMARY KEY(id)
);

ALTER TABLE aluno
ADD CONSTRAINT FK_Aluno_Curso
FOREIGN KEY(cursoid)
REFERENCES curso(id);

INSERT INTO aluno(nomealuno, cursoid)
VAlUES ('Arthur Marques de Oliveira', 1),
       ('João Érik da Silva Crisostomo', 1),
       ('Lucas Vieira da Silva', 2),
       ('Matheus Henrique Crispim Cola', 2),
       ('Pedro Henrique Vieira Ribeiro', 3),
       ('Vinícius Henrique dos Santos Pinto', 4);