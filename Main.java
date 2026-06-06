import java.util.Date;

public class Main {

    public static void main(String[] args) {

        UsuarioController usuarioController = new UsuarioController();
        HospedeController hospedeController = new HospedeController();
        HospedagemController hospedagemController = new HospedagemController();

        Usuario usuario1 = new Hospede(
                1,
                "João Silva",
                "12345678900",
                "joao",
                "1234",
                true,
                "Rua A",
                "84999999999",
                "joao@email.com"
        );

        usuarioController.criarUsuario(usuario1);

        System.out.println("\nUSUÁRIOS");

        for (Usuario u : usuarioController.listarUsuarios()) {

            System.out.println(
                    "ID: " + u.getid() +
                    " | Nome: " + u.getnome() +
                    " | Login: " + u.getlogin()
            );
        }

        System.out.println(
                "\nAutenticado? "
                + usuario1.autenticar("joao", "1234")
        );

        Hospede hospede1 = new Hospede(
                2,
                "Maria Oliveira",
                "98765432100",
                "maria",
                "123",
                true,
                "Rua C",
                "88999990000",
                "maria@email.com"
        );

        hospedeController.criarHospede(hospede1);

        System.out.println("\nHÓSPEDES");

        for (Hospede h : hospedeController.listarHospedes()) {

            System.out.println(
                    "ID: " + h.getid() +
                    " | Nome: " + h.getnome() +
                    " | Email: " + h.getEmail()
            );
        }

        Quarto quarto1 = Quarto.criarQuarto(
                101,
                "Luxo",
                2,
                250.00
        );

        System.out.println("\nQUARTO");

        quarto1.verQuarto();

        quarto1.editarQuarto(
                quarto1,
                101,
                "Luxo Premium",
                3,
                350.00,
                "Disponível"
        );

        System.out.println("\nQUARTO EDITADO");

        quarto1.verQuarto();

        Reserva reserva1 = Reserva.criarReserva(
                hospede1,
                quarto1,
                new Date(),
                new Date(System.currentTimeMillis() + 86400000L),
                2
        );

        System.out.println("\nRESERVA");

        reserva1.verReserva();

        Reserva.confirmarReserva(reserva1);

        System.out.println("\nLISTA DE RESERVAS");

        Reserva.listarReservas();

        Hospedagem hospedagem1 = new Hospedagem(
                1,
                reserva1,
                "05/06/2026",
                "06/06/2026",
                "ATIVA"
        );

        hospedagemController.criarHospedagem(hospedagem1);

        System.out.println("\nHOSPEDAGENS");

        for (Hospedagem h : hospedagemController.listarHospedagens()) {

            System.out.println(
                    "ID: " + h.getid() +
                    " | Check-in: " + h.getDataCheckIn() +
                    " | Status: " + h.getStatus()
            );
        }

        hospedagemController.encerrarCheckOut(1);

        System.out.println("\nHOSPEDAGEM APÓS CHECKOUT");

        Hospedagem hospedagemFinal =
                hospedagemController.verHospedagem(1);

        System.out.println(
                "ID: " + hospedagemFinal.getid()
                + " | Status: "
                + hospedagemFinal.getStatus()
        );

        Reserva.cancelarReserva(reserva1);

        System.out.println("\nRESERVA APÓS CANCELAMENTO");

        reserva1.verReserva();
    }
}