/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author Intel
 */
public class ConcreteAccount extends AccountBuilder {

    @Override
    public void definirId() {
        System.out.println("Se define el ID de la cuenta en concreto");
    }

    @Override
    public void definirLocale() {
        System.out.println("Se define el Locale de la cuenta en contreta");
    }

    @Override
    public void definirAmount() {
        System.out.println("Se define el monto de la cuenta en concreta");
    }

    @Override
    public void definirCurrency() {
        System.out.println("Se define el Currency de la cuenta en concreto");
    }
    
}
