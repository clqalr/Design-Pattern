/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

/**
 *
 * @author Bit
 */
public class PeteSubscriber implements Observer, NewsPaperSubscriber {

    private String newspaper;
    
    @Override
    public void update(String newspaper) {
        this.newspaper = newspaper;
        display();
    }

    @Override
    public void display() {
        // display newspaper
        System.out.println("Hi My name is Pete, and I have received my newspaper, "
                + "and it reads like this: " + newspaper);
    }
    
}
