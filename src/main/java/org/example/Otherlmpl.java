package org.example;

/**
 * Class inherits class SomeInterface
 */
public class Otherlmpl implements SomeOtherInterface {
    /**
     * Override method from SomeInterface
     */
    @Override
    public void doSome() {

        System.out.println("B");
    }
}