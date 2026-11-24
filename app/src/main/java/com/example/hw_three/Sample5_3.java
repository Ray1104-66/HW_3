package pb;

class Sample5_3 {
    public static void main(String[] args) {
        pc.Car car1 = new pc.Car();
        car1.show();
    }
}
public class Car {
    private int num;
    private double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("已生產了汽車");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
    }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}