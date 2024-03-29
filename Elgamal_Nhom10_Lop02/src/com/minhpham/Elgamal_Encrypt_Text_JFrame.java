package com.minhpham;

import java.awt.Dimension;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;

/**
 *
 * @author Minh Pham
 */
public class Elgamal_Encrypt_Text_JFrame extends javax.swing.JFrame {

    private String chiTietQuaTrinh;

    public Elgamal_Encrypt_Text_JFrame() {
        initComponents();
        setTitle("GIẢI THUẬT MÃ HÓA ELGAMAL - NHÓM 10");
        setLocationRelativeTo(null);

        this.chiTietQuaTrinh = "";
    }

    private boolean kiemTraNguyenTo(long n) {
        if (n < 2) {
            return false;
        }

        for (long i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tbnTaoKhoa = new javax.swing.JButton();
        btnLamLai = new javax.swing.JButton();
        txtE1 = new javax.swing.JTextField();
        txtP = new javax.swing.JTextField();
        txtD = new javax.swing.JTextField();
        txtE2 = new javax.swing.JTextField();
        txtE2SinhKhoa = new javax.swing.JTextField();
        txtPSinhKhoa = new javax.swing.JTextField();
        txtE1SinhKhoa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDSinhKhoa = new javax.swing.JTextField();
        btnCongKhaiKhoa = new javax.swing.JButton();
        checkboxSinhNgauNhien = new javax.swing.JCheckBox();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtE2MaHoa = new javax.swing.JTextField();
        txtE1MaHoa = new javax.swing.JTextField();
        txtPMaHoa = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtR = new javax.swing.JTextField();
        btnMaHoa = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBanMa = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtBanRo = new javax.swing.JTextArea();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDGiaiMa = new javax.swing.JTextField();
        btnGiaiMa = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtBanMaGiaiMa = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtBanRoSauKhiGiaiMa = new javax.swing.JTextArea();
        btnXemChiTietQuaTrinh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Chọn số nguyên tố p:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Chọn e1:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Chọn d (1 < d < p-1):");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Khóa công khai:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Khóa bí mật d:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("<html>=> e2 = e1<sup>d</sup> mod p</html>");

        tbnTaoKhoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tbnTaoKhoa.setText("1. Tạo khóa");
        tbnTaoKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnTaoKhoaActionPerformed(evt);
            }
        });

        btnLamLai.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLamLai.setText("Làm lại");
        btnLamLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamLaiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("e2");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("e1");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("p");

        btnCongKhaiKhoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCongKhaiKhoa.setText("2. Công khai khóa");
        btnCongKhaiKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCongKhaiKhoaActionPerformed(evt);
            }
        });

        checkboxSinhNgauNhien.setText("Sinh ngẫu nhiên");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnCongKhaiKhoa))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDSinhKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtE2SinhKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtE1SinhKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPSinhKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnLamLai, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkboxSinhNgauNhien)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(txtE1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtP, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtE2))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tbnTaoKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(147, 147, 147)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(62, 62, 62)
                            .addComponent(jLabel8)
                            .addGap(79, 79, 79)
                            .addComponent(jLabel9))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(checkboxSinhNgauNhien)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbnTaoKhoa)
                    .addComponent(btnLamLai))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtE2SinhKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtE1SinhKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPSinhKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtDSinhKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(btnCongKhaiKhoa)
                .addGap(32, 32, 32))
        );

        jTabbedPane1.addTab("Sinh khóa", jPanel1);

        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Khóa công khai:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("e2");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("e1");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("p");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Bản rõ:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Khóa bí mật r:");

        btnMaHoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMaHoa.setText("3. Mã hóa");
        btnMaHoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaHoaActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("=> Bản mã:");

        txtBanMa.setColumns(20);
        txtBanMa.setRows(5);
        jScrollPane1.setViewportView(txtBanMa);

        txtBanRo.setColumns(20);
        txtBanRo.setRows(5);
        jScrollPane2.setViewportView(txtBanRo);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(42, 42, 42)
                                .addComponent(jScrollPane1))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtE2MaHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtE1MaHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPMaHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(30, 30, 30)
                                            .addComponent(txtR, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(161, 161, 161))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel13)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnMaHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel12))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtE2MaHoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtE1MaHoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPMaHoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel15))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(38, 38, 38)
                .addComponent(btnMaHoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(56, 56, 56)))
                .addGap(28, 28, 28))
        );

        jTabbedPane2.addTab("Mã hóa", jPanel2);

        jTabbedPane3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Bản mã:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Khóa bí mật d:");

        btnGiaiMa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGiaiMa.setText("4. Giải mã");
        btnGiaiMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaiMaActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("=> Bản rõ:");

        txtBanMaGiaiMa.setColumns(20);
        txtBanMaGiaiMa.setRows(5);
        jScrollPane3.setViewportView(txtBanMaGiaiMa);

        txtBanRoSauKhiGiaiMa.setColumns(20);
        txtBanRoSauKhiGiaiMa.setRows(5);
        jScrollPane4.setViewportView(txtBanRoSauKhiGiaiMa);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDGiaiMa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGiaiMa)
                .addGap(123, 123, 123))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDGiaiMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnGiaiMa)
                .addGap(59, 59, 59)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(79, 79, 79))))
        );

        jTabbedPane3.addTab("Giải mã", jPanel3);

        btnXemChiTietQuaTrinh.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnXemChiTietQuaTrinh.setText("Xem chi tiết quá trình mã hóa / giải mã");
        btnXemChiTietQuaTrinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemChiTietQuaTrinhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXemChiTietQuaTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(304, 304, 304))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1))
                .addGap(18, 18, 18)
                .addComponent(btnXemChiTietQuaTrinh, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbnTaoKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnTaoKhoaActionPerformed
        resetAllInputMaHoa();
        resetAllInputGiaiMa();
        resetQuaTrinhMaHoaGiaiMa();

        if (checkboxSinhNgauNhien.isSelected()) {
            long p = 707933;
            long e1 = 203;
            long d = 765;

            long e2 = moduloMu(e1, d, p); // e2 = e1^d mod p

            txtP.setText(String.valueOf(p));
            txtD.setText(String.valueOf(d));
            txtE1.setText(String.valueOf(e1));
            txtE2.setText(String.valueOf(e2));

            txtE2SinhKhoa.setText(String.valueOf(e2));
            txtE1SinhKhoa.setText(String.valueOf(e1));
            txtPSinhKhoa.setText(String.valueOf(p));
            txtDSinhKhoa.setText(String.valueOf(d));

            checkboxSinhNgauNhien.setSelected(true);
        } else {
            if (txtP.getText().length() == 0 || txtE1.getText().length() == 0 || txtD.getText().length() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Hãy nhập đầy đủ p, e1, d !!");
            } else {
                long p = Long.parseLong(txtP.getText());
                long e1 = Long.parseLong(txtE1.getText());
                long d = Long.parseLong(txtD.getText());

                if (kiemTraNguyenTo(p) == false) {
                    JOptionPane.showMessageDialog(rootPane, "Hãy chọn p là số nguyên tố !!");
                    resetAllInputSinhKhoa();
                } else if (d <= 1 || d >= p - 1) {
                    JOptionPane.showMessageDialog(rootPane, "Chọn d trong khoảng 1 < d < p-1.");
                    txtD.setText("");
                } else {
                    long e2 = moduloMu(e1, d, p); // e2 = e1^d mod p

                    txtE2.setText(String.valueOf(e2));

                    txtE2SinhKhoa.setText(String.valueOf(e2));
                    txtE1SinhKhoa.setText(String.valueOf(e1));
                    txtPSinhKhoa.setText(String.valueOf(p));
                    txtDSinhKhoa.setText(String.valueOf(d));
                }
            }
        }
    }//GEN-LAST:event_tbnTaoKhoaActionPerformed

    private void btnLamLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamLaiActionPerformed
        resetAllInputSinhKhoa();
        resetAllInputMaHoa();
        resetAllInputGiaiMa();
        resetQuaTrinhMaHoaGiaiMa();
    }//GEN-LAST:event_btnLamLaiActionPerformed

    private void btnCongKhaiKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCongKhaiKhoaActionPerformed
        resetQuaTrinhMaHoaGiaiMa();

        // Công khai khóa e2, e1, p lên internet
        long e2 = Long.parseLong(txtE2.getText());
        long e1 = Long.parseLong(txtE1.getText());
        long p = Long.parseLong(txtP.getText());

        txtE2MaHoa.setText(String.valueOf(e2));
        txtE1MaHoa.setText(String.valueOf(e1));
        txtPMaHoa.setText(String.valueOf(p));

        // Khóa bí mật d
        long d = Long.parseLong(txtD.getText());
        txtDGiaiMa.setText(String.valueOf(d));
    }//GEN-LAST:event_btnCongKhaiKhoaActionPerformed

    private void btnMaHoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaHoaActionPerformed
        if (txtBanRo.getText().length() == 0 || txtR.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Hãy nhập đầy đủ bản rõ và r !!");
        } else {
            try {
                resetQuaTrinhMaHoaGiaiMa();
                String banRo = txtBanRo.getText();

                long e2 = Long.parseLong(txtE2.getText());
                long e1 = Long.parseLong(txtE1.getText());
                long p = Long.parseLong(txtP.getText());
                long r = Long.parseLong(txtR.getText());

                // Mã hóa
                String banMa = maHoa(banRo, e2, e1, p, r);
                txtBanMa.setText(banMa);

                // Gửi đến bên nhận
                txtBanMaGiaiMa.setText(String.valueOf(banMa));
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Elgamal_Encrypt_Text_JFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnMaHoaActionPerformed

    private void btnGiaiMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaiMaActionPerformed
        try {
            String banMa = txtBanMaGiaiMa.getText();

            long d = Long.parseLong(txtDGiaiMa.getText());
            long p = Long.parseLong(txtP.getText());

            String banRo = giaiMa(banMa, p, d);

            txtBanRoSauKhiGiaiMa.setText(banRo);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Elgamal_Encrypt_Text_JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGiaiMaActionPerformed

    private void btnXemChiTietQuaTrinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemChiTietQuaTrinhActionPerformed
        try {
            JTextPane jtp = new JTextPane();
            Document doc = jtp.getDocument();
            doc.insertString(doc.getLength(), chiTietQuaTrinh, new SimpleAttributeSet());

            JScrollPane jsp = new JScrollPane(jtp);
            jsp.setPreferredSize(new Dimension(650, 350));
            jsp.setBorder(null);

            JOptionPane.showMessageDialog(null, jsp, "Chi tiết quá trình mã hóa/giải mã", JOptionPane.INFORMATION_MESSAGE);
        } catch (BadLocationException ex) {
            Logger.getLogger(Elgamal_Encrypt_Text_JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnXemChiTietQuaTrinhActionPerformed

    private void resetAllInputSinhKhoa() {
        txtP.setText("");
        txtE1.setText("");
        txtD.setText("");
        txtE2.setText("");

        txtE2SinhKhoa.setText("");
        txtE1SinhKhoa.setText("");
        txtPSinhKhoa.setText("");
        txtDSinhKhoa.setText("");

        checkboxSinhNgauNhien.setSelected(false);
        resetQuaTrinhMaHoaGiaiMa();
    }

    private void resetAllInputMaHoa() {
        txtE2MaHoa.setText("");
        txtE1MaHoa.setText("");
        txtPMaHoa.setText("");

        txtBanRo.setText("");
        txtR.setText("");

        txtBanMa.setText("");
    }

    private void resetAllInputGiaiMa() {
        txtBanMaGiaiMa.setText("");

        txtDGiaiMa.setText("");
        txtBanRoSauKhiGiaiMa.setText("");
    }

    private void resetQuaTrinhMaHoaGiaiMa() {
        this.chiTietQuaTrinh = "";
    }

    // Tính a^n mod p
    private static long moduloMu(long a, long n, long p) {
        //Chuyển n sang hệ nhị phân
        long[] arr = new long[100];
        int k = 0;

        do {
            arr[k] = n % 2;
            k++;
            n = n / 2;
        } while (n != 0);

        // Quá trình lấy dư
        long answer = 1;
        for (int i = k - 1; i >= 0; i--) {
            answer = (answer * answer) % p;
            if (arr[i] == 1) {
                answer = (answer * a) % p;
            }
        }

        return answer;
    }

    // Tính nghịch đảo modulo: x^-1 mod p
    private static long moduloNghichDao(long x, long soModulo) {
        long kd = soModulo;
        long r = 1, q, y0 = 0, y1 = 1, y = 0;

        while (x != 0) {
            r = soModulo % x;

            if (r == 0) {
                break;
            } else {
                q = soModulo / x;
                y = y0 - y1 * q;
                soModulo = x;
                x = r;
                y0 = y1;
                y1 = y;
            }
        }

        if (y >= 0) {
            return y;
        } else {
            y = kd + y;
            return y;
        }
    }

    public String maHoa(String banRo, long e2, long e1, long p, long r) throws UnsupportedEncodingException {
        String encryptTxt = "";

        // Chuyển đầu vào thành mã Unicode
        String base64 = Base64.getEncoder().encodeToString(banRo.getBytes("UTF-8")); // ví dụ: a -> YQ==

        this.chiTietQuaTrinh += "-------------------------------- MÃ HÓA --------------------------------";
        this.chiTietQuaTrinh += "\nBản rõ: " + banRo; // a
        this.chiTietQuaTrinh += "\n1. Encode Base64 bản rõ: " + base64; // YQ==
        this.chiTietQuaTrinh += "\n2. Chuyển các kí tự trong bản rõ sau khi decode Base64 thành dạng số hệ Decimal:\n"; // YQ== --> 89 81 61 61

        // Chuyển xâu Unicode thành dạng số hệ Decimal trong bảng ASCII: YQ== --> 89 81 61 61
        int[] base64Decimal = new int[base64.length()];
        for (int i = 0; i < base64Decimal.length; i++) {
            base64Decimal[i] = (int) (base64.charAt(i));

            this.chiTietQuaTrinh += base64Decimal[i] + " ";
        }

        // Mã hóa lần lượt mảng base64Decimal tương tự như với mã hóa từng số
        // Chuỗi encryptTxt sẽ có dạng: c1-c2#c1-c2#c1-c2
        this.chiTietQuaTrinh += "\n3. Lần lượt mã hóa từng số ở bước 2 ta được các cặp bản mã c1-c2:\n";
        long c1 = moduloMu(e1, r, p);

        for (int i = 0; i < base64Decimal.length; i++) {
            // c2 = (e2^r * m) mod p = [(e2^r MOD p) * (m^1 mod p)] mod p
            long temp1 = moduloMu(e2, r, p);
            long temp2 = moduloMu(base64Decimal[i], 1, p);
            long c2 = moduloMu(temp1 * temp2, 1, p);

            encryptTxt += c1 + "-";

            encryptTxt += c2;
            if (i != base64Decimal.length - 1) {
                encryptTxt += "\n";
            }
        }

        this.chiTietQuaTrinh += encryptTxt;
        this.chiTietQuaTrinh += "\n4. Ghép các cặp bản mã c1-c2 ta được chuỗi các bản mã có dạng: c1-c2#c1-c2#c1-c2...";

        // Encode bản mã encryptTxt về dạng không đọc được
        String result = Base64.getEncoder().encodeToString(encryptTxt.getBytes("UTF-8"));
        this.chiTietQuaTrinh += "\nSau đó encode Base64 chuỗi các cặp bản mã:\n" + result;
        this.chiTietQuaTrinh += "\n5. Gửi đi";

        return result;
    }

    private String giaiMa(String banMa, long p, long d) throws UnsupportedEncodingException {
        String decryptTxt = "";

        // Decode bản mã về dạng đợc được: c1-c2#c1-c2
        this.chiTietQuaTrinh += "\n\n-------------------------------- GIẢI MÃ --------------------------------";
        this.chiTietQuaTrinh += "\n1. Decode Base64 bản mã đã nhận được. Chuỗi sau khi decode sẽ có dạng: c1-c2#c1-c2#c1-c2...";
        this.chiTietQuaTrinh += "\n2. Từ các cặp bản mã c1-c2 (dạng số decimal) lần lượt tính được một bản rõ m (dạng số decimal).";
        this.chiTietQuaTrinh += "\n3. Chuyển lần lượt bản rõ m (dạng số decimal) sang dạng char và ghép các kí tự với nhau.";
        this.chiTietQuaTrinh += "\n4. Decode Base64 mảng các kí tự ở bước 3, ta có được bản rõ.\n";
        String banMaDecoded = new String(Base64.getDecoder().decode(banMa), "UTF-8");

        // Chuỗi encryptTxt sẽ có dạng: c1-c2#c1-c2#c1-c2
        String[] arrBanMa = banMaDecoded.split("\n");

        for (int i = 0; i < arrBanMa.length; i++) {
            int index = arrBanMa[i].indexOf('-');

            String c1Str = arrBanMa[i].substring(0, index);
            String c2Str = arrBanMa[i].substring(index + 1);

            long c1 = Long.valueOf(c1Str);
            long c2 = Long.valueOf(c2Str);

            // Tìm message M
            long z = moduloMu(c1, d, p);
            long nghichDaoZ = moduloNghichDao(z, p);
            long M = moduloMu(c2 * nghichDaoZ, 1, p);

            decryptTxt += (char) M;
        }

        // Decode về bản rõ nhập vào
        String banRo = new String(Base64.getDecoder().decode(decryptTxt), "UTF-8");

        return banRo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCongKhaiKhoa;
    private javax.swing.JButton btnGiaiMa;
    private javax.swing.JButton btnLamLai;
    private javax.swing.JButton btnMaHoa;
    private javax.swing.JButton btnXemChiTietQuaTrinh;
    private javax.swing.JCheckBox checkboxSinhNgauNhien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JButton tbnTaoKhoa;
    private javax.swing.JTextArea txtBanMa;
    private javax.swing.JTextArea txtBanMaGiaiMa;
    private javax.swing.JTextArea txtBanRo;
    private javax.swing.JTextArea txtBanRoSauKhiGiaiMa;
    private javax.swing.JTextField txtD;
    private javax.swing.JTextField txtDGiaiMa;
    private javax.swing.JTextField txtDSinhKhoa;
    private javax.swing.JTextField txtE1;
    private javax.swing.JTextField txtE1MaHoa;
    private javax.swing.JTextField txtE1SinhKhoa;
    private javax.swing.JTextField txtE2;
    private javax.swing.JTextField txtE2MaHoa;
    private javax.swing.JTextField txtE2SinhKhoa;
    private javax.swing.JTextField txtP;
    private javax.swing.JTextField txtPMaHoa;
    private javax.swing.JTextField txtPSinhKhoa;
    private javax.swing.JTextField txtR;
    // End of variables declaration//GEN-END:variables
}
