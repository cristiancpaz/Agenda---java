public class Telefone {
    private String numero;
    private String tipo;
    public Telefone(String num, String tp){
        this.numero = num;
        this.tipo = tp;
    }

    public String getNumero() {
        return numero + " " + tipo;
    }

}
