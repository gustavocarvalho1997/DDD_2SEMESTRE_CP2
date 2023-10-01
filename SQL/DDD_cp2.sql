DROP SEQUENCE seq_cp_aluno;
DROP TABLE T_CP_ALUNO CASCADE CONSTRAINTS;

CREATE SEQUENCE seq_cp_aluno
START WITH 1
INCREMENT BY 1
NOCACHE
NOCYCLE;

CREATE TABLE T_CP_ALUNO (
    CODIGO      NUMBER(6)       PRIMARY KEY,
    NOME        VARCHAR(20)     NOT NULL,
    SOBRENOME   VARCHAR(40)     NOT NULL,
    CURSO       VARCHAR(30)     NOT NULL,
    INSTITUICAO VARCHAR(40)     NOT NULL,
    ANO_INICIO  NUMBER(4)       NOT NULL

);
