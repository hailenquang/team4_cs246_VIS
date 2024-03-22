/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package MenuNhanvien.SanPham;

import MenuNhanvien.SanPham.event.EventItem;
import MenuNhanvien.SanPham.form.FormHome;
import MenuNhanvien.SanPham.model.ModelItem;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import org.jdesktop.animation.timing.interpolation.PropertySetter;

/**
 *
 * @author Hoàng Thanh An
 */
public class DanhSachSP extends javax.swing.JInternalFrame {
    private FormHome home;
    private Animator animator;
    private Point animatePoint;
    private ModelItem itemSelected;
    
    public DanhSachSP() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(00,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        setBackground(new Color(0, 0, 0, 0));
        init();
        //  Animator start form animatePoint to TagetPoint
        animator = PropertySetter.createAnimator(500, mainPanel, "imageLocation", animatePoint, mainPanel.getTargetLocation());
        animator.addTarget(new PropertySetter(mainPanel, "imageSize", new Dimension(180, 120), mainPanel.getTargetSize()));
        animator.addTarget(new TimingTargetAdapter() {
            @Override
            public void end() {
                mainPanel.setImageOld(null);
            }
        });
        animator.setResolution(0);
        animator.setAcceleration(.5f);
        animator.setDeceleration(.5f);
    }

    private void init() {
        home = new FormHome();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(home);
        testData();
    }

    private void testData() {
        home.setEvent(new EventItem() {
            @Override
            public void itemClick(Component com, ModelItem item) {
                if (itemSelected != null) {
                    mainPanel.setImageOld(itemSelected.getImage());
                }
                if (itemSelected != item) {
                    if (!animator.isRunning()) {
                        itemSelected = item;
                        animatePoint = getLocationOf(com);
                        mainPanel.setImage(item.getImage());
                        mainPanel.setImageLocation(animatePoint);
                        mainPanel.setImageSize(new Dimension(180, 120));
                        mainPanel.repaint();
                        home.setSelected(com);
                        home.showItem(item);
                        animator.start();
                    }
                }
            }
        });
        int ID = 1;
        for (int i = 0; i < 1; i++) {
            home.addItem(new ModelItem(ID++, "iPhone 15 Pro Max", "Chip Apple A17 Pro 6 nhân \nRAM: 8 GB \nDung lượng: 512 GB \nCamera sau: Chính 48 MP & Phụ 12 MP, 12 MP \nCamera trước: 12 MP \nPin 4422 mAh, Sạc 20 W", 1499, "iPhone", new ImageIcon(getClass().getResource("/image/15 pro max.png"))));
            home.addItem(new ModelItem(ID++, "iPhone 15 Pro", "Chip Apple A17 Pro 6 nhân \nRAM: 8 GB \nDung lượng: 512 GB \nCamera sau: Chính 48 MP & Phụ 12 MP, 12 MP \nCamera trước: 12 MP \nPin 3274 mAh, Sạc 20 W", 1299, "iPhone", new ImageIcon(getClass().getResource("/image/15 pro.png"))));
            home.addItem(new ModelItem(ID++, "iPhone 15 Plus", "Chip Apple A16 Bionic \nRAM: 6 GB \nDung lượng: 512 GB \nCamera sau: Chính 48 MP & Phụ 12 MP, 12 MP \nCamera trước: 12 MP \nPin 4383 mAh, Sạc 20 W", 1199, "iPhone", new ImageIcon(getClass().getResource("/image/15 plus.png"))));
            home.addItem(new ModelItem(ID++, "iPhone 15", "Chip Apple A16 Bionic \nRAM: 6 GB \nDung lượng: 512 GB \nCamera sau: Chính 48 MP & Phụ 12 MP, 12 MP \nCamera trước: 12 MP \nPin 3349 mAh, Sạc 20 W", 1099, "iPhone", new ImageIcon(getClass().getResource("/image/15.png"))));
            home.addItem(new ModelItem(ID++, "iPhone 14 Pro Max", "Chip Apple A16 Bionic \nRAM: 6 GB \nDung lượng: 512 GB \nCamera sau: Chính 48 MP & Phụ 12 MP, 12 MP \nCamera trước: 12 MP \nPin 4323 mAh, Sạc 20 W", 1399, "iPhone", new ImageIcon(getClass().getResource("/image/14 pro max.png"))));
            home.addItem(new ModelItem(ID++, "iPhone 14 Pro", "Chip Apple A16 Bionic \nRAM: 6 GB \nDung lượng: 512 GB \nCamera sau: Chính 48 MP & Phụ 12 MP, 12 MP \nCamera trước: 12 MP \nPin 3200 mAh, Sạc 20 W", 1299, "iPhone", new ImageIcon(getClass().getResource("/image/14 pro.png"))));
            home.addItem(new ModelItem(ID++, "iPhone 14 Plus", "Chip Apple A15 Bionic \nRAM: 6 GB \nDung lượng: 512 GB \nCamera sau: 2 camera 12 MP \nCamera trước: 12 MP \nPin 4325 mAh, Sạc 20 W", 1099, "iPhone", new ImageIcon(getClass().getResource("/image/14 plus.png"))));
            home.addItem(new ModelItem(ID++, "iPhone 14", "Chip Apple A15 Bionic \nRAM: 6 GB \nDung lượng: 512 GB \nCamera sau: 2 camera 12 MP \nCamera trước: 12 MP \nPin 3279 mAh, Sạc 20 W", 1099, "iPhone", new ImageIcon(getClass().getResource("/image/14.png"))));
            home.addItem(new ModelItem(ID++, "iPhone 13 Pro Max", "Chip Apple A15 Bionic \nRAM: 6 GB \nDung lượng: 512 GB \nCamera sau: 3 camera 12 MP \nCamera trước: 12 MP \nPin 4352 mAh, Sạc 20 W", 1299, "iPhone", new ImageIcon(getClass().getResource("/image/13 pro max.png"))));
            home.addItem(new ModelItem(ID++, "iPhone 13 Pro", "Chip Apple A15 Bionic \nRAM: 6 GB \nDung lượng: 512 GB \nCamera sau: 3 camera 12 MP \nCamera trước: 12 MP \nPin 3095 mAh, Sạc 20 W", 1299, "iPhone", new ImageIcon(getClass().getResource("/image/13 pro.png"))));
            home.addItem(new ModelItem(ID++, "iPhone 13", "Chip Apple A15 Bionic \nRAM: 4 GB \nDung lượng: 512 GB \nCamera sau: 2 camera 12 MP \nCamera trước: 12 MP \nPin 3240 mAh, Sạc 20 W", 1099, "iPhone", new ImageIcon(getClass().getResource("/image/13.png"))));
            home.addItem(new ModelItem(ID++, "iPhone 12 Pro Max", "Chip Apple A14 Bionic \nRAM: 6 GB \nDung lượng: 512 GB \nCamera sau: 3 camera 12 MP \nCamera trước: 12 MP \nPin 3687 mAh, Sạc 20 W", 1419, "iPhone", new ImageIcon(getClass().getResource("/image/12 pro max.png"))));
            home.addItem(new ModelItem(ID++, "iPhone 12 Pro", "Chip Apple A14 Bionic \nRAM: 6 GB \nDung lượng: 512 GB \nCamera sau: 3 camera 12 MP \nCamera trước: 12 MP \nPin 2815 mAh, Sạc 20 W", 1299, "iPhone", new ImageIcon(getClass().getResource("/image/12 pro.png"))));
            home.addItem(new ModelItem(ID++, "iPhone 12", "Chip Apple A14 Bionic \nRAM: 4 GB \nDung lượng: 512 GB \nCamera sau: 2 camera 12 MP \nCamera trước: 12 MP \nPin 2815 mAh, Sạc 20 W", 899, "iPhone", new ImageIcon(getClass().getResource("/image/12.png"))));
            home.addItem(new ModelItem(ID++, "Galaxy S24 Ultra", "Chip Snapdragon 8 Gen 3 for Galaxy \nRAM: 12 GB \nDung lượng: 512 GB \nCamera sau: Chính 200 MP & Phụ 50 MP, 12 MP, 10 MP \nCamera trước: 12 MP \nPin 5000 mAh, Sạc 45 W", 1419, "Samsung", new ImageIcon(getClass().getResource("/image/galaxy s24 ultra.png"))));
            home.addItem(new ModelItem(ID++, "Galaxy S24+", "Chip Exynos 2400 \nRAM: 12 GB \nDung lượng: 512 GB \nCamera sau: Chính 50 MP & Phụ 12 MP, 10 MP \nCamera trước: 12 MP \nPin 4900 mAh, Sạc 45 W", 1000, "Samsung", new ImageIcon(getClass().getResource("/image/galaxy s24+.png"))));
            home.addItem(new ModelItem(ID++, "Galaxy Z Flip5", "Chip Snapdragon 8 Gen 2 for Galaxy \nRAM: 8 GB \nDung lượng: 512 GB \nCamera sau: 2 camera 12 MP \nCamera trước: 10 MP \nPin 3700 mAh, Sạc 25 W", 1179, "Samsung", new ImageIcon(getClass().getResource("/image/galaxy z flip5.png"))));
            home.addItem(new ModelItem(ID++, "Galaxy Z Fold5", "Chip Snapdragon 8 Gen 2 for Galaxy \nRAM: 12 GB \nDung lượng: 512 GB \nCamera sau: Chính 50 MP & Phụ 12 MP, 10 MP \nCamera trước: 10 MP & 4 Mp \nPin 4400 mAh, Sạc 25 W", 1800, "Samsung", new ImageIcon(getClass().getResource("/image/galaxy z fold5.png"))));
            home.addItem(new ModelItem(ID++, "Galaxy Z Flip4", "Chip Snapdragon 8+ Gen 1 \nRAM: 8 GB \nDung lượng: 512 GB \nCamera sau: 2 camera 12 MP \nCamera trước: 10 MP \nPin 3700 mAh, Sạc 25 W", 1099, "Samsung", new ImageIcon(getClass().getResource("/image/galaxy z flip4.png"))));
 
        }
    }
    private Point getLocationOf(Component com) {
        Point p = home.getPanelItemLocation();
        int x = p.x;
        int y = p.y;
        int itemX = com.getX();
        int itemY = com.getY();
        int left = 10;
        int top = 35;
        return new Point(x + itemX + left, y + itemY + top);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        background1 = new MenuNhanvien.SanPham.swing.Background();
        mainPanel = new MenuNhanvien.SanPham.swing.MainPanel();

        mainPanel.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 876, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private MenuNhanvien.SanPham.swing.Background background1;
    private javax.swing.JPanel jPanel1;
    private MenuNhanvien.SanPham.swing.MainPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
