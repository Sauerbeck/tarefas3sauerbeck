import java.util.ArrayList;
import java.util.List;

public class Tarefas {
    public List<String> seqLista(){
        List<String> lista = new ArrayList<>();
        for(int i = 1; i < 5; i++){
            lista.add("Solucionar OS"+i);
        }
        return lista;
    }
}
