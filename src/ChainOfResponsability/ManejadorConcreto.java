/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsability;

/**
 *
 * @author Intel
 */
public class ManejadorConcreto implements Manejador {
    protected int monto;
     protected Manejador next;
    protected double denominacion;

    public ManejadorConcreto(int monto, double denominacion) {
        this.monto = monto;
        this.denominacion = denominacion;
    }
    
    

    @Override
    public int getCantidad() {
       return this.monto;
    }

    @Override
    public double getDenominacion() {
        return this.denominacion;
    }

    @Override
    public void setMonto(int cantidad) {
        this.monto = monto;
    }

    @Override
    public void setNext(Manejador handler) {
        this.next = handler;
    }

    @Override
    public boolean retirar(float amount) {
        if(monto*denominacion>amount){
            monto-=(int)(amount/denominacion);
        }
       return false;
    }

    @Override
    public boolean depositar(double m, double d) {
        monto+=m;
        return false;
        
        
    }

    
    
    
}
