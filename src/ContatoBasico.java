import java.util.ArrayList;

abstract public class ContatoBasico {
    protected String nome;
    protected ArrayList<Telefone>telefones;

    public ContatoBasico(String nm){
        this.nome = nm;
        telefones = new ArrayList<>();
    }
    public ContatoBasico(){
        nome="";
        telefones = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefones(Telefone tf) {
        telefones.add(tf);
    }

    public String getDados(){
        String s = this.nome + "\n";
        for(Telefone t: telefones ){
            s+= t.getNumero()+"\n";
        }
        return s;
    }
}
