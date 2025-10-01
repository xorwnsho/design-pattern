package strategy;

import strategy.strategies.MagicStrategy;
import strategy.strategies.SwordStrategy;

public class Main {
    public static void main(String[] args) {
        Character character = new Character();
        System.out.println("게임 시작! 새로운 캐릭터사 생성됨.");

        System.out.println("\n검 장착");
        character.setAttackStrategy(new SwordStrategy());
        character.doSomething();

        System.out.println("\n마법 지팡이로 무기 교체");
        character.setAttackStrategy(new MagicStrategy());
        character.doSomething();


    }
}
