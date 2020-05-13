CREATE TABLE SKILL (
id NUMBER(11),
name VARCHAR(100),
CONSTRAINT SKILL_PK PRIMARY KEY (id));

CREATE TABLE PLAYER (
id NUMBER(11),
name VARCHAR(100),
country VARCHAR(100),
skill_id NUMBER(11),
CONSTRAINT skill_id_FK FOREIGN KEY (skill_id) REFERENCES SKILL(id),
CONSTRAINT PLAYER_PK PRIMARY KEY (id));


INSERT INTO SKILL(id, name)
VALUES (1, 'Batting');

INSERT INTO SKILL(id, name)
VALUES (2, 'Bowling');

INSERT INTO SKILL(id, name)
VALUES (3, 'Allrounder');

INSERT INTO SKILL(id, name)
VALUES (4, 'Wicket keeping batsman');

INSERT INTO PLAYER(id, name, country, skill_id)
VALUES (1, 'V Kohli', 'India', 1);

INSERT INTO PLAYER(id, name, country, skill_id)
VALUES (2, 'AB Develliers', 'South Africa', 1);

INSERT INTO PLAYER(id, name, country, skill_id)
VALUES (3, 'Bumrah', 'India', 2);

INSERT INTO PLAYER(id, name, country, skill_id)
VALUES (4, 'M Starc', 'Australia', 2);

INSERT INTO PLAYER(id, name, country, skill_id)
VALUES (5, 'R Jadeja', 'India', 3);

INSERT INTO PLAYER(id, name, country, skill_id)
VALUES (6, 'Al Hassan', 'Bangaldesh', 3);

INSERT INTO PLAYER(id, name, country, skill_id)
VALUES (7, 'MS Dhoni', 'India', 4);

INSERT INTO PLAYER(id, name, country, skill_id)
VALUES (8, 'A Gilchrist', 'Australia', 4);





