package cl.iplacex.ta4.bdd.helpers;

import cl.iplacex.ta4.core.AuthService;

public class AuthHelper {
  private final AuthService authService = new AuthService();

  public boolean intentarLogin(String user, String pass) {
    return authService.login(user, pass);
  }
}
