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
    private ArrayList<Produto> lista_produto;
    public CadastroProduto(){
        lista_produto = new ArrayList<>();

        
        Produto novo = new Produto("001", "arroz", "1", "20.00", "100","21/11/23");
        lista_produto.add(novo);
        Produto novo1 = new Produto("002", "feijão", "1", "8.00", "50","22/11/23");
        lista_produto.add(novo1);
        Produto novo2 = new Produto("003", "leite", "1", "5.00", "100","22/11/23");
        lista_produto.add(novo2);
        Produto novo3 = new Produto("004", "oleo", "1", "5.50", "200","22/11/23");
        lista_produto.add(novo2);
        Produto novo4 = new Produto("005", "farinha", "1", "3.00", "500","22/11/23");
        lista_produto.add(novo2);
        Produto novo5 = new Produto("006", "pão", "1", "700", "600","22/11/23");
        lista_produto.add(novo2);
        Produto novo6 = new Produto("007", "macarrão", "1", "6.00", "1000","22/11/23");
        lista_produto.add(novo2);
        Produto novo7 = new Produto("008", "file de frango", "1.00", "18.00", "50","22/11/23");
        lista_produto.add(novo2);
        Produto novo8 = new Produto("009", "batata", "1", "4.00", "1500","22/11/23");
        lista_produto.add(novo2);
        Produto novo9 = new Produto("010", "tomate", "1", "10.00", "800","22/11/23");
        lista_produto.add(novo2);
        Produto novo10 = new Produto("011", "ovos", "1", "15.00", "300","22/11/23");
        lista_produto.add(novo2);
        
    }

    public void inclusao(Produto novo_produto){
        lista_produto.add(novo_produto);
        JOptionPane.showMessageDialog(null,"Operação realizada com sucesso", "Concluido",JOptionPane.INFORMATION_MESSAGE);

    }
    
    void alteracao(){

    }
    Produto consulta(String nome_item){
        for(Produto p : lista_produto){
            if(p.obterNome().equals(nome_item) || p.obtercodigo().equals(nome_item)){
                return p;
            }
        }
        return null;
    }
    
}
