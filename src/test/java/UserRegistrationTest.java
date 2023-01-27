import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class UserRegistrationTest {
 @Test
 public void givenFirstName_whenProper_shouldReturnTrue() {
  UserRegistration registration = new UserRegistration();
  boolean result = registration.firstName("Sai");
  Assertions.assertEquals(true,result);
 }

 @Test
 public void givenLastName_whenProper_shouldReturnTrue(){
  UserRegistration registration = new UserRegistration();
  boolean result = registration.lastName("Paul");
  Assertions.assertEquals(true,result);
 }
 
}
