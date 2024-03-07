# Utilisation de l'image officielle de PostgreSQL
FROM postgres:latest

# Exécution de commandes SQL au démarrage
COPY ./SQL/init.sql /docker-entrypoint-initdb.d/

# Exposition du port par défaut
EXPOSE 5432