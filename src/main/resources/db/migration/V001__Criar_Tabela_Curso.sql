CREATE TABLE curso (
    id BIGINT NOT NULL AUTO_INCREMENT,
    nomecurso VARCHAR(100),
    PRIMARY KEY(id)
);

INSERT INTO curso(nomecurso)
VAlUES ('Desenvolvimento de Sistemas'),
       ('Química'),
       ('Administração'),
       ('Marketing'),
       ('Logística'),
       ('Edificações');