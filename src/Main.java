import java.util.GregorianCalendar;
public class Main {
    static void mostraDados(ContatoBasico obj){
        System.out.println(obj.getDados());
        if (obj instanceof Contato){
            System.out.println(((Contato)obj).getIdade());
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");
        }
    }
    public static void main(String[] args) {
       Agenda a = new Agenda();
       Contato cb = new Contato("Cristian",new GregorianCalendar(1979,01,19));
       cb.setTelefones(new Telefone("32323232","residencial"));
       cb.setTelefones(new Telefone("9999999","celular"));
       a.inserir(cb);

       ContatoComercial cc = new ContatoComercial("lanchonete","lanches","lan");
       cc.setTelefones(new Telefone("88888888","residencial"));
       a.inserir(cc);
       a.inserir(new EContato("exemplo", new GregorianCalendar(1979,07,19),"exemplo.mail", "exemplo.com.br"));
       ContatoBasico obj = a.buscar("Cristian");

        if (obj != null){
            mostraDados(obj);
            
        }else{
        System.out.println("contato nao encontrado!");
        }


    }
}