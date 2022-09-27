package ss18_String_Regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    private static String REGEX_CLASS = "^[CPG]{1}[0-9]{4}[G-M]$";  //C3018G

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile(REGEX_CLASS);
        System.out.println("Nhập vào tên class: ");
        String nameClass = scanner.nextLine();
        Matcher matcher = pattern.matcher(nameClass);
        boolean isvalidate = matcher.matches();
        System.out.println(isvalidate);
    }
}
