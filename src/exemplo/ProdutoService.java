package exemplo;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {

    public  LoteRepository loteRepository;
    public ProdutoRepository produtoRepository;
    public Produto produto;

    public List<Produto> listarProdLote(String nomeProd){
        List<Lote> lotes = loteRepository.getAll();
        //vai receber uma lista de lots, dai como cada lote tem um produto, ele vai retornar uma lista desses produtos
        List<Produto> prods = getProdsFromLotes(lotes);
        List<Produto> prodosOk = getProdsByName(nomeProd,prods);
    }

    private List<Produto> getProdsByName(String nomeProd, List<Produto> prods) {
        List<Produto> nomeProdutos = new ArrayList<Produto>();

    }

    public List<Produto> listarProdByName(String nomeProd){
        List<Produto> prods = produtoRepository.getAll();
        List<Produto> podsOk = getProdsByName(nomeProd,prods);
    }



    public List<Produto> pesquisaProduto(String prodNome){
        List<Produto> listaProdutos = new ArrayList<Produto>();
        for(Produto produto : produtoRepository.catalogo.values()){
            if (produto.getNome().equals(prodNome)){
                listaProdutos.add(produto);
            }
        }
        return listaProdutos;
    }
}

