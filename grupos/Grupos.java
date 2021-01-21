/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos;

/**
 *
 * @author Leal Hernandez Haziel Ivan
 */
public class Grupos {
    
    public static void main(String[] args){
        
        //Creación de un grupo de hilos
        ThreadGroup grupoHilos = new ThreadGroup("Grupo "
                + "de hilos");
        Thread hilo1 = new HiloDeGrupo(grupoHilos,"Hilo "
                + "1 con prioridad normal");
        Thread hilo2 = new HiloDeGrupo(grupoHilos,"Hilo "
                + "2 con prioridad normal");
        Thread hilo3 = new HiloDeGrupo(grupoHilos,"Hilo "
                + "3 con prioridad maxima");
        Thread hilo4 = new HiloDeGrupo(grupoHilos,"Hilo "
                + "4 con prioridad normal");
        Thread hilo5 = new HiloDeGrupo(grupoHilos,"Hilo"
                + " 5 con prioridad normal");
        
        //Establecimeinto de las prioridades dentro del grupo de hilos
        hilo3.setPriority(Thread.MAX_PRIORITY);
        grupoHilos.setMaxPriority(Thread.NORM_PRIORITY);
        
        //Impresión de prioridades de cada hilo
        System.out.println("Prioridad del Hilo "
                + "1: "+hilo1.getPriority());
        System.out.println("Prioridad del Hilo "
                + "2: "+hilo2.getPriority());
        System.out.println("Prioridad del Hilo "
                + "3: "+hilo3.getPriority());
        System.out.println("Prioridad del Hilo "
                + "4: "+hilo4.getPriority());
        System.out.println("Prioridad del Hilo "
                + "5: "+hilo5.getPriority());
        
        //Inicio del grupo de hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        listarHilos(grupoHilos);
    }
    
     /**
     * Método para listar hilos 
     * @param grupoHilos
     */
    private static void listarHilos(ThreadGroup grupoHilos){
        int numHilos;
        Thread[] listaDeHilos;
        numHilos= grupoHilos.activeCount();
        listaDeHilos = new Thread[numHilos];
        grupoHilos.enumerate(listaDeHilos);
        System.out.println("El numero de "
                + "hilos activos es: "+numHilos);
        for (int i = 0; i < numHilos; i++) {
            System.out.println("Soy "
                    + "el "+listaDeHilos[i].getName()+" en "
                            + "pos"+i);
        }
    }
    
}
