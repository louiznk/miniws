# Mini webservice with spring-boot … [![Build Status](https://travis-ci.org/yyekhlef/miniws.svg?branch=master)](https://travis-ci.org/yyekhlef/miniws.svg?branch=master)

… with toggle feature using ToggleZ

## Run and test it

```bash
$ ./gradlew bootRun
# […]
```

And then go to 
- http://localhost:8080/todos   <- should work
- http://localhost:8080/todos/1 <- should work
- http://localhost:8080/todos/2 <- should work
- http://localhost:8080/date    <- should not work (that's what you need to make work conditionnaly)
