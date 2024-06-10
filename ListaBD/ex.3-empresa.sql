CREATE TABLE Projeto (
    ID_Projeto INT PRIMARY KEY,
    Nome_Proj VARCHAR(100),
    Descricao TEXT
);

CREATE TABLE Funcionario (
    ID_Funcionario INT PRIMARY KEY,
    Nome_Func VARCHAR(100),
    Data_Admissao DATE
);

CREATE TABLE Associacao (
    ID_Projeto INT,
    ID_Funcionario INT,
    PRIMARY KEY (ID_Projeto, ID_Funcionario),
    FOREIGN KEY (ID_Projeto) REFERENCES Projeto(ID_Projeto),
    FOREIGN KEY (ID_Funcionario) REFERENCES Funcionario(ID_Funcionario)
);

INSERT INTO Projeto (ID_Projeto, Nome_Proj, Descricao) VALUES
(1, 'Projeto A', 'Desenvolvimento de um sistema de gerenciamento de vendas online para uma loja de roupas.'),
(2, 'Projeto B', 'Implementação de um novo sistema de controle de estoque para uma rede de supermercados.'),
(3, 'Projeto C', 'Desenvolvimento de um aplicativo móvel para rastreamento de encomendas.'),
(4, 'Projeto D', 'Desenvolvimento de um sistema de gestão de recursos humanos para uma empresa de tecnologia.'),
(5, 'Projeto E', 'Implementação de um novo sistema de pagamento online para uma plataforma de e-commerce.'),
(6, 'Projeto F', 'Desenvolvimento de um aplicativo de entrega de comida.'),
(7, 'Projeto G', 'Desenvolvimento de um sistema de gestão financeira para pequenas empresas.'),
(8, 'Projeto H', 'Implementação de um sistema de reserva de hotéis online.'),
(9, 'Projeto I', 'Desenvolvimento de um aplicativo de controle de gastos pessoais.'),
(10, 'Projeto J', 'Implementação de um sistema de monitoramento de tráfego urbano.');


INSERT INTO Funcionario (ID_Funcionario, Nome_Func, Data_Admissao) VALUES
(1, 'Carlos', '03-03-2024'),
(2, 'Samuel', '20-02-2022'),
(3, 'Juliane', '19-09-2019'),
(4, 'Maria', '10-01-2023'),
(5, 'João', '05-06-2021'),
(6, 'Ana', '15-03-2020'),
(7, 'Pedro', '25-11-2022'),
(8, 'Mariana', '02-04-2019'),
(9, 'Lucas', '30-07-2020'),
(10, 'Laura', '18-09-2023');

INSERT INTO Associacao (ID_Projeto, ID_Funcionario) VALUES
(1, 1),
(1, 2),
(2, 2),
(3, 1),
(3, 3),
(4, 4),
(4, 5),
(5, 6),
(6, 7),
(7, 8),
(8, 9),
(9, 10),
(10, 1);

SELECT * FROM Projeto
SELECT * FROM Funcionario
SELECT * FROM Associacao

--a
SELECT Associacao.ID_Projeto, Associacao.ID_Funcionario FROM Associacao
WHERE ID_Projeto = '1'

--b 
SELECT Associacao.ID_Funcionario, Associacao.ID_Projeto FROM Associacao
WHERE ID_Funcionario = '1'

--c 


