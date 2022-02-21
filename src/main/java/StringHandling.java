public class StringHandling {
    public static void main(String[] args) {
        String str = new String("PhamManhHung");

        System.out.println(str.charAt(5));

        System.out.println(str.codePointAt(5));

        System.out.println(str.compareTo("abc"));

        System.out.println(str.concat("0509"));

        System.out.println(str.contains("Manh"));

        System.out.println(str.contentEquals("PhamManhHung"));
        System.out.println(str.contentEquals("PhamManh"));

        System.out.println(str.hashCode());

        System.out.println(str.indexOf(65));
        System.out.println(str.indexOf('n'));
        System.out.println(str.indexOf("am"));
        System.out.println(str.indexOf("ph"));

        System.out.println(str.lastIndexOf("n"));

        System.out.println(str.isEmpty());
        System.out.println("".isEmpty());

        System.out.println(str.length());
        System.out.println(str.replace('a', 'u'));

        System.out.println(str.startsWith("Pham"));
        System.out.println(str.startsWith("ham"));

        System.out.println(str.substring(4));
        System.out.println(str.substring(4, 5));

        System.out.println("   Hung   ".trim());

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        System.out.println(String.valueOf(123.3) + "0000");


    }
}
