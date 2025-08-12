# Pago API

Repositorio en GitHub: [https://github.com/zaidepilef/pago-api.git](https://github.com/zaidepilef/pago-api.git)

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

## Prueba Standalone

Puedes probar el endpoint principal usando `curl`:

```sh
curl -X POST http://localhost:8080/procesar-orden \
  -H "Content-Type: application/json" \
  -d '{"campo1":"valor1","campo2":"valor2"}'
```

Reemplaza los campos del JSON según la estructura esperada por tu API.

Si recibes una respuesta como esta:

```json
{
    "timestamp": "2025-08-12T05:39:22.262+00:00",
    "status": 404,
    "error": "Not Found",
    "path": "/procesar-orden"
}
```

Significa que el endpoint `/procesar-orden` no está implementado o la ruta es incorrecta. Verifica la configuración de tus controladores en