package dio.desafio.designpatterns.iterator;

import java.time.LocalDate;

public class Consulta {

    private TipoConsulta tipoConsulta;
    private String paciente;
    private LocalDate dia;

    public Consulta(TipoConsulta profisionalConsulta, String paciente, LocalDate dia) {
        this.tipoConsulta = profisionalConsulta;
        this.paciente = paciente;
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "Paciente: " + paciente + "; Dia: " + dia + ";";
    }

    public TipoConsulta getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(TipoConsulta tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }
}
