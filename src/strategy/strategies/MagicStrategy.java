package strategy.strategies;

import strategy.AttackStrategy;

public class MagicStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("파이어볼 발사!");
    }
}
