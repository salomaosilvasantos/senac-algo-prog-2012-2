package br.com.senacrs.alp.aulas;

public class MinhaPilhaImp<T> implements MinhaPilha<T> {
	
	private MinhaLista<T> lista = null;
	
	public MinhaPilhaImp() {
		
		super();
		
		lista = new MinhaListaImp<T>();
	}

	public void push(T valor) {

		this.lista.prefixar(valor);
	}
	
	protected MinhaLista<T> getMinhaLista() {
		
		return this.lista;
	}

	public T pop() {
		
		T resultado = null;
		
		resultado = this.lista.remover(0);

		return resultado;
	}

}
