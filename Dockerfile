FROM amazoncorretto:17
MAINTAINER gastyft
COPY target/cart-0.0.1-SNAPSHOT.jar cart-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/cart-0.0.1-SNAPSHOT.jar"]
