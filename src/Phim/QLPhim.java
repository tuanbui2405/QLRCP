/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phim;

import KhachHang.KhachHang;
import KhachHang.updateKhachHang;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
//import javafx.scene.control.ScrollBar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import static qlrap.util.ConnectionUtils.getJDBCConnection;

/**
 *
 * @author Hieu Vo
 */
public class QLPhim extends javax.swing.JFrame {

    private ArrayList<Phim> list;

    /**
     * Creates new form QLPhim
     */
    public QLPhim() {
        initComponents();
        showPhim();
        list = PhimList();
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        txtTimKiem.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                change();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                change();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                change();
            }
        });

    }

    public void change() {
        DefaultTableModel model = (DefaultTableModel) JtablePhim.getModel();
        Object[] row = new Object[9];
        model.setRowCount(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTenP().toLowerCase().matches("(.*)" + txtTimKiem.getText().toLowerCase() + "(.*)") == true) {
                row[0] = list.get(i).getMaP();
                row[1] = list.get(i).getTenP();
                row[2] = list.get(i).getthoiLuong();
                row[3] = list.get(i).getDaoDien();
                row[4] = list.get(i).getDienVien();
                row[5] = list.get(i).getPhuDe();
                row[6] = list.get(i).getNgayCC();
                row[7] = list.get(i).getDoTuoi();
                row[8] = list.get(i).getTheLoai();

                model.addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtablePhim = new javax.swing.JTable();
        btnXoa = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        btnCapNhat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtTenPhim = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDaoDien = new javax.swing.JTextField();
        txtDienVien = new javax.swing.JTextField();
        txtThoiLuong = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CbxTuoi = new javax.swing.JComboBox<>();
        DCNgayChieu = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        txtPhuDe = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtTheLoai = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lí Phim");
        setFocusable(false);
        setName("QLPhim"); // NOI18N

        JtablePhim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phim", "Tên phim", "Thời lượng", "Đạo diễn", "Diễn viên", "Phụ đề", "Ngày công chiếu", "Độ tuổi", "Thể loại "
            }
        ));
        jScrollPane1.setViewportView(JtablePhim);
        if (JtablePhim.getColumnModel().getColumnCount() > 0) {
            JtablePhim.getColumnModel().getColumn(7).setResizable(false);
        }

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        jLabel2.setText("Tìm");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(568, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCapNhat)
                        .addGap(33, 33, 33)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        jTabbedPane1.addTab("Liệt kê", jPanel2);

        jLabel3.setText("Tên phim");

        jLabel4.setText("Thời lượng");

        jLabel5.setText("Đạo diễn");

        jLabel6.setText("Diễn viên ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtTenPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtThoiLuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDaoDien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDienVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtThoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDaoDien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDienVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jLabel8.setText("Ngày chiếu");

        jLabel9.setText("Độ tuổi quy định");

        CbxTuoi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "13", "16", "18", "22" }));

        jLabel12.setText("Phụ đề");

        txtPhuDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhuDeActionPerformed(evt);
            }
        });

        jLabel13.setText("Thể loại");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel9))
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CbxTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DCNgayChieu, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DCNgayChieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(txtPhuDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(CbxTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thêm phim", jPanel3);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText(" QUẢN LÝ PHIM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(357, 357, 357)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public ArrayList<Phim> PhimList() {
        ArrayList<Phim> PhimList = new ArrayList();

        try {

            Connection connection = getJDBCConnection();

            String sql = "Select * from Phim";
            // show data
            PreparedStatement statement = connection.prepareCall(sql);
            ResultSet resultSet = statement.executeQuery();
            Phim p;
            while (resultSet.next()) {

                p = new Phim(resultSet.getString("MaPhim"), resultSet.getString("TenPhim"), resultSet.getInt("ThoiLuong"), resultSet.getString("DaoDien"), resultSet.getString("DienVien"), resultSet.getString("PhuDe"), resultSet.getDate("NgayCongChieu"), resultSet.getInt("DoTuoi"), resultSet.getString("TheLoai"));
                PhimList.add(p);
            }
            // close connection
            connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return PhimList;
    }

    //Show   phim  lên JTable
    public void showPhim() {
        ArrayList<Phim> list = PhimList();
        DefaultTableModel model = (DefaultTableModel) JtablePhim.getModel();
        model.setRowCount(0);
        Object[] row = new Object[9];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getMaP();
            row[1] = list.get(i).getTenP();
            row[2] = list.get(i).getthoiLuong();
            row[3] = list.get(i).getDaoDien();
            row[4] = list.get(i).getDienVien();
            row[5] = list.get(i).getPhuDe();
            row[6] = list.get(i).getNgayCC();
            row[7] = list.get(i).getDoTuoi();
            row[8] = list.get(i).getTheLoai();
            model.addRow(row);
        }
        this.list = list;
    }

    public void btnXacNhan(String MaP, String TenP, String thoil, String Daodien, String dv, String pd, Date NCC, String dt, String TL) {
        try {

            Connection connection = getJDBCConnection();

            String sql = "update Phim  set  TenPhim =N'" + TenP + "' , ThoiLuong='" + thoil + "' , DaoDien=N'" + Daodien + "' , DienVien=N'" + dv + "' , PhuDe=N'" + pd + "'  , TheLoai=N'" + TL + "' , NgayCongChieu=? , DoTuoi='" + dt + "' where MaPhim='" + MaP + "'";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setDate(1, new java.sql.Date(NCC.getTime()));
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) JtablePhim.getModel();
            model.setRowCount(0);
            showPhim();
            JOptionPane.showMessageDialog(null, "Cập nhật thành công");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private void txtPhuDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhuDeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhuDeActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        txtDaoDien.setText("");
        txtDienVien.setText("");
        txtPhuDe.setText("");
        txtTenPhim.setText("");
        txtTheLoai.setText("");
        txtThoiLuong.setText("");
        DCNgayChieu.setDate(null);
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        try {

            Connection connection = getJDBCConnection();
            String sql = "insert into Phim values(null,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = connection.prepareCall(sql);
            statement.setString(1, txtTenPhim.getText());
            statement.setInt(2, Integer.parseInt(txtThoiLuong.getText()));
            statement.setString(3, txtDaoDien.getText());
            statement.setString(4, txtDienVien.getText());
            statement.setString(5, txtPhuDe.getText());
            statement.setDate(6, new java.sql.Date(DCNgayChieu.getDate().getTime()));
            statement.setInt(7, Integer.parseInt(CbxTuoi.getSelectedItem().toString()));
            statement.setString(8, txtTheLoai.getText());
            statement.setString(9, "D:\\PosterPhim\\" + txtTenPhim.getText() + ".PNG");
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Thêm thành công");
            DefaultTableModel model = (DefaultTableModel) JtablePhim.getModel();
            model.setRowCount(0);
            showPhim();

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        txtDaoDien.setText("");
        txtDienVien.setText("");
        txtPhuDe.setText("");
        txtTenPhim.setText("");
        txtTheLoai.setText("");
        txtThoiLuong.setText("");
        DCNgayChieu.setDate(null);
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
        updatePhim update = new updatePhim();
        int row = JtablePhim.getSelectedRow();
        String MaP = JtablePhim.getModel().getValueAt(row, 0).toString();
        String TenP = JtablePhim.getModel().getValueAt(row, 1).toString();
        String ThoiLuong = JtablePhim.getModel().getValueAt(row, 2).toString();
        String DaoDien = JtablePhim.getModel().getValueAt(row, 3).toString();
        String DienVien = JtablePhim.getModel().getValueAt(row, 4).toString();
        String PhuDe = JtablePhim.getModel().getValueAt(row, 5).toString();
        String NgayCongchieu = JtablePhim.getModel().getValueAt(row, 6).toString();
        String DoTuoi = JtablePhim.getModel().getValueAt(row, 7).toString();
        String TheLoai = JtablePhim.getModel().getValueAt(row, 8).toString();

        update.setMaP(MaP);
        update.setTenP(TenP);
        update.setThoiLuong(ThoiLuong);
        update.setDaoDien(DaoDien);
        update.setDienVien(DienVien);
        update.setPhuDe(PhuDe);
        update.setNgayCongChieu(NgayCongchieu);
        update.setDoTuoi(DoTuoi);
        update.setTheLoai(TheLoai);

        update.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa hay không ?", "Xóa", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            try {

                Connection connection = getJDBCConnection();
                int row = JtablePhim.getSelectedRow();
                String Values = JtablePhim.getModel().getValueAt(row, 0).toString();
                String sql = "Delete from Phim where MaPhim=N'" + Values + "'";
                PreparedStatement pst = connection.prepareStatement(sql);
                pst.executeUpdate();
                DefaultTableModel model = (DefaultTableModel) JtablePhim.getModel();
                model.setRowCount(0);
                showPhim();
                JOptionPane.showMessageDialog(null, "Xóa thành công");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(QLPhim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLPhim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLPhim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLPhim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLPhim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbxTuoi;
    private com.toedter.calendar.JDateChooser DCNgayChieu;
    private javax.swing.JTable JtablePhim;
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtDaoDien;
    private javax.swing.JTextField txtDienVien;
    private javax.swing.JTextField txtPhuDe;
    private javax.swing.JTextField txtTenPhim;
    private javax.swing.JTextField txtTheLoai;
    private javax.swing.JTextField txtThoiLuong;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}