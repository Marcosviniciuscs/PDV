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
    String codigo, nome, unidade, preco, quantidade_estoque, data_ultima_venda;

    public Produto(String codigo, String nome, String unidade, String preco, String quantidade_estoque, String data_ultima_venda ){
        this.codigo = codigo;
        this.nome = nome;
        this.unidade = unidade;
        this.preco = preco;
        this.quantidade_estoque = quantidade_estoque;
        this.data_ultima_venda = data_ultima_venda;
    }

    //getters - obtenção das informações
    String obtercodigo(){
        return codigo;
    }
    String obterNome(){
        return nome;
    }
    String obterUnidade(){ return unidade;}
    String obterPreco(){
        return preco;
    }
    String obter_quantidade_estoque(){
        return quantidade_estoque;
    }
    String obter_data_ultima_venda(){
        return data_ultima_venda;
    }


    //Setters - alteração dos atributos
    void alterarCodigo(String codigo){
        this.codigo = codigo;
    }

    void alterarNome(String nome){
        this.nome = nome;
    }

    void alterarUnidade(String Unidade){
        this.unidade = unidade;
    }

    void alterarPreco(String preco){
        this.preco = preco;
    }
    void alterarQuantidade_estoque(String quantidade){
        this.quantidade_estoque = quantidade;
    }
    void alterarData_ultima_venda(String ultima_venda){
        this.data_ultima_venda = ultima_venda;
    }

}
    
