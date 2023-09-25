package dio.desafio.designpatterns.iterator;

import java.util.Iterator;
import java.util.List;

public class ConsultasIterator implements Iterator<Consulta> {

    private final ConsultasController consultaController;
    private final TipoConsulta tipoConsulta;


    public ConsultasIterator(ConsultasController consultaController, TipoConsulta profissionalConsulta) {
        this.consultaController = consultaController;
        this.tipoConsulta = profissionalConsulta;
    }

    @Override
    public boolean hasNext() {
        return findNextIndex() >= 0;
    }

    @Override
    public Consulta next() {
        Integer index = findNextIndex();
        if (index > 0) {
            return consultaController.getConsultas().get(index);
        }
        return null;
    }

    public Integer findNextIndex() {
        List<Consulta> consultas = consultaController.getConsultas();
        Integer indexTemporario = -1;
        while (true) {
            indexTemporario += 1;
            if (indexTemporario >= consultas.size()) {
                indexTemporario = -1;
                break;
            }
            if (tipoConsulta.equals(TipoConsulta.ANY) || consultas.get(indexTemporario).getTipoConsulta().equals(tipoConsulta)) {
                break;
            }
        }
        return indexTemporario;
    }

}
