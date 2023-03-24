--liquibase formatted sql

--changeset ramyaraju:1557208625043-1
CREATE TABLE employee (id BIGINT NOT NULL, name VARCHAR(20));