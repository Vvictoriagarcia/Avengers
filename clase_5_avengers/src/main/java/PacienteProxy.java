import java.util.Date;

public class PacienteProxy implements Vacuna{

    @Override
    public void vacunar(Paciente p) throws PacienteVacunarException, FechaException {
        if(p.isVacunado()){
            throw new PacienteVacunarException("El paciente ya esta vacunado");
        }
        Date now = new Date();
        if(now.before(p.getFecha())){
            throw new FechaException("pestaniaste, usted es precoz");
        }
        p.setVacunado(true);
        System.out.println("Has sido vacunado REY");
    }
}
