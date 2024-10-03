package AtividadeLocalDateTime1.util;

import java.time.Duration;
import java.time.LocalTime;

public class CalculoUtil {

        public static long calcularTempoEmAula(LocalTime entrada, LocalTime saida) {
            Duration duration = Duration.between(entrada, saida);
            return duration.toMinutes();
        }
}
