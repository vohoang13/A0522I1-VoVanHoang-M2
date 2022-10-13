package ss19_Case_Study.QuanLyResort.until;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateChiPhi {
    private static final String CHI_PHI = "^[0-9]*$";
    private Pattern pattern;
    private Matcher matcher;

    public ValidateChiPhi() {
        pattern = Pattern.compile(CHI_PHI);
    }

    public  boolean testChiPhi(String chiPhi) {
        Pattern pattern = Pattern.compile(CHI_PHI);
        Matcher matcher = pattern.matcher(chiPhi);
        boolean isValidate = matcher.matches();
        return isValidate;
    }
}
