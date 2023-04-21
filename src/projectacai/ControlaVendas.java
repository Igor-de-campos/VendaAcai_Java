/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectacai;

import java.util.ArrayList;

/**
 *
 * @author igorc
 */
class ControlaVendas {
    
     private final ArrayList<Vendas> veiculos = new ArrayList<>();

   
public boolean salvar(Vendas v) {
    if(v != null) {
         veiculos.add(v);
        return true;
    }else{
        return false;
    }
}
public ArrayList<Vendas> retornaTodos(){
    return veiculos;
}
    
}
