CREATE TABLE Livro (
    ISBN VARCHAR(20) PRIMARY KEY,
    Titulo VARCHAR(100),
    Editora VARCHAR(50),
    Ano_Publicacao INT
);

CREATE TABLE Autor (
    Autor_ID INT PRIMARY KEY,
    Nome VARCHAR(50),
    Sobrenome VARCHAR(50)
);

CREATE TABLE Escreve (
    Livro_ISBN VARCHAR(20),
    Autor_Autor_ID INT,
    FOREIGN KEY (Livro_ISBN) REFERENCES Livro(ISBN),
    FOREIGN KEY (Autor_Autor_ID) REFERENCES Autor(Autor_ID),
    PRIMARY KEY (Livro_ISBN, Autor_Autor_ID)
);

INSERT INTO Livro (ISBN, Titulo, Editora, Ano_Publicacao) VALUES
('123', 'Dom Quixote', 'Editora 1', 1605),
('456', 'O Pequeno Príncipe', 'Editora 2', 1943),
('789', '1984', 'Editora 3', 1949),
('101112', 'Crime e Castigo', 'Editora 4', 1866),
('131415', 'A Revolução dos Bichos', 'Editora 5', 1945),
('161718', 'Moby Dick', 'Editora 6', 1851),
('192021', 'O Senhor dos Anéis', 'Editora 7', 1954),
('222324', 'O Retrato de Dorian Gray', 'Editora 8', 1890),
('252627', 'A Metamorfose', 'Editora 9', 1915),
('282930', 'Cem Anos de Solidão', 'Editora 10', 1967);

INSERT INTO Autor (Autor_ID, Nome, Sobrenome) VALUES
(1, 'Miguel', 'de Cervantes'),
(2, 'Antoine', 'de Saint-Exupéry'),
(3, 'George', 'Orwell'),
(4, 'Fiódor', 'Dostoiévski'),
(5, 'George', 'Orwell'),
(6, 'Herman', 'Melville'),
(7, 'J.R.R.', 'Tolkien'),
(8, 'Oscar', 'Wilde'),
(9, 'Franz', 'Kafka'),
(10, 'Gabriel', 'García Márquez');

INSERT INTO Escreve (Livro_ISBN, Autor_Autor_ID) VALUES
('123', 1),
('456', 2),
('789', 3),
('101112', 4),
('131415', 5),
('161718', 6),
('192021', 7),
('222324', 8),
('252627', 9),
('282930', 10);

SELECT * FROM Livro

--a
SELECT Livro.Titulo, Autor.Nome, Autor.Sobrenome FROM Livro
JOIN Escreve ON Livro.ISBN = Escreve.Livro_ISBN
JOIN Autor ON Escreve.Autor_Autor_ID = Autor.Autor_ID;

--b
SELECT Livro.Titulo, Autor.Nome, Autor.Sobrenome FROM Livro 
JOIN Escreve ON Livro.ISBN = Escreve.Livro_ISBN
JOIN Autor ON Escreve.Autor_Autor_ID = Autor.Autor_ID
WHERE Autor.Nome = 'George' AND Autor.Sobrenome = 'Orwell';

--c
SELECT Autor.Nome, Autor.Sobrenome FROM Livro
JOIN Escreve ON Livro.ISBN = Escreve.Livro_ISBN
JOIN Autor ON Escreve.Autor_Autor_ID = Autor.Autor_ID
WHERE Livro.Titulo = 'O Pequeno Príncipe' 