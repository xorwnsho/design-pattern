package strategy.strategies;

import strategy.AttackStrategy;

public class SwordStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("검으로 베기!");
    }
}
