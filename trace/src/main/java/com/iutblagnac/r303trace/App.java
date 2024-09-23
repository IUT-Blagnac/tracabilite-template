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
    /**
     * return ce qui est renseigné en paramètre d'entrée. ouah !!
     * @param param
     * @return param 
     */
    public static String hello(String param) {
        return  param ;
    }
    
}
