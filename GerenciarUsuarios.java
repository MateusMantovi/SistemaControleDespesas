import java.util.ArrayList;
import java.util.List;

public class GerenciarUsuarios {
    private List<Usuario> usuarios;

    public GerenciarUsuarios() {
        this.usuarios = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void listarUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println("Login: " + usuario.getLogin());
        }
    }
}

