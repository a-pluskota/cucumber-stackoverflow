
## Getting started  
  

#### Java, Java SDK  
* version 8 or higher  
* [documentation](https://docs.oracle.com/javase/8/docs/)  
  
#### Maven  
* version: 3.5.*  or higher
* [documentation](http://maven.apache.org/guides/)  
  
#### Browsers   
* Chrome  
* [official site](https://www.google.com/intl/pl_pl/chrome/)   
  
#### All dependencies from POM.xml  
```sh  
$ mvn dependency:resolve  
```  

#### Run tests: 
```sh  
$ mvn test 
```  
  
## Documentation  
#### Javadoc:
* ##### generate Javadoc:
```sh  
$ mvn javadoc:javadoc  
```  
* generated in file: 
```target/site/apidocs/index.html```
#### Logs:
* generated in file: 
```target/log4j/application-logs.log```

#### Screenshots:
* generated after every failed test in path: 
```target/screenshots```
 
## Run parameters  
To execute project with parameters, in command line type:   
```sh  
$ -Dname_of_parameter=value_of_parameter  
```  
#### Available parameters:
* ##### Chrome headless mode:
```sh  
$ -DHEADLESS_MODE=on
```  
* ##### Chosen test suit:
```sh  
$ -Dcucumber.options="--tags @SUIT_NAME "
```  
Available suits: ```SMOKE```, ```LOGIN_PAGE```, ```SIGNUP_PAGE```