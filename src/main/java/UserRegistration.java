import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean firstName(String fname){
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        return pattern.matcher(fname).matches();
    }

    public boolean lastName(String lname) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        return pattern.matcher(lname).matches();
    }
}
