package strategy;

public class Character {

    // design pattern시에 무조건 private으로 해라
    private AttackStrategy attackStrategy;

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void doSomething(){
        if(this.attackStrategy != null){
            this.attackStrategy.attack();
        } else{
            System.out.println("공격 방법이 설정되지 않았습니다.");
        }
    }
}
