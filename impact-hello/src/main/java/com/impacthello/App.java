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
            System.out.println(CommandLine.Help.Ansi.AUTO.string(
        "@|red  .__                             __                           |@\n" +
        "@|red  |__| _____ ___________    _____/  |_    ____  ____   _____  |@\n" +
        "@|red  |  |/     \\\\____ \\__  \\ _/ ___\\   __\\ _/ ___\\/ __ \\ /     \\ |@\n" +
        "@|red  |  |  Y Y  \\  |_> > __ \\\\  \\___|  |   \\  \\__(  <_> )  Y Y  \\|@\n" +
        "@|red  |__|__|_|  /   __(____  /\\___  >__|    \\___  >____/|__|_|  /|@\n" +
        "@|red            \\/|__|       \\/     \\/            \\/            \\/ |@"
    ));

    System.out.println(CommandLine.Help.Ansi.AUTO.string(
        "\n@|bold,white   Built for impact.com — by Sachal Mohar|@\n"
    ));
    
    }
    public static void main(String[] args) {
        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
    }
}