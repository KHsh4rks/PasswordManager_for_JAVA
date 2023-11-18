package mainform;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import loginform.login;

public class main extends javax.swing.JFrame {
    // SQL: データ情報
    static final String URL = "jdbc:mysql://localhost/sample_login"; 
    // SQL: ID
    static final String USERNAME = "root";    
    // SQL: パスワード
    static final String PASSWORD = "rootpass";                          
    // SQL: テーブル
    String sql = "SELECT * FROM list;";                                
    
    public main() {
        initComponents();
        // Fflameタイトル設定
        this.setTitle("PasswordManager - DeepShark -");
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Username_jTextBox = new javax.swing.JTextField();
        Password_jTextBox = new javax.swing.JTextField();
        Name_jTextBox = new javax.swing.JTextField();
        Delete_jButton = new javax.swing.JButton();
        Change_jButton = new javax.swing.JButton();
        Type_jTextBox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Memo_jTextBox = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        New_jButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Logout_jButton = new javax.swing.JButton();
        Shutdown_jButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 550));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "管理No.", "カテゴリ", "名前", "ユーザー名", "パスワード", "メモ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        // ■ SQLデータからテーブル情報を取得
        try (java.sql.Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            PreparedStatement statement = connection.prepareStatement(sql); ) {

            String sql = "SELECT * FROM list";

            // SQL実行
            ResultSet result = statement.executeQuery();

            while(result.next()) {
                String number = Integer.valueOf(result.getInt("id")).toString();
                String type = String.valueOf(result.getString("type"));
                String name = String.valueOf(result.getString("name"));
                String username = String.valueOf(result.getString("username"));
                String password = String.valueOf(result.getString("password"));
                String memo = String.valueOf(result.getString("memo"));

                String tbData[] = {number,type,name,username,password,memo};

                DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();

                tblModel.addRow(tbData);

            }

        }catch (SQLException e){
            e.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel2.setBackground(new java.awt.Color(25, 118, 211));
        jPanel2.setPreferredSize(new java.awt.Dimension(350, 300));

        jLabel1.setText("名前");

        jLabel2.setText("ユーザー名");

        jLabel3.setText("パスワード");

        Name_jTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name_jTextBoxActionPerformed(evt);
            }
        });

        Delete_jButton.setText("削除");
        Delete_jButton.setEnabled(false);
        Delete_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_jButtonActionPerformed(evt);
            }
        });

        Change_jButton.setText("変更");
        Change_jButton.setEnabled(false);
        Change_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Change_jButtonActionPerformed(evt);
            }
        });

        Type_jTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Type_jTextBoxActionPerformed(evt);
            }
        });

        jLabel4.setText("カテゴリ");

        jLabel5.setText("メモ");

        New_jButton.setText("新規作成");
        New_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Memo_jTextBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(Password_jTextBox, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Username_jTextBox, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Name_jTextBox, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Type_jTextBox, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(New_jButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Change_jButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Delete_jButton)))
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Type_jTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Name_jTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Username_jTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password_jTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Memo_jTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete_jButton)
                    .addComponent(Change_jButton)
                    .addComponent(New_jButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(235, 235, 235))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo_shark_small.png"))); // NOI18N

        Logout_jButton.setText("ログアウト");
        Logout_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout_jButtonActionPerformed(evt);
            }
        });

        Shutdown_jButton.setText("終了");
        Shutdown_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Shutdown_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logout_jButton)
                    .addComponent(Shutdown_jButton))
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(Logout_jButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Shutdown_jButton)
                        .addGap(8, 8, 8))))
        );

        jMenu1.setText("ファイル");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Name_jTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name_jTextBoxActionPerformed

    }//GEN-LAST:event_Name_jTextBoxActionPerformed

    // ■ テーブル処理 - 項目選択時
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        // テーブル情報取得
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        
        // 編集・削除ボタンを有効化
        Delete_jButton.setEnabled(true);
        Change_jButton.setEnabled(true);
        
        // 選択した項目をString変数に格納
        
        String tblType = tblModel.getValueAt(jTable1.getSelectedRow(),1).toString();
        String tblName = tblModel.getValueAt(jTable1.getSelectedRow(),2).toString();
        String tblUsername = tblModel.getValueAt(jTable1.getSelectedRow(),3).toString();
        String tblPassword = tblModel.getValueAt(jTable1.getSelectedRow(),4).toString();
        String tblMemo = tblModel.getValueAt(jTable1.getSelectedRow(),5).toString();
        
        // TextBoxに反映
        Type_jTextBox.setText(tblType);
        Name_jTextBox.setText(tblName);
        Username_jTextBox.setText(tblUsername);
        Password_jTextBox.setText(tblPassword);
        Memo_jTextBox.setText(tblMemo);
        
    }//GEN-LAST:event_jTable1MouseClicked

        // ■ ボタン処理 - 編集
    private void Change_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Change_jButtonActionPerformed
        
        // テーブル情報取得
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        
        // IF テーブルが空の場合
        if(tblModel.getRowCount() == 0) {
             JOptionPane.showMessageDialog(this,"テーブルにデータがありません。");
             
        // IF 必要項目の入力が足りない場合
        }else if(Type_jTextBox.getText().equals("") || Name_jTextBox.getText().equals("") || Username_jTextBox.getText().equals("") || Password_jTextBox.getText().equals("")){
            
            JOptionPane.showMessageDialog(this,"必須項目を入力してください。");
           
        // 編集実行
        }else{
            
            // メッセージボックス表示 YES/NO
            int option = JOptionPane.showConfirmDialog(this, "編集を確定しますか？","最終確認", JOptionPane.YES_NO_OPTION, JOptionPane.NO_OPTION);
           
            // YES
            if (option == JOptionPane.YES_OPTION){
                
            // TextBoxのデータ格納
            String type,name,username,password,memo;
            
            type = Type_jTextBox.getText();
            name = Name_jTextBox.getText();
            username = Username_jTextBox.getText();
            password =  Password_jTextBox.getText();
            memo = Memo_jTextBox.getText();
            
            // SQL接続          
            try (java.sql.Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            PreparedStatement statement = connection.prepareStatement(sql); ) {
            
                // SQL命令
                String number = tblModel.getValueAt(jTable1.getSelectedRow(),0).toString();
                String query = "UPDATE list SET type=\"" + type + "\", name=\"" + name + "\", username=\"" + username + "\", password=\"" + password + "\", memo=\"" + memo + "\" WHERE id=" + number;
                PreparedStatement prepatmt = connection.prepareStatement(query);
                                
                // SQLに送信
                prepatmt.execute();
                
                // テーブルを再読み込み
                tableReset();
                           
                // TextBox,Button 初期化
                txtbtnReset();
                                 
        }catch (SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,"データの編集に失敗しました。");
        }                  
            // NO    
            }else if (option == JOptionPane.NO_OPTION){
                // 処理なし   
            }
       }
        

        
    }//GEN-LAST:event_Change_jButtonActionPerformed

    // ■ ボタン処理 - 削除
    private void Delete_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_jButtonActionPerformed
        
        // テーブル情報を取得
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        
        // IF テーブルが空の場合
        if(tblModel.getRowCount() == 0) {

             JOptionPane.showMessageDialog(this,"テーブルにデータがありません。");
        
        // IF 必要項目の入力が足りない場合
        }else if(Type_jTextBox.getText().equals("") || Name_jTextBox.getText().equals("") || Username_jTextBox.getText().equals("") || Password_jTextBox.getText().equals("")){
            
            JOptionPane.showMessageDialog(this,"必須項目を入力してください。");
            
        // 削除実行
        }else{
        
            // メッセージボックス表示 YES/NO
            int option = JOptionPane.showConfirmDialog(this, "削除を確定しますか？","最終確認", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            // YES
            if (option == JOptionPane.YES_OPTION){
        
             // SQL接続                 
            try (java.sql.Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
              PreparedStatement statement = connection.prepareStatement(sql); ) {
            
                // SQL命令
                String number = tblModel.getValueAt(jTable1.getSelectedRow(),0).toString();
                String query = "DELETE FROM list WHERE id = " + number;
                PreparedStatement prepatmt = connection.prepareStatement(query);
                
                // SQLに送信
                prepatmt.execute();
                
                // テーブルを再読み込み
                tableReset();
                             
                // TextBox,Button 初期化
                txtbtnReset();
                                     
            }catch (SQLException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(this,"データの削除に失敗しました。");
            }   
        
            // NO
            }else if (option == JOptionPane.NO_OPTION){
                 // 処理なし
            }    
    }

        
    }//GEN-LAST:event_Delete_jButtonActionPerformed

    // ■ ボタン処理 - ログアウト
    private void Logout_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout_jButtonActionPerformed
            
            // ログインフォームを起動
            login login = new login();
            login.show();
            
            // ログインフォームを終了
            dispose();
            
    }//GEN-LAST:event_Logout_jButtonActionPerformed

    private void Type_jTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Type_jTextBoxActionPerformed

    }//GEN-LAST:event_Type_jTextBoxActionPerformed

    // ■ ボタン処理 - 新規作成のデータを送信
    private void New_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New_jButtonActionPerformed
        
        // テーブル情報の取得
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        
        // IF テーブルが空の場合
        if(Type_jTextBox.getText().equals("") || Name_jTextBox.getText().equals("") || Username_jTextBox.getText().equals("") || Password_jTextBox.getText().equals("")){
    
            JOptionPane.showMessageDialog(this,"データを入力してください。");
         
        // 新規作成実行
        }else{
            
            // データ格納用
            String type,name,username,password,memo;
       
            // SQL接続    
            try (java.sql.Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            PreparedStatement statement = connection.prepareStatement(sql); ) {
            
                // TextBoxのデータを格納
                type = Type_jTextBox.getText();
                name = Name_jTextBox.getText();
                username = Username_jTextBox.getText();
                password =  Password_jTextBox.getText();
                memo = Memo_jTextBox.getText();
                
                // SQL命令
                String query = "INSERT INTO list(type,name,username,password,memo)VALUES(?,?,?,?,?)";
                PreparedStatement prepatmt = connection.prepareStatement(query);
                prepatmt.setString(1, type);
                prepatmt.setString(2, name);
                prepatmt.setString(3, username);
                prepatmt.setString(4, password);
                prepatmt.setString(5, memo);
                
                // SQLに送信
                prepatmt.execute();
                
                // テーブルを再読み込み
                tableReset();
                
                // TextBox,Button 初期化
                txtbtnReset();
                       
        }catch (SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,"登録に失敗しました。");
        }
    
    }
        

        
    }//GEN-LAST:event_New_jButtonActionPerformed

    // ■ ボタン処理 - 終了
    private void Shutdown_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Shutdown_jButtonActionPerformed
        // ログインフォームを終了
        dispose();
    }//GEN-LAST:event_Shutdown_jButtonActionPerformed

    public static void main(String args[]) {

    //  ■ Look and Feel の設定 - flat-demo-3.2.1jar 使用 - 
    try {
        UIManager.setLookAndFeel(new FlatIntelliJLaf());
    } catch (Exception e) {
     e.printStackTrace();   
    }

    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
             new main().setVisible(true);
            }
        });
    }
    
    /********** 以下は再利用メソッド **********/
    
    // ■ メソッド - テーブルを再読み込み
    public void tableReset() {
        
    DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        
    // テーブルを初期化
    tblModel.setRowCount(0);
        
        // SQLデータからテーブル情報を取得
    try (java.sql.Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    PreparedStatement statement = connection.prepareStatement(sql); ) {
                 
    String sql = "SELECT * FROM list";
          
    // SQL実行
    ResultSet result = statement.executeQuery();
            
        while(result.next()) {
        
            String number = Integer.toString(result.getInt("id"));
            String type = String.valueOf(result.getString("type"));
            String name = String.valueOf(result.getString("name"));
            String username = String.valueOf(result.getString("username"));
            String password = String.valueOf(result.getString("password"));
            String memo = String.valueOf(result.getString("memo"));
                
            String tbData[] = {number,type,name,username,password,memo};
                           
            tblModel.addRow(tbData);
                
        }
            
    }catch (SQLException e){
        e.printStackTrace();     
    }       
  }
    
    // ■ メソッド - ボタン非表示、テキストボックス初期化
    public void txtbtnReset() {
    
    // 編集・削除ボタンを無効化
    Delete_jButton.setEnabled(false);
    Change_jButton.setEnabled(false);
    
    // テキストボックスを初期化
    Type_jTextBox.setText("");
    Name_jTextBox.setText("");
    Username_jTextBox.setText("");
    Password_jTextBox.setText("");
    Memo_jTextBox.setText("");
    
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Change_jButton;
    private javax.swing.JButton Delete_jButton;
    private javax.swing.JButton Logout_jButton;
    private javax.swing.JTextField Memo_jTextBox;
    private javax.swing.JTextField Name_jTextBox;
    private javax.swing.JButton New_jButton;
    private javax.swing.JTextField Password_jTextBox;
    private javax.swing.JButton Shutdown_jButton;
    private javax.swing.JTextField Type_jTextBox;
    private javax.swing.JTextField Username_jTextBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
