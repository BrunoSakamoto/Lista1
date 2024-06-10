CREATE TABLE Paciente (
    ID_Paciente INT PRIMARY KEY,
    Nome_Pac VARCHAR(100),
    Data_Nascimento DATE
);

CREATE TABLE Medico (
    ID_Medico INT PRIMARY KEY,
    Nome_Med VARCHAR(100),
    Especializacao VARCHAR(200)
);

CREATE TABLE Registro_Medico (
    ID_Paciente INT,
    ID_Medico INT,
    PRIMARY KEY (ID_Paciente, ID_Medico),
    FOREIGN KEY (ID_Paciente) REFERENCES Paciente(ID_Paciente),
    FOREIGN KEY (ID_Medico) REFERENCES Medico(ID_Medico)
);

INSERT INTO Paciente (ID_Paciente, Nome_Pac, Data_Nascimento) VALUES
(1, 'Ana Silva', '10/05/1980'),
(2, 'Pedro Santos', '15/07/1990'),
(3, 'Mariana Oliveira', '20/03/1975'),
(4, 'José Oliveira', '05/11/1982'),
(5, 'Carla Mendes', '25/09/1995'),
(6, 'Antônio Pereira', '12/06/1978'),
(7, 'Fernanda Lima', '08/04/1987'),
(8, 'Marcos Souza', '17/10/2000'),
(9, 'Lúcia Santos', '30/03/1992'),
(10, 'Roberto Ferreira', '22/07/1985');

INSERT INTO Medico (ID_Medico, Nome_Med, Especializacao) VALUES
(1, 'Dr. Rodrigo Costa', 'Cardiologia'),
(2, 'Dra. Juliana Almeida', 'Pediatria'),
(3, 'Dr. Rafael Pereira', 'Ortopedia'),
(4, 'Dra. Carolina Rodrigues', 'Dermatologia'),
(5, 'Dr. Marcelo Oliveira', 'Neurologia');

INSERT INTO Registro_Medico (ID_Paciente, ID_Medico) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 2),
(5, 1),
(6, 1),
(6, 2),
(6, 4),
(7, 4),
(8, 2),
(9, 3),
(10, 5);




SELECT * FROM Paciente
SELECT * FROM Medico
SELECT * FROM Registro_Medico

--a
SELECT ID_Paciente, Nome_Pac, ID_Medico FROM Registro_Medico
FULL JOIN Paciente USING (ID_Paciente)
WHERE ID_Medico = '2'

--b
SELECT Nome_Med, ID_Paciente FROM Registro_Medico
FULL JOIN Medico USING (ID_Medico)
WHERE ID_Paciente = '6'

--c




