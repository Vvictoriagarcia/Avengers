import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class Paciente {
    private String nombre;
    private String apellido;
    private String DNI;
    private Date fecha;
    private boolean vacunado;

    public Paciente(String nombre, String apellido, String DNI, Date fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.fecha = fecha;
        this.vacunado = false;
    }
}
