/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loading1;

import dangnhap2.FormLogin;
import loading1.Loading;

/**
 *
 * @author Hoàng Thanh An
 */
public class main {

    public static void main(String[] args) {
        Loading ld = new Loading();
        ld.setVisible(true);
        FormLogin frm = new FormLogin();
        frm.setLocationRelativeTo(null);
        try {
            for(int i=0; i<=100; i++){
                Thread.sleep(20);
                ld.ProgressBar.setValue(i);
                ld.pro.setText(Integer.toString(i)+"%");
                if (i==100) {
                    ld.setVisible(false);
                    frm.setVisible(true);
                }
            }
        } catch (Exception e) {
        }
    }
    
}
