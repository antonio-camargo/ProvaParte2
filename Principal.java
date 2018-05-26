package prova;

public class Principal {
	
	public static void main(String[] args) {
		Metodos metodos = new Metodos();
		metodos.ins(10);
		metodos.ins(15);
		metodos.ins(32);
		metodos.ins(21);
		metodos.ins(63);
		metodos.ins(25);
		metodos.ins(10);
		metodos.ins(20);
		metodos.ins(15);
		metodos.ins(8);
		
		metodos.del(2);
		System.out.println("Menor item : " + metodos.lower());
		System.out.println("Maior item : " + metodos.greater());
		System.out.println("Média : " + metodos.mean());
		System.out.println("Tamanho da lista : " + metodos.size());
		metodos.imprimeLista();

	}

}
