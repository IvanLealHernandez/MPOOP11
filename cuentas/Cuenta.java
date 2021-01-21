/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 * Clase que extiende de Thread
 * @author Leal Hernandez Haziel Ivan
 */
public class Cuenta extends Thread {
    
     /**
     * Atrubuto de tipo int privado
     */
    private static long saldo = 0;
    
     /**
     * Constructor que recibe un nombre
     * @param nombre
     */
    public Cuenta(String nombre){
        super(nombre);
    }
    
     /**
     * Método sobreeescrito run que deposita 100 si el nombre del objeto 
     * es igual a Deposito1 o Deposito2 y retira 50 en caso de no ser asi
     */
    @Override
    public void run(){
        if (getName().equals("Deposito1") || 
                getName().equals("Deposito2")){
            this.depositarDinero(100);
        } else {
            this.extraerDinero(50);
        }
    }
    
     /**
     * Método para depositar dinero
     * @param cantidad
     */
    public synchronized void depositarDinero(int cantidad){
        saldo += cantidad;
        System.out.println("Se depositaron "+cantidad+" pesos");
        notifyAll();
    }
    
     /**
     * Método para extraer dinero
     * @param cantidad
     */
    public synchronized void extraerDinero(int cantidad) {
        try {
            if(saldo <= 0){
                System.out.println(getName()+" Espera deposito. "
                        + "Saldo = "+ saldo);
                sleep(5000);
            }
        } catch(InterruptedException e){
            System.out.println(e);
        }
        saldo -= cantidad;
        System.out.println(getName()+ " "
                + "extrajo " + cantidad + " pesos. "
                        + "Saldo restante: "+ saldo);
        notifyAll();
    }
    
}
