/**
 * @author herisson.nogueira
 */

package br.com.herissonnogueira.observer;

import java.util.ArrayList;
import java.util.List;

public class Jornalista implements ISubject {

    public List<IObserver> observers = new ArrayList<>();

    private String titulo;

    @Override
    public void add(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAll(String titulo) {
        this.titulo = titulo;
        for (IObserver ob: this.observers) {
            ob.update(this);
        }
    }

    @Override
    public java.lang.String toString() {
        return "Jornalista{" +
                "titulo=" + titulo +
                '}';
    }
}
