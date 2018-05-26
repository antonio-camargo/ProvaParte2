package teste;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import prova.Metodos;

class TesteValores {
	
	@Test
	void testeInsercao11Elementos() {
		Metodos principal = new Metodos();
		principal.ins(10);
		principal.ins(20);
		principal.ins(15);
		principal.ins(8);
		principal.ins(5);
		principal.ins(40);
		principal.ins(40);
		principal.ins(40);
		principal.ins(40);
		principal.ins(40);
		
		boolean  retorno =  principal.ins(11);
		Assert.assertEquals(false,retorno);
		
		
	}
	@Test
	void testeInsercao10Elementos() {
		Metodos principal = new Metodos();
		principal.ins(10);
		principal.ins(20);
		principal.ins(15);
		principal.ins(8);
		principal.ins(5);
		principal.ins(40);
		principal.ins(40);
		principal.ins(40);
		principal.ins(40);
		
		boolean  retorno =  principal.ins(40);
		Assert.assertEquals(true,retorno);
		
		
	}

	@Test
	void testeInsersao() {
		Metodos principal = new Metodos();
		principal.ins(10);
		Assert.assertEquals(Integer.valueOf(10), principal.getLista().get(0));
	}
	@Test
	void testeDeletar() {
		Metodos principal = new Metodos();
		principal.ins(10);
		principal.del(0);
		Integer  tamanhoLista =  principal.getLista().size();
		Assert.assertEquals(Integer.valueOf(0),tamanhoLista);
		
		
	}
	@Test
	void testeDeletarListaVazia() {
		Metodos principal = new Metodos();
		
		Integer  retorno = principal.del(0);
		Assert.assertEquals(Integer.valueOf(-1),retorno);
		
		
	}
	@Test
	void testeTamanhoLista() {
		Metodos principal = new Metodos();
		principal.ins(10);
		principal.ins(20);
		principal.ins(15);
		principal.ins(8);
		principal.ins(5);
		principal.ins(40);
		principal.ins(40);
		principal.ins(40);
		principal.ins(40);
		principal.ins(40);
		Integer  tamanho =  principal.size();
		Assert.assertEquals(Integer.valueOf(10),tamanho);
		
		
	}
	@Test
	void testeMaior() {
		Metodos principal = new Metodos();
		principal.ins(10);
		principal.ins(20);
		principal.ins(15);
		principal.ins(8);
		principal.ins(5);
		principal.ins(40);
		Integer maior =  principal.greater();
		Assert.assertEquals(Integer.valueOf(40),maior);
		
		
	}
	void testeMedia() {
		Metodos principal = new Metodos();
		principal.ins(10);
		principal.ins(20);
		principal.ins(15);
		principal.ins(8);
		principal.ins(5);
		principal.ins(40);
		Integer maior =  principal.greater();
		Assert.assertEquals(Integer.valueOf(40),maior);
		
		
	}
	@Test
	void testeMenor() {
		Metodos principal = new Metodos();
		principal.ins(10);
		principal.ins(20);
		principal.ins(15);
		principal.ins(8);
		principal.ins(5);
		principal.ins(40);
		Integer menor =  principal.lower();
		Assert.assertEquals(Integer.valueOf(5),menor);
		
		
	}

}
