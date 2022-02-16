public class StringHandling {
    public static void main(String[] args){
        String str = new String("PhamManhHung");

        System.out.println(str.charAt(5));

        System.out.println(str.codePointAt(5));

        System.out.println(str.compareTo("abc"));

        System.out.println(str.concat("0509"));

        System.out.println(str.contains("Manh"));

        System.out.println(str.contentEquals("PhamManhHung"));
        System.out.println(str.contentEquals("PhamManh"));

        
    }
}
