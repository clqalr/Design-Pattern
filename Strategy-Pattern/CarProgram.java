package strategy.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bit
 */
public class CarProgram {
    
    public void run()
    {
        List<Car> cars = new ArrayList<>();
        
        Car car = new Corolla();
        Car car2 = new Sonata();
        cars.add(car);
        cars.add(car2);
        
        moveCars(cars);
   
        startEngine(cars);
        moveCars(cars);
   
        changeIgnitionSystem(cars); // change all to ignition switch
        
        moveCars(cars);    
        stopEngine(cars);
        
        moveCars(cars);
    }
    
    private void startEngine(List<Car> cars) {
        for (Car car : cars) {
            car.startEngine();
        }
    }
    
    private void stopEngine(List<Car> cars) {
    for (Car car : cars) {
        car.stopEngine();
    }
    }
    
    private void moveCars(List<Car> cars)
    {
        for (Car car : cars) {
            car.display();
        }
    }
    
    private void changeIgnitionSystem(List<Car> cars)
    {
        for (Car car : cars) {
            car.changeIgnitionSys(new IgnitionSwitch());
        }
    }
}
