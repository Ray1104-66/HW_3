package com.example.hw_three;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TextFileDemo {
    public static void main(String[] args) {
        String fileName = "message.txt";

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== 文字檔案讀寫 ===");
            System.out.print("請輸入要儲存的文字：");

            String message = scanner.nextLine();

            try {
                // 寫入檔案，結束區塊時自動關閉資源
                try (BufferedWriter writer = new BufferedWriter(
                        new OutputStreamWriter(
                                new FileOutputStream(fileName),
                                StandardCharsets.UTF_8
                        ))) {

                    writer.write(message);
                    writer.newLine();
                }

                System.out.println("已儲存至：" + fileName);
                System.out.println("\n讀取檔案內容：");

                // 讀取檔案，結束區塊時自動關閉資源
                try (BufferedReader reader = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream(fileName),
                                StandardCharsets.UTF_8
                        ))) {

                    String line;

                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                }

            } catch (IOException e) {
                System.out.println("檔案操作失敗：" + e.getMessage());
            }
        }
    }
}
