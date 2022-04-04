/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Corretor;
import java.util.ArrayList;

/**
 *
 * @author Isabela
 */
public class ctrCorretor {
    
    private ArrayList<Corretor> listCorr = new ArrayList<>();
    
    public void cadastraCorretor (String cpf, String nome, String email, String fone,
                    String creci, double percCorretagem){
        listCorr.add(new Corretor (cpf, nome, email,fone,creci,percCorretagem));
        
    }

    public ArrayList<Corretor> getListCorr() {
        return listCorr;
    }
}
