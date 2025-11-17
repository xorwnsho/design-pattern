package decorator.io;

public class Application {

    private static final String FILENAME = "decorator_data.txt";

    public static void main(String[] args) {
        String salaryRecord = "Name: John Doe, Salary: 100000";

        // 1. 암호화 기능이 추가된 데코레이터를 사용하여 데이터 저장
        DataSource encryptedDataSource = new EncryptionDecorator(
                                            new FileDataSource(FILENAME));
        encryptedDataSource.writeData(salaryRecord);
        System.out.println("암호화된 데이터가 파일에 저장되었습니다.");


        // 2. 일반 FileDataSource를 사용하여 파일 내용 확인 (암호화된 채로 보임)
        DataSource plainDataSource = new FileDataSource(FILENAME);
        System.out.println("\n--- 일반 파일 리더로 읽은 내용 (암호화된 원본) ---");
        System.out.println(plainDataSource.readData());


        // 3. 암호화 데코레이터가 포함된 리더로 파일 내용 확인 (복호화됨)
        System.out.println("\n--- 암호화 데코레이터로 읽은 내용 (복호화됨) ---");
        System.out.println(encryptedDataSource.readData());
    }
}
