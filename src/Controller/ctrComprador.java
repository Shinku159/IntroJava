/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Comprador;
import java.util.ArrayList;

/**
 *
 * @author Isabela
 */
public class ctrComprador {
    private ArrayList<Comprador> listComp = new ArrayList<>();

    public void cadastraComprador (String cpf, String nome, String email, String fone,
            String contatoPref){
        listComp.add(new Comprador (cpf,nome,email,fone, contatoPref));
    }
    
    public ArrayList<Comprador> getListComp() {
        return listComp;
    }
    
}
