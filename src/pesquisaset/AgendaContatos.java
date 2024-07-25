package pesquisaset;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    public Set<Contato> contatoset;

    public AgendaContatos() {
        this.contatoset = contatoset;
    }
    public void adicionarContato(String nome, int numero){
        contatoset.add(new Contato(nome, numero));
    }
    public void exibirContatos(){
        System.out.println(contatoset);
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoset) {
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
       Contato contatoAtualizado = null;
       for(Contato c : contatoset){
        if(c.getNome().equalsIgnoreCase(nome)){
            c.setNumero(novoNumero);
            contatoAtualizado = c;
            break;
        }
       }
       return contatoAtualizado;
    }
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("nome1", 234561);
        agendaContatos.adicionarContato("nome1", 0);
        agendaContatos.adicionarContato("nome1 joarez", 345612);
        agendaContatos.adicionarContato("nome1 042", 456123);
        agendaContatos.adicionarContato("JUJUba1", 561234);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("nome1"));
    }
}
