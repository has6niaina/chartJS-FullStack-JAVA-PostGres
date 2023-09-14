DROP DATABASE diagramme;
CREATE DATABASE diagramme;
\q
psql diagramme postgres
root

CREATE SEQUENCE tech_seq MINVALUE 1 start with 1 increment by 1;
CREATE TABLE tech(
    idtech VARCHAR(30) CONSTRAINT PK_tech PRIMARY KEY,
    nom VARCHAR(30),
    nbusers DECIMAL
);
INSERT INTO tech VALUES(nextVal('tech_seq'),'JAVA',280);
INSERT INTO tech VALUES(nextVal('tech_seq'),'JS',270);
INSERT INTO tech VALUES(nextVal('tech_seq'),'C#',200);
INSERT INTO tech VALUES(nextVal('tech_seq'),'Python',271);
INSERT INTO tech VALUES(nextVal('tech_seq'),'C++',90);