package strategy.pattern;

/**
 *
 * @author Bit
 */
public class Sonata extends Car {
    Sonata() {
        name = "Sonata";
        eb = new IgnitionSwitch(); // Let's say Sonata uses ignition switch system
    }
}
