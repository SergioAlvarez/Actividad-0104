
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    private final int  three = 3; 
    private final int  two= 2;
    private final int zero = 0;
    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void generateStarWarsName(String nombre, String apellido, String apellidoMadre, String ciudad)
    {
       nombre = nombre.substring(zero,three);
       apellido = apellido.substring(zero,three);
       apellidoMadre = apellidoMadre.substring(zero,two);
       ciudad = ciudad.substring(zero,three);
       System.out.println(nombre + apellido + apellidoMadre + ciudad);
    }
}
