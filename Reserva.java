import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reserva {
    private Date dataEntradaPrevista;
    private Date dataSaidaPrevista;
    private Date dataCriacao;
    private String status;
    private int quantidadeHospedes;
    
    private Hospede hospede;
    private Quarto quarto;
    
    private static List<Reserva> listaReservas = new ArrayList<>();
    
    public Reserva(Hospede hospede, Quarto quarto, Date dataEntradaPrevista, 
                   Date dataSaidaPrevista, int quantidadeHospedes) {
        this.hospede = hospede;
        this.quarto = quarto;
        this.dataEntradaPrevista = dataEntradaPrevista;
        this.dataSaidaPrevista = dataSaidaPrevista;
        this.dataCriacao = new Date(); 
        this.status = "Pendente"; 
        this.quantidadeHospedes = quantidadeHospedes;
    }
    
    public void verReserva() {
        System.out.println("=== Informações da Reserva ===");
        System.out.println("Hóspede: " + (hospede != null ? hospede.getnome() : "Não informado"));
        System.out.println("Quarto: " + (quarto != null ? quarto.getNumero() : "Não informado"));
        System.out.println("Data de Entrada Prevista: " + dataEntradaPrevista);
        System.out.println("Data de Saída Prevista: " + dataSaidaPrevista);
        System.out.println("Data de Criação: " + dataCriacao);
        System.out.println("Status: " + status);
        System.out.println("Quantidade de Hóspedes: " + quantidadeHospedes);
        System.out.println("==============================");
    }
    
    public static Reserva criarReserva(Hospede hospede, Quarto quarto, Date dataEntradaPrevista, Date dataSaidaPrevista, int quantidadeHospedes) {
        if (hospede == null || quarto == null) {
            System.out.println("Erro: Hóspede e Quarto são obrigatórios!");
            return null;
        }
        
        if (dataEntradaPrevista == null || dataSaidaPrevista == null) {
            System.out.println("Erro: Datas de entrada e saída são obrigatórias!");
            return null;
        }
        
        if (dataEntradaPrevista.after(dataSaidaPrevista)) {
            System.out.println("Erro: Data de entrada não pode ser posterior à data de saída!");
            return null;
        }
        
        if (!quarto.getStatus().equalsIgnoreCase("Disponível")) {
            System.out.println("Erro: Quarto não está disponível!");
            return null;
        }
        
        if (quantidadeHospedes > quarto.getCapacidade()) {
            System.out.println("Erro: Quantidade de hóspedes excede a capacidade do quarto!");
            return null;
        }
        
        Reserva reserva = new Reserva(hospede, quarto, dataEntradaPrevista, dataSaidaPrevista, quantidadeHospedes);
        listaReservas.add(reserva);
        
        quarto.setStatus("Reservado");
        
        System.out.println("Reserva criada com sucesso! Código: " + reserva.hashCode());
        return reserva;
    }
    
    public static void cancelarReserva(Reserva reserva) {
        if (reserva == null) {
            System.out.println("Erro: Reserva não encontrada!");
            return;
        }
        
        if (reserva.status.equalsIgnoreCase("Cancelada")) {
            System.out.println("Reserva já está cancelada!");
            return;
        }
        
        reserva.status = "Cancelada";
        
        if (reserva.quarto != null) {
            reserva.quarto.setStatus("Disponível");
        }
        
        System.out.println("Reserva cancelada com sucesso!");
    }
    
    public static void confirmarReserva(Reserva reserva) {
        if (reserva == null) {
            System.out.println("Erro: Reserva não encontrada!");
            return;
        }
        
        if (reserva.status.equalsIgnoreCase("Confirmada")) {
            System.out.println("Reserva já está confirmada!");
            return;
        }
        
        if (reserva.status.equalsIgnoreCase("Cancelada")) {
            System.out.println("Não é possível confirmar uma reserva cancelada!");
            return;
        }
        
        reserva.status = "Confirmada";
        System.out.println("Reserva confirmada com sucesso!");
    }
    
    public static List<Reserva> listarReservas() {
        if (listaReservas.isEmpty()) {
            System.out.println("Nenhuma reserva cadastrada.");
        } else {
            System.out.println("=== Lista de todas as reservas ===");
            for (int i = 0; i < listaReservas.size(); i++) {
                System.out.println("\nReserva #" + (i + 1));
                listaReservas.get(i).verReserva();
            }
        }
        return new ArrayList<>(listaReservas);
    }
    
    public static List<Reserva> listarReservasPorHospede(Hospede hospede) {
        List<Reserva> reservasHospede = new ArrayList<>();
        
        if (hospede == null) {
            System.out.println("Erro: Hóspede não informado!");
            return reservasHospede;
        }
        
        for (Reserva reserva : listaReservas) {
            if (reserva.hospede != null && reserva.hospede.equals(hospede)) {
                reservasHospede.add(reserva);
            }
        }
        
        if (reservasHospede.isEmpty()) {
            System.out.println("Nenhuma reserva encontrada para o hóspede: " + hospede.getnome());
        } else {
            System.out.println("=== Reservas do hóspede: " + hospede.getnome() + " ===");
            for (int i = 0; i < reservasHospede.size(); i++) {
                System.out.println("\nReserva #" + (i + 1));
                reservasHospede.get(i).verReserva();
            }
        }
        
        return reservasHospede;
    }
    
    public Date getDataEntradaPrevista() {
        return dataEntradaPrevista;
    }
    
    public void setDataEntradaPrevista(Date dataEntradaPrevista) {
        this.dataEntradaPrevista = dataEntradaPrevista;
    }
    
    public Date getDataSaidaPrevista() {
        return dataSaidaPrevista;
    }
    
    public void setDataSaidaPrevista(Date dataSaidaPrevista) {
        this.dataSaidaPrevista = dataSaidaPrevista;
    }
    
    public Date getDataCriacao() {
        return dataCriacao;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public int getQuantidadeHospedes() {
        return quantidadeHospedes;
    }
    
    public void setQuantidadeHospedes(int quantidadeHospedes) {
        this.quantidadeHospedes = quantidadeHospedes;
    }
    
    public Hospede getHospede() {
        return hospede;
    }
    
    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }
    
    public Quarto getQuarto() {
        return quarto;
    }
    
    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }
}