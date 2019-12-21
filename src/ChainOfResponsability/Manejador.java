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
public interface Manejador {

    public int getCantidad();

    public double getDenominacion();

    public void setMonto(int monto);

    public void setNext(Manejador m);

    public boolean retirar(float monto);

    public boolean depositar(double cantidad, double denominacion);

}
