package strategy;

public class Characterrr {
    public void attack(String human){
        if(human == "Magic"){
            System.out.println("파이어볼 발사~!");
        } else if(human == "Sword"){
            System.out.println("검으로 배기 !");
        } else{
            System.out.println("없음");
        }
    }

    public static void main(String[] args) {
        String human = "Magic";

        Characterrr characterrr = new Characterrr();

        characterrr.attack(human);

        human = "Sword";
        characterrr.attack(human);


    }
}

