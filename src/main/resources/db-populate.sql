INSERT INTO quotes VALUES (0, 'You must accept that you might fail.');
INSERT INTO quotes VALUES (1, 'Everyone enjoys doing the kind of work for which he is best suited.');

//users
INSERT INTO users VALUES (0, 'John', 'Doe', '123 Main Street', 'none');
INSERT INTO users VALUES (1, 'Jane', 'Doe', '123 Main Street', 'company');
INSERT INTO users VALUES (2, 'John', 'Smith', '123 Main Street', 'company');
INSERT INTO users VALUES (3, 'Jane', 'Smith', '123 Main Street', 'standard');

//domes
insert into domes values (0, 'Stofi', -23.88830978488233, -69.10460472106935, 11114567898.324);
insert into domes values (1, 'Vizes', -26.89251580987326, -67.10254478454591, 11114567898.324);
insert into domes values (2, 'Belgeewich', -29.878641315056486, -62.12589073181154, 11114567898.324);
insert into domes values (3, 'Castelia', -24.897979149921235, -67.12855148315431, 11114567898.324);
insert into domes values (4, 'Schiaparelli', -24.876341365435415056486, -70.12589073181154, 11114567898.324);
insert into domes values (5, 'Ceumi', -22.892979149921235, -67.12855148315431, 11114567898.852);
insert into domes values (6, 'Birmingham', -20.892979149921235, -66.12855148315431, 11114567898.852);
insert into domes values (7, 'Kurspa', -25.876341315056488, -67.12589073181154, 11114567898.324);
insert into domes values (8, 'Digeste', -24.892979149921235, -66.13215687431, 11114567898.852);
insert into domes values (9, 'Ckal', -26.876341315056586, -666.12589073181154, 11114567898.324);
insert into domes values (10, 'Chryse', -20.892979149921335, -64.12855148315431, 1114567898.324);
insert into domes values (11, 'Delphi', -28.876341315156486, -65.12589073181154, 1114567898.324);
insert into domes values (12, 'DELTA Quadrant', -25.892979149922235, -69.12855148315431, 1114567898.324);
insert into domes values (13, 'DELTA Vega', -23.876341325056486, -68.12589073181154, 1114567898.324);
insert into domes values (14, 'Cyndonia', -22.892979148921235, -67.12855148315431, 21114567898.324);

//companies
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
insert into companies values (18, 'GeoAid', 'Technology', 0.5, 19);


//oxygens leaks
insert into oxygen_leaks values (0, 'low', 0, '2022-01-01', -23.48330978288233, -69.1360672106935);
insert into oxygen_leaks values (1, 'low', 0, '2022-12-05', -23.85830478488233, -69.15360472106935);


insert into oxygen_leaks values (3, 'low', 0, '2022-11-01', -23.5830938488233, -69.15430472106935);
insert into oxygen_leaks values (4, 'low', 0, '2021-11-05', -23.58860978488233, -69.17460472106935);
insert into oxygen_leaks values (5, 'high', 0, '2023-01-11', -23.86830878488233, -69.12460672106935);


insert into oxygen_leaks values (7, 'medium', 1, '2021-12-05', -26.89221580987326, -67.34254478454591);
insert into oxygen_leaks values (8, 'high', 1, '2022-02-11', -26.82251580987326, -67.532254478454591);

insert into oxygen_leaks values (9, 'low', 1, '2022-09-01', -26.89551580987326, -67.19254478454591);
insert into oxygen_leaks values (10, 'medium', 1, '2021-11-05', -26.82251580987326, -67.12254478454591);
insert into oxygen_leaks values (11, 'high', 1, '2023-02-11', -26.89256580987326, -67.30254478454591);

insert into oxygen_leaks values (12, 'low', 2, '2022-01-01', -29.878661315056486, -62.32589073181154);

insert into oxygen_leaks values (14, 'high', 2, '2022-02-11', -29.878691315056486, -62.22589073181154);

insert into oxygen_leaks values (15, 'high', 2, '2022-09-01', -29.871641315056486, -62.21589073181154);
insert into oxygen_leaks values (16, 'medium', 2, '2021-11-05', -29.858641315056486, -62.12589073181154);
insert into oxygen_leaks values (17, 'high', 2, '2023-05-11', -29.878641315056486, -62.13589073181154);

insert into oxygen_leaks values (18, 'low', 3, '2022-04-01', -24.897979159921235, -67.14855148315431);
insert into oxygen_leaks values (19, 'medium', 3, '2021-11-05', -24.897379149921235, -67.16855148315431);
insert into oxygen_leaks values (20, 'low', 3, '2023-12-11', -24.897976149921235, -67.19855148315431);

insert into oxygen_leaks values (21, 'low', 3, '2022-01-01', -24.897979249921235, -67.12855148315431);
insert into oxygen_leaks values (22, 'medium', 3, '2021-11-05', -24.892479149921235, -67.15855148315431);
insert into oxygen_leaks values (23, 'low', 3, '2023-04-11', -24.897955149921235, -67.09855148315431);

insert into oxygen_leaks values (24, 'low', 4, '2021-11-21', -24.8763412465435415056486, -70.20589073181154);

insert into oxygen_leaks values (26, 'high', 4, '2023-02-11', -24.876341645435415056486, -70.11589073181154);

insert into oxygen_leaks values (27, 'high', 4, '2022-01-01', -24.876341345435415056486, -70.10589073181154);
insert into oxygen_leaks values (28, 'medium', 4, '2021-12-05', -24.8763764365435415056486, -70.02589073181154);
insert into oxygen_leaks values (29, 'high', 4, '2023-02-12', -24.8763413335435415056486, -70.22589073181154);


insert into oxygen_leaks values (31, 'medium', 5, '2021-11-05', -22.8929791229921235, -67.14855148315431);
insert into oxygen_leaks values (32, 'low', 5, '2023-02-11', -22.892979149551235, -67.08855148315431);

insert into oxygen_leaks values (33, 'low', 5, '2022-11-01', -22.892979149932235, -67.16855148315431);
insert into oxygen_leaks values (34, 'medium', 5, '2021-11-05', -22.892979124921235, -67.11855148315431);
insert into oxygen_leaks values (35, 'high', 5, '2023-02-11', -22.892979149531235, -67.12855148315431);

insert into oxygen_leaks values (42, 'low', 6, '2022-09-01', -20.892979149923235, -66.14855148315431);
insert into oxygen_leaks values (43, 'medium', 6, '2021-10-05', -20.892979145921235, -66.13855148315431);
insert into oxygen_leaks values (44, 'medium', 6, '2023-12-11', -20.8929791499641235, -66.12855148315431);

insert into oxygen_leaks values (45, 'low', 6, '2022-01-01', -20.892979149922335, -66.07855148315431);

insert into oxygen_leaks values (47, 'high', 6, '2023-02-13', -20.8925379149921235, -66.09855148315431);

insert into oxygen_leaks values (48, 'medium', 7, '2022-01-01', -25.876323315056488, -67.08589073181154);
insert into oxygen_leaks values (49, 'medium', 7, '2021-11-05', -25.8764341315056488, -67.13589073181154);
insert into oxygen_leaks values (50, 'high', 7, '2023-02-11', -25.876354315056488, -67.12589073181154);

insert into oxygen_leaks values (51, 'low', 7, '2022-11-01', -25.876342315056488, -67.12589073181154);
insert into oxygen_leaks values (52, 'medium', 7, '2020-11-05', -25.873441315056488, -67.12589073181154);
insert into oxygen_leaks values (53, 'low', 7, '2023-05-11', -25.876334315056488, -67.12589073181154);

insert into oxygen_leaks values (54, 'high', 8, '2022-01-01', -24.892973449921235, -66.14215687431);

insert into oxygen_leaks values (56, 'high', 8, '2023-06-11', -24.892932149921235, -66.13215687431);

insert into oxygen_leaks values (57, 'low', 8, '2022-06-01', -24.892972449921235, -66.13215687431);
insert into oxygen_leaks values (58, 'medium', 8, '2021-11-05', -24.892479149921235, -66.13215687431);
insert into oxygen_leaks values (59, 'high', 8, '2023-06-11', -24.892924149921235, -66.13215687431);

insert into oxygen_leaks values (72, 'low', 9, '2021-01-01', -26.876353315056586, -66.13589073181154);
insert into oxygen_leaks values (73, 'low', 9, '2021-09-05', -26.87244341315056586, -66.09589073181154);
insert into oxygen_leaks values (74, 'high', 9, '2023-02-11', -26.876342415056586, -66.11589073181154);

insert into oxygen_leaks values (75, 'high', 9, '2022-01-09', -26.876341645056586, -66.12589073181154);
insert into oxygen_leaks values (76, 'medium', 9, '2021-11-05', -26.876251315056586, -66.12589073181154);
insert into oxygen_leaks values (77, 'high', 9, '2023-02-11', -26.876346415056586, -66.12589073181154);

insert into oxygen_leaks values (78, 'medium', 10, '2022-01-01', -20.8929796439921335, -64.13855148315431);

insert into oxygen_leaks values (80, 'high', 10, '2023-02-11', -20.8929792349921335, -64.10855148315431);

insert into oxygen_leaks values (81, 'low', 10, '2022-01-01', -20.8929791464321335, -64.162855148315431);
insert into oxygen_leaks values (82, 'medium', 10, '2021-10-05', -20.892979249921335, -64.0312855148315431);
insert into oxygen_leaks values (83, 'medium', 10, '2023-02-11', -20.892979142221335, -64.10855148315431);

insert into oxygen_leaks values (84, 'low', 11, '2022-01-01', -28.8763413155436486, -65.10589073181154);
insert into oxygen_leaks values (85, 'medium', 11, '2021-11-05', -28.876341364156486, -65.06589073181154);
;

insert into oxygen_leaks values (87, 'low', 11, '2022-01-01', -28.876341315143486, -65.12589073181154);
insert into oxygen_leaks values (88, 'medium', 11, '2021-11-05', -28.876341324156486, -65.12589073181154);
insert into oxygen_leaks values (89, 'medium', 11, '2023-07-11', -28.876341315246486, -65.12589073181154);

insert into oxygen_leaks values (90, 'low', 12, '2022-01-01', -25.892979149953235, -69.12855148315431);
insert into oxygen_leaks values (91, 'medium', 12, '2021-11-05', -25.892979123922235, -69.12855148315431);
insert into oxygen_leaks values (92, 'low', 12, '2023-02-11', -25.824979149922235, -69.12855148315431);

insert into oxygen_leaks values (93, 'low', 12, '2022-11-01', -25.895579149922235, -69.12855148315431);
insert into oxygen_leaks values (94, 'medium', 12, '2021-11-05', -25.855979149922235, -69.12855148315431);
insert into oxygen_leaks values (95, 'high', 12, '2023-02-11', -25.863979149922235, -69.12855148315431);

insert into oxygen_leaks values (96, 'low', 13, '2022-01-01', -23.8766491325056486, -68.12582073181154);
insert into oxygen_leaks values (97, 'high', 13, '2021-11-05', -23.8764341325056486, -68.12689073181154);


insert into oxygen_leaks values (99, 'low', 13, '2022-01-01', -23.8767761325059486, -68.12589073181454);
insert into oxygen_leaks values (100, 'medium', 13, '2021-11-05', -23.8766781325056486, -68.12589273181154);
insert into oxygen_leaks values (101, 'high', 13, '2023-02-11', -23.8763965325056486, -68.12589273181154);

insert into oxygen_leaks values (102, 'low', 14, '2022-01-01', -22.892964148921235, -67.12855148315431);

insert into oxygen_leaks values (104, 'low', 14, '2023-02-11', -22.892963148921235, -67.12855148315431);

insert into oxygen_leaks values (105, 'medium', 14, '2022-04-01', -22.892974348921235, -67.12855148315431);
insert into oxygen_leaks values (106, 'medium', 14, '2021-11-05', -22.8973479148921235, -67.12855148315431);
insert into oxygen_leaks values (107, 'high', 14, '2023-02-11', -22.892977448921235, -67.12855148315431);



//population
insert into population values (0, 100,0, -23.81830978488233, -69.12460472106935, 'MINE');
insert into population values (1, 120,1, -26.79251580987326, -67.14254478454591, 'COLONY');
insert into population values (2, 160,2, -29.778641315056486, -62.12589073181154, 'SURFACE');
insert into population values (3, 150,3, -24.837979149921235, -67.11855148315431, 'MINE');
insert into population values (4, 90,4, -24.826341365435415056486, -70.15589073181154, 'COLONY');
insert into population values (5, 110,5, -22.812979149921235, -67.11855148315431, 'SURFACE');
insert into population values (6, 160,6, -20.872979149921235, -66.14855148315431, 'MINE');
insert into population values (7, 80,7, -25.816341315056488, -67.12589073181154, 'COLONY');
insert into population values (8, 90,8, -24.992979149921235, -66.13215687431, 'SURFACE');
insert into population values (9, 120,9, -26.836341315056586, -666.12589073181154, 'MINE');
insert into population values (10, 130,10, -20.792979149921335, -64.09855148315431, 'COLONY');
insert into population values (11, 140,11, -28.872341315156486, -65.12589073181154, 'SURFACE');
insert into population values (12, 90,12, -25.792979149922235, -69.092855148315431, 'MINE');
insert into population values (13, 150,13, -23.8266491325056486, -68.082582073181154, 'COLONY');
insert into population values (14, 120,14, -22.812964148921235, -67.12855148315431, 'SURFACE');




//appointments
insert into appointments values (0, '2022-01-01', '12:00:00', 'Meeting with the CEO', 1, 'CEO');
insert into appointments values (1, '2022-01-01', '13:00:00', 'Meeting with the CTO', 1, 'CTO');


//medical dispatches
insert into medical_dispatches values (0, '2022-03-01', 0, -22.38830978488233, -69.10460472106935, 'AMBULANCE');
insert into medical_dispatches values (1, '2022-01-21', 3, -24.37351580987326, -69.10254478454591, 'POLICE');
insert into medical_dispatches values (2, '2021-01-01', 6, -23.576341315056486, -69.62589073181154, 'FIRE_DEPARTMENT');
insert into medical_dispatches values (3, '2022-09-01', 9, -23.892979149921235, -68.12855148315431, 'AMBULANCE');
insert into medical_dispatches values (4, '2023-01-01', 12, -23.18830978488233, -69.10460472106935, 'POLICE');




//meteor showers
insert into meteor_showers values (0, '2021-01-01', 1, -22.58830978488233, -69.10460472106935, 'MEDIUM');
insert into meteor_showers values (1, '2022-09-09', 4, -25.17351580987326, -69.10254478454591, 'LOW');
insert into meteor_showers values (2, '2021-06-01', 7, -24.176341315056486, -68.12589073181154, 'HIGH');
insert into meteor_showers values (3, '2022-06-01', 10, -23.192979149921235, -68.12855148315431, 'MEDIUM');
insert into meteor_showers values (4, '2022-01-01', 13, -23.88830978488233, -68.70460472106935, 'LOW');

//stupid ai
insert into meteor_showers values (5, '2022-02-01', 14, -22.58830978488233, -69.10460472106935, 'HIGH');
insert into meteor_showers values (6, '2021-04-01', 12, -25.17351580987326, -69.10254478454591, 'MEDIUM');
insert into meteor_showers values (7, '2023-01-01', 11, -24.176341315056486, -68.12589073181154, 'LOW');
insert into meteor_showers values (8, '2021-03-01', 10, -23.192979149921235, -68.12855148315431, 'HIGH');
insert into meteor_showers values (9, '2021-12-01', 9, -23.88830978488233, -68.70460472106935, 'MEDIUM');
insert into meteor_showers values (27, '2022-07-01', 0, -22.58830978488233, -69.10460472106935, 'LOW');
insert into meteor_showers values (28, '2022-03-01', 1, -25.17351580987326, -69.10254478454591, 'HIGH');
insert into meteor_showers values (29, '2023-02-01', 2, -24.176341315056486, -68.12589073181154, 'MEDIUM');
insert into meteor_showers values (30, '2022-12-01', 3, -23.192979149921235, -68.12855148315431, 'LOW');
insert into meteor_showers values (31, '2023-03-01', 4, -23.88830978488233, -68.70460472106935, 'HIGH');
insert into meteor_showers values (32, '2022-05-01', 5, -22.58830978488233, -69.10460472106935, 'MEDIUM');
insert into meteor_showers values (33, '2021-07-01', 6, -25.17351580987326, -69.10254478454591, 'LOW');
insert into meteor_showers values (34, '2022-04-01', 7, -24.176341315056486, -68.12589073181154, 'HIGH');
insert into meteor_showers values (35, '2023-04-01', 8, -23.192979149921235, -68.12855148315431, 'MEDIUM');
insert into meteor_showers values (36, '2022-08-01', 9, -23.88830978488233, -68.70460472106935, 'LOW');
insert into meteor_showers values (37, '2021-02-01', 10, -22.58830978488233, -69.10460472106935, 'HIGH');
insert into meteor_showers values (38, '2023-05-01', 11, -25.17351580987326, -69.10254478454591, 'MEDIUM');
insert into meteor_showers values (39, '2022-11-01', 12, -24.176341315056486, -68.12589073181154, 'LOW');
insert into meteor_showers values (40, '2022-01-01', 13, -23.192979149921235, -68.12855148315431, 'HIGH');
insert into meteor_showers values (41, '2022-10-01', 14, -23.88830978488233, -68.70460472106935, 'MEDIUM');
insert into meteor_showers values (42, '2023-06-01', 11, -22.58830978488233, -69.10460472106935, 'LOW');
insert into meteor_showers values (44, '2023-02-01', 14, -22.58830978488233, -69.10460472106935, 'LOW');
insert into meteor_showers values (45, '2022-03-01', 9, -25.17351580987326, -69.10254478454591, 'HIGH');
insert into meteor_showers values (46, '2022-12-01', 2, -24.176341315056486, -68.12589073181154, 'MEDIUM');
insert into meteor_showers values (47, '2023-03-01', 0, -23.192979149921235, -68.12855148315431, 'LOW');
insert into meteor_showers values (48, '2022-05-01', 12, -23.88830978488233, -68.70460472106935, 'HIGH');
insert into meteor_showers values (49, '2021-07-01', 4, -22.58830978488233, -69.10460472106935, 'MEDIUM');
insert into meteor_showers values (50, '2022-04-01', 7, -25.17351580987326, -69.10254478454591, 'LOW');
insert into meteor_showers values (51, '2023-04-01', 11, -24.176341315056486, -68.12589073181154, 'HIGH');
insert into meteor_showers values (52, '2022-08-01', 3, -23.192979149921235, -68.12855148315431, 'MEDIUM');
insert into meteor_showers values (53, '2021-02-01', 10, -23.88830978488233, -68.70460472106935, 'LOW');
insert into meteor_showers values (54, '2023-05-01', 5, -22.58830978488233, -69.10460472106935, 'HIGH');
insert into meteor_showers values (55, '2022-11-01', 14, -25.17351580987326, -69.10254478454591, 'MEDIUM');
insert into meteor_showers values (56, '2022-01-01', 8, -24.176341315056486, -68.12589073181154, 'LOW');
insert into meteor_showers values (57, '2022-10-01', 6, -23.192979149921235, -68.12855148315431, 'HIGH');
insert into meteor_showers values (58, '2023-06-01', 13, -23.88830978488233, -68.70460472106935, 'MEDIUM');
insert into meteor_showers values (59, '2021-08-01', 1, -22.58830978488233, -69.10460472106935, 'LOW');
insert into meteor_showers values (61, '2022-03-01', 11, -22.58830978488233, -69.10460472106935, 'LOW');
insert into meteor_showers values (62, '2023-02-01', 0, -25.17351580987326, -69.10254478454591, 'HIGH');
insert into meteor_showers values (63, '2022-12-01', 7, -24.176341315056486, -68.12589073181154, 'MEDIUM');
insert into meteor_showers values (64, '2023-03-01', 3, -23.192979149921235, -68.12855148315431, 'LOW');
insert into meteor_showers values (65, '2022-05-01', 12, -23.88830978488233, -68.70460472106935, 'HIGH');
insert into meteor_showers values (66, '2021-07-01', 9, -22.58830978488233, -69.10460472106935, 'MEDIUM');
insert into meteor_showers values (67, '2022-04-01', 5, -25.17351580987326, -69.10254478454591, 'LOW');
insert into meteor_showers values (68, '2023-04-01', 2, -24.176341315056486, -68.12589073181154, 'HIGH');
insert into meteor_showers values (69, '2022-08-01', 6, -23.192979149921235, -68.12855148315431, 'MEDIUM');
insert into meteor_showers values (70, '2021-02-01', 13, -23.88830978488233, -68.70460472106935, 'LOW');
insert into meteor_showers values (71, '2023-05-01', 10, -22.58830978488233, -69.10460472106935, 'HIGH');
insert into meteor_showers values (72, '2022-11-01', 14, -25.17351580987326, -69.10254478454591, 'MEDIUM');
insert into meteor_showers values (73, '2022-01-01', 1, -24.176341315056486, -68.12589073181154, 'LOW');
insert into meteor_showers values (74, '2022-10-01', 4, -23.192979149921235, -68.12855148315431, 'HIGH');
insert into meteor_showers values (75, '2023-06-01', 8, -23.88830978488233, -68.70460472106935, 'MEDIUM');



//dust storms
insert into dust_storms values (0, '2021-10-11', 2, -24.18830978488233, -69.10460472106935, 'MEDIUM');
insert into dust_storms values (1, '2022-11-11', 5, -23.87351580987326, -68.70254478454591, 'LOW');
insert into dust_storms values (2, '2021-11-10', 8, -24.276341315056486, -69.12589073181154, 'HIGH');
insert into dust_storms values (3, '2022-05-01', 11, -23.892979149921235, -70.12855148315431, 'MEDIUM');
insert into dust_storms values (4, '2023-01-12', 14, -22.88830978488233, -69.10460472106935, 'LOW');

insert into dust_storms values (20, '2023-02-01', 4, -24.18830978488233, -69.10460472106935, 'LOW');
insert into dust_storms values (21, '2022-03-01', 6, -23.87351580987326, -68.70254478454591, 'HIGH');
insert into dust_storms values (22, '2022-12-01', 12, -24.276341315056486, -69.12589073181154, 'MEDIUM');
insert into dust_storms values (23, '2023-03-01', 1, -23.892979149921235, -70.12855148315431, 'LOW');
insert into dust_storms values (24, '2022-05-01', 14, -22.88830978488233, -69.10460472106935, 'HIGH');
insert into dust_storms values (25, '2021-07-01', 10, -24.18830978488233, -69.10460472106935, 'MEDIUM');
insert into dust_storms values (26, '2022-04-01', 2, -23.87351580987326, -68.70254478454591, 'LOW');
insert into dust_storms values (27, '2023-04-01', 5, -24.276341315056486, -69.12589073181154, 'HIGH');
insert into dust_storms values (28, '2022-08-01', 3, -23.892979149921235, -70.12855148315431, 'MEDIUM');
insert into dust_storms values (29, '2021-02-01', 7, -22.88830978488233, -69.10460472106935, 'LOW');
insert into dust_storms values (30, '2023-05-01', 0, -24.18830978488233, -69.10460472106935, 'HIGH');
insert into dust_storms values (31, '2022-11-01', 11, -23.87351580987326, -68.70254478454591, 'MEDIUM');
insert into dust_storms values (32, '2022-01-01', 13, -24.276341315056486, -69.12589073181154, 'LOW');
insert into dust_storms values (33, '2022-10-01', 8, -23.892979149921235, -70.12855148315431, 'HIGH');
insert into dust_storms values (34, '2023-06-01', 9, -22.88830978488233, -69.10460472106935, 'MEDIUM');
insert into dust_storms values (35, '2021-08-01', 1, -24.18830978488233, -69.10460472106935, 'LOW');
insert into dust_storms values (40, '2023-02-01', 3, -24.18830978488233, -69.10460472106935, 'LOW');
insert into dust_storms values (41, '2022-03-01', 9, -23.87351580987326, -68.70254478454591, 'HIGH');
insert into dust_storms values (42, '2022-12-01', 2, -24.276341315056486, -69.12589073181154, 'MEDIUM');
insert into dust_storms values (43, '2023-03-01', 8, -23.892979149921235, -70.12855148315431, 'LOW');
insert into dust_storms values (44, '2022-05-01', 1, -22.88830978488233, -69.10460472106935, 'HIGH');
insert into dust_storms values (45, '2021-07-01', 10, -24.18830978488233, -69.10460472106935, 'MEDIUM');
insert into dust_storms values (46, '2022-04-01', 14, -23.87351580987326, -68.70254478454591, 'LOW');
insert into dust_storms values (47, '2023-04-01', 5, -24.276341315056486, -69.12589073181154, 'HIGH');
insert into dust_storms values (48, '2022-08-01', 6, -23.892979149921235, -70.12855148315431, 'MEDIUM');
insert into dust_storms values (49, '2021-02-01', 12, -22.88830978488233, -69.10460472106935, 'LOW');
insert into dust_storms values (50, '2023-05-01', 0, -24.18830978488233, -69.10460472106935, 'HIGH');
insert into dust_storms values (51, '2022-11-01', 7, -23.87351580987326, -68.70254478454591, 'MEDIUM');
insert into dust_storms values (52, '2022-01-01', 4, -24.276341315056486, -69.12589073181154, 'LOW');
insert into dust_storms values (53, '2022-10-01', 13, -23.892979149921235, -70.12855148315431, 'HIGH');
insert into dust_storms values (54, '2023-06-01', 11, -22.88830978488233, -69.10460472106935, 'MEDIUM');
insert into dust_storms values (55, '2021-08-01', 2, -24.18830978488233, -69.10460472106935, 'LOW');