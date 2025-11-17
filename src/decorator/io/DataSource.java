package decorator.io;

public interface DataSource {
    void writeData(String data);
    String readData();
}
