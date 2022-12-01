import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String str = "pathway";
        String string = "patHWay";
        String s1 = "";
        String s2 = "Pathway";
        String s3 = "    Pathway    ";

        System.out.println("index number: " + str.charAt(0));
        System.out.println("index number: " + str.charAt(4));
        System.out.println("find ASCII code: " + str.codePointAt(2) + " index number");
        System.out.println("find ASCII code: " + str.codePointBefore(2) + " before index number");
        System.out.println("compare to: " + str.compareTo(string) + " the letters are different");
        System.out.println("compare To Ignore Case: " + str.compareToIgnoreCase(string) + " capital letters doesn't matter");
        System.out.println("concat: " + str.concat(".dev"));
        System.out.println("contains: " + str.contains("hw") + " return true or false");
        System.out.println("containsEquals: " + str.contentEquals("pathway") + " return true or false");
        System.out.println("containsEquals: " + str.contentEquals("way") + " return true or false");
        System.out.println("endWith: " + str.endsWith("ay") + " return true or false");
        System.out.println("endWith: " + str.endsWith("ya") + " return true or false");
        System.out.println("startsWith: " + str.startsWith("p") + " return true or false");
        System.out.println("startsWith: " + str.startsWith("a") + " return true or false");
        System.out.println("equals: " + str.equals("pathway") + " the letters are same");
        System.out.println("equals Ignore Case: " + str.equalsIgnoreCase("PathWay") + " capital letters doesn't matter");
        System.out.println("index number: " + str.indexOf('p'));
        System.out.println("is Empty: " + s1.isEmpty() + " return true or false");
        System.out.println("is Empty: " + s2.isEmpty() + " return true or false");
        System.out.println("subString: " + str.substring(4));
        System.out.println("subString: " + str.substring(2,4));
        System.out.println("trim: " + s3.trim());
        System.out.println("to Lower Case: " + string.toLowerCase());
        System.out.println("to Upper Case: " + str.toUpperCase());



    }
}
