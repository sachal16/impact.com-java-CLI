package com.impacthello;
import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(
    name = "impact-hello",
    mixinStandardHelpOptions = true,
    version = "1.0",
    description = "CLI tool built for impact.com job application"
)

public class App implements Runnable {
    public void run() {
        System.out.println("hi");
    }
    public static void main(String[] args) {
        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
    }
}