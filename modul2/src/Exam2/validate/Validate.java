package Exam2.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private final String MA_BA = "^(BA)[-][0-9]{3}$";

//    private final String BA_VIP = "^(VIP)+[I | II | III]+$";
    public boolean testBenhAn(String benhAn){
        Pattern pattern = Pattern.compile(MA_BA);
        Matcher matcher = pattern.matcher(benhAn);
        boolean isValidate = matcher.matches();
        return isValidate;
    }

//    public boolean testMaVIP(String maVIP){
//        Pattern pattern = Pattern.compile(BA_VIP);
//        Matcher matcher = pattern.matcher(benhAn);
//        boolean isValidate = matcher.matches();
//        return isValidate;
//    }
}
