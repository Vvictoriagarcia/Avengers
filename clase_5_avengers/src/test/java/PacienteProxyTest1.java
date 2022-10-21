import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class PacienteProxyTest1 {
    class PacienteProxyTest {

        @Test
        @DisplayName("Cuando un paciente se quiere vacunar pero esta vacunado")
        public void test1() throws PacienteVacunarException, FechaException {
            //GIVEN
            var paciente1 = new Paciente("ariel", "cofone", "20023424", new Date(2022,10,21));
            var pacienteProxy = new PacienteProxy();
            //WHEN
            pacienteProxy.vacunar(paciente1);

            //EXPECTED
            assertThrows(PacienteVacunarException.class, () -> pacienteProxy.vacunar(paciente1));
        }

    }
}
