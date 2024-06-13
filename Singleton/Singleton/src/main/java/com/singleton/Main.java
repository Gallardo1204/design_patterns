package com.singleton;

public class Main {
    public static void main(String[] args) {

        /*DatabaseConector databaseConector = DatabaseConector.getInstance();
        System.out.println("databaseConector = " + databaseConector);

        DatabaseConector databaseConector2 = DatabaseConector.getInstance();
        System.out.println("databaseConector2 = " + databaseConector2);


        System.out.println("\n");
        databaseConector.connectDatabase();


        System.out.println("\n");
        databaseConector2.connectDatabase();*/


       /* Logger logger = Logger.getInstance();
        logger.log("mi mensaje");

        Logger logger2 = Logger.getInstance();
        logger2.log("otro mensaje");*/


        /*En este ejercicio no se crea un nuevo objeto 'Response', lo que sucede es que se
        * reasignan los valores a cada atributo */
        Response response1 = Response.getInstance();
        response1.setMessage("mensaje respuesta 1");
        response1.setMethod("POST");
        response1.setStatus(200);
        response1.setObj(Boolean.TRUE);

        System.out.println(response1);

        System.out.println("\n");
        Response response2 = Response.getInstance();
        response2.setMessage("mensaje respuesta 2");
        response2.setMethod("GET");
        response2.setStatus(400);
        response2.setObj(Boolean.FALSE);

        System.out.println(response2);



    }
}
