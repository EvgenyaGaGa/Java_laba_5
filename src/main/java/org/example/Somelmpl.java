package org.example;

/**
 * Class inherits class SomeInterface
 */
public class Somelmpl implements SomeInterface {
    /**
     * Overriden method from SomeOtherInterface
     */
    @Override
    public void doSome() {

        System.out.println("A");
    }
}
