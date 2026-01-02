package cl.iplacex.ta4.unit;

import cl.iplacex.ta4.core.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class SumaTest {
  @Test
  public void suma_dos_numeros_retorna_resultado_correcto() {
    Calculator calc = new Calculator();
    assertEquals(5, calc.suma(2, 3));
  }
}