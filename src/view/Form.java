// Chèn JGraphX vào Form
// Lấy mã số đỉnh

package view;
    
import com.mxgraph.swing.mxGraphComponent;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import model.GraphDrawingExample;
import model.Graphs;
/**
 *
 * @author admin
 */
public class Form extends javax.swing.JFrame {
    private mxGraphComponent graphComponent;
    Graphs graph = new Graphs();
    GraphDrawingExample dgraph;
//    MinWeightHamiltonianCycle hamilton = new MinWeightHamiltonianCycle(graph.getArr(), graph.getN());
    public Form() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("B2012196 - Lâm Minh Đức");
        
        graph.docDoThi();
        // truyen vao mang cung va trong so 
        dgraph = new GraphDrawingExample(graph.arrU(),graph.arrV(),graph.arrW(), graph.getN(), graph.getM());
        // Lấy mxGraphComponent từ đối tượng đó
        mxGraphComponent graphComponent = dgraph.getGraphComponent();
        // Thêm mxGraphComponent vào JPanel
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(graphComponent, BorderLayout.CENTER);
        getContentPane().add(jPanel1);
        // Cập nhật lại JPanel
        jPanel1.revalidate();  // Cập nhật layout
        jPanel1.repaint();     // Cập nhật hiển thị
        
        jLabel13.setText("Đồ thị có " +graph.getN()+ " đỉnh và " +graph.getM() +" cung");
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtDiemDi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDiemDen = new javax.swing.JTextField();
        btnTimDuong = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnRefresh = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtTSo = new javax.swing.JTextField();
        txtCuoi = new javax.swing.JTextField();
        txtDau = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        btnTDinh = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("ĐỒ THỊ VỚI GIẢI THUẬT TÌM ĐƯỜNG ĐI, CHU TRINH, CÂY PHỦ");

        jLabel2.setBackground(new java.awt.Color(255, 153, 153));
        jLabel2.setText("Điểm đi:");

        txtDiemDi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiemDiActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(51, 255, 0));
        jLabel3.setText("Điểm đến:");

        btnTimDuong.setText("Tìm đường đi ngắn nhất");
        btnTimDuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimDuongActionPerformed(evt);
            }
        });

        jLabel5.setText(" ");

        jLabel6.setText(" ");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel7.setText(" ");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );

        btnRefresh.setText("Nhập lại");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jLabel4.setText(" ");

        jLabel8.setText(" ");

        jLabel9.setText("NHẬP CUNG");

        jLabel10.setText("Đỉnh đầu");

        jLabel11.setText("Đỉnh cuối");

        jLabel12.setText("Trọng số");

        btnAdd.setText("Thêm cung");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Cập nhật đồ thị");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel13.setText(" ");

        btnTDinh.setText("Thêm đỉnh");
        btnTDinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTDinhActionPerformed(evt);
            }
        });

        jLabel14.setText("ĐƯỜNG ĐI NGẮN NHẤT");

        jButton1.setText("Nhập lại");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Hướng dẫn");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel10))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtTSo, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                            .addComponent(txtDau)
                                            .addComponent(txtCuoi)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnTDinh)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnUpdate)))
                                .addGap(0, 7, Short.MAX_VALUE)))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDiemDi)
                                    .addComponent(txtDiemDen, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTimDuong)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRefresh))
                            .addComponent(jLabel14)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtCuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtTSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnUpdate)
                            .addComponent(btnTDinh))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDiemDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDiemDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTimDuong)
                            .addComponent(btnRefresh))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDiemDiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiemDiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiemDiActionPerformed

    private void btnTimDuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimDuongActionPerformed
        String diemdi = txtDiemDi.getText();
        String diemden = txtDiemDen.getText();
        if(graph.timduongdi(diemdi, diemden)){
            jLabel5.setText(graph.getduong());
            jLabel8.setText("Tổng trọng số Đường đi ngắn nhất: " +graph.getTrongSoDuong());
            jLabel7.setText(graph.findMinWeightHamiltonianCycle());

            jLabel6.setText("<html> Cây phủ tối tiểu: <br/>" + graph.getPhu()+ "</html>");
            jLabel4.setText("Tổng trọng số Cây phủ tối tiểu: " + graph.getTrongSo());
            if(graph.getTrongSoDuong() != 0)
                dgraph.doiMauCung(graph.getD(), graph.getK());
            jPanel1.revalidate();  // Cập nhật layout
            jPanel1.repaint();     // Cập nhật hiển thị
        }
        else JOptionPane.showMessageDialog(rootPane, "Tìm đường đi không thành công");
    }//GEN-LAST:event_btnTimDuongActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        jLabel5.setText("");
        jLabel8.setText("");
        graph.setSDFS("");
        jLabel7.setText("");
        graph.setSBestPath();
        jLabel6.setText("");
        txtDiemDi.setText("");
        txtDiemDen.setText("");
        jLabel4.setText("");
        if(graph.getTrongSoDuong() != 0)
            dgraph.refreshMauCung(graph.getD(), graph.getK());     
        graph.setPhu("");
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String dau = txtDau.getText();
        String cuoi = txtCuoi.getText();
        String tso = txtTSo.getText();
        
        // chuyen chuoi thanh int
        int ddau=0, dcuoi=0, dtso=0;
        try {
            ddau = Integer.parseInt(dau);
            dcuoi = Integer.parseInt(cuoi);
            dtso = Integer.parseInt(tso);
        } catch (NumberFormatException e) {
            System.out.println("Chuỗi không thể chuyển đổi thành số nguyên.");
            e.printStackTrace(); // In thông tin chi tiết về ngoại lệ
            JOptionPane.showMessageDialog(rootPane, "Thêm cung không thành công");
            return ;
        }
        String chuoi = ddau +" "+ dcuoi +" "+ dtso;
        String filePath = "D:\\NetbeanProject\\dothi\\src\\dulieu.txt";
        // Đọc file txt
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(chuoi);
            writer.newLine();
            graph.setM(); // cong m
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        // tăng số cung lên +1;
        
        int oldValue = graph.getM()-1;
        int newValue = graph.getM();
        
        //Đọc nội dung file và thay đổi giá trị m
        try {
            // Đọc tệp văn bản đầu vào
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();
         
            // Sửa đổi nội dung đọc số đầu tiên
            String modifiedContent = content.toString().replaceFirst(" "+oldValue, " "+newValue);
            // Ghi nội dung đã sửa vào tệp văn bản đầu ra
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(modifiedContent);
            writer.close();

            System.out.println("Sửa giá trị thành công.");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }


        
        
        // doc do thi 
        graph.docDoThi();
        
        JOptionPane.showMessageDialog(rootPane, "Thêm thành công cung " + graph.getM());
        
        jLabel13.setText("Đồ thị có " +graph.getN()+ " đỉnh và " +graph.getM() +" cung");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        jPanel1.removeAll();
        
        // truyen vao mang cung va trong so 
        dgraph = new GraphDrawingExample(graph.arrU(),graph.arrV(),graph.arrW(), graph.getN(), graph.getM());
        // Lấy mxGraphComponent từ đối tượng đó
        mxGraphComponent graphComponent = dgraph.getGraphComponent();
        // Thêm mxGraphComponent vào JPanel
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(graphComponent, BorderLayout.CENTER);
        getContentPane().add(jPanel1);
        // Cập nhật lại JPanel
        jPanel1.revalidate();  // Cập nhật layout
        jPanel1.repaint();     // Cập nhật hiển thị
        
        txtDau.setText("");
        txtCuoi.setText("");
        txtTSo.setText("");
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnTDinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTDinhActionPerformed
        // TODO add your handling code here:
        try {
            String filePath = "D:\\NetbeanProject\\dothi\\src\\dulieu.txt";
            // Đọc tệp văn bản đầu vào
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();
         
            // Sửa đổi nội dung đọc số đầu tiên
            String modifiedContent = content.toString().replaceFirst(""+graph.getN(), ""+graph.setN());

            // Ghi nội dung đã sửa vào tệp văn bản đầu ra
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(modifiedContent);
            writer.close();

            System.out.println("Sửa giá trị thành công.");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
        
        jLabel13.setText("Đồ thị có " +graph.getN()+ " đỉnh và " +graph.getM() +" cung");
        JOptionPane.showMessageDialog(rootPane, "Thêm thành công dinh " + graph.getN());
    }//GEN-LAST:event_btnTDinhActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        txtDau.setText("");
        txtCuoi.setText("");
        txtTSo.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Người dùng có thể nhập vào đỉnh đầu, đỉnh cuối, trọng số để thêm cung.\nCó thể thêm đỉnh mới bằng cách nhấn vào Thêm đỉnh"
                + " \nCó thể nhập điểm đi và điểm đến ở khung nhập để tìm ra một đường đi ngắn nhất\nLưu ý: Cần thực hiện Cập nhật đồ thị sau các bước trên.", "Hướng dẫn", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnTDinh;
    private javax.swing.JButton btnTimDuong;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtCuoi;
    private javax.swing.JTextField txtDau;
    private javax.swing.JTextField txtDiemDen;
    private javax.swing.JTextField txtDiemDi;
    private javax.swing.JTextField txtTSo;
    // End of variables declaration//GEN-END:variables
}
