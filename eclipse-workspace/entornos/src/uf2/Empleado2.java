package uf2;

/*public class Empleado {
	private String dni;
	private String nombre;
	
	
	// Empleado(){ constructor por defecto es cuando no tiene nada dentro del paréntesis, argumentos
	
	Empleado(String dni, String nombre){
		
	}
}*/




/**
 * <h2>Clase Empleado, se utiliza para crear y leer empleados de una BBDD</h2>
 * Busca información de javadoc en <a href="https://www.google.es/webhp?hl=es&sa=X&ved=0ahUKEwj-6MHyquPXAhXjK8AKHavcCzAQPAgD">
 * 
 * @author 21732599
 * @version 1.0
 * @since noviembre 2017
 *
 */

public class Empleado2 {
	/**
	 * Atributo Nombre del empleado
	 */
    private String nombre;
    /**
     * Atributo Apellido del empleado
     */
    private String apellido;
    /**
     * Atributo Salario del empleado
     */
    private double salario;
    
    /**
     * Constructor con 3 parámetros
     * Crea objetos de tipo empleado, con nombre, apellido y sueldo
     * 
     * @param nombre nombre del empleado
     * @param apellido apellido del empleado
     * @param salario sueldo bruto mensual
     */

    public Empleado2(String nombre, String apellido, double salario){
        this.nombre=nombre;
        this.apellido=apellido;
        this.salario=salario;
    }
    /**
     * Sube el salario al empleado según una cantidad
     * @see Empleado2
     * @param subida
     */
    
    //see sirve para hiperenlaces entre clases, aquí por ejemplo es para mostrar los datos de empleado, de forma que cuando cliques sobre él
    //te llevará a donde están escritos los datos de empleado
 
    public void subirSalario (double subida){
           salario=salario + subida;
    }
    /**
     * Comprueba que el nombre no esté vacío 
     * 
     * @return
     */
 
    private boolean comprobar(){
        if(nombre.equals("")){
            return false;
        }
        return true;
    }
   
}

