package main;

public class Main {
    public static void main(String[] args) {
        String number = "89 7655 6677 889900";
//        String mask = "XXXXXX******XXXX";
        String mask = "XXXXX*******XXXX";
        System.out.println(maskCardNumber(number, mask));
    }

    private static String maskCardNumber(String number, String mask) {
        number = number.replaceAll("\\s", "");
        return makeMask(number, mask);
    }

    private static String makeMask(String number, String mask) {
        int leftIndex = mask.indexOf('*');
        int rightIndex = mask.lastIndexOf('*');
        return number.substring(0, leftIndex) + number.substring(leftIndex, rightIndex).replaceAll("\\d", "*") + number.substring(rightIndex, number.length());
    }
}
