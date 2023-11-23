/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdv;

import java.util.ArrayList;

/**
 *
 * @author marco
 */

public class Banco {
    private  ArrayList<RegistroDeVendas> BancoDeDados;
    
    public Banco(){
        BancoDeDados = new ArrayList<>();
    }
    
    void Salvar(RegistroDeVendas dados){
        BancoDeDados.add(dados);
    }
}
