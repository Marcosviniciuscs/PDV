/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdv;

/**
 *
 * @author marco
 */

import javax.swing.*;
import java.util.ArrayList;
public class CadastroProduto {
    public ArrayList<Produto> lista_produto;

    public CadastroProduto(){
        lista_produto = new ArrayList<>();
        
        Produto novo = new Produto("001", "arroz", "10", "20.00", "100","21/11/23");
        lista_produto.add(novo);
        Produto novo1 = new Produto("002", "feijão", "150", "8.00", "50","22/11/23");
        lista_produto.add(novo1);
        
    }

    public void inclusao(Produto novo_produto){
        lista_produto.add(novo_produto);
        JOptionPane.showMessageDialog(null,"Operação realizada com sucesso", "Concluido",JOptionPane.INFORMATION_MESSAGE);

    }
    
    void alteracao(){

    }
    Produto consulta(String nome_item){
        for(Produto p : lista_produto){
            if(p.obterNome().equals(nome_item) ){
                return p;
            }
        }
        return null;
    }
}
