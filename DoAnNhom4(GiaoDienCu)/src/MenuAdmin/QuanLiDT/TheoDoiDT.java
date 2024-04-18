package MenuAdmin.QuanLiDT;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import MenuAdmin.QuanLiDT.card.ModelCard;
import MenuAdmin.QuanLiDT.chart.ModelChart;
import java.awt.Color;

public class TheoDoiDT extends javax.swing.JInternalFrame {

    public TheoDoiDT() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(00,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        setBackground(new Color(0, 0, 0, 0));
        initData();
    }
        private void initData() {
        card1.setData(new ModelCard("Thu nhập", "$ 60,000", "Tổng Thu nhập"));
        card2.setData(new ModelCard("Chi phí", "$ 10,000", "Tổng Chi phí"));
        card3.setData(new ModelCard("Lợi nhuận", "$ 20,000", "Tổng lợi nhuận"));
        card4.setData(new ModelCard("Giá niêm yết", "$ 30,000", "Tổng Giá niêm yết"));
        chart.addLegend("Thu nhập", new Color(12, 84, 175), new Color(0, 108, 247));
        chart.addLegend("Chi phí", new Color(54, 4, 143), new Color(104, 49, 200));
        chart.addLegend("Lợi nhuận", new Color(5, 125, 0), new Color(95, 209, 69));
        chart.addLegend("Giá niêm yết", new Color(186, 37, 37), new Color(241, 100, 120));
        chart.addData(new ModelChart("January", new double[]{500, 200, 80, 89}));
        chart.addData(new ModelChart("February", new double[]{600, 750, 90, 150}));
        chart.addData(new ModelChart("March", new double[]{200, 350, 460, 900}));
        chart.addData(new ModelChart("April", new double[]{480, 150, 750, 700}));
        chart.addData(new ModelChart("May", new double[]{350, 540, 300, 150}));
        chart.addData(new ModelChart("June", new double[]{190, 280, 81, 200}));
        chart.start();
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel1 = new MenuAdmin.QuanLiDT.swing.Panel();
        panel2 = new MenuAdmin.QuanLiDT.swing.Panel();
        chart = new MenuAdmin.QuanLiDT.chart.Chart();
        card1 = new MenuAdmin.QuanLiDT.card.Card();
        card2 = new MenuAdmin.QuanLiDT.card.Card();
        card3 = new MenuAdmin.QuanLiDT.card.Card();
        card4 = new MenuAdmin.QuanLiDT.card.Card();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 577));

        panel1.setBackground(new java.awt.Color(27, 27, 27));
        panel1.setForeground(new java.awt.Color(231, 231, 231));

        panel2.setBackground(new java.awt.Color(0, 0, 0));
        panel2.setForeground(new java.awt.Color(102, 102, 102));

        card1.setBackground(new java.awt.Color(102, 102, 102));
        card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/income.png"))); // NOI18N

        card2.setBackground(new java.awt.Color(102, 102, 102));
        card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/expense.png"))); // NOI18N

        card3.setBackground(new java.awt.Color(102, 102, 102));
        card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/profit.png"))); // NOI18N

        card4.setBackground(new java.awt.Color(102, 102, 102));
        card4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cost.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(224, 224, 224));
        jLabel1.setText("Biểu đồ doanh thu:");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(card1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(card2, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(card3, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(card4, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
                            .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30))))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private MenuAdmin.QuanLiDT.card.Card card1;
    private MenuAdmin.QuanLiDT.card.Card card2;
    private MenuAdmin.QuanLiDT.card.Card card3;
    private MenuAdmin.QuanLiDT.card.Card card4;
    private MenuAdmin.QuanLiDT.chart.Chart chart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private MenuAdmin.QuanLiDT.swing.Panel panel1;
    private MenuAdmin.QuanLiDT.swing.Panel panel2;
    // End of variables declaration//GEN-END:variables
}
