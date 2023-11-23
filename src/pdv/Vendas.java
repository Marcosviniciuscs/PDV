/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdv;
/**
 *
 * @author marco
 */

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public  class Vendas {
    
    public static ArrayList<Produto> lista_vendas = new ArrayList<>();
    public static double valor_total;
    
    public Vendas(){
        Vendas.lista_vendas = new ArrayList<>();
        Vendas.valor_total = 0;
    }
    
    public static void somador(double num){
        
         Vendas.valor_total = Vendas.valor_total +  num;
   
    }
    public static void subtrair(double num){
        Vendas.valor_total = Vendas.valor_total - num;
    }
    public static void adicionarProduto_lista(Produto produto){
        Vendas.lista_vendas.add(produto);
    }
    public static void removerProduto_lista(Produto produto){
        Vendas.lista_vendas.remove(produto);
    }
    public static double  valorAtual(){
        return Vendas.valor_total;
    }
    public static ArrayList<Produto> obterLista_produtos_vendidos(){
        return Vendas.lista_vendas;
    }
    public static String  obterHora(){
        LocalTime horaAtual = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String hora = horaAtual.format(formatter);
        return hora;
    }
    public static String obterData(){
         LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = dataAtual.format(formatter);
        return data;
        
    }
            
    public static void mostrar_lista(){
        
        System.out.print("Produto    quantidade      preço");
        for(Produto p : Vendas.lista_vendas){
            System.out.println( p.obterNome()+ " " + " " +p.obterQuantidade()+" " + " "+ p.obterPreco());
        }
    }
    

}

