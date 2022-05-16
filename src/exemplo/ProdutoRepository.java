package exemplo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProdutoRepository {
    Map<String, Produto> catalogo = new HashMap<String, Produto>();

    public String addProduto(Produto p){
        catalogo.put(p.getId(),p);
        return p.getId();
    }
    public void atualizaProduto(Produto p){
        addProduto(p);
    }
    public void removeProduto(String id){
       catalogo.remove(id);
    }
    public Produto recuperaProduto(String id){
        return catalogo.get(id);

    }



    public void listProduto(){
        catalogo.toString();

    }
}
