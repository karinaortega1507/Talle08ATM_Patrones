/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patrones;

import Builder.Account;
import ChainOfResponsability.Manejador;
import ChainOfResponsability.ManejadorConcreto;
import Singleton.AtmUK;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Account> lista = new LinkedList<>();
        Manejador m1 = new ManejadorConcreto(100, 20.0);
        Manejador m2 = new ManejadorConcreto(10, 10.0);
        Manejador m3 = new ManejadorConcreto(100, 0.75);
        Manejador m4 = new ManejadorConcreto(100, 0.15);
        Manejador m5 = new ManejadorConcreto(10, 0.05);
        Singleton.AtmUK atm = Singleton.AtmUK.getInstancia();
        atm.addManejador(m1);
        atm.addManejador(m2);
        atm.addManejador(m3);
        atm.addManejador(m4);
        atm.addManejador(m5);

        Account cuenta1 = new Account (1, 123);
        Account cuenta2 = new Account(2, 234);
        Account cuenta3 = new Account(3, 456);
        Account cuenta4 = new Account(4, 101);
        Account cuenta5 = new Account(5, 197);
        Account cuenta6 = new Account(6, 457);
        Account cuenta7 = new Account(7, 596);
        Account cuenta8 = new Account(8, 999);
        Account cuenta9 = new Account(9, 777);
        Account cuenta10 = new Account(10, 696);
        lista.add(cuenta1);
        lista.add(cuenta2);
        lista.add(cuenta3);
        lista.add(cuenta4);
        lista.add(cuenta5);
        lista.add(cuenta6);
        lista.add(cuenta7);
        lista.add(cuenta8);
        lista.add(cuenta9);
        lista.add(cuenta10);

        // Menú principal para seleccionar una de las 10 cuentas solo con el id
        // Mostrar el menú para realizar transacciones en el cajero automático
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su ID:");
        int ing = sc.nextInt();
        for (Account acc : lista) {
            if (acc.getId()== ing) {
                AtmUK.transaction(acc);
            }
    }

}}
