package singleton.my_database;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class Logger {

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private Logger() {
        System.out.println("==============");
        System.out.println(">>> Logger Instance Created. Log file opened at : ");
        System.out.println("==============");
    }

    // Logger 클래스가 로드될 때, LoggerHolder는 로드되지 않고, getInstance()가 최초 호출되면 그때 단 1회 실행되어 INSTANCE 생성
    private static class LoggerHolder {
        private static final Logger INSTANCE = new Logger();
    }

    public static Logger getInstance() {
        return LoggerHolder.INSTANCE;
    }

    public void log(String className, String message) {
        String timestamp = LocalDateTime.now().format(formatter);
        System.out.println("[" + timestamp + " | " + className + "] " + message);
    }
}
