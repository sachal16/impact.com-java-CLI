# impact-hello

A Java CLI built for impact.com using [picocli](https://picocli.info/).  
Prints a styled ASCII banner with ANSI color output.

Built by Sachal Mohar as part of the impact.com co-op application.

## Requirements

- Java 11+
- Maven

## Build

```bash
mvn compile
```

## Run

```bash
mvn exec:java -Dexec.mainClass="com.impacthello.App"
```

## Options

```bash
mvn exec:java -Dexec.mainClass="com.impacthello.App" -Dexec.args="--help"
mvn exec:java -Dexec.mainClass="com.impacthello.App" -Dexec.args="--version"
```
