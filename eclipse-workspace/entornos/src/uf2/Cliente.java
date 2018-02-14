package uf2;

	/**
	 * 
	 * <font><strong>Clase Cliente</strong> </font>
	 * 
	 * @author 21732599
	 * @version 2.0
	 * @see hiperenlaceClaseCliente
	 * @since 2017
	 *
	 *<br>
	 *<font>atributos</font>
	 *<ol>
	 *	<li> codigo </li>
	 *	<li> nombre </li>
	 *	<li> email </li>
	 *	<li> telefono </li>
	 *	<li> cifraVentas </li>
	 *</ol>
	 */
	public class Cliente  {
		
		public int codigo;
		public String nombre;
		public String email;
		public long telefono;
		public double cifraVentas;
		
		/**
		 * @exception descripMetodCliente 
		 * 
		 */
		public Cliente() {
		}	
		
		/**
		 * @exception descripConstruCliente
		 * <font> Parámetros de Cliente </font>
		 * @param codigo
		 * @param nombre
		 * @param email
		 */
		
		public Cliente(int codigo, String nombre, String email) {
			this.codigo = codigo;
			this.nombre = nombre;
			this.email = email;
		}

		/**
		 * <font> Constructor Cliente </font>
		 * @see hiperenlaceCliente
		 * @param codigo
		 * @param nombre
		 * @param email
		 * @param telefono
		 * @param cifraVentas
		 */
		
		public Cliente(int codigo, String nombre, String email, long telefono,
		double cifraVentas) {
			
			this.codigo = codigo;
			this.nombre = nombre;
			this.email = email;
			this.telefono = telefono;
			this.cifraVentas = cifraVentas;
		}
		/**
		 * <font>
		 * 		<b> Método mostrar datos <b>
		 * 		<br>
		 * 		Este método muestra por consola los datos aportados.
		 * </font>
		 * @exception metodoMostrarDatos
		 *  
		 */
		public void mostrarDatos(){
			System.out.println("Codigo: " + codigo + " Nombre: " + nombre + " ... " );
		}
		
		/**
		 * <font>
		 * 		<b> Método ver cifras <b>
		 * 		<br>
		 * 		Este método devuelve el valor de las cifras de ventas.
		 * </font>
		 * @see hiperenVerCifrasVentas
		 * @exception descripVerCifrasVentas 
		 * @return cifraVentas
		 */
		public double verCifraVentas(){
			return cifraVentas;
		}
		
		/**
		 * <font>
		 * 		<b> Método nuevo teléfono <b>
		 * 		<br>
		 * 		Este método muestra cambia el valor de telefono
		 * 		por uno nuevo (nuevoTelefono).
		 * </font>
		 * @param nuevoTelefono
		 */
		public void cambiarTelefono(long nuevoTelefono){
			telefono = nuevoTelefono;
		}
		
	}



