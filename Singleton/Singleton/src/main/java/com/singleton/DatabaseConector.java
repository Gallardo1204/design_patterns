package com.singleton;

// 1) Debemos tener un constructor privado
// 2) Debemos tener un atributo privado estatico
// 3) Debemos tener un método público estatico que devuelva la instancia

/* Trabajando con hilos:
Con la palabra synchronized le indicamos a cada hilo que, uno a la vez puede
invocar el método 'getInstance()', entonces se va a tener la misma instancia
para todos los hilos.
*/

public class DatabaseConector {

    private static DatabaseConector databaseConector;

    // Constructor privado para evitar instanciación externa.
    private DatabaseConector() {
        System.out.println("Creating Object");
    }

    public static synchronized DatabaseConector getInstance(){
        if(databaseConector == null){
            databaseConector = new DatabaseConector();
        }

        return databaseConector;
    }

    public void connectDatabase(){
        System.out.println("Connecting database = " + databaseConector);
    }

    public void disconnectDatabase(){
        System.out.println("Disconnecting database = " + databaseConector);
    }

}
