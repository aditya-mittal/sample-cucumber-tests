# Sample Cucumber Tests

### Run all tests
```bash
mvn clean test -Dcucumber.options="--tags @AllTests"
```

### Run only passing tests
```bash
mvn clean test -Dcucumber.filter.tags="@MyPassingTests"
```

### Run only failing tests
```bash
mvn clean test -Dcucumber.filter.tags="@MyFailingTests"
```