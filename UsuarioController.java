//Aqui é para implementar uma lista dinâmica.
import java.util.ArrayList;
//Já aqui é a interface que representa uma lista em geral.
import java.util.List;

//Uma classe que faz parte do Usuario.java, só para manter mais organizado.
public class UsuarioController{
    private List<Usuario> usuarios = new ArrayList<>();
    
    public void criarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public void editarUsuario(int id, String nome, String cpf, String login, String senha, boolean ativo){
        //O for aqui é uma laço para fazer a varredura na lista
    //U é uma variável temporária que representa um usuário por vez durante a varredura da lista.
        for(Usuario u : usuarios){
            //Esse IF verifica se tem algum id do usuário na lista igual ao id recebido
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