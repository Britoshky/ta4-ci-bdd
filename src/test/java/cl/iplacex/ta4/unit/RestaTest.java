package cl.iplacex.ta4.unit;

import cl.iplacex.ta4.core.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class RestaTest {
  @Test
  public void resta_dos_numeros_retorna_resultado_correcto() {
    Calculator calc = new Calculator();
    assertEquals(3, calc.resta(5, 2));
  }
}