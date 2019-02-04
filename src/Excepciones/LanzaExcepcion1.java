package Excepciones;

public class LanzaExcepcion1 {

	//Metodo para lanzar una excepción
	private void metodoExcepcion () {
		RuntimeException miError = new RuntimeException ("Error inventado por mi");
		//Sentencia para lanzar la excepción
		throw miError;
	}
	
	//Metodo para lanzar una excepción Exception con throws
	//El trows sirve de aviso
	private void metodoExcepcionException () throws Exception {
		Exception miError = new Exception ("Error inventado por mi");
		//Sentencia para lanzar la excepción
		throw miError;
	}
	
	//El throws no sirve para nada en el main
	public static void main(String[] args) {
		LanzaExcepcion1 miPrograma = new LanzaExcepcion1 ();
		miPrograma.metodoExcepcion();
		try {
			miPrograma.metodoExcepcionException ();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Este mensaje no se imprime porque el programa se para");
	}

}
