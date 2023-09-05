CREATE TABLE contacts (
  id BIGINT AUTO_INCREMENT NOT NULL,
   first_name VARCHAR(255) NOT NULL,
   last_name VARCHAR(255) NOT NULL,
   nickname VARCHAR(255) NULL,
   CONSTRAINT pk_contacts PRIMARY KEY (id)
);