package factory_method.pizza.style;

public class ChicagoStyleCheesePizza implements Pizza {

    public ChicagoStyleCheesePizza() {
        System.out.println("--- 시카고 스타일 치즈 피자 생성 ---");
    }

    @Override
    public void prepare() {
        System.out.println("시카고 : 두꺼운 도우와 치즈를 듬뿍 준비");
    }

    @Override
    public void bake() {
        System.out.println("시카고 : 200도에서 25분 굽기");
    }

    @Override
    public void cut() {
        System.out.println("시카고 : 6조각으로 자르기");
    }

    @Override
    public void box() {
        System.out.println("시카고 : 튼튼한 피자 상자에 포장");
    }
}
