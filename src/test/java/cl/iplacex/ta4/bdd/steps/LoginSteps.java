package cl.iplacex.ta4.bdd.steps;

import cl.iplacex.ta4.bdd.helpers.AuthHelper;
import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class LoginSteps {
  private String user;
  private String pass;
  private boolean resultado;

  private final AuthHelper helper = new AuthHelper();

  @Given("que tengo el usuario {string} y la contraseña {string}")
  public void tengoCredenciales(String user, String pass) {
    this.user = user;
    this.pass = pass;
  }

  @When("intento iniciar sesión")
  public void intentoLogin() {
    this.resultado = helper.intentarLogin(user, pass);
  }

  @Then("el resultado del login debe ser {string}")
  public void validoResultado(String esperado) {
    if ("exitoso".equalsIgnoreCase(esperado)) {
      assertTrue(resultado);
    } else {
      assertFalse(resultado);
    }
  }
}
