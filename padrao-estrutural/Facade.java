
public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = SubSistema2.getInstacia().recuperarCidade(cep);
        String estado = SubSistema2.getInstacia().recuperarEstado(cep);

        SubSistema1Service.gravarCliente(nome, cep, cidade, estado);


    }
}
