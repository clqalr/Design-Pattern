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
public class ObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewsPaperCompany newsPaperCompany = new NewsPaperCompany();
        Observer James = new JamesSubscriber();
        Observer Pete = new PeteSubscriber();
        
        newsPaperCompany.registerObserver(James);
        newsPaperCompany.registerObserver(Pete);
        
        newsPaperCompany.produceNewspaper("NewsPaper 10/24/2024");
        newsPaperCompany.notifyObservers();
        
        newsPaperCompany.removeObserver(James);
        
        newsPaperCompany.produceNewspaper("NewsPaper 10/25/2024");
        newsPaperCompany.notifyObservers();
    }
    
}
