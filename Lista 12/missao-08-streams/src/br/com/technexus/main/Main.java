package br.com.technexus.main;
import br.com.technexus.model.Loja;
import br.com.technexus.model.Produto;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();

        loja.cadastrar(new Produto("The Witcher 3", "GAMES", 150.0));
        loja.cadastrar(new Produto("EA Sports", "GAMES", 200.0));
        loja.cadastrar(new Produto("Java for Dummies", "LIVROS", 100.0));
        loja.cadastrar(new Produto("Clean Code", "LIVROS", 80.0));
        loja.cadastrar(new Produto("Mouse", "HARDWARE", 50.0));

        System.out.println("Produtos da categoria GAMES: " + loja.buscarPorCategoria("GAMES"));
        System.out.println("Patrimônio total da loja: " + loja.calcularPatrimonioTotal());
        System.out.println("Total de produtos da categoria LIVROS: " + loja.calcularTotalPorCategoria("LIVROS"));
    }
}
