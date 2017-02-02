import java.io.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SearchOpen extends JFrame implements ActionListener {
  JLabel text = new JLabel("ファイルまたはURLを指定してください");
  JLabel openLabel = new JLabel("開く:");
  JTextField openField = new JTextField();
  JButton okButton = new JButton("OK");
  JButton cancelButton = new JButton("キャンセル");
  JButton sansyoButton = new JButton("参照");
  JPanel openPanel = new JPanel();
  JPanel buttonPanel = new JPanel();

  public SearchOpen() {
    //openPanel
    openPanel.setLayout(new BorderLayout());
    openPanel.add(openLabel, BorderLayout.WEST);
    openPanel.add(openField, BorderLayout.CENTER);

    //buttonPanel
    buttonPanel.setLayout(new FlowLayout());
    buttonPanel.add(okButton);
    buttonPanel.add(cancelButton);
    buttonPanel.add(sansyoButton);

    //アクションリスナー
    okButton.addActionListener(this);

    //main
    getContentPane().setLayout(new GridLayout(3,1));
    getContentPane().add(text);
    getContentPane().add(openPanel);
    getContentPane().add(buttonPanel);

    setSize(350, 150);
    setTitle("ファイルを開く");
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e){
    if (e.getSource() == okButton) {
      String str = openField.getText();
      if (str.equals("")) {
        JOptionPane.showMessageDialog(null, "文字が入力されていません。", "エラー", JOptionPane.ERROR_MESSAGE);
      }
    }
   } 
}