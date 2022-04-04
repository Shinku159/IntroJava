package Controller;

import Model.Imovel;
import Model.Vendedor;
import java.util.ArrayList;
import java.util.Calendar;

public class ctrImovel {
    private ArrayList<Imovel> imoList = new ArrayList<>();
    
    public ctrImovel(){
        desserializaImovel();
    }
    
    public void cadastraImovel(int codigo, String tipo, String descricao, String arquivoFoto,
            double preco, double comissao, Calendar dataInclusao, Vendedor vendedor){
        
        imoList.add(new Imovel(codigo, tipo, descricao, arquivoFoto, preco, comissao, dataInclusao, vendedor));
    }
    
    public ArrayList<Imovel> getImoList() {
        return imoList;
    }

    private void desserializaImovel() {} //Este método é quem permite guardar um banco de dados.
}
