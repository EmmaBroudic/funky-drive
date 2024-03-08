# Utilisation de l'image officielle de PostgreSQL
FROM postgres:latest

# Exécution de commandes SQL au démarrage
COPY ./backend/src/main/resources/data-postgres.sql /docker-entrypoint-initdb.d/

# Exposition du port par défaut
EXPOSE 5432