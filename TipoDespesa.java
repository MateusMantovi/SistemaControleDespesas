import java.util.ArrayList;
import java.util.List;

public class TipoDespesa {
    private List<String> tipos = new ArrayList<>();

    public void adicionarTipo(String tipo) {
        tipos.add(tipo);
    }

    public void listarTipos() {
        for (String tipo : tipos) {
            System.out.println(tipo);
        }
    }
}
