CREATE TABLE Turma (
    id_turma INT PRIMARY KEY,
    professor VARCHAR(100)
);

CREATE TABLE Aluno (
    id_aluno INT PRIMARY KEY,
    nome_aluno VARCHAR(100),
    data_nasc DATE
);

CREATE TABLE Aluno_Turma (
    id_aluno_turma INT PRIMARY KEY,
    id_aluno INT,
    id_turma INT,
    FOREIGN KEY (id_aluno) REFERENCES Aluno(id_aluno),
    FOREIGN KEY (id_turma) REFERENCES Turma(id_turma)
);

CREATE TABLE Curso (
    id_curso INT PRIMARY KEY,
    nome_curso VARCHAR(100)
);

CREATE TABLE Turma_Curso (
    id_turma_curso INT PRIMARY KEY,
    id_turma INT,
    id_curso INT,
    FOREIGN KEY (id_turma) REFERENCES Turma(id_turma),
    FOREIGN KEY (id_curso) REFERENCES Curso(id_curso)
);

INSERT INTO Turma (id_turma, professor) VALUES
(1, 'Professor A'),
(2, 'Professor B'),
(3, 'Professor C'),
(4, 'Professor D'),
(5, 'Professor E');

INSERT INTO Aluno (id_aluno, nome_aluno, data_nasc) VALUES
(1, 'Aluno 1', '2005-03-15'),
(2, 'Aluno 2', '2006-08-22'),
(3, 'Aluno 3', '2004-01-10'),
(4, 'Aluno 4', '2003-11-05'),
(5, 'Aluno 5', '2007-06-30');

INSERT INTO Aluno_Turma (id_aluno_turma, id_aluno, id_turma) VALUES
(1, 1, 1),
(2, 2, 1),
(3, 3, 2),
(4, 4, 2),
(5, 1, 3),
(6, 2, 3),
(7, 3, 4),
(8, 4, 4),
(9, 5, 5),
(10, 1, 5);

INSERT INTO Curso (id_curso, nome_curso) VALUES
(1, 'Matemática'),
(2, 'História'),
(3, 'Ciências'),
(4, 'Geografia'),
(5, 'Inglês');

INSERT INTO Turma_Curso (id_turma_curso, id_turma, id_curso) VALUES
(1, 1, 1),
(2, 2, 2),
(3, 3, 3),
(4, 4, 4),
(5, 5, 5);

--a
SELECT Aluno.id_aluno, Aluno.nome_aluno FROM Aluno
INNER JOIN Aluno_Turma ON Aluno.id_aluno = Aluno_Turma.id_aluno
WHERE id_turma = '3'

--b
SELECT Curso.id_curso, Turma.id_Turma FROM Curso
INNER JOIN Turma ON Curso.id_curso = Turma.id_Turma
WHERE id_turma = '3'

--c
SELECT id_turma, Aluno.id_aluno FROM Aluno
INNER JOIN Aluno_Turma ON Aluno.id_aluno = Aluno_Turma.id_aluno

