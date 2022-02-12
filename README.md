# Problem setting up H2 init runscript. File is not found when script is not in classpath root folder

## Error description



```
org.h2.jdbc.JdbcSQLNonTransientException: IO Exception: 
"java.io.FileNotFoundException: resource /desktop/core/database/databaseCreation.sql"; 
"classpath:desktop/core/database/databaseCreation.sql"; 
SQL statement: RUNSCRIPT FROM 'classpath:desktop/core/database/databaseCreation.sql' [90031-210]
```


## Setup

- h2 database v2.1.210 with custom creation script path :

  `jdbc:h2:mem:;INIT=RUNSCRIPT FROM 'classpath:desktop/core/database/databaseCreation.sql'`

## Tests

**Run tests with `mvn spring-boot:run`**

1. Database is created with correct table.
2. Database table contains initial values.
3. Column constraints are applied

## Results

Cannot replicate error

## Conclusion

Possibles issues:
- recreation of the issue is incomplete/incorrect
- path to the script contains special characters/whitespaces
- DataSource setup causes nested file to be ignored