package dio.desafio.designpatterns.iterator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConsultasController {

    private final List<Consulta> consultas;

    ConsultasController() {
        this.consultas = List.of(
                new Consulta(TipoConsulta.DENTISTA, "Iury Damasceno", LocalDate.of(2023, 9, 26)),
                new Consulta(TipoConsulta.DENTISTA, "João Freitas", LocalDate.of(2023, 9, 27)),
                new Consulta(TipoConsulta.DENTISTA, "Maria Antunes", LocalDate.of(2023, 9, 28)),
                new Consulta(TipoConsulta.NUTRICIONISTA, "Iury Damasceno", LocalDate.of(2023, 10, 12)),
                new Consulta(TipoConsulta.NUTRICIONISTA, "Thiago Cardoso", LocalDate.of(2023, 10, 6)),
                new Consulta(TipoConsulta.PSIQUIATRA, "Iury Damasceno", LocalDate.of(2023, 10, 19)),
                new Consulta(TipoConsulta.PSIQUIATRA, "Thiago Cardoso", LocalDate.of(2023, 11, 1)),
                new Consulta(TipoConsulta.OFTALMOLOGISTA, "João Freitas", LocalDate.of(2023, 11, 3)));
    }

    public Iterator<Consulta> iterator(TipoConsulta tipoConsulta) {
        List<Consulta> consultasFiltradas = new ArrayList<>();

        if (tipoConsulta.equals(TipoConsulta.ANY)){
            return consultas.iterator();
        }
        for (Consulta consulta : consultas) {
            if (consulta.getTipoConsulta().equals(tipoConsulta)) {
                consultasFiltradas.add(consulta);
            }
        }

        return consultasFiltradas.iterator();
    }

    public List<Consulta> getConsultas() {
        return this.consultas;
    }

}
