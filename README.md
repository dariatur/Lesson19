# Lesson19
1. mvn versions:use-latest-versions
   ```
   [INFO] ------------------------------------------------------------------------
   [INFO] BUILD SUCCESS
   [INFO] ------------------------------------------------------------------------
   [INFO] Total time:  18.750 s
   [INFO] Finished at: 2025-02-23T18:41:13+01:00
   [INFO] ------------------------------------------------------------------------
2. mvn clean test -DsuiteXmlFile=src/test/resources/sauceDemo.xml
```
Tests run: 12, Failures: 0, Errors: 0, Skipped: 0

   [INFO] ------------------------------------------------------------------------
   [INFO] BUILD SUCCESS
   [INFO] ------------------------------------------------------------------------
   [INFO] Total time:  01:11 min
   [INFO] Finished at: 2025-02-23T19:07:02+01:00
   [INFO] ------------------------------------------------------------------------
```
3. mvn -Dtest=HeaderTest#openCartTest test
```
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  21.297 s
[INFO] Finished at: 2025-02-23T19:11:11+01:00
[INFO] ------------------------------------------------------------------------
```
4.mvn -Dusername=standard_user test (getProperty добавляла в тест с успешным логином)
```
Tests run: 12, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  01:09 min
[INFO] Finished at: 2025-02-23T19:29:24+01:00
[INFO] ------------------------------------------------------------------------
```


=======
## Login page:
1. Login with empty *username* field
2. Login with empty *password* field
3. Login with empty fields
4. Login with incorrect data
5. Login with correct data
   
## Header test:
1. Check if header is visible before login
2. Check if header is visible after login
3. Open cart link from header after login
4. Click on menu button and check if menu is open

## Products page
1. Check products count on page
2. Add a product to cart and check if it was actually added
3. Check if content of button 'add to cart' changes after adding

