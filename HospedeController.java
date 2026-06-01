import java.util.ArrayList;
import java.util.List;

public class HospedeController {

    private List<Hospede> hospedes = new ArrayList<>();

    public void criarHospede(Hospede hospede) {
        hospedes.add(hospede);
    }

    public Hospede verHospede(int id) {
        for (Hospede h : hospedes) {
            if (h.getid() == id) {
                return h;
            }
        }
        return null;
    }

    public void editarHospede(int id, String nome, String cpf, String login, String senha,
                              boolean ativo, String endereco, String telefone, String email) {
        for (Hospede h : hospedes) {
            if (h.getid() == id) {
                h.setnome(nome);
                h.setcpf(cpf);
                h.setlogin(login);
                h.setsenha(senha);
                h.setAtivo(ativo);
                h.setEndereco(endereco);
                h.setTelefone(telefone);
                h.setEmail(email);
                break;
            }
        }
    }

    public void desativarHospede(int id) {
        for (Hospede h : hospedes) {
            if (h.getid() == id) {
                h.setAtivo(false);
                break;
            }
        }
    }

    public List<Hospede> listarHospedes() {
        return hospedes;
    }
}