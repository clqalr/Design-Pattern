package strategy.pattern;

/**
 *
 * @author Bit
 */
public abstract class Car {
    
    EngineBehavior eb;
    boolean hasStarted;
    String name;
    
    public void changeIgnitionSys(EngineBehavior eb) {
        this.eb = eb;
    }
    
    public void startEngine()
    {
        hasStarted = true;
        eb.start();
    }
    
    public void stopEngine()
    {
        hasStarted = false;
        eb.stop();
    }
    
    public void display() {
        if (hasStarted) {
            System.out.println(name + " moves...");
        } else {
            System.out.println(name + " can't move... Start your engine!");
        }
    }
}
