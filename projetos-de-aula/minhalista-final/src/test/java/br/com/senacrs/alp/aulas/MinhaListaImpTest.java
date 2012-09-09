package br.com.senacrs.alp.aulas;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MinhaListaImpTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMinhaListaImp() {
		
		MinhaListaImp<Object> obj = null;
	
		try {
			obj = new MinhaListaImp<Object>();
		} catch (Exception e) {
			fail("Deve funcionar");
		}
		Assert.assertNotNull(obj);
	}

	@Test
	public void testSufixar() {
		
		MinhaListaImp<String> obj = null;
		String sufixo = null;
		String sufixoReal = null;
		
		obj = criarMinhaListaImp();
		sufixo = "sufixo";
		obj.sufixar(sufixo);
		sufixoReal = buscarSufixo(obj);
		Assert.assertEquals(sufixo, sufixoReal);
	}

	private <T> MinhaListaImp<T> criarMinhaListaImp() {
		
		MinhaListaImp<T> obj = null;

		obj = new MinhaListaImp<T>();
		
		return obj;
	}

	private <T> T buscarSufixo(MinhaListaImp<T> obj) {
		
		T resultado = null;
		Nodo<T> nodoSufixo = null;
		
		nodoSufixo = buscarNodoSufixo(obj);
		resultado = nodoSufixo.getValor();
		
		return resultado;
	}

	private <T> Nodo<T> buscarNodoSufixo(MinhaListaImp<T> obj) {
		
		Nodo<T> nodo = null;

		nodo = obj.getInicio();
		while (nodo.getProximo() != null) {
			nodo = nodo.getProximo();
		}
		
		return nodo;
	}

	@Test
	public void testPrefixar() {
				
		MinhaListaImp<String> obj = null;
		String prefixo = null;
		String prefixoReal = null;
		
		obj = criarMinhaListaImp();
		prefixo = "prefixo";
		obj.prefixar(prefixo);
		prefixoReal = buscarPrefixo(obj);
		Assert.assertEquals(prefixo, prefixoReal);
	}

	private <T> T buscarPrefixo(MinhaListaImp<T> obj) {
		
		T resultado = null;
		Nodo<T> nodo = null;
		
		nodo = obj.getInicio();
		nodo = nodo.getProximo();
		resultado = nodo.getValor();

		return resultado;
	}

	@Test
	public void testBuscar() {
		fail("Not yet implemented");
	}

	@Test
	public void testInserir() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemover() {
		fail("Not yet implemented");
	}

	@Test
	public void testTamanho() {
		
		MinhaListaImp<String> obj = null;
		int quantidade = 0;
		int tamanho = 0;
		
		obj = criarMinhaListaImp();
		quantidade = 10;		 
		adicionarElementos(obj, quantidade);
		tamanho = obj.tamanho();
		Assert.assertEquals(quantidade, tamanho);
	}

	private <T> void adicionarElementos(
			MinhaListaImp<T> obj, 
			int quantidade) {
		
		Nodo<T> ultimoNodo = null;
		Nodo<T> novoNodo = null;
		
		
		ultimoNodo = buscarNodoSufixo(obj);
		for (int i = 0; i < quantidade; i++) {
			novoNodo = new Nodo<T>(null);
			ultimoNodo.setProximo(novoNodo);
			ultimoNodo = novoNodo;
		}
	}
}
