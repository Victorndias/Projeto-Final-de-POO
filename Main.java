public class Main{
    public static void main(String[] args){
        
        //criando os controllers das classes controller
        UsuarioController usuarioController = new UsuarioController();
        HospedeController hospedeController = new HospedeController();

        //inserido as informações do usuario
        //está new Hospede pq usuario tbm é um usuário
        Usuario usuario1 = new Hospede(
              1,
                "João Silva",
                "12345678900",
                "joao",
                "1234",
                true,
                "Rua A, 100",
                "84999999999",
                "joao@email.com"
        );

        //com as informações acima criamos o usuario1
        usuarioController.criarUsuario(usuario1);

        //mesma ideia de usuário
        Hospede hospede1 = new Hospede(
             2,
                "Maria Oliveira",
                "98765432100",
                "mariao",
                "abcd123",
                true,
                "Rua C, 300",
                "88999990000",
                "mariao@email.com"
        );

        hospedeController.criarHospede(hospede1);

        //Aqui o for vai percorrer a Array e mostrar cada usuário que está armazenado
        System.out.println("\nLista de Usuarios: ");
        for(Usuario u : usuarioController.listarUsuarios()){
            System.out.println("ID: " + u.getid() + 
            "| Nome: " + u.getnome() + 
            "| Login: " + u.getlogin());
        }

        boolean autenticado = usuario1.autenticar("joao", "1234");
        System.out.println("Usuário autenticado? " + autenticado);

        System.out.println("\nLista de Hospedes: ");
        for(Hospede h : hospedeController.listarHospedes()){
            System.out.println("ID: " + h.getid() +
            "| Endereço: " + h.getEndereco() + 
            "| Telefone: " + h.getTelefone() +
            "| Email: " + h.getEmail());
        }

        //nessa parte vai informar os dados correto que você quer fazer a mudança
        //metedo para editar os dados já armazenado
        hospedeController.editarHospede(
             2,
                "Maria Oliveira",
                "98765432100",
                "mariao",
                "abcd123",
                true,
                "Rua C, 300",
                "88999990000",
                "mariao@email.com"
           );

           Hospede hEditado = hospedeController.verHospede(2);
           System.out.println("\nHospede apos edicao");
           if(hEditado != null){
            System.out.println("ID: " + hEditado.getid() +
             hEditado.getnome() +
             "| Login: " + hEditado.getlogin() +
             "| Endereço: " + hEditado.getEndereco() +
             "| Telefone: " + hEditado.getTelefone() +
             "| Email: " + hEditado.getEmail()
            );

            //metedo para desativar o Hospede que já esta ativo no sitema
            hospedeController.desativarHospede(2);

            System.out.println("\nStatus do hospede apos desativacao: ");
            System.out.println("Ativo? " + hospedeController.verHospede(2).isAtivo());
           }
        }       
}