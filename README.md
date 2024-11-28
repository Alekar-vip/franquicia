# Configuración del Proyecto: Franquicia

Este proyecto está basado en **Spring Boot** con **Java 17** y utiliza **PostgreSQL** como base de datos. A continuación, se detallan los pasos para configurar y ejecutar el proyecto.

## Requisitos Previos

Antes de comenzar, asegúrate de tener lo siguiente instalado en tu máquina:

- **Java 17**: Asegúrate de tener **Java 17** instalado.
- **PostgreSQL**: Debes tener **PostgreSQL** instalado y ejecutándose.

## 1. Clonar el Proyecto

Primero, clona el proyecto a tu máquina local usando Git:

```bash
git clone https://github.com/Alekar-vip/franquicia.git
```


## 2. base de datos

CREATE DATABASE franquicia;

## 3. Ajustar la conexión a esta

# Configuración de PostgreSQL
spring.datasource.url=jdbc:postgresql://localhost:5432/franquicia_db
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=create
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect


## 4. Ejecutar build de gradle

./gradlew build


## 5. Api del proyecto 

http://localhost:8084/franquicia/api/create

{
"nombre": "MiFranquicia5"
}






