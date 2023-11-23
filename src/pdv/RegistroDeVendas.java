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
public class RegistroDeVendas {
    
     public static String pagamento;
     public static String data;
     public static String hora;
     public static String valor_total ;

    public  RegistroDeVendas( String pagamento,String valor_total, String data, String hora){
        this.pagamento = pagamento;
        this.valor_total = null;
        this.data = null;
        this.hora = null;
    }

}
