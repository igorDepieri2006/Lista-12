package br.com.technexus.model;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Loja {
    private List<Produto> catalago = new ArrayList<>();

    public void cadastrar(Produto p){
        this.catalago.add(p);
    }

    public List<Produto> buscarPorCategoria(String catDesejada){
             return this.catalago.stream()
            .filter(p -> p.getCategoria().equalsIgnoreCase(catDesejada))
            .collect(Collectors.toList());
    }
    public double calcularPatrimonioTotal(){
        return this.catalago.stream()
            .mapToDouble(p -> p.getPreco())
            .sum();
    }
    public double calcularTotalPorCategoria(String catDesejado){
        return this.catalago.stream()
            .filter(p -> p.getCategoria().equalsIgnoreCase(catDesejado))
            .mapToDouble(p -> p.getPreco())
            .sum();
    }
}

