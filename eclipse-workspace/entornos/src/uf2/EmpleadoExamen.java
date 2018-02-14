package uf2;

public class EmpleadoExamen  {
	//he utilizado la técnica rename para cambiar el nombre
	//de la clase a EmpleadoExamen 
	
		private int codigo;
		private String nombre;
		private String oficio;
		private Double salario;
		private Departamento dept;
		
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
			
			
		}
		
		public void imprimirTodo(Object newParam) { 
			//he utilizado Change Method signature y 
			//he añadido un parámetro newParam
			
			//he usado método inline para meter el método imprimirCabecera
			//que estaba contenido en este otro método
			System.out.println("Empresa ITT");
			System.out.println("************");
			System.out.println("Código" + getCodigo());
			System.out.println("Nombre" + nombre);
			System.out.println("Oficio" + oficio);
		} 
		
		private void imprimirDatos() {
			System.out.println("Datos empleado");
			System.out.println("************");
			
			System.out.println("Código: " + getCodigo());
			System.out.println("Nombre: " + nombre);
			System.out.println("Oficio: " + oficio);
			 
		}
		
		//técnica encapsule field para sacar el get y set de slario
		private Double getSalario() {
			return salario;
		}
		private void setSalario(Double salario) {
			this.salario = salario;
		}

}
