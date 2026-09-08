[← Volver al inicio](../../README.md)

### Base de datos
Revise el motor de base de datos y la cadena de conexión a su base de datos en el archivo `application.properties` y actualízelo según corresponda. El proyecto está configurado para trabajar con MySQL, para cambiar de motor de base de datos actualice el archivo `pom.xml`

#### MySQL

Las dependencia incluida es:
```
    <!-- Conexión a base de datos -->
    <!-- Source: https://mvnrepository.com/artifact/com.mysql/mysql-connector-j -->
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <version>9.6.0</version>
        <scope>compile</scope>
    </dependency>
```

y en el archivo application.properties agregue la cadena de conexión:
```
    # JPA / Hibernate settings
    spring.jpa.database=mysql
    spring.jpa.show-sql=false
    spring.jpa.generate-ddl=true
    spring.jpa.hibernate.ddl-auto=update
    
    # Database connection
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    # Desde Spring Boot 3.1
    spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
    spring.datasource.url=jdbc:mysql://localhost:3306/rentalappdb
    spring.datasource.username=your_user
    spring.datasource.password=your_password
```

#### PostgreSQL

Para una conexión a postgresql considere la siguiente configuración en `pom.xml`

```
    <dependency>
        <groupId>org.postgresql</groupId>
        <artifactId>postgresql</artifactId>
        <scope>runtime</scope>
    </dependency>
 ```

o tambien opte por

 ```
    <!-- Source: https://mvnrepository.com/artifact/org.postgresql/postgresql -->
    <dependency>
        <groupId>org.postgresql</groupId>
        <artifactId>postgresql</artifactId>
        <version>42.7.10</version>
        <scope>compile</scope>
    </dependency>
```
Y la configuración de `application.properties`
```
    server.port=9090
    spring.jpa.database=postgresql
    spring.jpa.show-sql=false
    spring.jpa.hibernate.ddl-auto=update
    
    spring.datasource.driver-class-name=org.postgresql.Driver
    #Desde Spring Boot 3.1
    spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
    spring.datasource.url=jdbc:postgresql://localhost:5432/rentalappdb
    spring.datasource.username=your_user
    spring.datasource.password=your_password
```

En la mayoría de los casos, no es necesario incluir esta propiedad `spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect`. Hibernate 6 puede deducir el dialecto correcto basándose exclusivamente en la spring.datasource.url

#### MariaDB

Opte por usar la configuración de MariaDB si es que la configuración de MySQL le genera error, estos errores se deben a actualizaciones recientes de MySQL
Para una conexión a MariaDB considere la siguiente configuración en `pom.xml`

```
    <!-- Source: https://mvnrepository.com/artifact/org.mariadb.jdbc/mariadb-java-client -->
        <dependency>
            <groupId>org.mariadb.jdbc</groupId>
            <artifactId>mariadb-java-client</artifactId>
            <version>3.5.8</version>
            <scope>compile</scope>
        </dependency>
```
Y la configuración de `application.properties`
```
    # JPA / Hibernate settings
    spring.jpa.database=mysql
    spring.jpa.show-sql=true
    spring.jpa.hibernate.ddl-auto=update
    
    # Database connection
    spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
    spring.datasource.url=jdbc:mariadb://localhost:3306/rentalappdb
    spring.datasource.username=your_user
    spring.datasource.password=your_password
```

#### SQL Server
Para una conexión a SQL Server considere la siguiente configuración en `pom.xml`
```
    <!-- Source: https://mvnrepository.com/artifact/com.microsoft.sqlserver/mssql-jdbc -->
    <dependency>
        <groupId>com.microsoft.sqlserver</groupId>
        <artifactId>mssql-jdbc</artifactId>
        <version>13.5.1.jre11-preview</version>
        <scope>compile</scope>
    </dependency>
```

Y la configuración de `application.properties`
```
    spring.jpa.database=sql_server
    spring.jpa.show-sql=false
    spring.jpa.hibernate.ddl-auto=update

    spring.datasource.driver-class-name=com.microsoft.sqlserver.jdbc.SQLServerDriver
    # Desde Spring Boot 3.1 (Usa el dialecto adecuado para SQL Server)
    spring.jpa.database-platform=org.hibernate.dialect.SQLServerDialect
    # Modifica localhost, puerto y swapp16045 según tu entorno. 
    # "encrypt=false" evita errores de certificados SSL en entornos de desarrollo local.
    spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=swapp16046;encrypt=false;trustServerCertificate=true
    spring.datasource.username=tu_usuario_sql
    spring.datasource.password=tu_contraseña_sql
```

Para una autenticación de Windows se requieren en algunos casos configuraciones adiciones.
Agregue en `pom.xml`
```
    <!-- Soporte para Autenticación de Windows (Waffle) -->
    <dependency>
        <groupId>com.github.waffle</groupId>
        <artifactId>waffle-jna</artifactId>
        <version>3.4.0</version> <!-- Puedes usar la última versión disponible -->
    </dependency>
```

Y en `application.properties`
```
    spring.jpa.database=sql_server
    spring.jpa.show-sql=false
    spring.jpa.hibernate.ddl-auto=update
    
    spring.datasource.driver-class-name=com.microsoft.sqlserver.jdbc.SQLServerDriver
    spring.jpa.database-platform=org.hibernate.dialect.SQLServerDialect
    
    # integratedSecurity=true activa la Autenticación de Windows
    spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=swapp16045;integratedSecurity=true;encrypt=false;trustServerCertificate=true
```

### JPA

En el archivo archivo `pom.xml` agregue la dependencia
```
    <!-- Source: https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
        <version>4.1.1</version>
        <scope>compile</scope>
    </dependency>
```
