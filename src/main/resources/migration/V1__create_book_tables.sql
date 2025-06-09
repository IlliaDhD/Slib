CREATE TABLE t_author
(
    id   UUID PRIMARY KEY,
    name VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE t_genre
(
    id    UUID PRIMARY KEY,
    genre VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE t_book
(
    id         UUID PRIMARY KEY,
    name       VARCHAR(50) NOT NULL UNIQUE,
    annotation TEXT,
    image      VARCHAR(50) NOT NULL UNIQUE,
    year       INT         NOT NULL,
    author     UUID REFERENCES t_author (id),
    genre      UUID REFERENCES t_genre (id)
);

CREATE TABLE t_tag
(
    id         UUID PRIMARY KEY,
    tag       VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE t_book_tags
(
    book_id UUID REFERENCES t_book (id),
    tag_id  UUID REFERENCES t_tag (id)
);