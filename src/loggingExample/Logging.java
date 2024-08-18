package loggingExample;

class TerminalLogging{
    public void log(){
        System.out.println("Logging on terminal..");
    }
}

class FileLogging{
    public void write(){
        System.out.println("Logging on files..");
    }
}

class MyApp{
    public void logOnTerminal(){
        TerminalLogging tl = new TerminalLogging();
        tl.log();
    }
    public void logOnFile(){
        FileLogging fl = new FileLogging();
        fl.write();
    }
}

public class Logging {
    public static void main(String[] args) {
        MyApp myApp = new MyApp();
        myApp.logOnFile();
        myApp.logOnTerminal();
    }
}
