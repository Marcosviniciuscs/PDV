/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdv;

/**
 *
 * @author marco
 */
public class Produto {
    private String codigo, nome,quantidade ,preco;

    public Produto(String codigo, String nome, String quantidade, String preco){
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    //getters - obtenção das informações
    String obterCodigo(){
        return codigo;
    }
    String obterNome(){
        return nome;
    }

    String obterQuantidade(){
        return quantidade;  
    }
     String obterPreco(){
        return preco;
    }
   

    //Setters - alteração dos atributos
    void alterarCodigo(String codigo){
        this.codigo = codigo;
    }

    void alterarNome(String nome){
        this.nome = nome;
    }
    
    void alterarQuantidade(String quantidade){
        this.quantidade = quantidade;
    }


    void alterarPreco(String preco){
        this.preco = preco;
    }


}
    
