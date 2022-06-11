## Compilar el proyecto

mvn clean package

## Ejecutar proyecto

mvn spring-boot:run


##Peticion GET resolver, 
## Recibe idprestamo y iteraciones como params

## Servicio Resolver
curl --location --request GET 'http://localhost:8887/resolver/datos?idprestamo=5&iteraciones=7' \
--header 'Content-Type: application/json' \
--data-raw ''

##Respuesta

{
    "id": 0,
    "input_array": "10,15,9,7,11"
}