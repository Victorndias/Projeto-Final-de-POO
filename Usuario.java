public abstract class Usuario{

    protected int id;
    protected String nome;
    protected String cpf;
    protected String login;
    protected String senha;
    protected boolean Ativo;

    public Usuario(int id, String nome, String cpf, String login, String senha, boolean Ativo){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
        this.Ativo = Ativo;
    }

    public boolean autenticar(String login, String senha){
        return this.Ativo && this.login.equals(login) && this.senha.equals(senha);
    }

    public int getid() { return id; }
    public String getnome() {return nome; }
    public String getcpf() {return cpf; }
    public String getlogin() {return login; }
    public String getsenha() {return senha; }
    public boolean isAtivo() {return Ativo; }

    public void setnome(String nome) {this.nome = nome; }
    public void setcpf(String cpf) {this.cpf = cpf; }
    public void setlogin(String login) {this.login = login; }
    public void setsenha(String senha) {this.senha = senha; }
    public void setAtivo(boolean Ativo) {this.Ativo = Ativo; }
}