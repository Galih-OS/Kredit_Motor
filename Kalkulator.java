import javax.swing.JButton;  
  
/* 
 
 * To change this template, choose Tools | Templates 
 
 * and open the template in the editor. 
 
 */  
  
/** 
 
 * 
 
 * @author arief pham pham 
 
 */  
  
public class kalkulator extends javax.swing.JFrame {  
  
    String angka;  
  
    Double jumlah, bilangansatu, bilangandua;  
  
    int option;  
  
    /** 
 
     * Creates new form kalkulator 
 
     */  
  
    public kalkulator() {  
  
        initComponents();  
  
        angka="";  
  
private void layarActionPerformed(java.awt.event.ActionEvent evt) {                                       
  
        // TODO add your handling code here:  
  
        layar.setText("");  
  
    }                                      
  
private void tombolNolActionPerformed(java.awt.event.ActionEvent evt) {                                           
  
       angka +="0";  
  
        layar.setText(angka);  
  
    }                            
  
private void tombolSatuActionPerformed(java.awt.event.ActionEvent evt) {                                            
  
        angka +="1";  
  
        layar.setText(angka);  
  
private void tombolDuaActionPerformed(java.awt.event.ActionEvent evt) {                                           
  
        angka +="2";  
  
        layar.setText(angka);  
  
    }              
  
                             
  
    private void tombolTigaActionPerformed(java.awt.event.ActionEvent evt) {                                            
  
        angka +="3";  
  
        layar.setText(angka);  
  
    }                          
  
private void tombolEmpatActionPerformed(java.awt.event.ActionEvent evt) {                                             
  
        angka +="4";  
  
        layar.setText(angka);  
  
    }     
  
                      
  
private void tombolLimaActionPerformed(java.awt.event.ActionEvent evt) {                                            
  
      angka +="5";  
  
        layar.setText(angka);  
  
}  
  
private void tombolEnamActionPerformed(java.awt.event.ActionEvent evt) {                                            
  
        angka +="6";  
  
        layar.setText(angka);  
  
}  
  
private void tombolTujuhActionPerformed(java.awt.event.ActionEvent evt) {                                              
  
        angka +="7";  
  
        layar.setText(angka);  
  
}  
  
private void tombolDelapanActionPerformed(java.awt.event.ActionEvent evt) {                                               
  
     angka +="8";  
  
        layar.setText(angka);  
  
    }                               
  
private void tombolSembilanActionPerformed(java.awt.event.ActionEvent evt) {                                                
  
        angka +="9";  
  
        layar.setText(angka);  
  
    }                          
  
private void tombolBagiActionPerformed(java.awt.event.ActionEvent evt) {                                            
  
         bilangansatu = Double.parseDouble(angka);  
  
        layar.setText("/");  
  
        angka ="";  
  
        option =1;  
  
    }                              
  
private void tombolKaliActionPerformed(java.awt.event.ActionEvent evt) {                                            
  
         bilangansatu = Double.parseDouble(angka);  
  
        layar.setText("*");  
  
        angka ="";  
  
        option =4;  
  
    }                           
  
private void tombolKurangActionPerformed(java.awt.event.ActionEvent evt) {                                              
  
         bilangansatu = Double.parseDouble(angka);  
  
        layar.setText("-");  
  
        angka ="";  
  
        option =3;  
  
    }                            
  
private void tombolTambahActionPerformed(java.awt.event.ActionEvent evt) {                                              
  
        bilangansatu = Double.parseDouble(angka);  
  
        layar.setText("+");  
  
        angka ="";  
  
        option =2;  
  
    }    
  
private void tombolTitikActionPerformed(java.awt.event.ActionEvent evt) {                                             
  
       angka +=".";  
  
        layar.setText(angka);  
  
    }                                            
  
    private void tombolCActionPerformed(java.awt.event.ActionEvent evt) {                                         
  
angka ="";  
  
        layar.setText("0");  
  
    }                                  
  
private void tombolSamadenganActionPerformed(java.awt.event.ActionEvent evt) {                                                   
  
        switch(option){  
  
           case 1:  
  
                  bilangandua = Double.parseDouble(angka);  
  
                  jumlah = bilangansatu / bilangandua;  
  
                  angka = Double.toString(jumlah);  
  
                  layar.setText(angka);  
  
                  break;  
  
           case 2:  
  
                  bilangandua = Double.parseDouble(angka);  
  
                  jumlah = bilangansatu + bilangandua;  
  
                  angka = Double.toString(jumlah);  
  
                  layar.setText(angka);  
  
                  break;  
  
           case 3:  
  
                  bilangandua = Double.parseDouble(angka);  
  
                  jumlah= bilangansatu - bilangandua;  
  
                  angka = Double.toString(jumlah);  
  
                  layar.setText(angka);  
  
                  break;  
  
           case 4:  
  
                 bilangandua = Double.parseDouble(angka);  
  
                  jumlah = bilangansatu * bilangandua;  
  
                  angka = Double.toString(jumlah);  
  
                  layar.setText(angka);  
  
                  break;  
  
           default:  
  
                  break;  
  
        }  
  
    }                                                 
  
private void tombolKeluarActionPerformed(java.awt.event.ActionEvent evt) {                                               
  
            // TODO add your handling code here:  
  
             System.exit(0);  
  
        
  
    }                 
  
                
  
public static void main(String args[]) {  
  
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
  
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);  
  
        } catch (InstantiationException ex) {  
  
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);  
  
        } catch (IllegalAccessException ex) {  
  
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);  
  
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {  
  
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);  
  
        }  
  
        //</editor-fold>  
  
        /* Create and display the form */  
  
        java.awt.EventQueue.invokeLater(new Runnable() {  
  
            public void run() {  
  
                new kalkulator().setVisible(true);  
  
            }  
  
        });  
  
    }  
  
    // Variables declaration - do not modify                      
  
    private javax.swing.JLabel jLabel1;  
  
    private javax.swing.JTextField layar;  
  
    private javax.swing.JButton tombolBagi;  
  
    private javax.swing.JButton tombolC;  
  
    private javax.swing.JButton tombolDelapan;  
  
    private javax.swing.JButton tombolDua;  
  
    private javax.swing.JButton tombolEmpat;  
  
    private javax.swing.JButton tombolEnam;  
  
    private javax.swing.JButton tombolKali;  
  
    private javax.swing.JButton tombolKeluar;  
  
    private javax.swing.JButton tombolKurang;  
  
    private javax.swing.JButton tombolLima;  
  
    private javax.swing.JButton tombolNol;  
  
    private javax.swing.JButton tombolSamadengan;  
  
    private javax.swing.JButton tombolSatu;  
  
    private javax.swing.JButton tombolSembilan;  
  
    private javax.swing.JButton tombolTambah;  
  
    private javax.swing.JButton tombolTiga;  
  
    private javax.swing.JButton tombolTitik;  
  
    private javax.swing.JButton tombolTujuh;  
  
    // End of variables declaration                    
  
} 


Sumber : http://semaunyadoank.blogspot.com/2012/12/membuat-kalkulator-sederhana-dengan.html#ixzz3N60p59we