package day32_stringBuilder;

public class C05_subSequence {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Kayra");

        sb.substring(0, 3);
        // Bu method String dondurdugu icin StringBuilder eski halini degistiremez

        System.out.println(sb); // Kayra

        sb.subSequence(0, 3);

        System.out.println(sb); // Kayra

    }
}
