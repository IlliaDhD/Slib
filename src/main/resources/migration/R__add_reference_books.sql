-- Authors
INSERT INTO t_author (id, name) VALUES ('666246cb-4148-4464-b7e8-d1390cb0dacf', 'Емма Стоун');
INSERT INTO t_author (id, name) VALUES ('cde96ae0-13d2-4755-bd3b-620823a286fc', 'Олексій Харчук');
INSERT INTO t_author (id, name) VALUES ('c5129619-faef-412d-ad1b-b1a1ededac53', 'Марія Коваль');
INSERT INTO t_author (id, name) VALUES ('1903a697-7184-4147-8dba-63561ae1c1bc', 'Антуан Леру');
INSERT INTO t_author (id, name) VALUES ('2153fa5b-bf31-45a3-a53b-adc0c49806c8', 'Діана Шульц');
INSERT INTO t_author (id, name) VALUES ('e7a5b4ad-1b7b-4fe2-92d0-9ef91f0ec695', 'Ігор Вернигора');
INSERT INTO t_author (id, name) VALUES ('e805fec7-3dd9-4055-a201-54e1d0be8f80', 'Наталя Сайко');
INSERT INTO t_author (id, name) VALUES ('76b72205-1e0f-44ee-a2d2-5fc2ccb96b2b', 'Мартін Келлі');
INSERT INTO t_author (id, name) VALUES ('336a826a-d99b-4827-bdfc-ffc7015de991', 'Стефанія Моро');
INSERT INTO t_author (id, name) VALUES ('3918002c-4cf2-4dd6-9dfd-dd303f8876fc', 'Ярослав Прут');

-- Genres
INSERT INTO t_genre (id, genre) VALUES ('a81c8d79-4d10-4578-9e19-efffabdd39a5', 'Фантастика');
INSERT INTO t_genre (id, genre) VALUES ('34c8983a-0758-4345-91a4-fa1670509a8a', 'Детектив');
INSERT INTO t_genre (id, genre) VALUES ('24b67d14-0322-4071-a7bd-ff355afd8594', 'Містика');
INSERT INTO t_genre (id, genre) VALUES ('795f301c-bf4f-4423-b418-b19f629ebd2d', 'Роман');
INSERT INTO t_genre (id, genre) VALUES ('08c7a34e-f321-4c3a-9c88-d1819b1eb5e7', 'Трилер');
INSERT INTO t_genre (id, genre) VALUES ('ca0f5a88-57a0-4d9d-9ab1-5ea0c17e956f', 'Біографія');
INSERT INTO t_genre (id, genre) VALUES ('fabb511a-d20b-45ad-939c-3fdef1c7ce22', 'Історичний');
INSERT INTO t_genre (id, genre) VALUES ('c4c420aa-3a6c-4438-b30b-242af5236e5b', 'Науково-популярна');
INSERT INTO t_genre (id, genre) VALUES ('ff8356b5-a6c2-4ad2-a3a0-a636574a89ea', 'Психологічний');
INSERT INTO t_genre (id, genre) VALUES ('6aefb144-0641-4afd-980c-d3faaddfdb3e', 'Пригодницький');

-- Tags
INSERT INTO t_tag (id, tag) VALUES ('63b2ebf9-ec7e-4623-b265-b32009cdb484', 'неочікуваний сюжет');
INSERT INTO t_tag (id, tag) VALUES ('8211be4d-9ee3-4048-a0ad-8167ad1f5fa1', 'відкритий кінець');
INSERT INTO t_tag (id, tag) VALUES ('bad2bf4c-e9d9-47ff-a5f3-c1cce78abf50', 'глибока філософія');
INSERT INTO t_tag (id, tag) VALUES ('658d007d-5748-4837-8b79-173d1f78d170', 'чорний гумор');
INSERT INTO t_tag (id, tag) VALUES ('1b8d9da5-5f78-4dc5-8ac0-1cec1b0a13fb', 'емоційний кінець');
INSERT INTO t_tag (id, tag) VALUES ('90d1e60b-7685-4e89-8ff7-fbcd397e2b55', 'любовна лінія');
INSERT INTO t_tag (id, tag) VALUES ('8cd4d6c0-1578-49a9-ad38-34191c820e70', 'сильна головна героїня');
INSERT INTO t_tag (id, tag) VALUES ('9abbcdf7-3c4f-446b-a417-a54c885d9395', 'психологічна напруга');
INSERT INTO t_tag (id, tag) VALUES ('85e62417-1929-475c-944c-2bdb4767679c', 'засновано на реальних подіях');
INSERT INTO t_tag (id, tag) VALUES ('bda661ca-a83f-4e8d-a0f3-86674dc5412b', 'драматичний поворот');

-- Books
INSERT INTO t_book (id, name, annotation, image, year, author, genre) VALUES ('f8b58267-080e-4ef5-aaf7-260e8ef8e842', 'Тіні над містом', 'Анотація до книги ''Тіні над містом''...', 'тіні_над_містом.jpg', 2018, '2153fa5b-bf31-45a3-a53b-adc0c49806c8', '34c8983a-0758-4345-91a4-fa1670509a8a');
INSERT INTO t_book (id, name, annotation, image, year, author, genre) VALUES ('f7fc522a-3c45-4fba-8bb2-05e77854359f', 'Дорога до себе', 'Анотація до книги ''Дорога до себе''...', 'дорога_до_себе.jpg', 2021, '1903a697-7184-4147-8dba-63561ae1c1bc', 'fabb511a-d20b-45ad-939c-3fdef1c7ce22');
INSERT INTO t_book (id, name, annotation, image, year, author, genre) VALUES ('46bd4c70-4cf8-4e61-b581-99a01bc0a9a4', 'Зламані крила', 'Анотація до книги ''Зламані крила''...', 'зламані_крила.jpg', 2024, '1903a697-7184-4147-8dba-63561ae1c1bc', 'ca0f5a88-57a0-4d9d-9ab1-5ea0c17e956f');
INSERT INTO t_book (id, name, annotation, image, year, author, genre) VALUES ('b78c3189-f348-432a-9831-c2eb4af359c5', 'Після дощу', 'Анотація до книги ''Після дощу''...', 'після_дощу.jpg', 1991, '1903a697-7184-4147-8dba-63561ae1c1bc', 'c4c420aa-3a6c-4438-b30b-242af5236e5b');
INSERT INTO t_book (id, name, annotation, image, year, author, genre) VALUES ('b92a7787-682d-4780-b833-ff6888ecfac0', 'Мовчазна ніч', 'Анотація до книги ''Мовчазна ніч''...', 'мовчазна_ніч.jpg', 2008, '1903a697-7184-4147-8dba-63561ae1c1bc', '08c7a34e-f321-4c3a-9c88-d1819b1eb5e7');
INSERT INTO t_book (id, name, annotation, image, year, author, genre) VALUES ('dd1d4db3-e820-40bc-9025-bd2f5805afc1', 'Сторінки забуття', 'Анотація до книги ''Сторінки забуття''...', 'сторінки_забуття.jpg', 1999, '76b72205-1e0f-44ee-a2d2-5fc2ccb96b2b', 'ff8356b5-a6c2-4ad2-a3a0-a636574a89ea');
INSERT INTO t_book (id, name, annotation, image, year, author, genre) VALUES ('989f16f5-b439-40c7-9759-f80dc4c5cfe5', 'Скляний лабіринт', 'Анотація до книги ''Скляний лабіринт''...', 'скляний_лабіринт.jpg', 2003, 'e805fec7-3dd9-4055-a201-54e1d0be8f80', '24b67d14-0322-4071-a7bd-ff355afd8594');
INSERT INTO t_book (id, name, annotation, image, year, author, genre) VALUES ('31a38178-bb4e-443b-a388-9f306fa5959a', 'Код долі', 'Анотація до книги ''Код долі''...', 'код_долі.jpg', 2013, '1903a697-7184-4147-8dba-63561ae1c1bc', 'a81c8d79-4d10-4578-9e19-efffabdd39a5');
INSERT INTO t_book (id, name, annotation, image, year, author, genre) VALUES ('74ed5039-0f06-423a-9554-d09ea08d1822', 'Полум’я пам’яті', 'Анотація до книги ''Полум’я пам’яті''...', 'полум’я_пам’яті.jpg', 2000, '336a826a-d99b-4827-bdfc-ffc7015de991', 'c4c420aa-3a6c-4438-b30b-242af5236e5b');
INSERT INTO t_book (id, name, annotation, image, year, author, genre) VALUES ('c43e38dc-39a4-4233-bdfd-e4b1cfa349af', 'Крила часу', 'Анотація до книги ''Крила часу''...', 'крила_часу.jpg', 2001, 'c5129619-faef-412d-ad1b-b1a1ededac53', 'a81c8d79-4d10-4578-9e19-efffabdd39a5');
INSERT INTO t_book (id, name, annotation, image, year, author, genre) VALUES ('9f1bd010-ad12-403c-85fc-982191a611e0', 'Під місяцем', 'Анотація до книги ''Під місяцем''...', 'під_місяцем.jpg', 1999, '336a826a-d99b-4827-bdfc-ffc7015de991', '24b67d14-0322-4071-a7bd-ff355afd8594');
INSERT INTO t_book (id, name, annotation, image, year, author, genre) VALUES ('9353c5af-fe64-4dc6-9a9e-ee10310765a2', 'Межа правди', 'Анотація до книги ''Межа правди''...', 'межа_правди.jpg', 1996, '1903a697-7184-4147-8dba-63561ae1c1bc', '6aefb144-0641-4afd-980c-d3faaddfdb3e');
INSERT INTO t_book (id, name, annotation, image, year, author, genre) VALUES ('c8aeb68c-e3f8-4ecf-accc-408d917224a6', 'Каміння в річці', 'Анотація до книги ''Каміння в річці''...', 'каміння_в_річці.jpg', 1998, '666246cb-4148-4464-b7e8-d1390cb0dacf', 'ff8356b5-a6c2-4ad2-a3a0-a636574a89ea');
INSERT INTO t_book (id, name, annotation, image, year, author, genre) VALUES ('e81df3ff-b1a0-4ec0-b121-d6dba4fc59cc', 'Голос минулого', 'Анотація до книги ''Голос минулого''...', 'голос_минулого.jpg', 1991, 'e805fec7-3dd9-4055-a201-54e1d0be8f80', 'ff8356b5-a6c2-4ad2-a3a0-a636574a89ea');
INSERT INTO t_book (id, name, annotation, image, year, author, genre) VALUES ('9b65c8c0-2c31-4839-a0b9-3a482f713002', 'Сліди на снігу', 'Анотація до книги ''Сліди на снігу''...', 'сліди_на_снігу.jpg', 1996, 'c5129619-faef-412d-ad1b-b1a1ededac53', 'a81c8d79-4d10-4578-9e19-efffabdd39a5');
INSERT INTO t_book (id, name, annotation, image, year, author, genre) VALUES ('df10535c-ca15-42ec-b4ef-060b74d7f17c', 'Замкнене коло', 'Анотація до книги ''Замкнене коло''...', 'замкнене_коло.jpg', 2011, 'cde96ae0-13d2-4755-bd3b-620823a286fc', '34c8983a-0758-4345-91a4-fa1670509a8a');
INSERT INTO t_book (id, name, annotation, image, year, author, genre) VALUES ('fd6133e7-bbee-4c73-8271-a3f55eabbe87', 'Останній погляд', 'Анотація до книги ''Останній погляд''...', 'останній_погляд.jpg', 2008, '3918002c-4cf2-4dd6-9dfd-dd303f8876fc', 'ca0f5a88-57a0-4d9d-9ab1-5ea0c17e956f');
INSERT INTO t_book (id, name, annotation, image, year, author, genre) VALUES ('f4d769cf-a852-4786-aa7c-f9b0c4c53c9c', 'Міст через мрії', 'Анотація до книги ''Міст через мрії''...', 'міст_через_мрії.jpg', 2009, 'e7a5b4ad-1b7b-4fe2-92d0-9ef91f0ec695', '24b67d14-0322-4071-a7bd-ff355afd8594');
INSERT INTO t_book (id, name, annotation, image, year, author, genre) VALUES ('2a913fa1-0203-4c4a-adcb-b0b570e1d8ce', 'Мелодія мовчання', 'Анотація до книги ''Мелодія мовчання''...', 'мелодія_мовчання.jpg', 2005, '666246cb-4148-4464-b7e8-d1390cb0dacf', 'c4c420aa-3a6c-4438-b30b-242af5236e5b');
INSERT INTO t_book (id, name, annotation, image, year, author, genre) VALUES ('1679fe89-f39d-4749-981d-4253a981b7d9', 'Лінія тиші', 'Анотація до книги ''Лінія тиші''...', 'лінія_тиші.jpg', 2004, 'e805fec7-3dd9-4055-a201-54e1d0be8f80', 'ff8356b5-a6c2-4ad2-a3a0-a636574a89ea');

-- Book Tags
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('f8b58267-080e-4ef5-aaf7-260e8ef8e842', '8211be4d-9ee3-4048-a0ad-8167ad1f5fa1');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('f8b58267-080e-4ef5-aaf7-260e8ef8e842', 'bad2bf4c-e9d9-47ff-a5f3-c1cce78abf50');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('f8b58267-080e-4ef5-aaf7-260e8ef8e842', '90d1e60b-7685-4e89-8ff7-fbcd397e2b55');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('f7fc522a-3c45-4fba-8bb2-05e77854359f', '8cd4d6c0-1578-49a9-ad38-34191c820e70');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('f7fc522a-3c45-4fba-8bb2-05e77854359f', 'bda661ca-a83f-4e8d-a0f3-86674dc5412b');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('46bd4c70-4cf8-4e61-b581-99a01bc0a9a4', '90d1e60b-7685-4e89-8ff7-fbcd397e2b55');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('46bd4c70-4cf8-4e61-b581-99a01bc0a9a4', '9abbcdf7-3c4f-446b-a417-a54c885d9395');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('b78c3189-f348-432a-9831-c2eb4af359c5', '1b8d9da5-5f78-4dc5-8ac0-1cec1b0a13fb');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('b78c3189-f348-432a-9831-c2eb4af359c5', '9abbcdf7-3c4f-446b-a417-a54c885d9395');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('b92a7787-682d-4780-b833-ff6888ecfac0', '9abbcdf7-3c4f-446b-a417-a54c885d9395');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('b92a7787-682d-4780-b833-ff6888ecfac0', '85e62417-1929-475c-944c-2bdb4767679c');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('b92a7787-682d-4780-b833-ff6888ecfac0', '8211be4d-9ee3-4048-a0ad-8167ad1f5fa1');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('dd1d4db3-e820-40bc-9025-bd2f5805afc1', '8211be4d-9ee3-4048-a0ad-8167ad1f5fa1');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('989f16f5-b439-40c7-9759-f80dc4c5cfe5', '9abbcdf7-3c4f-446b-a417-a54c885d9395');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('31a38178-bb4e-443b-a388-9f306fa5959a', '63b2ebf9-ec7e-4623-b265-b32009cdb484');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('31a38178-bb4e-443b-a388-9f306fa5959a', '8211be4d-9ee3-4048-a0ad-8167ad1f5fa1');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('31a38178-bb4e-443b-a388-9f306fa5959a', '9abbcdf7-3c4f-446b-a417-a54c885d9395');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('74ed5039-0f06-423a-9554-d09ea08d1822', '90d1e60b-7685-4e89-8ff7-fbcd397e2b55');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('c43e38dc-39a4-4233-bdfd-e4b1cfa349af', 'bad2bf4c-e9d9-47ff-a5f3-c1cce78abf50');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('c43e38dc-39a4-4233-bdfd-e4b1cfa349af', '63b2ebf9-ec7e-4623-b265-b32009cdb484');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('9f1bd010-ad12-403c-85fc-982191a611e0', '8cd4d6c0-1578-49a9-ad38-34191c820e70');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('9f1bd010-ad12-403c-85fc-982191a611e0', '90d1e60b-7685-4e89-8ff7-fbcd397e2b55');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('9f1bd010-ad12-403c-85fc-982191a611e0', '85e62417-1929-475c-944c-2bdb4767679c');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('9353c5af-fe64-4dc6-9a9e-ee10310765a2', 'bda661ca-a83f-4e8d-a0f3-86674dc5412b');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('c8aeb68c-e3f8-4ecf-accc-408d917224a6', 'bad2bf4c-e9d9-47ff-a5f3-c1cce78abf50');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('e81df3ff-b1a0-4ec0-b121-d6dba4fc59cc', '85e62417-1929-475c-944c-2bdb4767679c');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('e81df3ff-b1a0-4ec0-b121-d6dba4fc59cc', '658d007d-5748-4837-8b79-173d1f78d170');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('e81df3ff-b1a0-4ec0-b121-d6dba4fc59cc', '8211be4d-9ee3-4048-a0ad-8167ad1f5fa1');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('9b65c8c0-2c31-4839-a0b9-3a482f713002', '85e62417-1929-475c-944c-2bdb4767679c');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('9b65c8c0-2c31-4839-a0b9-3a482f713002', '8211be4d-9ee3-4048-a0ad-8167ad1f5fa1');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('9b65c8c0-2c31-4839-a0b9-3a482f713002', '90d1e60b-7685-4e89-8ff7-fbcd397e2b55');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('df10535c-ca15-42ec-b4ef-060b74d7f17c', '85e62417-1929-475c-944c-2bdb4767679c');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('fd6133e7-bbee-4c73-8271-a3f55eabbe87', '1b8d9da5-5f78-4dc5-8ac0-1cec1b0a13fb');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('f4d769cf-a852-4786-aa7c-f9b0c4c53c9c', '90d1e60b-7685-4e89-8ff7-fbcd397e2b55');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('f4d769cf-a852-4786-aa7c-f9b0c4c53c9c', '85e62417-1929-475c-944c-2bdb4767679c');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('f4d769cf-a852-4786-aa7c-f9b0c4c53c9c', '1b8d9da5-5f78-4dc5-8ac0-1cec1b0a13fb');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('2a913fa1-0203-4c4a-adcb-b0b570e1d8ce', '8cd4d6c0-1578-49a9-ad38-34191c820e70');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('1679fe89-f39d-4749-981d-4253a981b7d9', '1b8d9da5-5f78-4dc5-8ac0-1cec1b0a13fb');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('1679fe89-f39d-4749-981d-4253a981b7d9', 'bda661ca-a83f-4e8d-a0f3-86674dc5412b');
INSERT INTO t_book_tags (book_id, tag_id) VALUES ('1679fe89-f39d-4749-981d-4253a981b7d9', '63b2ebf9-ec7e-4623-b265-b32009cdb484');