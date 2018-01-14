package strategy.pattern;

/**
 *
 * @author Bit
 */
public class SmartKey implements EngineBehavior {

    @Override
    public void start() {
        System.out.println("Engine started by pushing a button...");
    }

    @Override
    public void stop() {
        System.out.println("Engine stopped by pushing a button...");
    }
    
}
