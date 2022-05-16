package exemplo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoteRepository {

    Map<String, Lote> lotes = new HashMap<String, Lote>();

    public String addLote(Lote lote){
        lotes.put(lote.getId(),lote);
        return lote.getId();
    }
    public void atualizaProduto(Lote lote){
        addLote(lote);
    }
    public void removeProduto(String id){
        lotes.remove(id);
    }
    public Lote recuperaProduto(String id){
        return lotes.get(id);

    }
    public void listProduto(){
        lotes.toString();

    }


    public List<Lote> getAll() {
        List<Lote> listaLotes = new ArrayList<Lote>();
        for (Lote lote: lotes.values())  {
            listaLotes.add(lote);
        }
    }
}
