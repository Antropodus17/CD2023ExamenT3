# Exámen CD T3

## Ejercicio 1 

Coloqué la clase CunetaBancaria.java dentro del proyecto de maven en `//proyecto/main/java/examencd.local`

Inserté un comentario de javadoc antes de cada método, atributo, clase y paquete para luego ejecutar los siguientes comandos.

```bash
 cd //proyecto

 mvn compile
 mvn javadoc:javadoc
```
La documentación se aloja en `//proyecto/target/site/apidocs`

## Ejercicio 2

Coloqué la clase CunetaBancariaTest.java dentro del proyecto de maven en `//proyecto/test/java/examencd.local`

Revisé que estuvieran las pruebas definidas y que tuviesen sentido

Ejecute los siguientes comandos.
```bash
cd //proyecto

mvn test
```
El resultado se aloja en el e2.png dentro del directorio img

## Ejercicio 3

Crear la clase App y realizar lo pedido en el metodo main.

Ir al pom.xml y dentro de la dependencia del jar configurar la clase a iniciar mediant la siguiente estructura de etiquetas.
```xml
<configuration>
    <archive>
        <manifest>
            <mainClass>
                {paquete.Clase}
            </mainClass>
        </manifest>
    </archive>
</configuration>
```

Una vez configurado procedo a crear el jar.
```bash
 cd //proyecto

 mvn package
```

Esto creará el .jar en `//proyecto/target`

Para ejecutarlo y probar si funciona, ejecutamos lo siguient.

```bash
cd //proyecto/target

java -jar {nombreJar}.jar
```