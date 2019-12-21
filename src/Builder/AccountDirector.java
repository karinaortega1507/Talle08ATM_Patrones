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
public class AccountDirector {

    protected AccountBuilder builder;

    public AccountDirector(AccountBuilder builder) {
        this.builder = builder;
    }

    public void construirCajero() {
        builder.definirAmount();
        builder.definirCurrency();
        builder.definirId();
        builder.definirLocale();

    }
    public void changeBuilder(AccountBuilder ab){
       
        this.builder=ab;
    
    }

    public Account getAccount() {

        return builder.getAccount();
    }
}
