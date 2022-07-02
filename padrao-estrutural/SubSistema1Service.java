public class SubSistema1Service {

    private SubSistema1Service() {
        super();

    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado) {

        System.out.println("Cliente salvo no service");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);

    }
}
