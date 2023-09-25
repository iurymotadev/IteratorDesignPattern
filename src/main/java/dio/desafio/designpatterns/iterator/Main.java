package dio.desafio.designpatterns.iterator;

import java.util.Iterator;

public class Main {

    private static final ConsultasController CONSULTAS_CONTROLLER = new ConsultasController();

    private static void consultasIteratorPorTipo(TipoConsulta tipoConsulta) {
        System.out.println("------------------------");
        if (tipoConsulta.equals(TipoConsulta.ANY)) {
            System.out.println("Todas as consultas:");
            Iterator<Consulta> consultaIterator = CONSULTAS_CONTROLLER.iterator(tipoConsulta);
            while (consultaIterator.hasNext()) {
                System.out.println(consultaIterator.next().toString());
            }
        }else{
            System.out.println("Consultas com o " + tipoConsulta + ":");
            Iterator<Consulta> consultaIterator = CONSULTAS_CONTROLLER.iterator(tipoConsulta);
            while (consultaIterator.hasNext()) {
                System.out.println(consultaIterator.next().toString());
            }
        }
    }

    public static void main(String[] args) {
        consultasIteratorPorTipo(TipoConsulta.ANY);
        consultasIteratorPorTipo(TipoConsulta.DENTISTA);
        consultasIteratorPorTipo(TipoConsulta.NUTRICIONISTA);
        consultasIteratorPorTipo(TipoConsulta.PSIQUIATRA);
        consultasIteratorPorTipo(TipoConsulta.OFTALMOLOGISTA);
    }
}