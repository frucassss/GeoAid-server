INSERT INTO quotes VALUES (0, 'You must accept that you might fail.');
INSERT INTO quotes VALUES (1, 'Everyone enjoys doing the kind of work for which he is best suited.');

//users
INSERT INTO users VALUES (0, 'John', 'Doe', '123 Main Street', 'none');
INSERT INTO users VALUES (1, 'Jane', 'Doe', '123 Main Street', 'company');
INSERT INTO users VALUES (2, 'John', 'Smith', '123 Main Street', 'company');
INSERT INTO users VALUES (3, 'Jane', 'Smith', '123 Main Street', 'standard');

//domes
insert into domes values (0, 'Lyneaut With Stofi', -23.88830978488233, -69.10460472106935);
insert into domes values (1, 'Vizes', -23.87351580987326, -69.10254478454591);
insert into domes values (2, 'Kurspa-In-Belgeewich', -23.876341315056486, -69.12589073181154);
insert into domes values (3, 'Ceumi Castle', -23.892979149921235, -69.12855148315431);

//comapnies
insert into companies values (0, 'Coca Cola', 'Food', 0.5, 1);
insert into companies values (1, 'Pepsi', 'Food', 0.5, 2);
insert into companies values (2, 'Apple', 'Technology', 0.5, 3);
insert into companies values (3, 'Samsung', 'Technology', 0.5, 4);
insert into companies values (4, 'Google', 'Technology', 0.5, 5);
insert into companies values (5, 'Microsoft', 'Technology', 0.5, 6);
insert into companies values (6, 'Facebook', 'Technology', 0.5, 7);
insert into companies values (7, 'Amazon', 'Technology', 0.5, 8);
insert into companies values (8, 'Netflix', 'Technology', 0.5, 9);
insert into companies values (9, 'Disney', 'Entertainment', 0.5, 10);
insert into companies values (10, 'Sony', 'Entertainment', 0.5, 11);
insert into companies values (11, 'Nintendo', 'Entertainment', 0.5, 12);
insert into companies values (12, 'Ubisoft', 'Entertainment', 0.5, 13);
insert into companies values (13, 'EA', 'Entertainment', 0.5, 14);
insert into companies values (14, 'Activision', 'Entertainment', 0.5, 15);
insert into companies values (15, 'Warner Bros', 'Entertainment', 0.5, 16);
insert into companies values (16, 'Universal', 'Entertainment', 0.5, 17);
insert into companies values (17, 'McDonalds', 'Food', 0.5, 18);

//oxygens leaks
insert into oxygen_leaks values (0, 'low', 0, '2022-01-01', -23.88830978488233, -69.10460472106935);
insert into oxygen_leaks values (1, 'medium', 1, '2022-06-26', -23.87351580987326, -69.10254478454591);
insert into oxygen_leaks values (2, 'high', 2, '2022-03-16', -23.876341315056486, -69.12589073181154);
insert into oxygen_leaks values (3, 'low', 1, '2022-11-04', -23.892979149921235, -69.12855148315431);
insert into oxygen_leaks values (4, 'medium', 2, '2022-12-01', -23.88830978488233, -69.10460472106935);
insert into oxygen_leaks values (5, 'high', 3, '2022-03-31', -23.87351580987326, -69.10254478454591);
insert into oxygen_leaks values (6, 'low', 2, '2022-05-19', -23.876341315056486, -69.12589073181154);
insert into oxygen_leaks values (7, 'medium', 3, '2022-09-28', -23.892979149921235, -69.12855148315431);
insert into oxygen_leaks values (8, 'high', 0, '2022-07-11', -23.88830978488233, -69.10460472106935);
insert into oxygen_leaks values (9, 'low', 3, '2022-08-22', -23.87351580987326, -69.10254478454591);
insert into oxygen_leaks values (10, 'medium', 0, '2022-10-03', -23.876341315056486, -69.12589073181154);
insert into oxygen_leaks values (11, 'high', 1, '2022-04-14', -23.892979149921235, -69.12855148315431);
insert into oxygen_leaks values (12, 'low', 0, '2022-02-25', -23.88830978488233, -69.10460472106935);

-- //population
-- insert into population values (0, 100, -23.88830978488233, -69.10460472106935);
-- insert into population values (1, 200, -23.87351580987326, -69.10254478454591);
-- insert into population values (2, 300, -23.876341315056486, -69.12589073181154);
-- insert into population values (3, 400, -23.892979149921235, -69.12855148315431);

//appointments
insert into appointments values (0, '2022-01-01', '12:00:00', 'Meeting with the CEO', 1, 'CEO');
insert into appointments values (1, '2022-01-01', '13:00:00', 'Meeting with the CTO', 1, 'CTO');
insert into appointments values (2, '2022-01-01', '14:00:00', 'Meeting with the CFO', 1, 'CFO');
insert into appointments values (3, '2022-01-01', '15:00:00', 'Meeting with the COO', 1, 'COO');
insert into appointments values (4, '2022-01-01', '16:00:00', 'Meeting with the CMO', 1, 'CMO');
insert into appointments values (5, '2022-01-01', '17:00:00', 'Meeting with the CIO', 1, 'CIO');
insert into appointments values (6, '2022-01-01', '18:00:00', 'Meeting with the CDO', 1, 'CDO');