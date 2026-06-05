import java.util.ArrayList;
import java.util.List;

public class UsuarioController{
    private List<Usuario> usuarios = new ArrayList<>();
    
    public void criarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public void editarUsuario(int id, String nome, String cpf, String login, String senha, boolean ativo){
        for(Usuario u : usuarios){
            if(u.getid() == id){
                u.setnome(nome);
                u.setcpf(cpf);
                u.setlogin(login);
                u.setsenha(senha);
                u.setAtivo(ativo);
                break;
            }
        }
    }

    public void desativarUsuario(int id){
        for(Usuario u : usuarios){
            if(u.getid() == id){
                u.setAtivo(false);
                break;
            }
        }
    }

    public List<Usuario> listarUsuarios() {
        return usuarios;
    }
}