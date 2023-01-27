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

    public boolean email(String Email) {
        Pattern pattern = Pattern.compile("^[0-9a-zA-z]+([+.-_][0-9a-zA-Z]+)*"+
                "@([0-9a-zA-Z][-]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$");
        return pattern.matcher(Email).matches();
    }

    public boolean mobileNumber(String mobileNum) {
        Pattern pattern = Pattern.compile("^[0-9]{2}+\s[0-9]{10}$");
        return pattern.matcher(mobileNum).matches();
    }


    public boolean password(String uPassword) {
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])[a-zA-z]{8,}$");
        return pattern.matcher(uPassword).matches();
    }
}
