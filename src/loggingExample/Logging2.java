package loggingExample;

abstract class LoggerStrategy{
    abstract void log();
}

class TerminalLogging2 extends LoggerStrategy{

    @Override
    void log() {
        System.out.println("Logging on terminal..");
    }
}

class FileLogging2 extends LoggerStrategy{

    @Override
    void log() {
        System.out.println("Logging on file..");
    }
}


class Logger {
    private LoggerStrategy ls;
    public Logger(LoggerStrategy ls){
        this.ls = ls;
    }
    public void printLog(){
        this.ls.log();
    }
}

public class Logging2 {
    public static void main(String[] args) {
        LoggerStrategy terminal = new TerminalLogging2();
        LoggerStrategy file = new FileLogging2();

        Logger logOnTerminal = new Logger(terminal);
        logOnTerminal.printLog();

        Logger logOnFile = new Logger(file);
        logOnFile.printLog();
    }
}
