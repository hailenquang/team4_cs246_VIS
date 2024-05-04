
package MenuAdmin.QuanLiSP;
import MenuAdmin.Menu_admin;
import MenuAdmin.QuanLiSP.ClikeSp.Iphone1;
import MenuAdmin.QuanLiSP.ClikeSp.Iphone2;
import MenuAdmin.QuanLiSP.ClikeSp.Iphone3;
import MenuAdmin.QuanLiSP.ClikeSp.Iphone4;
import MenuAdmin.QuanLiSP.ClikeSp.Iphone5;
import MenuAdmin.QuanLiSP.ClikeSp.Nokia1;
import MenuAdmin.QuanLiSP.ClikeSp.Nokia2;
import MenuAdmin.QuanLiSP.ClikeSp.Nokia3;
import MenuAdmin.QuanLiSP.ClikeSp.Nokia4;
import MenuAdmin.QuanLiSP.ClikeSp.Nokia5;
import MenuAdmin.QuanLiSP.ClikeSp.Realme1;
import MenuAdmin.QuanLiSP.ClikeSp.Realme2;
import MenuAdmin.QuanLiSP.ClikeSp.Realme3;
import MenuAdmin.QuanLiSP.ClikeSp.Realme4;
import MenuAdmin.QuanLiSP.ClikeSp.Realme5;
import MenuAdmin.QuanLiSP.ClikeSp.Samsum1;
import MenuAdmin.QuanLiSP.ClikeSp.Samsum2;
import MenuAdmin.QuanLiSP.ClikeSp.Samsum3;
import MenuAdmin.QuanLiSP.ClikeSp.Samsum4;
import MenuAdmin.QuanLiSP.ClikeSp.Samsum5;
import MenuAdmin.QuanLiSP.ClikeThemSp.IphoneThem;
import MenuAdmin.QuanLiSP.ClikeThemSp.NokiaThem;
import MenuAdmin.QuanLiSP.ClikeThemSp.RealmeThem;
import MenuAdmin.QuanLiSP.ClikeThemSp.SamsumThem;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class DanhsachSP extends javax.swing.JInternalFrame {

    
    public DanhsachSP() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(00,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }
    private void quayLaiMenuAdmin() {
    Menu_admin menuAdmin = new Menu_admin();
    menuAdmin.setVisible(true);
    this.dispose();
}
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        materialTabbed1 = new swing.MaterialTabbed();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        panelShadow12 = new swing.PanelShadow();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jTextArea7 = new javax.swing.JTextArea();
        starRating7 = new rating.StarRating();
        jButton17 = new javax.swing.JButton();
        panelShadow13 = new swing.PanelShadow();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextArea8 = new javax.swing.JTextArea();
        starRating8 = new rating.StarRating();
        jButton18 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        panelShadow16 = new swing.PanelShadow();
        imageAvatar6 = new swing.ImageAvatar();
        panelRound6 = new swing.PanelRound();
        jButton21 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        panelShadow17 = new swing.PanelShadow();
        imageAvatar7 = new swing.ImageAvatar();
        panelRound7 = new swing.PanelRound();
        jButton23 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        panelShadow18 = new swing.PanelShadow();
        imageAvatar8 = new swing.ImageAvatar();
        panelRound8 = new swing.PanelRound();
        jButton25 = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jButton26 = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        panelShadow11 = new swing.PanelShadow();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jTextArea6 = new javax.swing.JTextArea();
        starRating6 = new rating.StarRating();
        Nokia1 = new javax.swing.JButton();
        panelShadow25 = new swing.PanelShadow();
        NokiaThem = new javax.swing.JButton();
        jLabel69 = new javax.swing.JLabel();
        panelShadow15 = new swing.PanelShadow();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jTextArea10 = new javax.swing.JTextArea();
        starRating10 = new rating.StarRating();
        jButton20 = new javax.swing.JButton();
        panelShadow20 = new swing.PanelShadow();
        imageAvatar10 = new swing.ImageAvatar();
        panelRound10 = new swing.PanelRound();
        jButton29 = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        jButton30 = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        panelShadow14 = new swing.PanelShadow();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jTextArea9 = new javax.swing.JTextArea();
        starRating9 = new rating.StarRating();
        jButton19 = new javax.swing.JButton();
        panelShadow19 = new swing.PanelShadow();
        imageAvatar9 = new swing.ImageAvatar();
        panelRound9 = new swing.PanelRound();
        jButton27 = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        jButton28 = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        Quaylai = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel9 = new javax.swing.JPanel();
        panelShadow41 = new swing.PanelShadow();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jTextArea21 = new javax.swing.JTextArea();
        starRating21 = new rating.StarRating();
        jButton61 = new javax.swing.JButton();
        panelShadow42 = new swing.PanelShadow();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jTextArea22 = new javax.swing.JTextArea();
        starRating22 = new rating.StarRating();
        jButton62 = new javax.swing.JButton();
        panelShadow43 = new swing.PanelShadow();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jTextArea23 = new javax.swing.JTextArea();
        starRating23 = new rating.StarRating();
        jButton63 = new javax.swing.JButton();
        panelShadow44 = new swing.PanelShadow();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jTextArea24 = new javax.swing.JTextArea();
        starRating24 = new rating.StarRating();
        jButton64 = new javax.swing.JButton();
        panelShadow45 = new swing.PanelShadow();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jTextArea25 = new javax.swing.JTextArea();
        starRating25 = new rating.StarRating();
        jButton65 = new javax.swing.JButton();
        jLabel135 = new javax.swing.JLabel();
        panelShadow46 = new swing.PanelShadow();
        imageAvatar21 = new swing.ImageAvatar();
        panelRound21 = new swing.PanelRound();
        jButton66 = new javax.swing.JButton();
        jLabel136 = new javax.swing.JLabel();
        jButton67 = new javax.swing.JButton();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        panelShadow47 = new swing.PanelShadow();
        imageAvatar22 = new swing.ImageAvatar();
        panelRound22 = new swing.PanelRound();
        jButton68 = new javax.swing.JButton();
        jLabel140 = new javax.swing.JLabel();
        jButton69 = new javax.swing.JButton();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        panelShadow48 = new swing.PanelShadow();
        imageAvatar23 = new swing.ImageAvatar();
        panelRound23 = new swing.PanelRound();
        jButton70 = new javax.swing.JButton();
        jLabel144 = new javax.swing.JLabel();
        jButton71 = new javax.swing.JButton();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        panelShadow49 = new swing.PanelShadow();
        imageAvatar24 = new swing.ImageAvatar();
        panelRound24 = new swing.PanelRound();
        jButton72 = new javax.swing.JButton();
        jLabel148 = new javax.swing.JLabel();
        jButton73 = new javax.swing.JButton();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        panelShadow50 = new swing.PanelShadow();
        imageAvatar25 = new swing.ImageAvatar();
        panelRound25 = new swing.PanelRound();
        jButton74 = new javax.swing.JButton();
        jLabel152 = new javax.swing.JLabel();
        jButton75 = new javax.swing.JButton();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        panelShadow23 = new swing.PanelShadow();
        IphoneThem = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        panelShadow1 = new swing.PanelShadow();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        starRating1 = new rating.StarRating();
        jButton11 = new javax.swing.JButton();
        panelShadow2 = new swing.PanelShadow();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextArea2 = new javax.swing.JTextArea();
        starRating2 = new rating.StarRating();
        jButton12 = new javax.swing.JButton();
        panelShadow3 = new swing.PanelShadow();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextArea3 = new javax.swing.JTextArea();
        starRating3 = new rating.StarRating();
        jButton13 = new javax.swing.JButton();
        panelShadow4 = new swing.PanelShadow();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextArea4 = new javax.swing.JTextArea();
        starRating4 = new rating.StarRating();
        jButton14 = new javax.swing.JButton();
        panelShadow5 = new swing.PanelShadow();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextArea5 = new javax.swing.JTextArea();
        starRating5 = new rating.StarRating();
        jButton15 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        panelShadow6 = new swing.PanelShadow();
        imageAvatar1 = new swing.ImageAvatar();
        panelRound1 = new swing.PanelRound();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        panelShadow7 = new swing.PanelShadow();
        imageAvatar2 = new swing.ImageAvatar();
        panelRound2 = new swing.PanelRound();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        panelShadow8 = new swing.PanelShadow();
        imageAvatar3 = new swing.ImageAvatar();
        panelRound3 = new swing.PanelRound();
        jButton5 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        panelShadow9 = new swing.PanelShadow();
        imageAvatar4 = new swing.ImageAvatar();
        panelRound4 = new swing.PanelRound();
        jButton7 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        panelShadow10 = new swing.PanelShadow();
        imageAvatar5 = new swing.ImageAvatar();
        panelRound5 = new swing.PanelRound();
        jButton9 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        panelShadow54 = new swing.PanelShadow();
        SamSumThem = new javax.swing.JButton();
        jLabel109 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel22 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        panelShadow28 = new swing.PanelShadow();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jTextArea18 = new javax.swing.JTextArea();
        starRating18 = new rating.StarRating();
        jButton38 = new javax.swing.JButton();
        panelShadow29 = new swing.PanelShadow();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jTextArea19 = new javax.swing.JTextArea();
        starRating19 = new rating.StarRating();
        jButton39 = new javax.swing.JButton();
        panelShadow30 = new swing.PanelShadow();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jTextArea20 = new javax.swing.JTextArea();
        starRating20 = new rating.StarRating();
        jButton40 = new javax.swing.JButton();
        panelShadow31 = new swing.PanelShadow();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jTextArea26 = new javax.swing.JTextArea();
        starRating26 = new rating.StarRating();
        jButton41 = new javax.swing.JButton();
        panelShadow32 = new swing.PanelShadow();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jTextArea27 = new javax.swing.JTextArea();
        starRating27 = new rating.StarRating();
        jButton42 = new javax.swing.JButton();
        jLabel87 = new javax.swing.JLabel();
        panelShadow33 = new swing.PanelShadow();
        imageAvatar11 = new swing.ImageAvatar();
        panelRound11 = new swing.PanelRound();
        jButton43 = new javax.swing.JButton();
        jLabel88 = new javax.swing.JLabel();
        jButton44 = new javax.swing.JButton();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        panelShadow34 = new swing.PanelShadow();
        imageAvatar12 = new swing.ImageAvatar();
        panelRound12 = new swing.PanelRound();
        jButton45 = new javax.swing.JButton();
        jLabel92 = new javax.swing.JLabel();
        jButton46 = new javax.swing.JButton();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        panelShadow35 = new swing.PanelShadow();
        imageAvatar13 = new swing.ImageAvatar();
        panelRound13 = new swing.PanelRound();
        jButton47 = new javax.swing.JButton();
        jLabel96 = new javax.swing.JLabel();
        jButton48 = new javax.swing.JButton();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        panelShadow36 = new swing.PanelShadow();
        imageAvatar14 = new swing.ImageAvatar();
        panelRound14 = new swing.PanelRound();
        jButton49 = new javax.swing.JButton();
        jLabel100 = new javax.swing.JLabel();
        jButton50 = new javax.swing.JButton();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        panelShadow37 = new swing.PanelShadow();
        imageAvatar15 = new swing.ImageAvatar();
        panelRound15 = new swing.PanelRound();
        jButton51 = new javax.swing.JButton();
        jLabel104 = new javax.swing.JLabel();
        jButton52 = new javax.swing.JButton();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        panelShadow22 = new swing.PanelShadow();
        RealmeThem = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        jToggleButton3 = new javax.swing.JToggleButton();

        setPreferredSize(new java.awt.Dimension(900, 577));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(1589, 685));

        panelShadow12.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow12.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelShadow12.setShadowOpacity(0.3F);

        jLabel34.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(90, 90, 90));
        jLabel34.setText("Nokia 105");

        jLabel35.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(90, 90, 90));
        jLabel35.setText("650.000 đ");

        jTextArea7.setEditable(false);
        jTextArea7.setColumns(20);
        jTextArea7.setForeground(new java.awt.Color(90, 90, 90));
        jTextArea7.setRows(5);
        jTextArea7.setText("Màn hình 1.8\"\nHỗ trợ 4G VoLTE\n\n\n2 Nano SIM, Hỗ trợ 4G VoLTE\n\nPin 1020 mAh");
        jTextArea7.setBorder(null);
        jTextArea7.setFocusable(false);

        starRating7.setForeground(new java.awt.Color(22, 136, 12));
        starRating7.setStar(4);

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/nk2.jpg"))); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow12Layout = new javax.swing.GroupLayout(panelShadow12);
        panelShadow12.setLayout(panelShadow12Layout);
        panelShadow12Layout.setHorizontalGroup(
            panelShadow12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelShadow12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(starRating7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(panelShadow12Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jButton17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow12Layout.setVerticalGroup(
            panelShadow12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow12Layout.createSequentialGroup()
                .addComponent(jButton17)
                .addGap(3, 3, 3)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArea7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(starRating7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelShadow13.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow13.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelShadow13.setPreferredSize(new java.awt.Dimension(195, 247));
        panelShadow13.setShadowOpacity(0.3F);

        jLabel36.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(90, 90, 90));
        jLabel36.setText(" Nokia 110 4G Pro");

        jLabel37.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(90, 90, 90));
        jLabel37.setText("720.000đ");

        jTextArea8.setEditable(false);
        jTextArea8.setColumns(20);
        jTextArea8.setForeground(new java.awt.Color(90, 90, 90));
        jTextArea8.setRows(5);
        jTextArea8.setText("RAM: 48 MB\nDung lượng: 128 MB\n");
        jTextArea8.setBorder(null);
        jTextArea8.setFocusable(false);

        starRating8.setForeground(new java.awt.Color(22, 136, 12));
        starRating8.setStar(4);

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/nk3.jpg"))); // NOI18N
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow13Layout = new javax.swing.GroupLayout(panelShadow13);
        panelShadow13.setLayout(panelShadow13Layout);
        panelShadow13Layout.setHorizontalGroup(
            panelShadow13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelShadow13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow13Layout.createSequentialGroup()
                        .addGroup(panelShadow13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(starRating8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36)
                            .addGroup(panelShadow13Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(panelShadow13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel37)
                                    .addComponent(jTextArea8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow13Layout.createSequentialGroup()
                        .addComponent(jButton18)
                        .addGap(35, 35, 35))))
        );
        panelShadow13Layout.setVerticalGroup(
            panelShadow13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow13Layout.createSequentialGroup()
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArea8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(starRating8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel42.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(77, 77, 77));
        jLabel42.setText("Profile");

        panelShadow16.setBackground(new java.awt.Color(246, 88, 88));
        panelShadow16.setShadowOpacity(0.3F);

        imageAvatar6.setBorderSize(5);
        imageAvatar6.setBorderSpace(0);
        imageAvatar6.setGradientColor1(new java.awt.Color(255, 255, 255));
        imageAvatar6.setGradientColor2(new java.awt.Color(255, 255, 255));
        imageAvatar6.setImage(new javax.swing.ImageIcon(getClass().getResource("/image/nk1.jpg"))); // NOI18N

        panelRound6.setBackground(new java.awt.Color(255, 255, 255));
        panelRound6.setRoundBottomLeft(5);
        panelRound6.setRoundBottomRight(5);

        jButton21.setForeground(new java.awt.Color(65, 65, 65));
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/like.png"))); // NOI18N
        jButton21.setText("Like");
        jButton21.setBorder(null);
        jButton21.setContentAreaFilled(false);

        jLabel43.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(86, 86, 86));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("9K");

        jButton22.setForeground(new java.awt.Color(65, 65, 65));
        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/comment.png"))); // NOI18N
        jButton22.setText("Comment");
        jButton22.setBorder(null);
        jButton22.setContentAreaFilled(false);

        jLabel44.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(86, 86, 86));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("18K");

        javax.swing.GroupLayout panelRound6Layout = new javax.swing.GroupLayout(panelRound6);
        panelRound6.setLayout(panelRound6Layout);
        panelRound6Layout.setHorizontalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound6Layout.createSequentialGroup()
                .addGroup(panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelRound6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRound6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(panelRound6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton22)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelRound6Layout.setVerticalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRound6Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton22)
                            .addComponent(jButton21)))
                    .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(15, 15, 15))
        );

        jLabel45.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(235, 235, 235));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Nokia");

        jLabel46.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(235, 235, 235));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Admin");

        javax.swing.GroupLayout panelShadow16Layout = new javax.swing.GroupLayout(panelShadow16);
        panelShadow16.setLayout(panelShadow16Layout);
        panelShadow16Layout.setHorizontalGroup(
            panelShadow16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(panelShadow16Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(panelShadow16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imageAvatar6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        panelShadow16Layout.setVerticalGroup(
            panelShadow16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow16Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(imageAvatar6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRound6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        panelShadow17.setBackground(new java.awt.Color(88, 130, 246));
        panelShadow17.setShadowOpacity(0.3F);

        imageAvatar7.setBorderSize(5);
        imageAvatar7.setBorderSpace(0);
        imageAvatar7.setGradientColor1(new java.awt.Color(255, 255, 255));
        imageAvatar7.setGradientColor2(new java.awt.Color(255, 255, 255));
        imageAvatar7.setImage(new javax.swing.ImageIcon(getClass().getResource("/image/nk2.jpg"))); // NOI18N

        panelRound7.setBackground(new java.awt.Color(255, 255, 255));
        panelRound7.setRoundBottomLeft(5);
        panelRound7.setRoundBottomRight(5);

        jButton23.setForeground(new java.awt.Color(65, 65, 65));
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/like.png"))); // NOI18N
        jButton23.setText("Like");
        jButton23.setBorder(null);
        jButton23.setContentAreaFilled(false);

        jLabel47.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(86, 86, 86));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("15K");

        jButton24.setForeground(new java.awt.Color(65, 65, 65));
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/comment.png"))); // NOI18N
        jButton24.setText("Comment");
        jButton24.setBorder(null);
        jButton24.setContentAreaFilled(false);

        jLabel48.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(86, 86, 86));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("1.2K");

        javax.swing.GroupLayout panelRound7Layout = new javax.swing.GroupLayout(panelRound7);
        panelRound7.setLayout(panelRound7Layout);
        panelRound7Layout.setHorizontalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound7Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelRound7Layout.setVerticalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24))
                .addContainerGap())
        );

        jLabel49.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(235, 235, 235));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Nokia");

        jLabel50.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(235, 235, 235));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Admin");

        javax.swing.GroupLayout panelShadow17Layout = new javax.swing.GroupLayout(panelShadow17);
        panelShadow17.setLayout(panelShadow17Layout);
        panelShadow17Layout.setHorizontalGroup(
            panelShadow17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageAvatar7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelShadow17Layout.createSequentialGroup()
                        .addGroup(panelShadow17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelRound7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelShadow17Layout.setVerticalGroup(
            panelShadow17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRound7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelShadow18.setBackground(new java.awt.Color(69, 205, 94));
        panelShadow18.setPreferredSize(new java.awt.Dimension(195, 247));
        panelShadow18.setShadowOpacity(0.3F);

        imageAvatar8.setBorderSize(5);
        imageAvatar8.setBorderSpace(0);
        imageAvatar8.setGradientColor1(new java.awt.Color(255, 255, 255));
        imageAvatar8.setGradientColor2(new java.awt.Color(255, 255, 255));
        imageAvatar8.setImage(new javax.swing.ImageIcon(getClass().getResource("/image/nk3.jpg"))); // NOI18N

        panelRound8.setBackground(new java.awt.Color(255, 255, 255));
        panelRound8.setRoundBottomLeft(5);
        panelRound8.setRoundBottomRight(5);

        jButton25.setForeground(new java.awt.Color(65, 65, 65));
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/like.png"))); // NOI18N
        jButton25.setText("Like");
        jButton25.setBorder(null);
        jButton25.setContentAreaFilled(false);

        jLabel51.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(86, 86, 86));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("5K");

        jButton26.setForeground(new java.awt.Color(65, 65, 65));
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/comment.png"))); // NOI18N
        jButton26.setText("Comment");
        jButton26.setBorder(null);
        jButton26.setContentAreaFilled(false);

        jLabel52.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(86, 86, 86));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("3.5K");

        javax.swing.GroupLayout panelRound8Layout = new javax.swing.GroupLayout(panelRound8);
        panelRound8.setLayout(panelRound8Layout);
        panelRound8Layout.setHorizontalGroup(
            panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound8Layout.createSequentialGroup()
                .addGroup(panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(panelRound8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton26)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelRound8Layout.setVerticalGroup(
            panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(jLabel52))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel53.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(235, 235, 235));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Nokia");

        jLabel54.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(235, 235, 235));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Admin");

        javax.swing.GroupLayout panelShadow18Layout = new javax.swing.GroupLayout(panelShadow18);
        panelShadow18.setLayout(panelShadow18Layout);
        panelShadow18Layout.setHorizontalGroup(
            panelShadow18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow18Layout.createSequentialGroup()
                        .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelShadow18Layout.createSequentialGroup()
                        .addComponent(panelRound8, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 25, Short.MAX_VALUE))))
            .addGroup(panelShadow18Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(imageAvatar8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelShadow18Layout.setVerticalGroup(
            panelShadow18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRound8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        panelShadow11.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow11.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelShadow11.setShadowOpacity(0.3F);

        jLabel32.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(90, 90, 90));
        jLabel32.setText("Nokia 8210 4G  ");

        jLabel33.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(90, 90, 90));
        jLabel33.setText("1.590.000 đ");

        jTextArea6.setEditable(false);
        jTextArea6.setColumns(20);
        jTextArea6.setForeground(new java.awt.Color(90, 90, 90));
        jTextArea6.setRows(5);
        jTextArea6.setText("Thẻ nhớ MicroSD, \nhỗ trợ tối đa 32 GB");
        jTextArea6.setBorder(null);
        jTextArea6.setFocusable(false);

        starRating6.setForeground(new java.awt.Color(22, 136, 12));
        starRating6.setStar(5);

        Nokia1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/nk1.jpg"))); // NOI18N
        Nokia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nokia1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow11Layout = new javax.swing.GroupLayout(panelShadow11);
        panelShadow11.setLayout(panelShadow11Layout);
        panelShadow11Layout.setHorizontalGroup(
            panelShadow11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextArea6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(panelShadow11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelShadow11Layout.createSequentialGroup()
                        .addGroup(panelShadow11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(starRating6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 59, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Nokia1)
                .addGap(34, 34, 34))
        );
        panelShadow11Layout.setVerticalGroup(
            panelShadow11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow11Layout.createSequentialGroup()
                .addComponent(Nokia1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addGap(3, 3, 3)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArea6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(starRating6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelShadow25.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow25.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelShadow25.setShadowOpacity(0.3F);

        NokiaThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/+++++.jpg"))); // NOI18N
        NokiaThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NokiaThemMouseClicked(evt);
            }
        });
        NokiaThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NokiaThemActionPerformed(evt);
            }
        });

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel69.setText("THÊM SẢN PHẨM");

        javax.swing.GroupLayout panelShadow25Layout = new javax.swing.GroupLayout(panelShadow25);
        panelShadow25.setLayout(panelShadow25Layout);
        panelShadow25Layout.setHorizontalGroup(
            panelShadow25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelShadow25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NokiaThem, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69))
                .addGap(18, 18, 18))
        );
        panelShadow25Layout.setVerticalGroup(
            panelShadow25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow25Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel69)
                .addGap(18, 18, 18)
                .addComponent(NokiaThem)
                .addGap(28, 28, 28))
        );

        panelShadow15.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow15.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelShadow15.setPreferredSize(new java.awt.Dimension(195, 247));
        panelShadow15.setShadowOpacity(0.3F);

        jLabel40.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(90, 90, 90));
        jLabel40.setText("Nokia 215 4G ");

        jLabel41.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(90, 90, 90));
        jLabel41.setText("Product");

        jTextArea10.setEditable(false);
        jTextArea10.setColumns(20);
        jTextArea10.setForeground(new java.awt.Color(90, 90, 90));
        jTextArea10.setRows(5);
        jTextArea10.setText("2 Nano SIM,\n Hỗ trợ 4G");
        jTextArea10.setBorder(null);
        jTextArea10.setFocusable(false);

        starRating10.setForeground(new java.awt.Color(22, 136, 12));
        starRating10.setStar(4);

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/nk5.jpg"))); // NOI18N
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow15Layout = new javax.swing.GroupLayout(panelShadow15);
        panelShadow15.setLayout(panelShadow15Layout);
        panelShadow15Layout.setHorizontalGroup(
            panelShadow15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow15Layout.createSequentialGroup()
                        .addComponent(jTextArea10, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow15Layout.createSequentialGroup()
                        .addGap(0, 37, Short.MAX_VALUE)
                        .addComponent(jButton20)
                        .addGap(36, 36, 36))
                    .addGroup(panelShadow15Layout.createSequentialGroup()
                        .addGroup(panelShadow15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(jLabel41)
                            .addComponent(starRating10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelShadow15Layout.setVerticalGroup(
            panelShadow15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow15Layout.createSequentialGroup()
                .addComponent(jButton20)
                .addGap(3, 3, 3)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextArea10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(starRating10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelShadow20.setBackground(new java.awt.Color(241, 209, 70));
        panelShadow20.setPreferredSize(new java.awt.Dimension(195, 247));
        panelShadow20.setShadowOpacity(0.3F);

        imageAvatar10.setBorderSize(5);
        imageAvatar10.setBorderSpace(0);
        imageAvatar10.setGradientColor1(new java.awt.Color(255, 255, 255));
        imageAvatar10.setGradientColor2(new java.awt.Color(255, 255, 255));
        imageAvatar10.setImage(new javax.swing.ImageIcon(getClass().getResource("/image/nk5.jpg"))); // NOI18N

        panelRound10.setBackground(new java.awt.Color(255, 255, 255));
        panelRound10.setRoundBottomLeft(5);
        panelRound10.setRoundBottomRight(5);

        jButton29.setForeground(new java.awt.Color(65, 65, 65));
        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/like.png"))); // NOI18N
        jButton29.setText("Like");
        jButton29.setBorder(null);
        jButton29.setContentAreaFilled(false);

        jLabel59.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(86, 86, 86));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("20K");

        jButton30.setForeground(new java.awt.Color(65, 65, 65));
        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/comment.png"))); // NOI18N
        jButton30.setText("Comment");
        jButton30.setBorder(null);
        jButton30.setContentAreaFilled(false);

        jLabel60.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(86, 86, 86));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("21K");

        javax.swing.GroupLayout panelRound10Layout = new javax.swing.GroupLayout(panelRound10);
        panelRound10.setLayout(panelRound10Layout);
        panelRound10Layout.setHorizontalGroup(
            panelRound10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound10Layout.createSequentialGroup()
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(panelRound10Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(19, 19, 19))))
        );
        panelRound10Layout.setVerticalGroup(
            panelRound10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(jLabel59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel61.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(235, 235, 235));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("Nokia");

        jLabel62.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(235, 235, 235));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("Admin");

        javax.swing.GroupLayout panelShadow20Layout = new javax.swing.GroupLayout(panelShadow20);
        panelShadow20.setLayout(panelShadow20Layout);
        panelShadow20Layout.setHorizontalGroup(
            panelShadow20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageAvatar10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelShadow20Layout.createSequentialGroup()
                        .addComponent(panelRound10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelShadow20Layout.setVerticalGroup(
            panelShadow20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow20Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imageAvatar10, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelRound10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelShadow14.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow14.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelShadow14.setPreferredSize(new java.awt.Dimension(195, 247));
        panelShadow14.setShadowOpacity(0.3F);

        jLabel38.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(90, 90, 90));
        jLabel38.setText("Nokia");

        jLabel39.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(90, 90, 90));
        jLabel39.setText("Product");

        jTextArea9.setEditable(false);
        jTextArea9.setColumns(20);
        jTextArea9.setForeground(new java.awt.Color(90, 90, 90));
        jTextArea9.setRows(5);
        jTextArea9.setText("2 Nano SIM, \nHỗ trợ 4G");
        jTextArea9.setBorder(null);
        jTextArea9.setFocusable(false);

        starRating9.setForeground(new java.awt.Color(22, 136, 12));
        starRating9.setStar(3);

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/nk4.jpg"))); // NOI18N
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow14Layout = new javax.swing.GroupLayout(panelShadow14);
        panelShadow14.setLayout(panelShadow14Layout);
        panelShadow14Layout.setHorizontalGroup(
            panelShadow14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextArea9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelShadow14Layout.createSequentialGroup()
                        .addGroup(panelShadow14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(panelShadow14Layout.createSequentialGroup()
                .addGroup(panelShadow14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(starRating9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelShadow14Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButton19)))
                .addGap(0, 40, Short.MAX_VALUE))
        );
        panelShadow14Layout.setVerticalGroup(
            panelShadow14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow14Layout.createSequentialGroup()
                .addComponent(jButton19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38)
                .addGap(3, 3, 3)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArea9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(starRating9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelShadow19.setBackground(new java.awt.Color(58, 189, 217));
        panelShadow19.setShadowOpacity(0.3F);

        imageAvatar9.setBorderSize(5);
        imageAvatar9.setBorderSpace(0);
        imageAvatar9.setGradientColor1(new java.awt.Color(255, 255, 255));
        imageAvatar9.setGradientColor2(new java.awt.Color(255, 255, 255));
        imageAvatar9.setImage(new javax.swing.ImageIcon(getClass().getResource("/image/nk4.jpg"))); // NOI18N

        panelRound9.setBackground(new java.awt.Color(255, 255, 255));
        panelRound9.setRoundBottomLeft(5);
        panelRound9.setRoundBottomRight(5);

        jButton27.setForeground(new java.awt.Color(65, 65, 65));
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/like.png"))); // NOI18N
        jButton27.setText("Like");
        jButton27.setBorder(null);
        jButton27.setContentAreaFilled(false);

        jLabel55.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(86, 86, 86));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("1K");

        jButton28.setForeground(new java.awt.Color(65, 65, 65));
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/comment.png"))); // NOI18N
        jButton28.setText("Comment");
        jButton28.setBorder(null);
        jButton28.setContentAreaFilled(false);

        jLabel56.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(86, 86, 86));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("1.5K");

        javax.swing.GroupLayout panelRound9Layout = new javax.swing.GroupLayout(panelRound9);
        panelRound9.setLayout(panelRound9Layout);
        panelRound9Layout.setHorizontalGroup(
            panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound9Layout.createSequentialGroup()
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound9Layout.createSequentialGroup()
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton28)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panelRound9Layout.setVerticalGroup(
            panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRound9Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel55)
                        .addComponent(jLabel56))))
        );

        jLabel57.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(235, 235, 235));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Nokia");

        jLabel58.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(235, 235, 235));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Admin");

        javax.swing.GroupLayout panelShadow19Layout = new javax.swing.GroupLayout(panelShadow19);
        panelShadow19.setLayout(panelShadow19Layout);
        panelShadow19Layout.setHorizontalGroup(
            panelShadow19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelShadow19Layout.createSequentialGroup()
                        .addComponent(panelRound9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 29, Short.MAX_VALUE))
                    .addGroup(panelShadow19Layout.createSequentialGroup()
                        .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(imageAvatar9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelShadow19Layout.setVerticalGroup(
            panelShadow19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imageAvatar9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRound9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        Quaylai.setText("Quay lại");
        Quaylai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuaylaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Quaylai)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(panelShadow25, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelShadow11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelShadow16, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(panelShadow18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addComponent(panelShadow19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(panelShadow13, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                .addGap(53, 53, 53)
                                .addComponent(panelShadow14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelShadow20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelShadow15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelShadow12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelShadow17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(130, Short.MAX_VALUE))))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(1121, 1121, 1121)
                    .addComponent(jLabel42)
                    .addContainerGap(425, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(Quaylai)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(panelShadow14, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(panelShadow15, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(42, 42, 42))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(panelShadow12, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelShadow25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelShadow13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelShadow11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelShadow16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelShadow18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelShadow19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelShadow20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelShadow17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(526, 526, 526)
                    .addComponent(jLabel42)
                    .addContainerGap(140, Short.MAX_VALUE)))
        );

        jScrollPane4.setViewportView(jPanel4);

        materialTabbed1.addTab("Nokia", jScrollPane4);

        jPanel9.setBackground(new java.awt.Color(204, 255, 255));

        panelShadow41.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow41.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelShadow41.setPreferredSize(new java.awt.Dimension(195, 247));
        panelShadow41.setShadowOpacity(0.3F);

        jLabel125.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(90, 90, 90));
        jLabel125.setText("Iphone 15");

        jLabel126.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(90, 90, 90));
        jLabel126.setText("20.690.000 đ");

        jTextArea21.setEditable(false);
        jTextArea21.setColumns(20);
        jTextArea21.setForeground(new java.awt.Color(90, 90, 90));
        jTextArea21.setRows(5);
        jTextArea21.setText("RAM: 6 GB\nDung lượng: 128 GB");
        jTextArea21.setBorder(null);
        jTextArea21.setFocusable(false);

        starRating21.setForeground(new java.awt.Color(22, 136, 12));
        starRating21.setStar(5);

        jButton61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ip1.jpg"))); // NOI18N
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow41Layout = new javax.swing.GroupLayout(panelShadow41);
        panelShadow41.setLayout(panelShadow41Layout);
        panelShadow41Layout.setHorizontalGroup(
            panelShadow41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow41Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow41Layout.createSequentialGroup()
                        .addComponent(jLabel126)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow41Layout.createSequentialGroup()
                        .addComponent(jLabel125, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                        .addGap(66, 66, 66))
                    .addGroup(panelShadow41Layout.createSequentialGroup()
                        .addGroup(panelShadow41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton61)
                            .addGroup(panelShadow41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(starRating21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextArea21, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelShadow41Layout.setVerticalGroup(
            panelShadow41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow41Layout.createSequentialGroup()
                .addComponent(jButton61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel125)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel126)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArea21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(starRating21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelShadow42.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow42.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelShadow42.setPreferredSize(new java.awt.Dimension(195, 247));
        panelShadow42.setShadowOpacity(0.3F);

        jLabel127.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel127.setForeground(new java.awt.Color(90, 90, 90));
        jLabel127.setText("Iphone 13");

        jLabel128.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(90, 90, 90));
        jLabel128.setText("14.990.000 đ");

        jTextArea22.setEditable(false);
        jTextArea22.setColumns(20);
        jTextArea22.setForeground(new java.awt.Color(90, 90, 90));
        jTextArea22.setRows(5);
        jTextArea22.setText("RAM: 4 GB\nDung lượng: 128 GB");
        jTextArea22.setBorder(null);
        jTextArea22.setFocusable(false);

        starRating22.setForeground(new java.awt.Color(22, 136, 12));
        starRating22.setStar(4);

        jButton62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ip2.jpg"))); // NOI18N
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow42Layout = new javax.swing.GroupLayout(panelShadow42);
        panelShadow42.setLayout(panelShadow42Layout);
        panelShadow42Layout.setHorizontalGroup(
            panelShadow42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow42Layout.createSequentialGroup()
                .addGroup(panelShadow42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow42Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelShadow42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel127)
                            .addComponent(jLabel128)
                            .addComponent(starRating22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelShadow42Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton62))
                    .addGroup(panelShadow42Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextArea22, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        panelShadow42Layout.setVerticalGroup(
            panelShadow42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow42Layout.createSequentialGroup()
                .addComponent(jButton62)
                .addGap(3, 3, 3)
                .addComponent(jLabel127)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel128)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArea22, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(starRating22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelShadow43.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow43.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelShadow43.setShadowOpacity(0.3F);

        jLabel129.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel129.setForeground(new java.awt.Color(90, 90, 90));
        jLabel129.setText("Iphone 14 Plus");

        jLabel130.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel130.setForeground(new java.awt.Color(90, 90, 90));
        jLabel130.setText("20.090.000 đ");

        jTextArea23.setEditable(false);
        jTextArea23.setColumns(20);
        jTextArea23.setForeground(new java.awt.Color(90, 90, 90));
        jTextArea23.setRows(5);
        jTextArea23.setText("RAM: 6 GB\nDung lượng: 128 GB");
        jTextArea23.setBorder(null);
        jTextArea23.setFocusable(false);

        starRating23.setForeground(new java.awt.Color(22, 136, 12));
        starRating23.setStar(4);

        jButton63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ip3.jpg"))); // NOI18N
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow43Layout = new javax.swing.GroupLayout(panelShadow43);
        panelShadow43.setLayout(panelShadow43Layout);
        panelShadow43Layout.setHorizontalGroup(
            panelShadow43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(starRating23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow43Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelShadow43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton63)
                    .addComponent(jLabel130)
                    .addComponent(jLabel129)
                    .addComponent(jTextArea23, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        panelShadow43Layout.setVerticalGroup(
            panelShadow43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow43Layout.createSequentialGroup()
                .addComponent(jButton63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel129)
                .addGap(3, 3, 3)
                .addComponent(jLabel130)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextArea23, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(starRating23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        panelShadow44.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow44.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelShadow44.setShadowOpacity(0.3F);

        jLabel131.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel131.setForeground(new java.awt.Color(90, 90, 90));
        jLabel131.setText("Iphone 15 Plus");

        jLabel132.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel132.setForeground(new java.awt.Color(90, 90, 90));
        jLabel132.setText("23.690.000 đ");

        jTextArea24.setEditable(false);
        jTextArea24.setColumns(20);
        jTextArea24.setForeground(new java.awt.Color(90, 90, 90));
        jTextArea24.setRows(5);
        jTextArea24.setText("RAM: 6 GB\nDung lượng: 128 GB");
        jTextArea24.setBorder(null);
        jTextArea24.setFocusable(false);

        starRating24.setForeground(new java.awt.Color(22, 136, 12));
        starRating24.setStar(3);

        jButton64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ip4.jpg"))); // NOI18N
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow44Layout = new javax.swing.GroupLayout(panelShadow44);
        panelShadow44.setLayout(panelShadow44Layout);
        panelShadow44Layout.setHorizontalGroup(
            panelShadow44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow44Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow44Layout.createSequentialGroup()
                        .addComponent(jLabel132)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelShadow44Layout.createSequentialGroup()
                        .addGroup(panelShadow44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextArea24, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(starRating24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel131))
                        .addGap(0, 50, Short.MAX_VALUE))))
            .addGroup(panelShadow44Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButton64)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelShadow44Layout.setVerticalGroup(
            panelShadow44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow44Layout.createSequentialGroup()
                .addComponent(jButton64)
                .addGap(3, 3, 3)
                .addComponent(jLabel131)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel132)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArea24, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(starRating24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelShadow45.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow45.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelShadow45.setShadowOpacity(0.3F);

        jLabel133.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel133.setForeground(new java.awt.Color(90, 90, 90));
        jLabel133.setText("Iphone 11");

        jLabel134.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel134.setForeground(new java.awt.Color(90, 90, 90));
        jLabel134.setText("8.990.000");

        jTextArea25.setEditable(false);
        jTextArea25.setColumns(20);
        jTextArea25.setForeground(new java.awt.Color(90, 90, 90));
        jTextArea25.setRows(5);
        jTextArea25.setText("RAM: 4 GB\nDung lượng: 64 GB");
        jTextArea25.setBorder(null);
        jTextArea25.setFocusable(false);

        starRating25.setForeground(new java.awt.Color(22, 136, 12));
        starRating25.setStar(4);

        jButton65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ip5.jpg"))); // NOI18N
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow45Layout = new javax.swing.GroupLayout(panelShadow45);
        panelShadow45.setLayout(panelShadow45Layout);
        panelShadow45Layout.setHorizontalGroup(
            panelShadow45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow45Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(starRating25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(panelShadow45Layout.createSequentialGroup()
                .addGroup(panelShadow45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow45Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel133))
                    .addGroup(panelShadow45Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel134))
                    .addGroup(panelShadow45Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextArea25, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelShadow45Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton65)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow45Layout.setVerticalGroup(
            panelShadow45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow45Layout.createSequentialGroup()
                .addComponent(jButton65)
                .addGap(0, 0, 0)
                .addComponent(jLabel133)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel134)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArea25, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(starRating25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel135.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel135.setForeground(new java.awt.Color(77, 77, 77));
        jLabel135.setText("Profile");

        panelShadow46.setBackground(new java.awt.Color(246, 88, 88));
        panelShadow46.setShadowOpacity(0.3F);

        imageAvatar21.setBorderSize(5);
        imageAvatar21.setBorderSpace(0);
        imageAvatar21.setGradientColor1(new java.awt.Color(255, 255, 255));
        imageAvatar21.setGradientColor2(new java.awt.Color(255, 255, 255));
        imageAvatar21.setImage(new javax.swing.ImageIcon(getClass().getResource("/image/ip1.jpg"))); // NOI18N

        panelRound21.setBackground(new java.awt.Color(255, 255, 255));
        panelRound21.setRoundBottomLeft(5);
        panelRound21.setRoundBottomRight(5);

        jButton66.setForeground(new java.awt.Color(65, 65, 65));
        jButton66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/like.png"))); // NOI18N
        jButton66.setText("Like");
        jButton66.setBorder(null);
        jButton66.setContentAreaFilled(false);

        jLabel136.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel136.setForeground(new java.awt.Color(86, 86, 86));
        jLabel136.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel136.setText("19K");

        jButton67.setForeground(new java.awt.Color(65, 65, 65));
        jButton67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/comment.png"))); // NOI18N
        jButton67.setText("Comment");
        jButton67.setBorder(null);
        jButton67.setContentAreaFilled(false);

        jLabel137.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel137.setForeground(new java.awt.Color(86, 86, 86));
        jLabel137.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel137.setText("2k");

        javax.swing.GroupLayout panelRound21Layout = new javax.swing.GroupLayout(panelRound21);
        panelRound21.setLayout(panelRound21Layout);
        panelRound21Layout.setHorizontalGroup(
            panelRound21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound21Layout.createSequentialGroup()
                .addGroup(panelRound21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelRound21Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRound21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel136, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelRound21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound21Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jLabel137, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(panelRound21Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton67)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelRound21Layout.setVerticalGroup(
            panelRound21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRound21Layout.createSequentialGroup()
                        .addComponent(jLabel137)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRound21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton67)
                            .addComponent(jButton66)))
                    .addComponent(jLabel136, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(15, 15, 15))
        );

        jLabel138.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel138.setForeground(new java.awt.Color(235, 235, 235));
        jLabel138.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel138.setText("Iphone");

        jLabel139.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        jLabel139.setForeground(new java.awt.Color(235, 235, 235));
        jLabel139.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel139.setText("Admin");

        javax.swing.GroupLayout panelShadow46Layout = new javax.swing.GroupLayout(panelShadow46);
        panelShadow46.setLayout(panelShadow46Layout);
        panelShadow46Layout.setHorizontalGroup(
            panelShadow46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow46Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelShadow46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel139, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow46Layout.createSequentialGroup()
                        .addGroup(panelShadow46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imageAvatar21, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
            .addGroup(panelShadow46Layout.createSequentialGroup()
                .addComponent(panelRound21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelShadow46Layout.setVerticalGroup(
            panelShadow46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow46Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(imageAvatar21, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel138)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel139)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelRound21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelShadow47.setBackground(new java.awt.Color(88, 130, 246));
        panelShadow47.setShadowOpacity(0.3F);

        imageAvatar22.setBorderSize(5);
        imageAvatar22.setBorderSpace(0);
        imageAvatar22.setGradientColor1(new java.awt.Color(255, 255, 255));
        imageAvatar22.setGradientColor2(new java.awt.Color(255, 255, 255));
        imageAvatar22.setImage(new javax.swing.ImageIcon(getClass().getResource("/image/ip2.jpg"))); // NOI18N

        panelRound22.setBackground(new java.awt.Color(255, 255, 255));
        panelRound22.setRoundBottomLeft(5);
        panelRound22.setRoundBottomRight(5);

        jButton68.setForeground(new java.awt.Color(65, 65, 65));
        jButton68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/like.png"))); // NOI18N
        jButton68.setText("Like");
        jButton68.setBorder(null);
        jButton68.setContentAreaFilled(false);

        jLabel140.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel140.setForeground(new java.awt.Color(86, 86, 86));
        jLabel140.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel140.setText("15K");

        jButton69.setForeground(new java.awt.Color(65, 65, 65));
        jButton69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/comment.png"))); // NOI18N
        jButton69.setText("Comment");
        jButton69.setBorder(null);
        jButton69.setContentAreaFilled(false);

        jLabel141.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel141.setForeground(new java.awt.Color(86, 86, 86));
        jLabel141.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel141.setText("2K");

        javax.swing.GroupLayout panelRound22Layout = new javax.swing.GroupLayout(panelRound22);
        panelRound22.setLayout(panelRound22Layout);
        panelRound22Layout.setHorizontalGroup(
            panelRound22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton68, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelRound22Layout.setVerticalGroup(
            panelRound22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel141)
                    .addComponent(jLabel140))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton69))
                .addContainerGap())
        );

        jLabel142.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel142.setForeground(new java.awt.Color(235, 235, 235));
        jLabel142.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel142.setText("Iphone");

        jLabel143.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        jLabel143.setForeground(new java.awt.Color(235, 235, 235));
        jLabel143.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel143.setText("Admin");

        javax.swing.GroupLayout panelShadow47Layout = new javax.swing.GroupLayout(panelShadow47);
        panelShadow47.setLayout(panelShadow47Layout);
        panelShadow47Layout.setHorizontalGroup(
            panelShadow47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow47Layout.createSequentialGroup()
                .addGroup(panelShadow47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow47Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(panelShadow47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelShadow47Layout.createSequentialGroup()
                                .addComponent(panelRound22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel143, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow47Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(panelShadow47Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(imageAvatar22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelShadow47Layout.setVerticalGroup(
            panelShadow47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar22, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel142)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel143, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRound22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelShadow48.setBackground(new java.awt.Color(69, 205, 94));
        panelShadow48.setShadowOpacity(0.3F);

        imageAvatar23.setBorderSize(5);
        imageAvatar23.setBorderSpace(0);
        imageAvatar23.setGradientColor1(new java.awt.Color(255, 255, 255));
        imageAvatar23.setGradientColor2(new java.awt.Color(255, 255, 255));
        imageAvatar23.setImage(new javax.swing.ImageIcon(getClass().getResource("/image/ip3.jpg"))); // NOI18N

        panelRound23.setBackground(new java.awt.Color(255, 255, 255));
        panelRound23.setRoundBottomLeft(5);
        panelRound23.setRoundBottomRight(5);

        jButton70.setForeground(new java.awt.Color(65, 65, 65));
        jButton70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/like.png"))); // NOI18N
        jButton70.setText("Like");
        jButton70.setBorder(null);
        jButton70.setContentAreaFilled(false);

        jLabel144.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel144.setForeground(new java.awt.Color(86, 86, 86));
        jLabel144.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel144.setText("4k");

        jButton71.setForeground(new java.awt.Color(65, 65, 65));
        jButton71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/comment.png"))); // NOI18N
        jButton71.setText("Comment");
        jButton71.setBorder(null);
        jButton71.setContentAreaFilled(false);

        jLabel145.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel145.setForeground(new java.awt.Color(86, 86, 86));
        jLabel145.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel145.setText("3.5K");

        javax.swing.GroupLayout panelRound23Layout = new javax.swing.GroupLayout(panelRound23);
        panelRound23.setLayout(panelRound23Layout);
        panelRound23Layout.setHorizontalGroup(
            panelRound23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound23Layout.createSequentialGroup()
                .addGroup(panelRound23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelRound23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound23Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(panelRound23Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton71)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelRound23Layout.setVerticalGroup(
            panelRound23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel144)
                    .addComponent(jLabel145))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel146.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel146.setForeground(new java.awt.Color(235, 235, 235));
        jLabel146.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel146.setText("Iphone");

        jLabel147.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        jLabel147.setForeground(new java.awt.Color(235, 235, 235));
        jLabel147.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel147.setText("Admin");

        javax.swing.GroupLayout panelShadow48Layout = new javax.swing.GroupLayout(panelShadow48);
        panelShadow48.setLayout(panelShadow48Layout);
        panelShadow48Layout.setHorizontalGroup(
            panelShadow48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow48Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow48Layout.createSequentialGroup()
                        .addComponent(panelRound23, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addComponent(imageAvatar23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel146, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel147, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelShadow48Layout.setVerticalGroup(
            panelShadow48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel146)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel147)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRound23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        panelShadow49.setBackground(new java.awt.Color(58, 189, 217));
        panelShadow49.setShadowOpacity(0.3F);

        imageAvatar24.setBorderSize(5);
        imageAvatar24.setBorderSpace(0);
        imageAvatar24.setGradientColor1(new java.awt.Color(255, 255, 255));
        imageAvatar24.setGradientColor2(new java.awt.Color(255, 255, 255));
        imageAvatar24.setImage(new javax.swing.ImageIcon(getClass().getResource("/image/ip4.jpg"))); // NOI18N

        panelRound24.setBackground(new java.awt.Color(255, 255, 255));
        panelRound24.setRoundBottomLeft(5);
        panelRound24.setRoundBottomRight(5);

        jButton72.setForeground(new java.awt.Color(65, 65, 65));
        jButton72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/like.png"))); // NOI18N
        jButton72.setText("Like");
        jButton72.setBorder(null);
        jButton72.setContentAreaFilled(false);

        jLabel148.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel148.setForeground(new java.awt.Color(86, 86, 86));
        jLabel148.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel148.setText("1K");

        jButton73.setForeground(new java.awt.Color(65, 65, 65));
        jButton73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/comment.png"))); // NOI18N
        jButton73.setText("Comment");
        jButton73.setBorder(null);
        jButton73.setContentAreaFilled(false);

        jLabel149.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel149.setForeground(new java.awt.Color(86, 86, 86));
        jLabel149.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel149.setText("0.5K");

        javax.swing.GroupLayout panelRound24Layout = new javax.swing.GroupLayout(panelRound24);
        panelRound24.setLayout(panelRound24Layout);
        panelRound24Layout.setHorizontalGroup(
            panelRound24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound24Layout.createSequentialGroup()
                        .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel149, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound24Layout.createSequentialGroup()
                        .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton73)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelRound24Layout.setVerticalGroup(
            panelRound24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRound24Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panelRound24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRound24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel148)
                        .addComponent(jLabel149))))
        );

        jLabel150.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel150.setForeground(new java.awt.Color(235, 235, 235));
        jLabel150.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel150.setText("Iphone");

        jLabel151.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        jLabel151.setForeground(new java.awt.Color(235, 235, 235));
        jLabel151.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel151.setText("Admin");

        javax.swing.GroupLayout panelShadow49Layout = new javax.swing.GroupLayout(panelShadow49);
        panelShadow49.setLayout(panelShadow49Layout);
        panelShadow49Layout.setHorizontalGroup(
            panelShadow49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow49Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageAvatar24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel150, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel151, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelShadow49Layout.createSequentialGroup()
                        .addComponent(panelRound24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 19, Short.MAX_VALUE))))
        );
        panelShadow49Layout.setVerticalGroup(
            panelShadow49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow49Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(imageAvatar24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel150)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel151)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelRound24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelShadow50.setBackground(new java.awt.Color(241, 209, 70));
        panelShadow50.setShadowOpacity(0.3F);

        imageAvatar25.setBorderSize(5);
        imageAvatar25.setBorderSpace(0);
        imageAvatar25.setGradientColor1(new java.awt.Color(255, 255, 255));
        imageAvatar25.setGradientColor2(new java.awt.Color(255, 255, 255));
        imageAvatar25.setImage(new javax.swing.ImageIcon(getClass().getResource("/image/ip5.jpg"))); // NOI18N

        panelRound25.setBackground(new java.awt.Color(255, 255, 255));
        panelRound25.setRoundBottomLeft(5);
        panelRound25.setRoundBottomRight(5);

        jButton74.setForeground(new java.awt.Color(65, 65, 65));
        jButton74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/like.png"))); // NOI18N
        jButton74.setText("Like");
        jButton74.setBorder(null);
        jButton74.setContentAreaFilled(false);

        jLabel152.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel152.setForeground(new java.awt.Color(86, 86, 86));
        jLabel152.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel152.setText("50K");

        jButton75.setForeground(new java.awt.Color(65, 65, 65));
        jButton75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/comment.png"))); // NOI18N
        jButton75.setText("Comment");
        jButton75.setBorder(null);
        jButton75.setContentAreaFilled(false);

        jLabel153.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel153.setForeground(new java.awt.Color(86, 86, 86));
        jLabel153.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel153.setText("30.2K");

        javax.swing.GroupLayout panelRound25Layout = new javax.swing.GroupLayout(panelRound25);
        panelRound25.setLayout(panelRound25Layout);
        panelRound25Layout.setHorizontalGroup(
            panelRound25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound25Layout.createSequentialGroup()
                        .addComponent(jLabel152, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel153, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(panelRound25Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11))))
        );
        panelRound25Layout.setVerticalGroup(
            panelRound25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel153)
                    .addComponent(jLabel152))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel154.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel154.setForeground(new java.awt.Color(235, 235, 235));
        jLabel154.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel154.setText("Iphone");

        jLabel155.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        jLabel155.setForeground(new java.awt.Color(235, 235, 235));
        jLabel155.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel155.setText("Admin");

        javax.swing.GroupLayout panelShadow50Layout = new javax.swing.GroupLayout(panelShadow50);
        panelShadow50.setLayout(panelShadow50Layout);
        panelShadow50Layout.setHorizontalGroup(
            panelShadow50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow50Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel154, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel155, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelShadow50Layout.createSequentialGroup()
                        .addComponent(panelRound25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(imageAvatar25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelShadow50Layout.setVerticalGroup(
            panelShadow50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow50Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(imageAvatar25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel154)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel155)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelRound25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panelShadow23.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow23.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelShadow23.setPreferredSize(new java.awt.Dimension(195, 247));
        panelShadow23.setShadowOpacity(0.3F);

        IphoneThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/+++++.jpg"))); // NOI18N
        IphoneThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IphoneThemMouseClicked(evt);
            }
        });
        IphoneThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IphoneThemActionPerformed(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel67.setText("THÊM SẢN PHẨM");

        javax.swing.GroupLayout panelShadow23Layout = new javax.swing.GroupLayout(panelShadow23);
        panelShadow23.setLayout(panelShadow23Layout);
        panelShadow23Layout.setHorizontalGroup(
            panelShadow23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow23Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelShadow23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IphoneThem, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67))
                .addGap(18, 18, 18))
        );
        panelShadow23Layout.setVerticalGroup(
            panelShadow23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow23Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel67)
                .addGap(18, 18, 18)
                .addComponent(IphoneThem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToggleButton1.setText("Quay lại");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton1)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelShadow23, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel135)))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelShadow41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelShadow46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelShadow42, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(panelShadow47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelShadow43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelShadow48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelShadow44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelShadow49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelShadow50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelShadow45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jToggleButton1)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelShadow23, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(panelShadow41, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(panelShadow45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelShadow44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelShadow43, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(panelShadow42, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(panelShadow50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel135))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelShadow46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelShadow48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelShadow49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelShadow47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(581, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel9);

        materialTabbed1.addTab("Iphone", jScrollPane2);

        jScrollPane1.setBorder(null);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1589, 685));

        panelShadow1.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow1.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelShadow1.setShadowOpacity(0.3F);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(90, 90, 90));
        jLabel1.setText("Samsung Galaxy S23 Ultra");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(90, 90, 90));
        jLabel2.setText("24.990.000 đ");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(90, 90, 90));
        jTextArea1.setRows(5);
        jTextArea1.setText("RAM: 8 GB\nDung lượng: 256 GB");
        jTextArea1.setBorder(null);
        jTextArea1.setFocusable(false);

        starRating1.setForeground(new java.awt.Color(22, 136, 12));
        starRating1.setStar(5);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sm1.jpg"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(starRating1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton11)))
                .addGap(0, 59, Short.MAX_VALUE))
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(starRating1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelShadow2.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow2.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelShadow2.setPreferredSize(new java.awt.Dimension(195, 247));
        panelShadow2.setShadowOpacity(0.3F);

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(90, 90, 90));
        jLabel3.setText("Samsung Galaxy S23");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(90, 90, 90));
        jLabel4.setText("32.190.000 đ");

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setForeground(new java.awt.Color(90, 90, 90));
        jTextArea2.setRows(5);
        jTextArea2.setText("RAM: 12 GB\nDung lượng: 256 GB");
        jTextArea2.setBorder(null);
        jTextArea2.setFocusable(false);

        starRating2.setForeground(new java.awt.Color(22, 136, 12));
        starRating2.setStar(4);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sm2.jpg"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow2Layout = new javax.swing.GroupLayout(panelShadow2);
        panelShadow2.setLayout(panelShadow2Layout);
        panelShadow2Layout.setHorizontalGroup(
            panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelShadow2Layout.createSequentialGroup()
                        .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addGroup(panelShadow2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jButton12))
                            .addComponent(starRating2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelShadow2Layout.setVerticalGroup(
            panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow2Layout.createSequentialGroup()
                .addComponent(jButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(starRating2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelShadow3.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow3.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelShadow3.setPreferredSize(new java.awt.Dimension(195, 247));
        panelShadow3.setShadowOpacity(0.3F);

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(90, 90, 90));
        jLabel5.setText("Samsung Galaxy S24");

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(90, 90, 90));
        jLabel6.setText("21.990.000 đ");

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setForeground(new java.awt.Color(90, 90, 90));
        jTextArea3.setRows(5);
        jTextArea3.setText("RAM: 8 GB\nDung lượng: 256 GB");
        jTextArea3.setBorder(null);
        jTextArea3.setFocusable(false);

        starRating3.setForeground(new java.awt.Color(22, 136, 12));
        starRating3.setStar(4);

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sm3.jpg"))); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow3Layout = new javax.swing.GroupLayout(panelShadow3);
        panelShadow3.setLayout(panelShadow3Layout);
        panelShadow3Layout.setHorizontalGroup(
            panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextArea3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelShadow3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton13)
                            .addGroup(panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(starRating3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(35, 35, 35))
        );
        panelShadow3Layout.setVerticalGroup(
            panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow3Layout.createSequentialGroup()
                .addComponent(jButton13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(3, 3, 3)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArea3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(starRating3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        panelShadow4.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow4.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelShadow4.setPreferredSize(new java.awt.Dimension(195, 247));
        panelShadow4.setShadowOpacity(0.3F);

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(90, 90, 90));
        jLabel7.setText("Samsung Galaxy Z Fold5");

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(90, 90, 90));
        jLabel8.setText("35.990.000 đ");

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setForeground(new java.awt.Color(90, 90, 90));
        jTextArea4.setRows(5);
        jTextArea4.setText("RAM: 12 GB\nDung lượng: 456 GB");
        jTextArea4.setBorder(null);
        jTextArea4.setFocusable(false);

        starRating4.setForeground(new java.awt.Color(22, 136, 12));
        starRating4.setStar(3);

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sm4.jpg"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow4Layout = new javax.swing.GroupLayout(panelShadow4);
        panelShadow4.setLayout(panelShadow4Layout);
        panelShadow4Layout.setHorizontalGroup(
            panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(starRating4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(panelShadow4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton14)
                .addGap(0, 46, Short.MAX_VALUE))
            .addGroup(panelShadow4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelShadow4Layout.setVerticalGroup(
            panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow4Layout.createSequentialGroup()
                .addComponent(jButton14)
                .addGap(3, 3, 3)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArea4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(starRating4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelShadow5.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow5.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelShadow5.setPreferredSize(new java.awt.Dimension(195, 247));
        panelShadow5.setShadowOpacity(0.3F);

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(90, 90, 90));
        jLabel9.setText("Samsung Galaxy Z");

        jLabel10.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(90, 90, 90));
        jLabel10.setText("31.390.000đ");

        jTextArea5.setEditable(false);
        jTextArea5.setColumns(20);
        jTextArea5.setForeground(new java.awt.Color(90, 90, 90));
        jTextArea5.setRows(5);
        jTextArea5.setText("RAM: 8 GB\nDung lượng: 256 GB");
        jTextArea5.setBorder(null);
        jTextArea5.setFocusable(false);

        starRating5.setForeground(new java.awt.Color(22, 136, 12));
        starRating5.setStar(4);

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sm5.jpg"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow5Layout = new javax.swing.GroupLayout(panelShadow5);
        panelShadow5.setLayout(panelShadow5Layout);
        panelShadow5Layout.setHorizontalGroup(
            panelShadow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow5Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(starRating5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(panelShadow5Layout.createSequentialGroup()
                .addGroup(panelShadow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextArea5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelShadow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelShadow5Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panelShadow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)))
                        .addGroup(panelShadow5Layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(jButton15))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow5Layout.setVerticalGroup(
            panelShadow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow5Layout.createSequentialGroup()
                .addComponent(jButton15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(3, 3, 3)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArea5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(starRating5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(77, 77, 77));
        jLabel11.setText("Profile");

        panelShadow6.setBackground(new java.awt.Color(246, 88, 88));
        panelShadow6.setPreferredSize(new java.awt.Dimension(195, 247));
        panelShadow6.setShadowOpacity(0.3F);

        imageAvatar1.setBorderSize(5);
        imageAvatar1.setBorderSpace(0);
        imageAvatar1.setGradientColor1(new java.awt.Color(255, 255, 255));
        imageAvatar1.setGradientColor2(new java.awt.Color(255, 255, 255));
        imageAvatar1.setImage(new javax.swing.ImageIcon(getClass().getResource("/image/sm1.jpg"))); // NOI18N

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(5);
        panelRound1.setRoundBottomRight(5);

        jButton1.setForeground(new java.awt.Color(65, 65, 65));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/like.png"))); // NOI18N
        jButton1.setText("Like");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(86, 86, 86));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("12K");

        jButton2.setForeground(new java.awt.Color(65, 65, 65));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/comment.png"))); // NOI18N
        jButton2.setText("Comment");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);

        jLabel13.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(86, 86, 86));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("1.9K");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRound1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1)))
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(15, 15, 15))
        );

        jLabel14.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(235, 235, 235));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Mr. Dara");

        jLabel15.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(235, 235, 235));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Admin");

        javax.swing.GroupLayout panelShadow6Layout = new javax.swing.GroupLayout(panelShadow6);
        panelShadow6.setLayout(panelShadow6Layout);
        panelShadow6Layout.setHorizontalGroup(
            panelShadow6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(panelShadow6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imageAvatar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow6Layout.setVerticalGroup(
            panelShadow6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelShadow7.setBackground(new java.awt.Color(88, 130, 246));
        panelShadow7.setPreferredSize(new java.awt.Dimension(195, 247));
        panelShadow7.setShadowOpacity(0.3F);

        imageAvatar2.setBorderSize(5);
        imageAvatar2.setBorderSpace(0);
        imageAvatar2.setGradientColor1(new java.awt.Color(255, 255, 255));
        imageAvatar2.setGradientColor2(new java.awt.Color(255, 255, 255));
        imageAvatar2.setImage(new javax.swing.ImageIcon(getClass().getResource("/image/sm2.jpg"))); // NOI18N

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setRoundBottomLeft(5);
        panelRound2.setRoundBottomRight(5);

        jButton3.setForeground(new java.awt.Color(65, 65, 65));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/like.png"))); // NOI18N
        jButton3.setText("Like");
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);

        jLabel16.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(86, 86, 86));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("15K");

        jButton4.setForeground(new java.awt.Color(65, 65, 65));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/comment.png"))); // NOI18N
        jButton4.setText("Comment");
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);

        jLabel17.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(86, 86, 86));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("1.2K");

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        jLabel18.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(235, 235, 235));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Mr. Dara");

        jLabel19.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(235, 235, 235));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Admin");

        javax.swing.GroupLayout panelShadow7Layout = new javax.swing.GroupLayout(panelShadow7);
        panelShadow7.setLayout(panelShadow7Layout);
        panelShadow7Layout.setHorizontalGroup(
            panelShadow7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow7Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(imageAvatar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelShadow7Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow7Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        panelShadow7Layout.setVerticalGroup(
            panelShadow7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelShadow8.setBackground(new java.awt.Color(69, 205, 94));
        panelShadow8.setPreferredSize(new java.awt.Dimension(195, 247));
        panelShadow8.setShadowOpacity(0.3F);

        imageAvatar3.setBorderSize(5);
        imageAvatar3.setBorderSpace(0);
        imageAvatar3.setGradientColor1(new java.awt.Color(255, 255, 255));
        imageAvatar3.setGradientColor2(new java.awt.Color(255, 255, 255));
        imageAvatar3.setImage(new javax.swing.ImageIcon(getClass().getResource("/image/sm3.jpg"))); // NOI18N

        panelRound3.setBackground(new java.awt.Color(255, 255, 255));
        panelRound3.setRoundBottomLeft(5);
        panelRound3.setRoundBottomRight(5);

        jButton5.setForeground(new java.awt.Color(65, 65, 65));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/like.png"))); // NOI18N
        jButton5.setText("Like");
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);

        jLabel20.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(86, 86, 86));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("50K");

        jButton6.setForeground(new java.awt.Color(65, 65, 65));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/comment.png"))); // NOI18N
        jButton6.setText("Comment");
        jButton6.setBorder(null);
        jButton6.setContentAreaFilled(false);

        jLabel21.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(86, 86, 86));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("3.5K");

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(panelRound3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel22.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(235, 235, 235));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Mr. Dara");

        jLabel23.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(235, 235, 235));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Admin");

        javax.swing.GroupLayout panelShadow8Layout = new javax.swing.GroupLayout(panelShadow8);
        panelShadow8.setLayout(panelShadow8Layout);
        panelShadow8Layout.setHorizontalGroup(
            panelShadow8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageAvatar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelShadow8Layout.createSequentialGroup()
                        .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 45, Short.MAX_VALUE))))
        );
        panelShadow8Layout.setVerticalGroup(
            panelShadow8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        panelShadow9.setBackground(new java.awt.Color(58, 189, 217));
        panelShadow9.setPreferredSize(new java.awt.Dimension(195, 247));
        panelShadow9.setShadowOpacity(0.3F);

        imageAvatar4.setBorderSize(5);
        imageAvatar4.setBorderSpace(0);
        imageAvatar4.setGradientColor1(new java.awt.Color(255, 255, 255));
        imageAvatar4.setGradientColor2(new java.awt.Color(255, 255, 255));
        imageAvatar4.setImage(new javax.swing.ImageIcon(getClass().getResource("/image/sm4.jpg"))); // NOI18N

        panelRound4.setBackground(new java.awt.Color(255, 255, 255));
        panelRound4.setRoundBottomLeft(5);
        panelRound4.setRoundBottomRight(5);

        jButton7.setForeground(new java.awt.Color(65, 65, 65));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/like.png"))); // NOI18N
        jButton7.setText("Like");
        jButton7.setBorder(null);
        jButton7.setContentAreaFilled(false);

        jLabel24.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(86, 86, 86));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("10K");

        jButton8.setForeground(new java.awt.Color(65, 65, 65));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/comment.png"))); // NOI18N
        jButton8.setText("Comment");
        jButton8.setBorder(null);
        jButton8.setContentAreaFilled(false);

        jLabel25.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(86, 86, 86));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("0.5K");

        javax.swing.GroupLayout panelRound4Layout = new javax.swing.GroupLayout(panelRound4);
        panelRound4.setLayout(panelRound4Layout);
        panelRound4Layout.setHorizontalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound4Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound4Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panelRound4Layout.setVerticalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRound4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(jLabel25))))
        );

        jLabel26.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(235, 235, 235));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Mr. Dara");

        jLabel27.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(235, 235, 235));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Admin");

        javax.swing.GroupLayout panelShadow9Layout = new javax.swing.GroupLayout(panelShadow9);
        panelShadow9.setLayout(panelShadow9Layout);
        panelShadow9Layout.setHorizontalGroup(
            panelShadow9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow9Layout.createSequentialGroup()
                        .addComponent(panelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 33, Short.MAX_VALUE))
                    .addComponent(imageAvatar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelShadow9Layout.setVerticalGroup(
            panelShadow9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow9Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(imageAvatar4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        panelShadow10.setBackground(new java.awt.Color(241, 209, 70));
        panelShadow10.setPreferredSize(new java.awt.Dimension(195, 247));
        panelShadow10.setShadowOpacity(0.3F);

        imageAvatar5.setBorderSize(5);
        imageAvatar5.setBorderSpace(0);
        imageAvatar5.setGradientColor1(new java.awt.Color(255, 255, 255));
        imageAvatar5.setGradientColor2(new java.awt.Color(255, 255, 255));
        imageAvatar5.setImage(new javax.swing.ImageIcon(getClass().getResource("/image/sm5.jpg"))); // NOI18N

        panelRound5.setBackground(new java.awt.Color(255, 255, 255));
        panelRound5.setPreferredSize(new java.awt.Dimension(195, 58));
        panelRound5.setRoundBottomLeft(5);
        panelRound5.setRoundBottomRight(5);

        jButton9.setForeground(new java.awt.Color(65, 65, 65));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/like.png"))); // NOI18N
        jButton9.setText("Like");
        jButton9.setBorder(null);
        jButton9.setContentAreaFilled(false);

        jLabel28.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(86, 86, 86));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("13K");

        jButton10.setForeground(new java.awt.Color(65, 65, 65));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/comment.png"))); // NOI18N
        jButton10.setText("Comment");
        jButton10.setBorder(null);
        jButton10.setContentAreaFilled(false);

        jLabel29.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(86, 86, 86));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("2.5K");

        javax.swing.GroupLayout panelRound5Layout = new javax.swing.GroupLayout(panelRound5);
        panelRound5.setLayout(panelRound5Layout);
        panelRound5Layout.setHorizontalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound5Layout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(panelRound5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11))))
        );
        panelRound5Layout.setVerticalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel30.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(235, 235, 235));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Mr. Dara");

        jLabel31.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(235, 235, 235));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Admin");

        javax.swing.GroupLayout panelShadow10Layout = new javax.swing.GroupLayout(panelShadow10);
        panelShadow10.setLayout(panelShadow10Layout);
        panelShadow10Layout.setHorizontalGroup(
            panelShadow10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imageAvatar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow10Layout.setVerticalGroup(
            panelShadow10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow10Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(imageAvatar5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addGap(15, 15, 15)
                .addComponent(panelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        panelShadow54.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow54.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelShadow54.setPreferredSize(new java.awt.Dimension(195, 247));
        panelShadow54.setShadowOpacity(0.3F);

        SamSumThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/+++++.jpg"))); // NOI18N
        SamSumThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SamSumThemActionPerformed(evt);
            }
        });

        jLabel109.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel109.setText("THÊM SẢN PHẨM");

        javax.swing.GroupLayout panelShadow54Layout = new javax.swing.GroupLayout(panelShadow54);
        panelShadow54.setLayout(panelShadow54Layout);
        panelShadow54Layout.setHorizontalGroup(
            panelShadow54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow54Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelShadow54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SamSumThem, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel109))
                .addGap(36, 36, 36))
        );
        panelShadow54Layout.setVerticalGroup(
            panelShadow54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow54Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel109)
                .addGap(18, 18, 18)
                .addComponent(SamSumThem)
                .addGap(28, 28, 28))
        );

        jToggleButton2.setText("Quay lại");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(panelShadow54, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelShadow6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelShadow2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelShadow7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelShadow8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelShadow3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelShadow9, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelShadow4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelShadow10, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(panelShadow5, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                        .addGap(309, 309, 309))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jToggleButton2)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jToggleButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelShadow4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                        .addComponent(panelShadow54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panelShadow3, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                        .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelShadow2, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
                    .addComponent(panelShadow5, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(jLabel11)
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelShadow6, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(panelShadow9, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(panelShadow10, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(panelShadow8, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(panelShadow7, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        materialTabbed1.addTab("Samsum", jScrollPane1);

        jPanel22.setBackground(new java.awt.Color(204, 255, 255));

        jPanel21.setBackground(new java.awt.Color(204, 255, 255));
        jPanel21.setPreferredSize(new java.awt.Dimension(1589, 685));

        panelShadow28.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow28.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelShadow28.setPreferredSize(new java.awt.Dimension(195, 247));
        panelShadow28.setShadowOpacity(0.3F);

        jLabel77.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(90, 90, 90));
        jLabel77.setText("Realme 11 Pro");

        jLabel78.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(90, 90, 90));
        jLabel78.setText("14.990.000đ");

        jTextArea18.setEditable(false);
        jTextArea18.setColumns(20);
        jTextArea18.setForeground(new java.awt.Color(90, 90, 90));
        jTextArea18.setRows(5);
        jTextArea18.setText("RAM: 12 GB\nDung lượng: 512 GB");
        jTextArea18.setBorder(null);
        jTextArea18.setFocusable(false);

        starRating18.setForeground(new java.awt.Color(22, 136, 12));
        starRating18.setStar(5);

        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/rm1.jpg"))); // NOI18N
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow28Layout = new javax.swing.GroupLayout(panelShadow28);
        panelShadow28.setLayout(panelShadow28Layout);
        panelShadow28Layout.setHorizontalGroup(
            panelShadow28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow28Layout.createSequentialGroup()
                        .addGroup(panelShadow28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel78)
                            .addComponent(starRating18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow28Layout.createSequentialGroup()
                        .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                        .addGap(66, 66, 66))
                    .addGroup(panelShadow28Layout.createSequentialGroup()
                        .addGroup(panelShadow28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton38)
                            .addComponent(jTextArea18, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelShadow28Layout.setVerticalGroup(
            panelShadow28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow28Layout.createSequentialGroup()
                .addComponent(jButton38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel77)
                .addGap(3, 3, 3)
                .addComponent(jLabel78)
                .addGroup(panelShadow28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow28Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(starRating18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelShadow28Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        panelShadow29.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow29.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelShadow29.setPreferredSize(new java.awt.Dimension(195, 247));
        panelShadow29.setShadowOpacity(0.3F);

        jLabel79.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(90, 90, 90));
        jLabel79.setText("realme C30s");

        jLabel80.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(90, 90, 90));
        jLabel80.setText("2.290.000đ");

        jTextArea19.setEditable(false);
        jTextArea19.setColumns(20);
        jTextArea19.setForeground(new java.awt.Color(90, 90, 90));
        jTextArea19.setRows(5);
        jTextArea19.setText("RAM: 6 GB\nDung lượng: 128 GB");
        jTextArea19.setBorder(null);
        jTextArea19.setFocusable(false);

        starRating19.setForeground(new java.awt.Color(22, 136, 12));
        starRating19.setStar(4);

        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/rm2.jpg"))); // NOI18N
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow29Layout = new javax.swing.GroupLayout(panelShadow29);
        panelShadow29.setLayout(panelShadow29Layout);
        panelShadow29Layout.setHorizontalGroup(
            panelShadow29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton39)
                    .addGroup(panelShadow29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextArea19, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel79)
                        .addComponent(jLabel80)
                        .addComponent(starRating19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panelShadow29Layout.setVerticalGroup(
            panelShadow29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow29Layout.createSequentialGroup()
                .addComponent(jButton39)
                .addGap(3, 3, 3)
                .addComponent(jLabel79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArea19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(starRating19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelShadow30.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow30.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelShadow30.setPreferredSize(new java.awt.Dimension(195, 247));
        panelShadow30.setShadowOpacity(0.3F);

        jLabel81.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(90, 90, 90));
        jLabel81.setText("Realme C55");

        jLabel82.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(90, 90, 90));
        jLabel82.setText("3.290.000 đ");

        jTextArea20.setEditable(false);
        jTextArea20.setColumns(20);
        jTextArea20.setForeground(new java.awt.Color(90, 90, 90));
        jTextArea20.setRows(5);
        jTextArea20.setText("RAM: 4 GB\nDung lượng: 64 GB");
        jTextArea20.setBorder(null);
        jTextArea20.setFocusable(false);

        starRating20.setForeground(new java.awt.Color(22, 136, 12));
        starRating20.setStar(4);

        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/rm3.jpg"))); // NOI18N
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow30Layout = new javax.swing.GroupLayout(panelShadow30);
        panelShadow30.setLayout(panelShadow30Layout);
        panelShadow30Layout.setHorizontalGroup(
            panelShadow30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow30Layout.createSequentialGroup()
                .addGroup(panelShadow30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow30Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panelShadow30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton40)
                            .addGroup(panelShadow30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel81)
                                .addComponent(jLabel82)
                                .addComponent(starRating20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelShadow30Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextArea20, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        panelShadow30Layout.setVerticalGroup(
            panelShadow30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow30Layout.createSequentialGroup()
                .addComponent(jButton40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel81)
                .addGap(3, 3, 3)
                .addComponent(jLabel82)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArea20, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(starRating20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelShadow31.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow31.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelShadow31.setPreferredSize(new java.awt.Dimension(195, 247));
        panelShadow31.setShadowOpacity(0.3F);

        jLabel83.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(90, 90, 90));
        jLabel83.setText("Cấu hình Điện thoại realme C51 (4GB/64GB)");

        jLabel84.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(90, 90, 90));
        jLabel84.setText("2.490.000 đ");

        jTextArea26.setEditable(false);
        jTextArea26.setColumns(20);
        jTextArea26.setForeground(new java.awt.Color(90, 90, 90));
        jTextArea26.setRows(5);
        jTextArea26.setText("RAM: 3 GB\nDung lượng: 64 GB");
        jTextArea26.setBorder(null);
        jTextArea26.setFocusable(false);

        starRating26.setForeground(new java.awt.Color(22, 136, 12));
        starRating26.setStar(3);

        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/rm4.jpg"))); // NOI18N
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow31Layout = new javax.swing.GroupLayout(panelShadow31);
        panelShadow31.setLayout(panelShadow31Layout);
        panelShadow31Layout.setHorizontalGroup(
            panelShadow31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow31Layout.createSequentialGroup()
                .addGroup(panelShadow31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow31Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelShadow31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel84)
                            .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(starRating26, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow31Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jButton41)
                .addGap(19, 19, 19))
            .addGroup(panelShadow31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextArea26, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelShadow31Layout.setVerticalGroup(
            panelShadow31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow31Layout.createSequentialGroup()
                .addComponent(jButton41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel83)
                .addGap(3, 3, 3)
                .addComponent(jLabel84)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArea26, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(starRating26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelShadow32.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow32.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelShadow32.setPreferredSize(new java.awt.Dimension(195, 247));
        panelShadow32.setShadowOpacity(0.3F);

        jLabel85.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(90, 90, 90));
        jLabel85.setText(" realme C51");

        jLabel86.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(90, 90, 90));
        jLabel86.setText("2.290.000 đ");

        jTextArea27.setEditable(false);
        jTextArea27.setColumns(20);
        jTextArea27.setForeground(new java.awt.Color(90, 90, 90));
        jTextArea27.setRows(5);
        jTextArea27.setText("RAM: 3 GB\nDung lượng: 64 GB");
        jTextArea27.setBorder(null);
        jTextArea27.setFocusable(false);

        starRating27.setForeground(new java.awt.Color(22, 136, 12));
        starRating27.setStar(4);

        jButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/realme-note-50-black-thumb-600x600.jpg"))); // NOI18N
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow32Layout = new javax.swing.GroupLayout(panelShadow32);
        panelShadow32.setLayout(panelShadow32Layout);
        panelShadow32Layout.setHorizontalGroup(
            panelShadow32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow32Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton42)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow32Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(panelShadow32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextArea27, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel85)
                    .addComponent(jLabel86)
                    .addComponent(starRating27, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        panelShadow32Layout.setVerticalGroup(
            panelShadow32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow32Layout.createSequentialGroup()
                .addComponent(jButton42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel85)
                .addGap(3, 3, 3)
                .addComponent(jLabel86)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArea27, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(starRating27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel87.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(77, 77, 77));
        jLabel87.setText("Profile");

        panelShadow33.setBackground(new java.awt.Color(246, 88, 88));
        panelShadow33.setShadowOpacity(0.3F);

        imageAvatar11.setBorderSize(5);
        imageAvatar11.setBorderSpace(0);
        imageAvatar11.setGradientColor1(new java.awt.Color(255, 255, 255));
        imageAvatar11.setGradientColor2(new java.awt.Color(255, 255, 255));
        imageAvatar11.setImage(new javax.swing.ImageIcon(getClass().getResource("/image/rm1.jpg"))); // NOI18N

        panelRound11.setBackground(new java.awt.Color(255, 255, 255));
        panelRound11.setRoundBottomLeft(5);
        panelRound11.setRoundBottomRight(5);

        jButton43.setForeground(new java.awt.Color(65, 65, 65));
        jButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/like.png"))); // NOI18N
        jButton43.setText("Like");
        jButton43.setBorder(null);
        jButton43.setContentAreaFilled(false);

        jLabel88.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(86, 86, 86));
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setText("2K");

        jButton44.setForeground(new java.awt.Color(65, 65, 65));
        jButton44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/comment.png"))); // NOI18N
        jButton44.setText("Comment");
        jButton44.setBorder(null);
        jButton44.setContentAreaFilled(false);

        jLabel89.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(86, 86, 86));
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setText("1.9K");

        javax.swing.GroupLayout panelRound11Layout = new javax.swing.GroupLayout(panelRound11);
        panelRound11.setLayout(panelRound11Layout);
        panelRound11Layout.setHorizontalGroup(
            panelRound11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound11Layout.createSequentialGroup()
                .addGroup(panelRound11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelRound11Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRound11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelRound11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(panelRound11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton44)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelRound11Layout.setVerticalGroup(
            panelRound11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRound11Layout.createSequentialGroup()
                        .addComponent(jLabel89)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRound11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton44)
                            .addComponent(jButton43)))
                    .addComponent(jLabel88, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(15, 15, 15))
        );

        jLabel90.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(235, 235, 235));
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setText("Realme");

        jLabel91.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(235, 235, 235));
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setText("Admin");

        javax.swing.GroupLayout panelShadow33Layout = new javax.swing.GroupLayout(panelShadow33);
        panelShadow33.setLayout(panelShadow33Layout);
        panelShadow33Layout.setHorizontalGroup(
            panelShadow33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow33Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRound11, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(panelShadow33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imageAvatar11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel90, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow33Layout.setVerticalGroup(
            panelShadow33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow33Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(imageAvatar11, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel91)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRound11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        panelShadow34.setBackground(new java.awt.Color(88, 130, 246));
        panelShadow34.setShadowOpacity(0.3F);

        imageAvatar12.setBorderSize(5);
        imageAvatar12.setBorderSpace(0);
        imageAvatar12.setGradientColor1(new java.awt.Color(255, 255, 255));
        imageAvatar12.setGradientColor2(new java.awt.Color(255, 255, 255));
        imageAvatar12.setImage(new javax.swing.ImageIcon(getClass().getResource("/image/rm2.jpg"))); // NOI18N

        panelRound12.setBackground(new java.awt.Color(255, 255, 255));
        panelRound12.setRoundBottomLeft(5);
        panelRound12.setRoundBottomRight(5);

        jButton45.setForeground(new java.awt.Color(65, 65, 65));
        jButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/like.png"))); // NOI18N
        jButton45.setText("Like");
        jButton45.setBorder(null);
        jButton45.setContentAreaFilled(false);

        jLabel92.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(86, 86, 86));
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setText("20K");

        jButton46.setForeground(new java.awt.Color(65, 65, 65));
        jButton46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/comment.png"))); // NOI18N
        jButton46.setText("Comment");
        jButton46.setBorder(null);
        jButton46.setContentAreaFilled(false);

        jLabel93.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(86, 86, 86));
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel93.setText("23K");

        javax.swing.GroupLayout panelRound12Layout = new javax.swing.GroupLayout(panelRound12);
        panelRound12.setLayout(panelRound12Layout);
        panelRound12Layout.setHorizontalGroup(
            panelRound12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton45, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelRound12Layout.setVerticalGroup(
            panelRound12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93)
                    .addComponent(jLabel92))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton46))
                .addContainerGap())
        );

        jLabel94.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(235, 235, 235));
        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel94.setText("Realme");

        jLabel95.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(235, 235, 235));
        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setText("Admin");

        javax.swing.GroupLayout panelShadow34Layout = new javax.swing.GroupLayout(panelShadow34);
        panelShadow34.setLayout(panelShadow34Layout);
        panelShadow34Layout.setHorizontalGroup(
            panelShadow34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow34Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(imageAvatar12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelShadow34Layout.createSequentialGroup()
                        .addGroup(panelShadow34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelRound12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelShadow34Layout.setVerticalGroup(
            panelShadow34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar12, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel94)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRound12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelShadow35.setBackground(new java.awt.Color(69, 205, 94));
        panelShadow35.setMaximumSize(new java.awt.Dimension(195, 247));
        panelShadow35.setMinimumSize(new java.awt.Dimension(195, 247));
        panelShadow35.setPreferredSize(new java.awt.Dimension(195, 247));
        panelShadow35.setShadowOpacity(0.3F);

        imageAvatar13.setBorderSize(5);
        imageAvatar13.setBorderSpace(0);
        imageAvatar13.setGradientColor1(new java.awt.Color(255, 255, 255));
        imageAvatar13.setGradientColor2(new java.awt.Color(255, 255, 255));
        imageAvatar13.setImage(new javax.swing.ImageIcon(getClass().getResource("/image/rm3.jpg"))); // NOI18N

        panelRound13.setBackground(new java.awt.Color(255, 255, 255));
        panelRound13.setRoundBottomLeft(5);
        panelRound13.setRoundBottomRight(5);

        jButton47.setForeground(new java.awt.Color(65, 65, 65));
        jButton47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/like.png"))); // NOI18N
        jButton47.setText("Like");
        jButton47.setBorder(null);
        jButton47.setContentAreaFilled(false);

        jLabel96.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(86, 86, 86));
        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel96.setText("50K");

        jButton48.setForeground(new java.awt.Color(65, 65, 65));
        jButton48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/comment.png"))); // NOI18N
        jButton48.setText("Comment");
        jButton48.setBorder(null);
        jButton48.setContentAreaFilled(false);

        jLabel97.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(86, 86, 86));
        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setText("14K");

        javax.swing.GroupLayout panelRound13Layout = new javax.swing.GroupLayout(panelRound13);
        panelRound13.setLayout(panelRound13Layout);
        panelRound13Layout.setHorizontalGroup(
            panelRound13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound13Layout.createSequentialGroup()
                .addGroup(panelRound13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton47))
                .addGroup(panelRound13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(panelRound13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton48)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelRound13Layout.setVerticalGroup(
            panelRound13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96)
                    .addComponent(jLabel97))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel98.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(235, 235, 235));
        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel98.setText("Realme");

        jLabel99.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(235, 235, 235));
        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel99.setText("Admin");

        javax.swing.GroupLayout panelShadow35Layout = new javax.swing.GroupLayout(panelShadow35);
        panelShadow35.setLayout(panelShadow35Layout);
        panelShadow35Layout.setHorizontalGroup(
            panelShadow35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow35Layout.createSequentialGroup()
                        .addComponent(jLabel98, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jLabel99, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelShadow35Layout.createSequentialGroup()
                        .addComponent(panelRound13, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(imageAvatar13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelShadow35Layout.setVerticalGroup(
            panelShadow35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel98)
                .addGap(10, 10, 10)
                .addComponent(jLabel99)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelRound13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        panelShadow36.setBackground(new java.awt.Color(58, 189, 217));
        panelShadow36.setPreferredSize(new java.awt.Dimension(195, 247));
        panelShadow36.setShadowOpacity(0.3F);

        imageAvatar14.setBorderSize(5);
        imageAvatar14.setBorderSpace(0);
        imageAvatar14.setGradientColor1(new java.awt.Color(255, 255, 255));
        imageAvatar14.setGradientColor2(new java.awt.Color(255, 255, 255));
        imageAvatar14.setImage(new javax.swing.ImageIcon(getClass().getResource("/image/rm4.jpg"))); // NOI18N

        panelRound14.setBackground(new java.awt.Color(255, 255, 255));
        panelRound14.setRoundBottomLeft(5);
        panelRound14.setRoundBottomRight(5);

        jButton49.setForeground(new java.awt.Color(65, 65, 65));
        jButton49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/like.png"))); // NOI18N
        jButton49.setText("Like");
        jButton49.setBorder(null);
        jButton49.setContentAreaFilled(false);

        jLabel100.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(86, 86, 86));
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setText("10K");

        jButton50.setForeground(new java.awt.Color(65, 65, 65));
        jButton50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/comment.png"))); // NOI18N
        jButton50.setText("Comment");
        jButton50.setBorder(null);
        jButton50.setContentAreaFilled(false);

        jLabel101.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(86, 86, 86));
        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel101.setText("5K");

        javax.swing.GroupLayout panelRound14Layout = new javax.swing.GroupLayout(panelRound14);
        panelRound14.setLayout(panelRound14Layout);
        panelRound14Layout.setHorizontalGroup(
            panelRound14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound14Layout.createSequentialGroup()
                        .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound14Layout.createSequentialGroup()
                        .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton50)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound14Layout.setVerticalGroup(
            panelRound14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRound14Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panelRound14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRound14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel100)
                        .addComponent(jLabel101))))
        );

        jLabel102.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(235, 235, 235));
        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel102.setText("Realme");

        jLabel103.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(235, 235, 235));
        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel103.setText("Admin");

        javax.swing.GroupLayout panelShadow36Layout = new javax.swing.GroupLayout(panelShadow36);
        panelShadow36.setLayout(panelShadow36Layout);
        panelShadow36Layout.setHorizontalGroup(
            panelShadow36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel102, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel103, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelShadow36Layout.createSequentialGroup()
                        .addGroup(panelShadow36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imageAvatar14, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelRound14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 21, Short.MAX_VALUE))))
        );
        panelShadow36Layout.setVerticalGroup(
            panelShadow36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow36Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(imageAvatar14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel102)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel103)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRound14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        panelShadow37.setBackground(new java.awt.Color(241, 209, 70));
        panelShadow37.setPreferredSize(new java.awt.Dimension(195, 247));
        panelShadow37.setShadowOpacity(0.3F);

        imageAvatar15.setBorderSize(5);
        imageAvatar15.setBorderSpace(0);
        imageAvatar15.setGradientColor1(new java.awt.Color(255, 255, 255));
        imageAvatar15.setGradientColor2(new java.awt.Color(255, 255, 255));
        imageAvatar15.setImage(new javax.swing.ImageIcon(getClass().getResource("/image/realme-note-50-black-thumb-600x600.jpg"))); // NOI18N

        panelRound15.setBackground(new java.awt.Color(255, 255, 255));
        panelRound15.setRoundBottomLeft(5);
        panelRound15.setRoundBottomRight(5);

        jButton51.setForeground(new java.awt.Color(65, 65, 65));
        jButton51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/like.png"))); // NOI18N
        jButton51.setText("Like");
        jButton51.setBorder(null);
        jButton51.setContentAreaFilled(false);

        jLabel104.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(86, 86, 86));
        jLabel104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel104.setText("3K");

        jButton52.setForeground(new java.awt.Color(65, 65, 65));
        jButton52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/comment.png"))); // NOI18N
        jButton52.setText("Comment");
        jButton52.setBorder(null);
        jButton52.setContentAreaFilled(false);

        jLabel105.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(86, 86, 86));
        jLabel105.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel105.setText("2.5K");

        javax.swing.GroupLayout panelRound15Layout = new javax.swing.GroupLayout(panelRound15);
        panelRound15.setLayout(panelRound15Layout);
        panelRound15Layout.setHorizontalGroup(
            panelRound15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound15Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(panelRound15Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11))))
        );
        panelRound15Layout.setVerticalGroup(
            panelRound15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel105)
                    .addComponent(jLabel104))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel106.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(235, 235, 235));
        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel106.setText("Realme");

        jLabel107.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(235, 235, 235));
        jLabel107.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel107.setText("Admin");

        javax.swing.GroupLayout panelShadow37Layout = new javax.swing.GroupLayout(panelShadow37);
        panelShadow37.setLayout(panelShadow37Layout);
        panelShadow37Layout.setHorizontalGroup(
            panelShadow37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageAvatar15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel107, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelShadow37Layout.createSequentialGroup()
                        .addComponent(panelRound15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 33, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelShadow37Layout.setVerticalGroup(
            panelShadow37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel106)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel107)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRound15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        panelShadow22.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow22.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelShadow22.setShadowOpacity(0.3F);

        RealmeThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/+++++.jpg"))); // NOI18N
        RealmeThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealmeThemActionPerformed(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel66.setText("THÊM SẢN PHẨM");

        javax.swing.GroupLayout panelShadow22Layout = new javax.swing.GroupLayout(panelShadow22);
        panelShadow22.setLayout(panelShadow22Layout);
        panelShadow22Layout.setHorizontalGroup(
            panelShadow22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelShadow22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RealmeThem, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66))
                .addGap(18, 18, 18))
        );
        panelShadow22Layout.setVerticalGroup(
            panelShadow22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow22Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel66)
                .addGap(18, 18, 18)
                .addComponent(RealmeThem)
                .addGap(28, 28, 28))
        );

        jToggleButton3.setText("Quay lại");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jToggleButton3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel87)
                            .addComponent(panelShadow22, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelShadow33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelShadow28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelShadow29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelShadow34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelShadow35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelShadow30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelShadow36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelShadow31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelShadow32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelShadow37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(218, 218, 218))))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jToggleButton3)
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(panelShadow22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel87)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelShadow28, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(panelShadow31, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(panelShadow32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(panelShadow30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(panelShadow29, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                        .addGap(18, 29, Short.MAX_VALUE)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelShadow35, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                            .addComponent(panelShadow37, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panelShadow34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panelShadow33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(panelShadow36, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
                        .addGap(75, 75, 75))))
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1038, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(463, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel22);

        materialTabbed1.addTab("Realme", jScrollPane3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(materialTabbed1, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(materialTabbed1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RealmeThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealmeThemActionPerformed
        RealmeThem r1=new RealmeThem();
        r1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RealmeThemActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        Realme5 r5=new Realme5();
        r5.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        Realme4 r4=new Realme4();
        r4.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        Realme3 r3=new Realme3();
        r3.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        Realme2 r2=new Realme2();
        r2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        Realme1 r1=new Realme1();
        r1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton38ActionPerformed

    private void SamSumThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SamSumThemActionPerformed
        SamsumThem s1=new SamsumThem();
        s1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SamSumThemActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        Samsum5 s5=new Samsum5();
        s5.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        Samsum4 s4=new Samsum4();
        s4.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        Samsum3 s3=new Samsum3();
        s3.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        Samsum2 s2=new Samsum2();
        s2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        Samsum1 s1=new Samsum1();
        s1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void IphoneThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IphoneThemActionPerformed
        IphoneThem i1=new IphoneThem();
        i1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_IphoneThemActionPerformed

    private void IphoneThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IphoneThemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_IphoneThemMouseClicked

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
        Iphone5 Ip5=new Iphone5();
        Ip5.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton65ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        Iphone4 Ip4=new Iphone4();
        Ip4.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton64ActionPerformed

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
        Iphone3 Ip3=new Iphone3();
        Ip3.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton63ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
        Iphone2 Ip2=new Iphone2();
        Ip2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
        Iphone1 Ip1=new Iphone1();
        Ip1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton61ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        Nokia4 n4=new Nokia4();
        n4.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        Nokia5 n5=new Nokia5();
        n5.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void NokiaThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NokiaThemActionPerformed
        NokiaThem nt1=new NokiaThem();
        nt1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_NokiaThemActionPerformed

    private void NokiaThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NokiaThemMouseClicked
        NokiaThem n1=new NokiaThem();
        n1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_NokiaThemMouseClicked

    private void Nokia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nokia1ActionPerformed
        Nokia1 n1=new Nokia1();
        n1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Nokia1ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        Nokia3 n3=new Nokia3();
        n3.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        Nokia2 n2=new Nokia2();
        n2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void QuaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuaylaiActionPerformed
       quayLaiMenuAdmin();
    }//GEN-LAST:event_QuaylaiActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        quayLaiMenuAdmin();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        quayLaiMenuAdmin();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        quayLaiMenuAdmin();
    }//GEN-LAST:event_jToggleButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IphoneThem;
    private javax.swing.JButton Nokia1;
    private javax.swing.JButton NokiaThem;
    private javax.swing.JToggleButton Quaylai;
    private javax.swing.JButton RealmeThem;
    private javax.swing.JButton SamSumThem;
    private swing.ImageAvatar imageAvatar1;
    private swing.ImageAvatar imageAvatar10;
    private swing.ImageAvatar imageAvatar11;
    private swing.ImageAvatar imageAvatar12;
    private swing.ImageAvatar imageAvatar13;
    private swing.ImageAvatar imageAvatar14;
    private swing.ImageAvatar imageAvatar15;
    private swing.ImageAvatar imageAvatar2;
    private swing.ImageAvatar imageAvatar21;
    private swing.ImageAvatar imageAvatar22;
    private swing.ImageAvatar imageAvatar23;
    private swing.ImageAvatar imageAvatar24;
    private swing.ImageAvatar imageAvatar25;
    private swing.ImageAvatar imageAvatar3;
    private swing.ImageAvatar imageAvatar4;
    private swing.ImageAvatar imageAvatar5;
    private swing.ImageAvatar imageAvatar6;
    private swing.ImageAvatar imageAvatar7;
    private swing.ImageAvatar imageAvatar8;
    private swing.ImageAvatar imageAvatar9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea18;
    private javax.swing.JTextArea jTextArea19;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea20;
    private javax.swing.JTextArea jTextArea21;
    private javax.swing.JTextArea jTextArea22;
    private javax.swing.JTextArea jTextArea23;
    private javax.swing.JTextArea jTextArea24;
    private javax.swing.JTextArea jTextArea25;
    private javax.swing.JTextArea jTextArea26;
    private javax.swing.JTextArea jTextArea27;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private swing.MaterialTabbed materialTabbed1;
    private swing.PanelRound panelRound1;
    private swing.PanelRound panelRound10;
    private swing.PanelRound panelRound11;
    private swing.PanelRound panelRound12;
    private swing.PanelRound panelRound13;
    private swing.PanelRound panelRound14;
    private swing.PanelRound panelRound15;
    private swing.PanelRound panelRound2;
    private swing.PanelRound panelRound21;
    private swing.PanelRound panelRound22;
    private swing.PanelRound panelRound23;
    private swing.PanelRound panelRound24;
    private swing.PanelRound panelRound25;
    private swing.PanelRound panelRound3;
    private swing.PanelRound panelRound4;
    private swing.PanelRound panelRound5;
    private swing.PanelRound panelRound6;
    private swing.PanelRound panelRound7;
    private swing.PanelRound panelRound8;
    private swing.PanelRound panelRound9;
    private swing.PanelShadow panelShadow1;
    private swing.PanelShadow panelShadow10;
    private swing.PanelShadow panelShadow11;
    private swing.PanelShadow panelShadow12;
    private swing.PanelShadow panelShadow13;
    private swing.PanelShadow panelShadow14;
    private swing.PanelShadow panelShadow15;
    private swing.PanelShadow panelShadow16;
    private swing.PanelShadow panelShadow17;
    private swing.PanelShadow panelShadow18;
    private swing.PanelShadow panelShadow19;
    private swing.PanelShadow panelShadow2;
    private swing.PanelShadow panelShadow20;
    private swing.PanelShadow panelShadow22;
    private swing.PanelShadow panelShadow23;
    private swing.PanelShadow panelShadow25;
    private swing.PanelShadow panelShadow28;
    private swing.PanelShadow panelShadow29;
    private swing.PanelShadow panelShadow3;
    private swing.PanelShadow panelShadow30;
    private swing.PanelShadow panelShadow31;
    private swing.PanelShadow panelShadow32;
    private swing.PanelShadow panelShadow33;
    private swing.PanelShadow panelShadow34;
    private swing.PanelShadow panelShadow35;
    private swing.PanelShadow panelShadow36;
    private swing.PanelShadow panelShadow37;
    private swing.PanelShadow panelShadow4;
    private swing.PanelShadow panelShadow41;
    private swing.PanelShadow panelShadow42;
    private swing.PanelShadow panelShadow43;
    private swing.PanelShadow panelShadow44;
    private swing.PanelShadow panelShadow45;
    private swing.PanelShadow panelShadow46;
    private swing.PanelShadow panelShadow47;
    private swing.PanelShadow panelShadow48;
    private swing.PanelShadow panelShadow49;
    private swing.PanelShadow panelShadow5;
    private swing.PanelShadow panelShadow50;
    private swing.PanelShadow panelShadow54;
    private swing.PanelShadow panelShadow6;
    private swing.PanelShadow panelShadow7;
    private swing.PanelShadow panelShadow8;
    private swing.PanelShadow panelShadow9;
    private rating.StarRating starRating1;
    private rating.StarRating starRating10;
    private rating.StarRating starRating18;
    private rating.StarRating starRating19;
    private rating.StarRating starRating2;
    private rating.StarRating starRating20;
    private rating.StarRating starRating21;
    private rating.StarRating starRating22;
    private rating.StarRating starRating23;
    private rating.StarRating starRating24;
    private rating.StarRating starRating25;
    private rating.StarRating starRating26;
    private rating.StarRating starRating27;
    private rating.StarRating starRating3;
    private rating.StarRating starRating4;
    private rating.StarRating starRating5;
    private rating.StarRating starRating6;
    private rating.StarRating starRating7;
    private rating.StarRating starRating8;
    private rating.StarRating starRating9;
    // End of variables declaration//GEN-END:variables

    
    
}