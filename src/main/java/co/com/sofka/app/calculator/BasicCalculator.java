package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Double sumar(Double numero1, Double numero2) {
        logger.info("Summing {} + {}", numero1, numero2);
        return numero1 + numero2;
    }

    public Double  restar(Double numero1,Double numero2) {
        logger.info("Subtracting {} - {}", numero1, numero2);
        return numero1 - numero2;
    }

    public Double multiplicar(Double numero1, Double numero2) {
        logger.info("Multiplication {} * {}", numero1, numero2);
        return numero1 * numero2;

    }

    public Double dividir(Double numero1, Double numero2) {
        logger.info( "Division {} / {}", numero1, numero2 );
        if(numero2 == 0){
            throw new RuntimeException("No es posible realizar la división por cero");
        }
        return numero1 / numero2;
    }

}
