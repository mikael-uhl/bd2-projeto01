DROP DATABASE IF EXISTS byte_bank;

CREATE DATABASE byte_bank;

\c byte_bank;

CREATE TABLE conta
(
    numero        INT NOT NULL PRIMARY KEY,
    saldo         DECIMAL(10, 0) DEFAULT NULL,
    cliente_nome  VARCHAR(50)    DEFAULT NULL,
    cliente_cpf   VARCHAR(11)    DEFAULT NULL,
    cliente_email VARCHAR(50)    DEFAULT NULL
);