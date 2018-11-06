INSERT INTO classification (description)
SELECT 'Debe' FROM dual WHERE NOT EXISTS(SELECT description FROM classification WHERE description = 'Debe')
LIMIT 1;

INSERT INTO classification (description)
SELECT 'Haber' FROM dual WHERE NOT EXISTS(SELECT description FROM classification WHERE description = 'Haber')
LIMIT 1;

INSERT INTO category(name, comment, classificationId)
SELECT 'Alimentación', '', (SELECT id FROM classification WHERE description = 'Haber') FROM dual WHERE NOT EXISTS(SELECT name FROM category WHERE name = 'Alimentación')
LIMIT 1;

INSERT INTO category(name, comment, classificationId)
SELECT 'Transporte', '', (SELECT id FROM classification WHERE description = 'Haber') FROM dual WHERE NOT EXISTS(SELECT name FROM category WHERE name = 'Transporte')
LIMIT 1;

INSERT INTO category(name, comment, classificationId)
SELECT 'Salud', '', (SELECT id FROM classification WHERE description = 'Haber') FROM dual WHERE NOT EXISTS(SELECT name FROM category WHERE name = 'Salud')
LIMIT 1;

INSERT INTO category(name, comment, classificationId)
SELECT 'Educación', '', (SELECT id FROM classification WHERE description = 'Haber') FROM dual WHERE NOT EXISTS(SELECT name FROM category WHERE name = 'Educación')
LIMIT 1;

INSERT INTO category(name, comment, classificationId, fatherId)
SELECT 'Colegio Alterra', '', (SELECT id FROM classification WHERE description = 'Haber'), (SELECT id FROM category WHERE name = 'Educación') FROM dual WHERE NOT EXISTS(SELECT name FROM category WHERE name = 'Colegio Alterra')
LIMIT 1;

INSERT INTO category(name, comment, classificationId, fatherId)
SELECT 'USS', '', (SELECT id FROM classification WHERE description = 'Haber'), (SELECT id FROM category WHERE name = 'Educación') FROM dual WHERE NOT EXISTS(SELECT name FROM category WHERE name = 'USS')
LIMIT 1;

INSERT INTO category(name, comment, classificationId)
SELECT 'Diversión', '', (SELECT id FROM classification WHERE description = 'Haber') FROM dual WHERE NOT EXISTS(SELECT name FROM category WHERE name = 'Diversión')
LIMIT 1;

INSERT INTO category(name, comment, classificationId)
SELECT 'Cuentas y pagos', '', (SELECT id FROM classification WHERE description = 'Haber') FROM dual WHERE NOT EXISTS(SELECT name FROM category WHERE name = 'Cuentas y pagos')
LIMIT 1;