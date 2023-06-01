package cadastro;

public class Cadastro {

	private static frmformulario formulario;
	private static principal principal [];
	private static int contador;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		formulario = new frmformulario ();
		principal =new principal [100];
		
		//ESTRUTURA FOR PARA AGREGAÇÃO DE 0-99 PACIENTES
		
		for (int i=0; i<100; i ++) {
			
			principal [i]= new principal ();
		}
		contador = 0;
		
		formulario.setVisible(true);
		
		//METODOS DE GUARDAR E BUSCAR
		
	}

	public static void guardar(String n, String a, String s, int i) {
		
		//CRIANDO A VARIAVEL nome n, apelido a, sala s, idade i
		
		principal[contador].setNome(n);
		principal[contador].setApelido(a);
		principal[contador].setSala(s);
		principal[contador].setIdade(i);
		
		contador ++;
		
	}
	
	public static void buscar(String bus) {
		
	// VARIAVEL BUSCAR
		for (int j=0; j< principal.length; j++) {
			
			if (principal[j].getNome().equals(bus)) {
				formulario.cargardatos(principal[j]);
				
			}
		}
	}

	public static void guardar(String a, String b, String c, String d) {
		// TODO Auto-generated method stub
		
	}
}
