
package com.mycompany.fabricadegarrafas;

import javax.swing.JOptionPane;

public class FabricaDeGarrafas {
     public static void main(String[] args) {
	    
	CaixaDeGarrafas caixa = new CaixaDeGarrafas();
	    
	int confirmacao;
            
        do {
                
            confirmacao = JOptionPane.showConfirmDialog(null, "Adionar uma Garrafa (\"Cancel\" para sair do programa)");
                
            if (confirmacao == 0){
                caixa.addGarrafas();
                }
                
        } while ((confirmacao == 0) || (confirmacao == 1));
            
        JOptionPane.showMessageDialog(null, "Você saiu do programa");
	    
	}
}

