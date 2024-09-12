import java.util.Calendar;
import java.util.GregorianCalendar;

public class Contato extends ContatoBasico{
    protected Calendar dtNasc;
    public Contato(String nome, Calendar dtNasc){
        super(nome);
        this.dtNasc = dtNasc;
    }
    @Override
    public String getDados(){
        return super.getDados() + "Nascido em "+
                dtNasc.get(Calendar.DATE)+"/"+
                dtNasc.get(Calendar.MONTH)+"/"+
                dtNasc.get(Calendar.YEAR)+"\nIdade: ";
    }
    public int getIdade(){
        Calendar hoje = new GregorianCalendar();
        int idade = hoje.get(Calendar.YEAR) - dtNasc.get(Calendar.YEAR);
        hoje.set(Calendar.YEAR, dtNasc.get(Calendar.YEAR));
        if (hoje.before(dtNasc)){
            idade--;
        }
        return idade;
    }

}
