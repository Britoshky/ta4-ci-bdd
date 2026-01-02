package cl.iplacex.ta4.core;

public class AuthService {
  public boolean login(String user, String pass) {
    return "admin".equals(user) && "1234".equals(pass);
  }
}
