package loginform;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.UIManager;
import mainform.main;

public class login extends javax.swing.JFrame {
       
    static final String URL = "jdbc:mysql://localhost/sample_login";    // SQL: データ情報
    static final String USERNAME = "root";                              // SQL: ID
    static final String PASSWORD = "rootpass";                          // SQL: パスワード
    
    String sql = "SELECT * FROM admin;";                                // SQL: テーブル
    
    public login() {
        initComponents();
        Admin_jTextBox.setBackground(new java.awt.Color(0,0,0,1));
        Password_jTextBox.setBackground(new java.awt.Color(0,0,0,1));
        
         // ■ チェックボックス処理 - AdminIDを表示
        if(Admin_jCheckBox.isSelected()) {
            
        String sqlId = "";
        
            try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                PreparedStatement statement = connection.prepareStatement(sql); ) {
                        
                ResultSet result = statement.executeQuery();
            
                while(result.next()){
                sqlId = result.getString("id");
                }
            
                Admin_jTextBox.setText(sqlId);
            
            }catch (SQLException e){
                e.printStackTrace();     
            }
            
        }else{
            Admin_jTextBox.setText("");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Close_jLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Admin_jTextBox = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Password_jTextBox = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        Disable_jLabel = new javax.swing.JLabel();
        Show_jLabel = new javax.swing.JLabel();
        Admin_jCheckBox = new javax.swing.JCheckBox();
        Login_jButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        Result_jLabel = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("けいふぉんと", 0, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Password Manager");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo_shark.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 350));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(25, 118, 211));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText(" Created by KHsh4rks");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 500, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 440));

        jPanel2.setBackground(new java.awt.Color(25, 118, 211));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Close_jLabel.setFont(new java.awt.Font("メイリオ", 0, 18)); // NOI18N
        Close_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        Close_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close_jLabel.setText("X");
        Close_jLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Close_jLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Close_jLabelMouseClicked(evt);
            }
        });
        jPanel2.add(Close_jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 40, 29));

        jLabel3.setFont(new java.awt.Font("メイリオ", 0, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ログイン画面");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 47, 420, 41));

        jLabel4.setFont(new java.awt.Font("Meiryo UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("管理者ID、パスワードを入力してください。");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 94, 420, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(199, 226, 255));
        jLabel5.setText("Administrator ID");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 341, -1));

        Admin_jTextBox.setFont(Admin_jTextBox.getFont().deriveFont(Admin_jTextBox.getFont().getSize()+2f));
        Admin_jTextBox.setForeground(new java.awt.Color(255, 255, 255));
        Admin_jTextBox.setBorder(null);
        jPanel2.add(Admin_jTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 320, 30));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("________________________________________________________________");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 330, 39));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_user.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 145, 40, 39));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(199, 226, 255));
        jLabel8.setText("Password");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 341, -1));

        Password_jTextBox.setFont(Password_jTextBox.getFont().deriveFont(Password_jTextBox.getFont().getSize()+2f));
        Password_jTextBox.setForeground(new java.awt.Color(255, 255, 255));
        Password_jTextBox.setBorder(null);
        Password_jTextBox.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(Password_jTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 320, 30));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("________________________________________________________________");
        jLabel9.setToolTipText("");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 330, 40));

        Disable_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Disable_jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_eye_close.png"))); // NOI18N
        Disable_jLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Disable_jLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Disable_jLabelMouseClicked(evt);
            }
        });
        jPanel2.add(Disable_jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 205, 40, 40));

        Show_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Show_jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_eye_open.png"))); // NOI18N
        Show_jLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Show_jLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Show_jLabelMouseClicked(evt);
            }
        });
        jPanel2.add(Show_jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 205, 40, 40));

        Admin_jCheckBox.setFont(new java.awt.Font("メイリオ", 0, 13)); // NOI18N
        Admin_jCheckBox.setForeground(new java.awt.Color(199, 226, 255));
        Admin_jCheckBox.setSelected(true);
        Admin_jCheckBox.setText("IDを記録する");
        Admin_jCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Admin_jCheckBoxStateChanged(evt);
            }
        });
        jPanel2.add(Admin_jCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        Login_jButton.setBackground(new java.awt.Color(255, 255, 255));
        Login_jButton.setFont(new java.awt.Font("メイリオ", 1, 14)); // NOI18N
        Login_jButton.setForeground(new java.awt.Color(25, 118, 211));
        Login_jButton.setText("ログイン");
        Login_jButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Login_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_jButtonActionPerformed(evt);
            }
        });
        jPanel2.add(Login_jButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 341, 40));

        jLabel13.setFont(new java.awt.Font("メイリオ", 0, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("こちら");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 122, -1));

        Result_jLabel.setFont(new java.awt.Font("メイリオ", 0, 13)); // NOI18N
        Result_jLabel.setForeground(new java.awt.Color(255, 0, 0));
        Result_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(Result_jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 330, -1));

        jLabel16.setFont(new java.awt.Font("メイリオ", 0, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(199, 226, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("管理者アカウントの設定:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 213, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 420, 440));

        setSize(new java.awt.Dimension(916, 438));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // ■ アプリ終了 ラベルクリック時の処理
    private void Close_jLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Close_jLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_Close_jLabelMouseClicked

    // ■ パスワード非表示
    private void Disable_jLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Disable_jLabelMouseClicked
        Password_jTextBox.setEchoChar((char)0);
        Disable_jLabel.setVisible(false);
        Disable_jLabel.setEnabled(false);
        Show_jLabel.setEnabled(true);
        Show_jLabel.setEnabled(true);
    }//GEN-LAST:event_Disable_jLabelMouseClicked

    // ■ パスワード表示
    private void Show_jLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Show_jLabelMouseClicked
        Password_jTextBox.setEchoChar((char)8226);
        Disable_jLabel.setVisible(true);
        Disable_jLabel.setEnabled(true);
        Show_jLabel.setEnabled(false);
        Show_jLabel.setEnabled(false);
    }//GEN-LAST:event_Show_jLabelMouseClicked

    // ■ ウィンドウの表示アニメーション設定
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <=1.0; i = i+0.1){
            String val = i+ "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try{
                Thread.sleep(50);
            }catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_formWindowOpened

    // ■ ボタンの処理 - ログイン
    private void Login_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_jButtonActionPerformed
        adminLogin(); 
    }//GEN-LAST:event_Login_jButtonActionPerformed

    private void Admin_jCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Admin_jCheckBoxStateChanged
 
    }//GEN-LAST:event_Admin_jCheckBoxStateChanged

    public static void main(String args[]) {

    //  ■ Look and Feel の設定 - flat-demo-3.2.1jar 使用 - 
    try {
        UIManager.setLookAndFeel(new FlatIntelliJLaf());
    } catch (Exception e) {
     e.printStackTrace();   
    }    
        
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new login().setVisible(true);
        }
      });
    }
    
    // ■ メソッド - MySQL IDとパスワードの認証
     public void adminLogin(){
        
        // フォームデータ格納用
        String id = Admin_jTextBox.getText();
        String password = Password_jTextBox.getText();
         
        // SQLデータ格納用
        String sqlId = "";
        String sqlPassword = "";
        
        // SQL接続
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
              PreparedStatement statement = connection.prepareStatement(sql); ) {
                        
            // SQL実行
            ResultSet result = statement.executeQuery();
            
            // ID・パスワードの照合
            while(result.next()){
                sqlId = result.getString("id");
                sqlPassword = result.getString("password");
            }  
            
        }catch (SQLException e){
            e.printStackTrace();     
        }
        
        // IF 照合成功の場合
        if(id.equals(sqlId) && password.equals(sqlPassword)){
           
            // メインフォームを起動
            main main = new main();
            main.show();
            
            // ログインフォームを終了
            dispose();
         
        // Else 照合失敗の場合
        }else{
            Result_jLabel.setText("IDまたはパスワードが間違っています。");  
        }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Admin_jCheckBox;
    private javax.swing.JTextField Admin_jTextBox;
    private javax.swing.JLabel Close_jLabel;
    private javax.swing.JLabel Disable_jLabel;
    private javax.swing.JButton Login_jButton;
    private javax.swing.JPasswordField Password_jTextBox;
    private javax.swing.JLabel Result_jLabel;
    private javax.swing.JLabel Show_jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
