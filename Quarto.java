import java.util.ArrayList;
import java.util.List;

public class Quarto {
    private int numero;
    private String tipo;
    private int capacidade;
    private double valorDiaria;
    private String status;

    public Quarto(int numero, String tipo, int capacidade, double valorDiaria) {
        this.numero = numero;
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.valorDiaria = valorDiaria;
        this.status = "Disponível";
    }

    public void verQuarto() {
        System.out.println("=== Informações do Quarto ===");
        System.out.println("Número:   " + this.numero);
        System.out.println("Tipo:   " + this.tipo);
        System.out.println("Capacidade:   " + this.capacidade + " pessoas");
        System.out.println("Valor da Diária:  R$ " + String.format("%.2f", this.valorDiaria));
        System.out.println("Status:   " + this.status);
        System.out.println("==============================");
    }

    public static Quarto criarQuarto(int numero, String tipo, int capacidade, double valorDiaria) {
        return new Quarto(numero, tipo, capacidade, valorDiaria);
    }

    public void editarQuarto(Quarto quarto, int numero, String tipo, int capacidade, double valorDiaria, String status) {
        if (quarto != null) {
            quarto.numero = numero;
            quarto.tipo = tipo;
            quarto.capacidade = capacidade;
            quarto.valorDiaria = valorDiaria;
            quarto.status = status;
            System.out.println("Quarto atualizado com sucesso!");
        } else {
            System.out.println("Erro: Quarto não encontrado!");
        }
    }

    public static List<Quarto> listarQuartos() {

    if (quartos.isEmpty()) {
        System.out.println("Nenhum quarto cadastrado.");
    } else {

        System.out.println("=== Lista de todos os quartos ===");
        System.out.println("Total de quartos: " + quartos.size());
        System.out.println("--------------------------------");

        for (int i = 0; i < quartos.size(); i++) {

            System.out.println("\nQuarto #" + (i + 1));

            Quarto quarto = quartos.get(i);

            System.out.println("Número: " + quarto.getNumero());
            System.out.println("Tipo: " + quarto.getTipo());
            System.out.println("Capacidade: " + quarto.getCapacidade());
            System.out.println("Valor da diária: R$ " + quarto.getValorDiaria());
            System.out.println("Status: " + quarto.getStatus());
        }
    }

    return new ArrayList<>(quartos);
    }

private static List<Quarto> quartos = new ArrayList<>();

    public void desativarQuarto() {
        this.status = "Inativo";
        System.out.println("Quarto " + this.numero + "  foi desativado.");
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   public int getCapacidade() {
        return capacidade;
    }
    
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    public double getValorDiaria() {
        return valorDiaria;
    }
    
    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}