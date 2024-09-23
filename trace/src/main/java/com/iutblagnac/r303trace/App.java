package com.iutblagnac.r303trace;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * 
     * @param args
     */
    public static void main( String[] args )
    {

        System.out.println(hello());
    }

    /**
     * Retourne la chaine de caractère Hello world
     * @return Hello World !
     */
    public static String hello() {
        return "Hello World!";
    }

    /**
     *Retourne la chaine de caractère donner a param saisi
     * @param param
     * @return param
     */
    public static String hello(String param) {
        return param;
    }

}
