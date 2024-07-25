package cadastroset;
import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
   private String nome;
   private int cod;
   private double preco;
   private int quantidade;
public Produto(String nome, int cod, double preco, int quantidade) {
    this.nome = nome;
    this.cod = cod;
    this.preco = preco;
    this.quantidade = quantidade;
}
@Override
public int compareTo(Produto p){
    return nome.compareToIgnoreCase(p.getNome());
}
public String getNome() {
    return nome;
}
public int getCod() {
    return cod;
}
public double getPreco() {
    return preco;
}
public int getQuantidade() {
    return quantidade;
}


@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + cod;
    return result;
}
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Produto other = (Produto) obj;
    if (cod != other.cod)
        return false;
    return true;
}
@Override
public String toString() {
    return "Produto [nome=" + nome + ", cod=" + cod + ", preco=" + preco + ", quantidade=" + quantidade + "]";
}
   
   
}
class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
      
}