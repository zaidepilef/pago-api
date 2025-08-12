# Pago API

API REST de ejemplo construida con Spring Boot.

## Requisitos

- Java 23
- Maven

## Ejecución

1. Clona el repositorio.
2. Ejecuta el siguiente comando en la raíz del proyecto:

```sh
./mvnw spring-boot:run
```

En Windows, usa:

```sh
mvnw.cmd spring-boot:run
```

La API estará disponible en [http://localhost:8080](http://localhost:8080).

## Endpoint principal

- `POST /procesar-orden`

  Envía una orden en formato JSON para ser procesada.