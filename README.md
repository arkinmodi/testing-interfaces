# Testing Interfaces
This is a small demonstration on how to write tests against interfaces and have all implementations tested. The idea behind testing the interface instead of testing the implementations directly is encourage the idea of testing behavior instead of testing code, the core idea behind TDD/BDD.

The way that testing against interfaces is achieved is by having a contract based design pattern. All or majority of the tests are written against the target interface inside a test interface. This will act as our contract (e.g., [ListTestContract.java](src/test/java/com/arkinmodi/testinginterfaces/contract/ListTestContract.java)). Then each test implementation will implement this contract (e.g., [ArrayListTest.java](src/test/java/com/arkinmodi/testinginterfaces/impl/ArrayListTest.java)). This achieves all implementations having a shared set of tests, thus enforcing a specification for the target interface.

Each test implementation only needs to implement the `underTest()` method to resolve the interface into an implementation during runtime. This method can also perform any configurations the implementation needs (e.g., setting properties). If additional implementation specific steps are needed before running the tests (e.g., mocks), there are two ways to do this:
1. Create a before all/each setup method in the test implementation.
2. Create a custom implementation of the test inside the test implementation, insert the extra steps, and then call `super()` to run the original test.

> Reference: https://www.novatec-gmbh.de/blog/interface-contract-with-junit-5/

## Technology Stack
- Java 17
- Gradle 7
- JUnit 5
- AssertJ
- Spotless

### Notes

How to refresh dependencies.
```
./gradlew dependencies --write-locks --refresh-dependencies
```

How to run tests.
```
./gradlew clean test
```

How to run spotless (linter).
```
./gradlew spotlessApply
```
