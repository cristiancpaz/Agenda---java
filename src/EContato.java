import java.util.Calendar;

public class EContato extends ContatoBasico{
    protected String email, homepage;

    public EContato(String nome, Calendar dtNasc, String email, String homepage){
        super(nome);
        this.email = email;
        homepage = homepage;
    }
    @Override
    public String getDados(){
        return super.getDados() + "email: "+ email +"\n homepage: "+homepage+"\nIdade: ";
    }
    public String getEmail(){
        return email;
    }

    public String getHomepage() {
        return homepage;
    }
}
