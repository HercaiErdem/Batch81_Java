package day39_exceptions;

import java.io.*;

public class C02_IcIceTryCatch {
    public static void main(String[] args) {
        int k;
        try {
            FileInputStream fis = new FileInputStream("src/day39_exceptions/Test.txt");
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosyadan bilgiler okunamadi");
        } catch (IOException e) {
            System.out.println("Dosya bulunamadi");
        }
    }
}