package ss18_String_Regex.thuc_hanh.validateEmail;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào email: ");
        String email = scanner.nextLine();
        RegexEmail regexEmail = new RegexEmail();
        boolean booleans = regexEmail.validate(email);
        System.out.println(booleans);
    }
}
