package com.example.hw_three;
import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n=== 購物清單 ===");
                System.out.println("1. 新增商品");
                System.out.println("2. 查看清單");
                System.out.println("3. 刪除商品");
                System.out.println("0. 結束");
                System.out.print("請選擇功能：");

                String choice = scanner.nextLine().trim();

                switch (choice) {
                    case "1":
                        System.out.print("請輸入商品名稱：");
                        String name = scanner.nextLine().trim();

                        if (name.isEmpty()) {
                            System.out.println("商品名稱不能空白！");
                        } else {
                            items.add(name);
                            System.out.println("已新增：" + name);
                        }
                        break;

                    case "2":
                        if (items.isEmpty()) {
                            System.out.println("購物清單目前沒有商品。");
                        } else {
                            for (int i = 0; i < items.size(); i++) {
                                System.out.println(
                                        (i + 1) + ". " + items.get(i)
                                );
                            }
                        }
                        break;

                    case "3":
                        System.out.print("請輸入要刪除的商品名稱：");
                        String target = scanner.nextLine().trim();

                        if (items.remove(target)) {
                            System.out.println("已刪除：" + target);
                        } else {
                            System.out.println("找不到這個商品。");
                        }
                        break;

                    case "0":
                        System.out.println("程式結束。");
                        return;

                    default:
                        System.out.println("請輸入 0、1、2 或 3！");
                }
            }
        }
    }
}
