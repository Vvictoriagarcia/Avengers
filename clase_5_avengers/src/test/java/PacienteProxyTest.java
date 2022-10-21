import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class PacienteProxyTest {

    @Test
    @DisplayName("Cuando un paciente se quiere vacunar pero esta vacunado")
    public void test1() throws PacienteVacunarException, FechaException {
        //GIVEN
        var paciente1 = new Paciente("ariel", "cofone", "20023424", new Date(2022-1900,9,21));
        var pacienteProxy = new PacienteProxy();
        //WHEN
        pacienteProxy.vacunar(paciente1);

        //EXPECTED
        assertThrows(PacienteVacunarException.class, () -> pacienteProxy.vacunar(paciente1));
    }

    @Test
    @DisplayName("Cuando un paciente se quiere vacunar antes de fecha")
    public void test2() throws PacienteVacunarException, FechaException {
        //GIVEN
        var paciente2 = new Paciente("ariel", "cofone", "20023424", new Date(2022-1900,10,21));
        var pacienteProxy1 = new PacienteProxy();

        //WHEN

        //EXPECTED
        assertThrows(FechaException.class, () -> pacienteProxy1.vacunar(paciente2));
    }

}