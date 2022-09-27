package ss18_String_Regex.thuc_hanh.validateEmail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmail {
    private Pattern pattern;
    private Matcher matcher;
    public static String REGEX_EMAIL = "^[a-zA-Z0-9]+[a-zA-Z0-9]*@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)$";

    public RegexEmail(){
        pattern = Pattern.compile(REGEX_EMAIL);
    }

    public boolean validate(String email){
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
