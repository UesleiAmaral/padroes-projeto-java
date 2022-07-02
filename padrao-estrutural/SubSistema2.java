public class SubSistema2 {

    private static SubSistema2 instacia = new SubSistema2();

    private SubSistema2() {
        super();
    }

    public static SubSistema2 getInstacia() {
        return instacia;
    }

    public String recuperarCidade(String cep) {
        return "Campinas";
        
    }
    public String recuperarEstado(String estado) {
        return "São Paulo";

    }
}
