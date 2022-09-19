CREATE TABLE aluno (
    id BIGINT NOT NULL AUTO_INCREMENT,
    nomealuno VARCHAR(255),
    cursoid BIGINT NOT NULL,
    PRIMARY KEY(id)
);

ALTER TABLE aluno ADD CONSTRAINT FK_Aluno_Curso FOREIGN KEY(cursoid) REFERENCES curso(id);