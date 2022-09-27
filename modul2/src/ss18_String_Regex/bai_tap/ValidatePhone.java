package ss18_String_Regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    private static String REGEX_NUMBER_PHONE = "^([(]84[)][-][(]0)[\\d]{8}[)]$";   //(84)-(0xxxxxxxx)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số điện thoại: ");
        String number = scanner.nextLine();
        Pattern pattern = Pattern.compile(REGEX_NUMBER_PHONE);
        Matcher matcher = pattern.matcher(number);
        boolean isPhone = matcher.matches();
        System.out.println(isPhone);
    }
}
