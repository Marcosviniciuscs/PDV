/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdv;

import java.util.ArrayList;

public class CadastroProduto {
   
    public static ArrayList<Produto> lista_produto = new ArrayList<>(); 
    
    public CadastroProduto() {
        CadastroProduto.lista_produto = new ArrayList<>();
    }
    
    public ArrayList<Produto>  getListaGlobal() {
        return CadastroProduto.lista_produto;
    }

    public static void inclusao(String codigo,String nome, String quantidade, String preco){
       Produto produto = new Produto(codigo, nome, quantidade,preco);
       CadastroProduto.lista_produto.add(produto);
        
    }
    
    public  static Produto consulta(String nome_item){
        for(Produto p : CadastroProduto.lista_produto){
            if(p.obterNome().equals(nome_item) || p.obterCodigo().equals(nome_item)){
                return p;
            }
        }
        return null;
    }
   
}
