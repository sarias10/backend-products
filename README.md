para empquetar la aplicación en un jar

./mvnw clean package

para poder usar el comando anterior, las variables (DB_URL, DB_USERNAME y DB_PASSWORD) ya deben estar exportadas

asi se ejecuta la imagen

java -jar target/backend-products-0.0.1-SNAPSHOT.jar


para construir una imagen de docker

docker build -t [nombre de la imagen de docker] .

para correr una imagen de docker

docker run -d \
  -e DB_URL=[url de la base de datos: HOST/NOMBRE DE BASE DE DATOS] \
  -e DB_USERNAME=[nombre del usuario de la base de datos] \
  -e DB_PASSWORD=[contraseña de base de datos] \
  -p [puerto externo]:[puerto interno del contenedor] \
  --name [nombre que se le va a poner al contenedor] \
  [nombre de la imagen de docker que se va a ejecutar]

ruta ejemplo:

si -p 3002:8082 entonces se debe consultar:

http://localhost:3002/products

porque 3002 es el puerto externo que conecta con el puerto 8082 interno de docker


para hacer login en el ecr

aws ecr get-login-password --region [region donde esta el ecr] | docker login --username AWS --password-stdin [id de la cuenta aws].dkr.ecr.[region donde esta el ecr].amazonaws.com


para hacer pull desde el ecr

prerequisitos:
- hacer login al ecr

docker pull [id de la cuenta aws].dkr.ecr.$[región del ecr].amazonaws.com/[nombre del repositorio ecr]:[etiqueta del ecr]


información general útil:

- 127.0.0.1 es la IP local, también llamada localhost.
Significa: "esta misma máquina" o "yo mismo".

