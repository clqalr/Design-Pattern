package strategy.pattern;

/**
 *
 * @author Bit
 */
public class Corolla extends Car {
       
    Corolla() {
        name = "Corolla";
        eb = new SmartKey(); // Let's say Corolla uses smart key system
    }
}
