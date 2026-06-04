import java.util.ArrayList;
import java.util.List;

public class HospedagemController {
   private List<Hospedagem> hospedagens = new ArrayList<>();

   public void criarHospedagem(Hospedagem hospedagem){
    hospedagens.add(hospedagem);
   }
   public Hospedagem verHospedagem(int id){
    for (Hospedagem h : hospedagens){
        if (h.getid() == id){
            return h;
        }
    }
    return null;
   }
   public void editarHospedagem(int id, String dataCheckIn, String dataCheckOutPrevisto, String dataCheckOutReal, String status) {
        for (Hospedagem h : hospedagens) {
            if (h.getid() == id) {
                h.setDataCheckIn(dataCheckIn);
                h.setDataCheckOutPrevisto(dataCheckOutPrevisto);
                h.setDataCheckOutReal(dataCheckOutReal);
                h.setStatus(status);
                break;
            }
        }
    }

    public void encerrarCheckOut(int id) {
        for (Hospedagem h : hospedagens) {
            if (h.getid() == id) {
                h.setStatus("ENCERRADA");
                break;
            }
        }
    }

    public List<Hospedagem> listarHospedagens() {
        return hospedagens;
    }
}
