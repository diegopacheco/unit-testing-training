## unit-testing-training

Java Unit-Testing-Training is a sandbox code for the xunit testing training.

## What we are building

So we are building a basic bank. We need to develop the following business capabilities:
* A) The USER must have the ability to *deposit* money.
* B) The USER must have the ability to *withdraw* money.
* C) The USER must have the ability to *check* his money balance.
* D) The USER must have the ability to *transf* his money to other account with 5% bank fees.
* E) The USER must have the ability to *save* his money into savings account where he will get %22 gains per minute with 2% bank fee on the *withdraw*.

## What do we need todo

1. We will talk with the "Discovery" team who did a poor job discoverying stuff to "extract" requirements.

2. We will DESIGN the minimal solution and grow as we need it. We need at least 1 diagran.

3. We need create proper unit tests that validate the core-features and also validate the proper happy path but also the corner-cases or failure scenatios as well.

4. As we implement the tests we will implemet the business capabilities and refactor the code. We should be running the tests all the time.

## House Rules

1. No Frameworks or external libs are allowed.

2. You can do this training in pairs.

3. A "PO" might ask you to change anything at anytime, so your code must be working ALWAYS, all the TIME.

4. You cannot create BRANCHS to make the CODE STABLE.

## In order to generate the project in Eclipse / Intelij
```bash
~/.gradle/init.gradle
```
```bash
allprojects {

  apply plugin: 'eclipse'
  apply plugin: 'idea'

   tasks.withType(JavaExec) {
      if (System.getProperty('DEBUG', 'false') == 'true') {
         jvmArgs '-Xdebug', '-Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=9009'
      }
   }

}
```
```bash
./gradlew eclipse 
```
After that you can import on your ide. 
