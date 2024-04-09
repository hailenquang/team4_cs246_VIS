/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package MenuAdmin.QuanLiSP;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;


import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class ThemXoaSP extends javax.swing.JInternalFrame {
     List<Danhsach>list = new ArrayList<Danhsach>();
    Danhsach y;
    private static int pos = 0;
    private static int check = 0;
    JPanel panel;

    
    public ThemXoaSP() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(00,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        list.add(new Danhsach("Iphone 14",19000000,"IOS","Chup anh,quay phim","1TB","Sac sieu nhanh","Khang bui nuoc","12G"));
        list.add(new Danhsach("Samsung Galaxy S24",44490000,"Adroid","Choi game","1TB","Sac sieu nhanh","Khang bui nuoc","12G"));
        list.add(new Danhsach("Nokia 8210",1590000,"Dien thoai pho thong","Pin khung","32G","Sac sieu nhanh"," "," "));
        list.add(new Danhsach("Irealme 11 Pro+",14990000,"Adroid","Chup anh,quay phim va choi game","512GB","Sac sieu nhanh","Khang bui nuoc","12G"));
        View();
        ViewTable();
    }
     public void View(){
        y = list.get(pos);
        this.txthang.setText(y.getHang());
        this.txtgia.setText("" + y.getGia());
        this.txtdt.setText(y.getDt());
        this.txtnc.setText(y.getNc());
        this.txtdl.setText(y.getDl());
        this.txttn.setText(y.getTn());
        this.txttndb.setText(y.getTndb());
        this.txtram.setText(y.getRam());
        OnOff(true,false);
    }
    public void ViewTable(){
        DefaultTableModel model = (DefaultTableModel) this.tblDanhsach.getModel();
        model.setNumRows(0);
        int n=1;
        for (Danhsach y:list)
        {
            model.addRow(new Object[]{n++,y.getHang(),y.getGia(),y.getDt(),y.getNc(),y.getDl(),y.getTn(),y.getTndb(),y.getRam()});
        
    }
        this.tblDanhsach.setRowHeight(20);
        
    }
     public void OnOff(boolean a, boolean b){
         this.btnSave.show(b);
         this.btnCancel.show(b);
         //+++++++++++
         this.btnAdd.show(a);
         this.btnedit.show(a);
         this.btnDelete.show(a);
     }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        txtram = new javax.swing.JTextField();
        txttndb = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhsach = new javax.swing.JTable();
        txttn = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtdl = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtnc = new javax.swing.JTextField();
        txtdt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtgia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txthang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnedit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(900, 577));

        jLabel9.setText("Ram");

        tblDanhsach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Hãng", "Giá", "Loại điện thoại", "Nhu cầu", "Dung lương lưu trữ", "Tính năng sạc", "Tính năng đặc biệt", "Ram"
            }
        ));
        tblDanhsach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhsachMouseClicked(evt);
            }
        });
        tblDanhsach.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblDanhsachKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblDanhsach);

        jLabel8.setText("Tính năng đặc biệt");

        txtdl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdlActionPerformed(evt);
            }
        });

        jLabel7.setText("Tính năng sạc");

        txtnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtncActionPerformed(evt);
            }
        });

        jLabel6.setText("Dung lương lưu trữ");

        jLabel5.setText("Nhu cầu");

        jLabel4.setText("Loại điện thoại");

        jLabel3.setText("Giá");

        btnedit.setText("Sửa");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        jLabel1.setText("Hãng");

        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCancel.setText("Hủy bỏ");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("THÔNG TINH SẢN PHẨM");

        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtgia, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                            .addComponent(txthang)
                                            .addComponent(txtdt)
                                            .addComponent(txtnc))
                                        .addGap(69, 69, 69))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSave)
                                        .addGap(122, 122, 122)
                                        .addComponent(btnAdd)
                                        .addGap(113, 113, 113)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                .addComponent(btnedit)
                                .addGap(23, 23, 23))
                            .addComponent(txtdl)
                            .addComponent(txttn)
                            .addComponent(txttndb)
                            .addComponent(txtram)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(jLabel2)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(txthang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)))
                    .addComponent(txtgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txttndb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(txtram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete)
                    .addComponent(btnedit)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblDanhsachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhsachMouseClicked
        pos = this.tblDanhsach.getSelectedRow();
        View();
    }//GEN-LAST:event_tblDanhsachMouseClicked

    private void tblDanhsachKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDanhsachKeyReleased
        pos = this.tblDanhsach.getSelectedRow();
        View();
    }//GEN-LAST:event_tblDanhsachKeyReleased

    private void txtdlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdlActionPerformed

    }//GEN-LAST:event_txtdlActionPerformed

    private void txtncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtncActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        OnOff(false,true);
        check = -1;

    }//GEN-LAST:event_btneditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        UIManager.put("OptionPane.massageFont", new FontUIResource(new Font("Aria",Font.BOLD,20)));
        int n = JOptionPane.showConfirmDialog(panel,"Ban muon xoa khong ?","Alert",JOptionPane.YES_NO_OPTION);
        if(n==JOptionPane.YES_OPTION)
        {
            list.remove(pos);
            if(pos >list.size()-1)
            pos = pos -1;
            if(pos<0)
            pos = 0;
            View();
            ViewTable();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        View();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        this.txthang.setText("");
        this.txtgia.setText("");
        this.txtdt.setText("");
        this.txtnc.setText("");
        this.txtdl.setText("");
        this.txttn.setText("");
        this.txttndb.setText("");
        this.txtram.setText("");
        OnOff(false,true);
        check = 1;
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String hang = this.txthang.getText();
        int gia = Integer.parseInt(this.txtgia.getText());
        String dt = this.txtdt.getText();
        String nc = this.txtnc.getText();
        String dl = this.txtdl.getText();
        String tn = this.txttn.getText();
        String tndb = this.txttndb.getText();
        String ram = this.txtram.getText();
//        if(check == 1)
//        {
//            list.add(new Danhsach(hang,gia,dt,nc,dl,tn,tndb,ram));
//        }
//        if(check == -1)
//        {
//            list.set(pos ,new Danhsach(hang,gia,dt,nc,dl,tn,tndb,ram));
//        }
        list.add(new Danhsach(hang,gia,dt,nc,dl,tn,tndb,ram));
        View();
        ViewTable();

    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnedit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDanhsach;
    private javax.swing.JTextField txtdl;
    private javax.swing.JTextField txtdt;
    private javax.swing.JTextField txtgia;
    private javax.swing.JTextField txthang;
    private javax.swing.JTextField txtnc;
    private javax.swing.JTextField txtram;
    private javax.swing.JTextField txttn;
    private javax.swing.JTextField txttndb;
    // End of variables declaration//GEN-END:variables
}
