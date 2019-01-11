## Manage the homepage board Using Spring Framework

#### Environment
* IDE : Eclipse Oxygen.3a Release
* JDK : JAVA SE 9.0.1
* Tomcat : Tomcat 9.0.12
* Maven : Maven 3.3.9
* DB : Oracle-12c 
* Docker

#### Framework
* Spring 3.2.4
* MyBatis 3.2.2

#### build

*docker*
```
$ docker run --name oracle12c -d -p 59160:22 -p 59161:1521 -v sath89/oracle-12c
$ docker exec -it oracle12c sqlplus
$ lsof -PiTCP -sTCP:LISTEN
```


* localhost:8080/first/sample/~