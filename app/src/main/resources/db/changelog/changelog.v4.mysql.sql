--liquibase formatted sql

--changeset ramyaraju:1557208625044-1
CREATE TABLE employee3 (id BIGINT NOT NULL, name VARCHAR(20));
