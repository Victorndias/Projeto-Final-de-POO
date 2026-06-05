public class Hospede extends Usuario{

    private String endereco;
    private String telefone;
    private String email;

    public Hospede(int id, String nome, String cpf, String login, String senha, boolean ativo,
                     String endereco, String telefone, String email){

        super(id, nome, cpf, login, senha, ativo);

        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public String getEndereco(){ 
        return endereco;
    }

        public void setEndereco(String endereco){
            this.endereco = endereco; 
        }

    public String getTelefone(){
        return telefone;
    }

        public void setTelefone(String telefone){
        this.telefone = telefone;
        }

    public String getEmail(){
        return email;
    }

        public void setEmail(String email){
            this.email = email;
        }
}