package fr.n;

/**
 * Hello world!
 *
 */
public class App 
{
    /*
     * Affiche un texte
     * 
     * @param String[] texte a afficher
     */
    public static void main( String[] args )
    {
        System.out.println(hello());
    }

    /*
     * Retourne 'Hello World!'
     * 
     * @return String 'Hello World!'
     */
    public static String hello() {
        return  "Hello World!" ;
    }

    /*
     * Retourne une chaine de caractere
     * 
     * @param String chaine a retourner
     * @return String en parame
     */
    public static String hello(String param) {
        return  param ;
    }
    
}
