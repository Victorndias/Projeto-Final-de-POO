import java.util.ArrayList; // Importa a classe ArrayList, que serve para criar listas dinâmicas
import java.util.List;      // Importa a interface List, usada para declarar listas de forma mais genérica

public class HospedeController {

    // Lista que vai guardar todos os hóspedes cadastrados no sistema
    private List<Hospede> hospedes = new ArrayList<>();

    // Método responsável por cadastrar um novo hóspede na lista
    public void criarHospede(Hospede hospede) {
        hospedes.add(hospede); // Adiciona o objeto Hospede recebido como parâmetro dentro da lista
    }

    // Método que procura um hóspede pelo id e retorna esse hóspede
    public Hospede verHospede(int id) {
        // Percorre todos os hóspedes da lista, um por um
        for (Hospede h : hospedes) {
            // Verifica se o id do hóspede atual é igual ao id informado
            if (h.getid() == id) {
                return h; // Se encontrar, retorna o hóspede imediatamente
            }
        }
        return null; // Se não encontrar nenhum hóspede com esse id, retorna null
    }

    // Método que altera os dados de um hóspede existente
    public void editarHospede(int id, String nome, String cpf, String login, String senha,
                              boolean ativo, String endereco, String telefone, String email) {

        // Percorre a lista de hóspedes para encontrar o hóspede certo
        for (Hospede h : hospedes) {
            // Verifica se o id atual é o mesmo informado no parâmetro
            if (h.getid() == id) {
                // Atualiza os dados herdados da classe Usuario
                h.setnome(nome);
                h.setcpf(cpf);
                h.setlogin(login);
                h.setsenha(senha);
                h.setAtivo(ativo);

                // Atualiza os dados específicos da classe Hospede
                h.setEndereco(endereco);
                h.setTelefone(telefone);
                h.setEmail(email);

                break; // Encerra o laço assim que o hóspede for encontrado e alterado
            }
        }
    }

    // Método que desativa um hóspede, ou seja, marca como inativo
    public void desativarHospede(int id) {
        // Percorre a lista em busca do hóspede correto
        for (Hospede h : hospedes) {
            // Verifica se o id do hóspede é o mesmo informado
            if (h.getid() == id) {
                h.setAtivo(false); // Altera o status para false, desativando o hóspede
                break; // Para a busca assim que encontrar o registro
            }
        }
    }

    // Método que devolve a lista completa de hóspedes cadastrados
    public List<Hospede> listarHospedes() {
        return hospedes; // Retorna a lista inteira
    }
}