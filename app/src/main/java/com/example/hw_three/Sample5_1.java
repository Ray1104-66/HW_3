package com.example.hw_three;
class Sample5_1 {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();
        car1.show();
        int[] test;
        test = new int[5];

        System.out.println("將值指定給test[10]");

        test[10] = 80;
        System.out.println("將80指定給test[10]");
        System.out.println("順利地執行完畢");
    }
}
class Car {
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

        System.out.println(
                "將車號設為" + num + "汽油量設為" + gas
        );
    }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + num);
    }
}