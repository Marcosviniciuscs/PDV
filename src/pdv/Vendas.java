/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdv;

/**
 *
 * @author marco
 */
import java.util.ArrayList;
public class Vendas {
    
    public ArrayList lista_vendas;
    double valorTotal = 0;
    public Vendas(){
        lista_vendas = new ArrayList<>();
    }
    
    void adicionar_registro(){}
    
    void somador(double num){
         valorTotal += num;
    }
    double mostrar_valor(){
        return valorTotal;
    }
    
    
}

