// A classe Hospede herda todos os atributos e métodos da classe Usuario
public class Hospede extends Usuario{

    // Atributos específicos de um hóspede
    private String endereco;
    private String telefone;
    private String email;

    // Construtor da classe Hospede
    // Recebe os dados do usuário e também os dados específicos do hóspede
    public Hospede(int id, String nome, String cpf, String login, String senha, boolean ativo,
                     String endereco, String telefone, String email){

        // Chama o construtor da classe pai (Usuario)
        // para inicializar os atributos herdados
        super(id, nome, cpf, login, senha, ativo);

        // Inicializa os atributos específicos da classe Hospede
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    // Getter do atributo endereco
    // Permite obter o endereço do hóspede
    public String getEndereco(){ 
        return endereco;
    }

        // Setter do atributo endereco
        // Permite alterar o endereço do hóspede
        public void setEndereco(String endereco){
            this.endereco = endereco; 
        }

    // Getter do atributo telefone
    // Permite obter o telefone do hóspede
    public String getTelefone(){
        return telefone;
    }

        // Setter do atributo telefone
        // Permite alterar o telefone do hóspede
        public void setTelefone(String telefone){
        this.telefone = telefone;
        }

    // Getter do atributo email
    // Permite obter o e-mail do hóspede
    public String getEmail(){
        return email;
    }

        // Setter do atributo email
        // Permite alterar o e-mail do hóspede
        public void setEmail(String email){
            this.email = email;
        }
}