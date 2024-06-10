CREATE TABLE Funcionario (
    ID_Funcionario INT PRIMARY KEY,
    Nome_Func VARCHAR(100),
    Data_Admissao DATE,
    Cargo VARCHAR(100),
    Departamento_ID INT
);

CREATE TABLE Departamento (
    ID_Departamento INT PRIMARY KEY,
    Nome_Dep VARCHAR(100),
	Gerente_ID INT,
    FOREIGN KEY (Gerente_ID) REFERENCES Funcionario(ID_Funcionario)
);

CREATE TABLE Supervisao (
    Gerente_ID INT,
    Funcionario_ID INT,
    PRIMARY KEY (Gerente_ID, Funcionario_ID),
    FOREIGN KEY (Gerente_ID) REFERENCES Funcionario(ID_Funcionario),
    FOREIGN KEY (Funcionario_ID) REFERENCES Funcionario(ID_Funcionario)
);

INSERT INTO Funcionario (ID_Funcionario, Nome_Func, Data_Admissao, Cargo, Departamento_ID) VALUES
(1, 'Lucas', '15/01/2020', 'Desenvolvedor', 1),
(2, 'Carla', '20/05/2019', 'Analista de RH', 2),
(3, 'Fernanda', '25/03/2018', 'Gerente de Vendas', 4),
(4, 'Ricardo', '10/07/2021', 'Contador', 4),
(5, 'Juliana', '12/11/2017', 'Assistente Administrativo', 1),
(6, 'Pedro', '03/09/2019', 'Analista de Sistemas', 5),
(7, 'Ana', '14/06/2020', 'Programador', 3),
(8, 'Marcos', '28/02/2022', 'Analista Financeiro', 4),
(9, 'Beatriz', '05/11/2021', 'Recrutador', 3),
(10, 'Gustavo', '18/04/2023', 'Estagiário', 1);

INSERT INTO Departamento (ID_Departamento, Nome_Dep, Gerente_ID) VALUES
(1, 'TI', 3),
(2, 'RH', 2),
(3, 'Marketing', 3),
(4, 'Financeiro', 2),
(5, 'Logística', 2);

INSERT INTO Supervisao (Gerente_ID, Funcionario_ID) VALUES
(1, 1),
(1, 2),
(1, 3),
(2, 4),
(2, 5),
(2, 6),
(3, 7),
(3, 8),
(3, 9),
(3, 10);

--a
SELECT Nome_Func, Cargo
FROM Funcionario
WHERE Departamento_ID = 4;

--b
SELECT Nome_Dep
FROM Departamento
WHERE ID_Departamento = (SELECT Departamento_ID 
						 FROM Funcionario WHERE 
						 ID_Funcionario = 7);
						 
--c
