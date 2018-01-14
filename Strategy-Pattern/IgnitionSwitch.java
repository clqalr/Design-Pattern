/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.pattern;

/**
 *
 * @author Bit
 */
public class IgnitionSwitch implements EngineBehavior {

    @Override
    public void start() {
        System.out.println("Engine started by using a key...");
    }

    @Override
    public void stop() {
        System.out.println("Engine stopped by using a key....");
    }
    
    
}
