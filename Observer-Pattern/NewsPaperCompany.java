/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bit
 */
public class NewsPaperCompany implements Subject {
    private final ArrayList observers;
    private final List<String> newspapers; // Let's say newspaper is produced everyday
    
    public NewsPaperCompany() {
        observers = new ArrayList();
        newspapers = new ArrayList<>();
    }
    
    public void produceNewspaper(String content) {
        newspapers.add(content);
    }
    
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(newspapers.get(newspapers.size() - 1));
        }
    }
    
}
