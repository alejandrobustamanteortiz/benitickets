#PASOS
____________

## 1 - Añadir dependencias al archivo Pom.xml y recargar maven.
## 2 - Consigurar conexión MySQL en application.properties
- Para iniciar MySQL en windows : Servicios
```java
spring.datasource.url=jdbc:mysql://localhost:3306/magpie?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=admin
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=create
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.main.banner-mode=off
spring.sql.init.mode=always // esta de momento no la ponemos
spring.jpa.defer-datasource-initialization=true // esta de momento no 
```

## 3 - Crear entidades
-  Introducir anotaciones encima de la clase:
```java
@Builder  
@AllArgsConstructor  
@NoArgsConstructor  
@Setter  
@Getter  
@Entity  
@ToString

```

- Atributo Id dentro de la clase
```java
@Id
private Long id
```

Ejemplo entidad Customer:

```java
package com.example.entities;  
  
  
import jakarta.persistence.Entity;  
import jakarta.persistence.GeneratedValue;  
import jakarta.persistence.GenerationType;  
import jakarta.persistence.Id;  
import lombok.*;

@Builder  
@AllArgsConstructor  
@NoArgsConstructor  
@Setter  
@Getter  
@Entity  
@ToString  
  
public class Customer {  
  
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;  
    String firstName;  
    String firstLastName;  
    String secondLastName;  
}
```


## 4 - Crear repositorio

### Contiene los métodos CRUD (Crear, leer, actualizar, y borrar )
+ findAll()
+ findById()
+ guardar
+ delete
## 5 - Crear servicio

+ Creamos la Intefaz servicio : CustomerService y añadimos los métodos CRUD.
+ Creamos la clase que implementa la interfaz: CustomerServiceImp y definimos los métodos.
	Aquí introducimos algunas anotaciones como:
	
	@Service (anotación que viene de Spring)
	@AllArgConstructor









## 6 - Crear controlador

* Crear clase controller
* Tiene un par de anotaciones: 
@Controller
@AllArgsContructor

Esta es la última clase, por donde entran las peticiones al navegador

