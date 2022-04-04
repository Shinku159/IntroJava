/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.LimPrincipal;

public class ctrPrincipal {
    private LimPrincipal mainLim;
    private ctrImovel imoCtr;
    private ctrVendedor vendCtr;
    private ctrCorretor corrCtr;
    private ctrComprador compCtr;

    public ctrPrincipal(){
        ctrPrincipal ct = this;
        imoCtr = new ctrImovel();
        vendCtr = new ctrVendedor();
        corrCtr = new ctrCorretor();
        compCtr = new ctrComprador();
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LimPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LimPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LimPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LimPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                mainLim = new LimPrincipal(ct);
                mainLim.setVisible(true);
            }
        });
    }
    
    public ctrImovel getImoCtr(){
        return imoCtr;
    }
    
    public ctrVendedor getVendCtr(){
        return vendCtr;
    }
    
    public ctrCorretor getcorrCtr(){
        return corrCtr;
    }
    
    public ctrComprador getCompCtr() {
        return compCtr;
    }
    
    public static void main(String[] Args){
        new ctrPrincipal();
    }
}
