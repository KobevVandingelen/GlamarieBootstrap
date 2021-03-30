INSERT INTO USER(ID, USERNAME, PASSWORD, ROLE) VALUES
(nextval('user_seq'), 'Marie',
 '$2a$10$ikfZfmrAcf2UOTs5bvAgM.YPnMa2HN4qMw7Al5eV6jHzaYjsdkgNi',
 'ADMIN');
INSERT INTO USER(ID, USERNAME, PASSWORD, ROLE) VALUES
(nextval('user_seq'), 'kobe',
 '$2a$10$bcpHRi0Pf8PHhssHFdlMSexzGWpl0oXghBNqP8cavdVtlEelYGgf2',
 'USER');

INSERT INTO USER(ID, USERNAME, PASSWORD, ROLE) VALUES
(nextval('user_seq'), 'ilias',
 '$2a$10$bcpHRi0Pf8PHhssHFdlMSexzGWpl0oXghBNqP8cavdVtlEelYGgf2',
 'USER');




INSERT INTO PORTFOLIO (ID, PORTFOLIO_NAME)
values (nextval('portfolio_seq'), 'Effen nagels');

INSERT INTO PORTFOLIO (ID, PORTFOLIO_NAME)
values (nextval('portfolio_seq'), 'Glitter nagels');

INSERT INTO PORTFOLIO (ID, PORTFOLIO_NAME)
values (nextval('portfolio_seq'), 'Marble nagels');

INSERT INTO PORTFOLIO (ID, PORTFOLIO_NAME)
values (nextval('portfolio_seq'), 'Kerst nagels');

INSERT INTO PORTFOLIO (ID, PORTFOLIO_NAME)
values (nextval('portfolio_seq'), 'Unieke nagels');

INSERT INTO PORTFOLIO (ID, PORTFOLIO_NAME)
values (nextval('portfolio_seq'), 'Zomerse nagels');

INSERT INTO PORTFOLIO (ID, PORTFOLIO_NAME)
values (nextval('portfolio_seq'), 'French manicure nagels');

INSERT INTO PORTFOLIO (ID, PORTFOLIO_NAME)
values (nextval('portfolio_seq'), 'Baby boom');


INSERT INTO COLOR(ID, COLOR_NAME)
values (nextval('color_seq'), 'Wit');

INSERT INTO COLOR(ID, COLOR_NAME)
values (nextval('color_seq'), 'Blauw');

INSERT INTO COLOR(ID, COLOR_NAME)
values (nextval('color_seq'), 'Geel');

INSERT INTO COLOR(ID, COLOR_NAME)
values (nextval('color_seq'), 'Zwart');

INSERT INTO COLOR(ID, COLOR_NAME)
values (nextval('color_seq'), 'Rood');

INSERT INTO COLOR(ID, COLOR_NAME)
values (nextval('color_seq'), 'Paars');

INSERT INTO COLOR(ID, COLOR_NAME)
values (nextval('color_seq'), 'Bruin');

INSERT INTO COLOR(ID, COLOR_NAME)
values (nextval('color_seq'), 'Grijs');

INSERT INTO COLOR(ID, COLOR_NAME)
values (nextval('color_seq'), 'Roos');

INSERT INTO COLOR(ID, COLOR_NAME)
values (nextval('color_seq'), 'Groen');




INSERT INTO NAGEL_DETAIL(ID, BEHANDELING, PRIJS, DUUR)
values (nextval('nageldetail_seq'), 'Manicuur met nagellak', 15, '01:00 Uur');

INSERT INTO NAGEL_DETAIL(ID, BEHANDELING, PRIJS, DUUR)
values (nextval('nageldetail_seq'), 'Acrygel zonder verlenging', 30, '02:30 Uur');

INSERT INTO NAGEL_DETAIL(ID, BEHANDELING, PRIJS, DUUR)
values (nextval('nageldetail_seq'), 'Acrygel Met verlenging', 35, '03:00 Uur');

INSERT INTO NAGEL_DETAIL(ID, BEHANDELING, PRIJS, DUUR)
values (nextval('nageldetail_seq'), 'Gel zonder verlenging', 25, '02:30 Uur');

INSERT INTO NAGEL_DETAIL(ID, BEHANDELING, PRIJS, DUUR)
values (nextval('nageldetail_seq'), 'Gel Met verlenging', 30,'03:00 Uur');





INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Effen1Wit.jpg',1, 1, 1);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Effen2Blauw.jpg',2, 1, 1);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Effen3Roos.jpg',9, 1, 1);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Effen4Rood.jpg',5, 1,1);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Effen5Roos.jpg',9, 1,1);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Effen6Roos.jpg',9, 1,1);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Effen7Rood.jpg',5, 1,1);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Effen8Groen.jpg',10, 1,1);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Effen9Bruin.jpg',7, 1,1);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Effen10Roos.jpg',9, 1,1);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Effen11Blauw.jpg',2, 1,1);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Effen12Rood.jpg',5, 1,1);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Effen13Wit.jpg',1, 1,1);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Effen14Groen.jpg',10, 1,1);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Effen15Grijs.jpg',8, 1,1);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Effen16Roos.jpg',9, 1,1);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Effen17Wit.jpg',1, 1,1);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Effen18Bruin.jpg',7, 1,1);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Effen19Rood.jpg',5, 1,1);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Effen20Blauw.jpg',2, 1,1);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Effen21Blauw.jpg',2, 1,1);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Effen22Bruin.jpg',7, 1,1);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Effen23Zwart.jpg',4, 1,1);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Effen24Wit.jpg',1, 1,1);





INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/French1.jpg',9, 8, 3);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/French2.jpg',9, 7, 3);






INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Glitter1Wit.jpg',1, 2, 2);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Glitter2Bruin.jpg',7, 2, 2);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Glitter3Rood.jpg',5, 2,2);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Glitter4Wit.jpg',1, 2,2);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Glitter5Paars.jpg',6, 2,2);





INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Kerst1Wit.jpg',1, 4,2);


INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Kerst2Zwart.jpg',4, 4,2);






INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Marble1.jpg',1, 3,2);


INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Marble2.jpg',1, 3,2);


INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Marble3.jpg',1, 3,2);





INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Uniek1Zwart.jpg',4, 5,3);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Uniek2Zwart.jpg',4, 5,3);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Uniek3Wit.jpg',1, 5,3);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Uniek4Zwart.jpg',4, 5,3);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Uniek6Blauw.jpg',2, 5,3);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Uniek7Wit.jpg',1, 5,3);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Uniek8Wit.jpg',1, 5,3);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Uniek9Wit.jpg',1, 5,3);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Uniek10Bruin.jpg',7, 5,3);




INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Zomer1Rood.jpg',5, 6,1);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Zomer2Blauw.jpg',2, 6,1);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Zomer3Roos.jpg',9, 6,1);

INSERT INTO NAGEL (ID, STRING_PATH, COLOR_ID ,PORTFOLIO_ID, NAGEL_DETAIL_ID)
values (nextval('nagel_seq'),  '/img/Zomer4Wit.jpg',1, 6,1);


INSERT INTO AFSPRAAK(ID, BEHANDELING, DATE, TIME, USER_ID)
values (nextval('afspraak_seq'), 'Nagels', '2000-12-02', '12:00:00',1);

INSERT INTO AFSPRAAK(ID, BEHANDELING, DATE, TIME, USER_ID )
values (nextval('afspraak_seq'), 'Nagels', '2000-12-02', '12:00:00', 3);

INSERT INTO AFSPRAAK(ID, BEHANDELING, DATE, TIME, USER_ID )
values (nextval('afspraak_seq'), 'Nagels', '2000-12-02', '12:00:00', null );

INSERT INTO AFSPRAAK(ID, DATE, TIME )
values (nextval('afspraak_seq'), '2000-12-02', '12:00:00');













