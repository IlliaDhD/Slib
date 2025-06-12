# SLib
## 🛠️ 1. Завантаження залежностей

Перед запуском переконайтеся, що у вас встановлені такі інструменти:

- [Docker](https://www.docker.com/get-started)
- [Docker Compose](https://docs.docker.com/compose/)
- [sbt (Scala Build Tool)](https://www.scala-sbt.org/)

> **Перевірка у терміналі:**
> ```bash
> docker --version
> docker compose version
> sbt --version
> ```

---

## 🧪 2. Створення `.env` файлу

Перед запуском необхідно створити файл `.env` у кореневій директорії проєкту з такими змінними:
```
DATABASE_NAME=your_database_name
DATABASE_USER=your_database_user
DATABASE_PASSWORD=your_database_password
```

> ⚠️ Файл `.env` автоматично підтягується `docker-compose`.

---

## 🚀 3. Збірка та запуск проєкту

Виконайте наступні команди у кореневій директорії проєкту:

```bash
sbt Docker/publishLocal
docker compose up
```