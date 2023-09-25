package dio.desafio.designpatterns.iterator;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ManipuladorDeDatas {
    public static Long calcularDiasRestantesParaData(LocalDate dataAtual, LocalDate dataFutura) {
        return ChronoUnit.DAYS.between(dataAtual, dataFutura);
    }
}
