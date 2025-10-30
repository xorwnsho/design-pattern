package factory_method.pizza.style;

public class NYStyleCheesePizza implements Pizza {

    public NYStyleCheesePizza() {
        System.out.println("--- 뉴욕 스타일 치즈 피자 생성 ---");
    }

    @Override
    public void prepare() {
        System.out.println("뉴욕 : 얇은 도우와 소스를 준비");
    }

    @Override
    public void bake() {
        System.out.println("뉴욕 : 180도에서 15분 굽기");
    }

    @Override
    public void cut() {
        System.out.println("뉴욕 : 8조각으로 자르기");
    }

    @Override
    public void box() {
        System.out.println("뉴욕 : 공식 피자 상자에 포장");
    }
}
