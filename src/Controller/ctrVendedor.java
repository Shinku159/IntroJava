package Controller;

import Model.Vendedor;
import java.util.ArrayList;

public class ctrVendedor {
    private ArrayList<Vendedor> vendList = new ArrayList<>();
    
    public ctrVendedor(){
        desserializaVendedor();
        //O CODIGO A SEGUIR É APENAS PARA TESTES INICIAIS E DEVE SER APAGADO NO FUTURO
        vendList.add(new Vendedor("123445-7", "Joao",  "JJ@HOTMAIL", "33256-5625", "Cartlo"));
        vendList.add(new Vendedor("123445-7", "Maria",  "JJ@HOTMAIL", "33256-5625", "Cartlo"));
        vendList.add(new Vendedor("123445-7", "Pedro",  "JJ@HOTMAIL", "33256-5625", "Cartlo"));
        vendList.add(new Vendedor("123445-7", "Jennifer",  "JJ@HOTMAIL", "33256-5625", "Cartlo"));
        vendList.add(new Vendedor("123445-7", "Franchesco",  "JJ@HOTMAIL", "33256-5625", "Cartlo"));
        vendList.add(new Vendedor("123445-7", "Fernando",  "JJ@HOTMAIL", "33256-5625", "Cartlo"));
        //----------------------------------------------------------------------------
    }
    
    public ArrayList<Vendedor> getVendList(){
        return vendList;
    }

    private void desserializaVendedor() {} //Este método é quem permite guardar um banco de dados.
}
