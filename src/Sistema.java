import exemplo.Lote;
import exemplo.Produto;
import exemplo.ProdutoRepository;

public class Sistema {

	public static void main(String[] args) {
		
		Produto leite = new Produto("Leite", "Parmalat");
		Lote loteLeite = new Lote(leite, 10L);
		Produto pao = new Produto("Pão", "Panificadora Alfa");
		Lote lotePao = new Lote(pao, 10L);
		Produto ovo = new Produto("Ovo", "Maricota's Eggs");
		Lote loteOvo = new Lote(ovo, 10L);

		ProdutoRepository catalogo = new ProdutoRepository();
		catalogo.addProduto(leite);
		catalogo.addProduto(ovo);
		catalogo.addProduto(pao);



		System.out.println(leite);
		System.out.println(loteLeite);
	}
}
