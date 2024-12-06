package tarefa2;

public class Livro {
	
	private String titulo;
	private String autor;
	private int isbn;
	private String descricao;
	
	public Livro(String tit, String aut, int isb, String desc) {
		titulo = tit;
		autor = aut;
		isbn = isb;
		descricao = desc;
	}
	
	public Livro(String tit, String aut, int isb) {
		titulo = tit;
		autor = aut;
		isbn = isb;
	}
	
	public String toString() {
		return "Livro{" + 
			   "Título: '" + titulo + '\'' +
			   ", Autor: '" + autor +  '\'' + 
			   ", ISBN: '" + isbn + '\'' + 
			   ", Descricao: '" + descricao + '\'' + 
			   "}";
	}

}
