package com.iutblagnac.r303trace;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        System.out.println(hello());
    }

    /**
     * méthode qui retourne hello world si pas de paramètres
     * @return Hello world
     */
    public static String hello() {
        return "Hello World!";
    }

    /**
     * méthode qui retourne le paramètre entré
     * @param param un string a afficher
     * @return le string que l'on veut afficher
     */
    public static String hello(String param) {
        return param;
    }

}
