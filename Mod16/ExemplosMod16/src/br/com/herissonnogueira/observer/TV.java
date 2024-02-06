/**
 * @author herisson.nogueira
 */

package br.com.herissonnogueira.observer;

public class TV implements IObserver {

    @Override
    public void update(ISubject subject) {
        System.out.println("Recebendo a notícia via TV" + subject.toString());
    }
}
