package setconvidados;

import java.util.HashSet;
import java.util.Set;


public class ConjuntoConvidados {
    public Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidadosPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set de convidados.");

        conjuntoConvidados.adicionarConvidado("convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("convidado 2", 4567);
        conjuntoConvidados.adicionarConvidado("convidado 3", 7891);
        conjuntoConvidados.adicionarConvidado("convidado 4", 1011);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set de convidados.");

        conjuntoConvidados.removerConvidadosPorCodigoConvite(1234);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set de convidados.");

        conjuntoConvidados.exibirConvidados();

    }
}
