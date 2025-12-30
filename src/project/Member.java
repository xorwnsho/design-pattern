package project;

public class Member {

    private String name;
    private Grade grade;

    public Member(String name, Grade grade) {
        this.name = name;
        this.grade = grade;
    }

    public Grade getGrade() {
        return grade;
    }
}
