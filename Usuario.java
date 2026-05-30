//A classe está abstrata para servir como base para as outras classes.
public abstract class Usuario{

    protected int id;
    protected String nome;
    protected String cpf;
    protected String login;
    protected String senha;
    protected boolean Ativo;

    //construtor criado.
    public Usuario(int id, String nome, String cpf, String login, String senha, boolean Ativo){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
        this.Ativo = Ativo;
    }

    //metódo para verificar se o login e senha é igual os salvos.
    public boolean autenticar(String login, String senha){
        return this.Ativo && this.login.equals(login) && this.senha.equals(senha);
    }

    //usando o metódo getter para retorna o valor.
    public int getid() { return id; }
    public String getnome() {return nome; }
    public String getcpf() {return cpf; }
    public String getlogin() {return login; }
    public String getsenha() {return senha; }
    //Aqui nesse trecho do boolean é comum usar "is" no getter.
    public boolean isAtivo() {return Ativo; }

    //o setter é para alterar o valor.
    public void setnome(String nome) {this.nome = nome; }
    public void setcpf(String cpf) {this.cpf = cpf; }
    public void setlogin(String login) {this.login = login; }
    public void setsenha(String senha) {this.senha = senha; }
    public void setAtivo(boolean Ativo) {this.Ativo = Ativo; }
}