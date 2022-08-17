package lambda_functional_programming;

import java.util.ArrayList;
import java.util.List;

public class Fp01 {
    /*
    1) Lambda (Functional Programming) Java 8 ile kullanılmaya başlanmıştır.
    2) Functional Programming'de "Ne yapılacak" (What to do) üzerine yoğunlaşılır.
       Structured Programming "Nasıl yapılacak" (How to do) üzerine yoğınlaşılır.
    3) Functional Programming, Arrays ve Collections ile kullanılır.
    4) "entrySet() methodu ile Map, Set'e dönüştürülerek Functional Programming'de kullanılabilir.

     */

    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);

        listElemanlariniYazdirStructured(liste);
        System.out.println();
        listElemanlariniYazdirFunctional(liste);

        System.out.println();
        ciftElemanlariYazdirStructured(liste);

        System.out.println();
        ciftElemanlariYazdirFunctional(liste);

        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);

        System.out.println();
        tekrarsizTekElemanlarininKupunuYazdir(liste);

        System.out.println();
        tekrarsizCiftElemanlarinKarelerininToplami(liste);

    }

    //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
    public static void listElemanlariniYazdirStructured(List<Integer> list) {

        for (Integer w : list) {

            System.out.print(w + " ");

        }
    }

    //1)Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void listElemanlariniYazdirFunctional(List<Integer> list) {

        list.stream().forEach(t -> System.out.print(t + " "));
        // Stream () u collection dan elementleri akisa dahil etmek icin ve () lara ulasmak icin kullanilir

    }

    //2) Cift list elemanlarini aynı satırda aralarında boşluk bırakarak
    // yazdıran bir method oluşturun.(Structured)

    public static void ciftElemanlariYazdirStructured(List<Integer> list) {

        for (Integer w : list) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }

    }

    //2) Cift list elemanlarini aynı satırda aralarında boşluk bırakarak
    // yazdıran bir method oluşturun.(Structured)


    public static void ciftElemanlariYazdirFunctional(List<Integer> list) {

        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));


    }
//3) Ardışık tek list elemanlarinin karelerini aynı satırda aralarında boşluk bırakarak
// yazdıran bir method oluşturun.(Functional)


    public static void tekElemanlarinKareleriniYazdir(List<Integer> list) {

        list.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));
        //elemanlarin degeri degisecekse map () kullanilir.
    }
//4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda
//  aralarında boşluk bırakarak yazdıran bir method oluşturun.

    public static void tekrarsizTekElemanlarininKupunuYazdir(List<Integer> list){

        list.stream().distinct().filter(t-> t%2==1).map(t->t*t*t).forEach(t-> System.out.print(t + " "));

    }

//5) Tekrarsız çift elemanlarin karelerinin toplamını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKarelerininToplami (List<Integer>list){

       Integer toplam = list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)-> t+u);
        System.out.println(toplam);






    }





















}