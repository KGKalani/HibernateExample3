CREATE TABLE EMP123 (
   ID NUMBER(10,0) NOT NULL ENABLE,
   FIRST_NAME VARCHAR2(20),
   LAST_NAME  VARCHAR(20),
   SALARY FLOAT(126),
   CONSTRAINT EMP123_PK PRIMARY KEY (ID)
);

CREATE SEQUENCE emp123_sequence;