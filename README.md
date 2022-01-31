# micro-service

# Créer une image docker:
docker pull mysql:8.0

# Commande docker pour créer le contenair:
docker run --name mysqlDbT -p 8080:3306 -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=projet1 -d mysql:8.0

# Setting Spring application.properties:
spring.datasource.url=jdbc:mysql://localhost:8080/projet1

# Commande pour rentrer dans le contenair:
docker exec -it cc2e5bd63f503ac9a80a9ce0a1f62c0933ab8145dba7c4cd1462926462750ca9 bash


# Commande sql pour créer mon utilisateur:
mysql -u root -p
CREATE USER 'projet1'@'%' IDENTIFIED BY 'projet1';
GRANT ALL PRIVILEGES ON projet1.* TO 'projet1'@'%';
user projet1 password projet1