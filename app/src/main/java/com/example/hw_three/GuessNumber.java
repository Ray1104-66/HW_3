package com.example.hw_three;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int answer = random.nextInt(100) + 1;
        int count = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== 猜數字遊戲 ===");
            System.out.println("請猜一個 1～100 的整數。");

            while (true) {
                System.out.print("你的答案：");

                // 檢查是否輸入整數
                if (!scanner.hasNextInt()) {
                    scanner.next();
                    System.out.println("請輸入整數！");
                    continue;
                }

                int guess = scanner.nextInt();

                if (guess < 1 || guess > 100) {
                    System.out.println("數字必須介於 1～100！");
                    continue;
                }

                count++;

                if (guess > answer) {
                    System.out.println("太大了！");
                } else if (guess < answer) {
                    System.out.println("太小了！");
                } else {
                    System.out.println("答對了！答案是 " + answer);
                    System.out.println("你總共猜了 " + count + " 次。");
                    break;
                }
            }
        }
    }
}
