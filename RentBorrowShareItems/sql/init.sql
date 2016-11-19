
--passwordAdmin123
INSERT INTO User (userId, username, password, verifyPassword, firstName, lastName, gender, email, enabled) VALUES (1, 'kedus', '123', NULL, 'chinzo', 'dandar', 1, 'bekidus@mail.co', 1);
INSERT INTO User (userId, username, password, verifyPassword, firstName, lastName, gender, email, enabled) VALUES (2, 'lez', '123', NULL, 'tamrat', 'tamrat', 1,  'lez@gmail.com',   1);
INSERT INTO User (userId, username, password, verifyPassword, firstName, lastName, gender, email, enabled) VALUES (3, 'rushina',  '123', NULL, 'kedus',   'kedus', 1,  'rushina@mail.com',     1);

INSERT INTO authorities (id, authority, userId) VALUES (1, 'ROLE_ADMIN', 1);
INSERT INTO authorities (id, authority, userId) VALUES (2, 'ROLE_ADMIN', 2);
INSERT INTO authorities (id, authority, userId) VALUES (3, 'ROLE_ADMIN', 3);







