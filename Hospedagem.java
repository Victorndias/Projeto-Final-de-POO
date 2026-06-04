public class Hospedagem {
    private int id;
    private Reserva reserva;
    private String dataCheckIn;
    private String dataCheckOutPrevisto;
    private String dataCheckOutReal;
    private String status;
    
    public Hospedagem(int id, Reserva reserva, String dataCheckIn, String datacheckOutPrevisto, String status){
        this.id = id;
        this.reserva = reserva;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOutPrevisto = datacheckOutPrevisto;
        this.status = status;  
    }
    public int getid(){
        return id;
    }
    public Reserva getReserva(){
        return reserva;
    }
    public String getDataCheckIn(){ 
        return dataCheckIn;
    }
    public String getDataCheckOutPrevisto(){ 
        return dataCheckOutPrevisto; 
    }
    public String getDataCheckOutReal(){ 
        return dataCheckOutReal; 
    }
    public String getStatus() { 
        return status; 
    }

    public void setDataCheckIn(String dataCheckIn) { 
        this.dataCheckIn = dataCheckIn; 
    }
    public void setDataCheckOutPrevisto(String dataCheckOutPrevisto) { 
        this.dataCheckOutPrevisto = dataCheckOutPrevisto; 
    }
    public void setDataCheckOutReal(String dataCheckOutReal) { 
        this.dataCheckOutReal = dataCheckOutReal; 
    }
    public void setStatus(String status) { 
        this.status = status; 
    }
}
