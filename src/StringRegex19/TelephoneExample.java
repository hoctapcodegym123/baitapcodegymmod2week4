package StringRegex19;

public class TelephoneExample {
    public final static String REGEX_TEL = "\\(\\d{2}\\)\\-\\(0\\d{9}\\)";


    public static void main(String[] args) {
        String telephone = "(34)-(0123456789)";
        System.out.println(telephone.matches(REGEX_TEL));
    }

}

//done
