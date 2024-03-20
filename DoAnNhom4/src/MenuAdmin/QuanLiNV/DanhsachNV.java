/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package MenuAdmin.QuanLiNV;

import javax.swing.RowFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Hoàng Thanh An
 */
public class DanhsachNV extends javax.swing.JInternalFrame {

    /**
     * Creates new form MenuDanhsachNV
     */
    public DanhsachNV() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(00,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DANH SÁCH NHÂN VIÊN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tìm kiếm theo tên :");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        jButton1.setText("Tìm kiếm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"01", "Hoàng Thanh An", "10/02/2004", "user1@gmail.com", "0123456789", "Đà Nẵng"},
                {"02", "Nguyễn Nhật Huy", "04/06/2003", "user2@gmail.com", "0987123456", "Huế"},
                {"03", "Trần Minh Mạnh", "12/08/2006", "user3@gmail.com", "0987654321", "HCM"},
                {"04", "Bùi Huy Tâm", "05/04/2015", "user4@gmail.com", "0987654324", "Hà Nội"},
                {"05", "Nguyễn Thị Như", "16/06/2003", "user5@gmail.com", "0987654753", "Quảng Trị"},
                {"06", "Trần Hà Linh", "18/03/2007", "user6@gmail.com", "0987654335", "Hà Tĩnh"},
                {"07", "Đặng Thế Hiếu", "24/01/2002", "user7@gmail.com", "0905622333", "Đà Nẵng"},
                {"08", "Nguyễn Minh Nhật", "24/07/2000", "user8@gmail.com", "0943037888", "Đà Nẵng"},
                {"09", "Trần Thanh Tâm", "24/07/2003", "user9@gmail.com", "0967123456", "Quảng Trị"},
                {"10", "Bùi Ngọc Hiếu", "24/02/2005", "user10@gmail.com", "0888100267", "Quảng Bình"},
                {"11", "Hoàng Thị Thảo", "04/07/2001", "user11@gmail.com", "0876454323", "Cần Thơ"},
                {"12", "Nguyễn Thị Lan Anh", "04/06/2008", "user12@gmail.com", "0556783367", "Đà Nẵng"},
                {"13", "Trần Quốc Toản", "04/11/2003", "user13@gmail.com", "0756123897", "Quảng Trị"},
                {"14", "Võ Nguyên Phúc", "04/02/2001", "user14@gmail.com", "0567226678", "Nghệ An"},
                {"15", "Nguyễn Quốc Quang", "28/07/2000", "user15@gmail.com", "2354756867", "Phú Yên"},
                {"16", "Bùi Tiến Dũng", "08/03/2003", "user16@gmail.com", "1232353465", "Nghệ An"},
                {"17", "Hoàng Văn Dương", "01/06/2006", "user17@gmail.com", "4354376586", "Đà Nẵng"},
                {"18", "Nguyễn Hoàng Vỹ", "09/06/2007", "user18@gmail.com", "3244654212", "Quảng Trị"},
                {"19", "Trần Nhân Tông", "03/10/2006", "user19@gmail.com", "3255455666", "Quảng Bình"},
                {"20", "Nguyễn Minh Quốc", "24/01/2007", "user20@gmail.com", "2432508453", "Đà Nẵng"},
                {"21", "Nguyễn Thị Thắm", "20/05/2000", "user21@gmail.com", "0534567455", "Phú Yên"},
                {"22", "Đậu Phương Lan", "24/01/2002", "user22@gmail.com", "0952357653", "Phú Yên"},
                {"23", "Bùi Hoài Anh", "24/11/2005", "user23@gmail.com", "0683325234", "Nghệ An"},
                {"24", "Nguyễn Quốc An", "21/01/2002", "user24@gmail.com", "0905235325", "Quảng Trị"},
                {"25", "Trần Thị Như", "23/06/2032", "user25@gmail.com", "0943574354", "Quảng Bình"},
                {"26", "Nguyễn Trâm Anh", "04/01/2012", "user26@gmail.com", "0974324323", "Đà Nẵng"},
                {"27", "Nguyễn Hoàng Mai", "17/02/2007", "user27@gmail.com", "0976433655", "Phú Yên"},
                {"28", "Hoàng Việt Quân", "30/04/2005", "user28@gmail.com", "0964234267", "Quảng Trị"},
                {"29", "Nhữ Quốc Tuấn", "14/02/2002", "user29@gmail.com", "0882214765", "Nghệ An"},
                {"30", "Trần Minh Nghĩa", "23/03/2004", "user30@gmail.com", "0976453734", "Quảng Trị"}
            },
            new String [] {
                "ID", "Họ và tên", "Ngày sinh", "Email", "Số điện thoại", "Địa chỉ"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(88, 88, 88))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
//        DefaultTableModel obj = (DefaultTableModel) jTable1.getModel();
//        TableRowSorter<DefaultTableModel>objl = new TableRowSorter<>(obj);
//        jTable1.setRowSorter(objl);
//        objl.setRowFilter(RowFilter.regexFilter(jTextField1.getText()));
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel obj = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel>objl = new TableRowSorter<>(obj);
        jTable1.setRowSorter(objl);
        objl.setRowFilter(RowFilter.regexFilter(jTextField1.getText()));
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
