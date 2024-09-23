package com.iutblagnac.r303trace;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(hello());
    }

    public static String hello() {
        return  "Hello World!" ;
    }

    /**Affiche le paramètre
     * Ajout d'une ligne pour merge au bon endroit
     * 
     */
    public static String hello(String param) {
        return  param ;
    }
    
}
