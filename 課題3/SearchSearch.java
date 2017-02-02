import java.io.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SearchSearch extends JFrame implements ActionListener{
  JLabel searchLabel = new JLabel("検索する文字列:");
  JTextField searchField = new JTextField();
  JCheckBox one = new JCheckBox("単語単位で検索する");
  JCheckBox two = new JCheckBox("大文字と小文字を区別する");
  JLabel mukiLabel = new JLabel("検索する方向");
  JRadioButton up = new JRadioButton("上から");
  JRadioButton down = new JRadioButton("下から");
  JButton nextButton = new JButton("次を検索");
  JButton cancelButton = new JButton("キャンセル");
  JPanel searchPanel = new JPanel();
  JPanel checkPanel = new JPanel();
  JPanel radioPanel = new JPanel();
  JPanel buttonPanel = new JPanel();
  JPanel preprecenter = new JPanel(); //mukiLabel + radio
  JPanel precenter = new JPanel(); // check + radio
  JPanel center = new JPanel(); //seach + precenter
  ButtonGroup udGroup = new ButtonGroup();

  public SearchSearch() {

    //ラジオボタンのグループ化
    udGroup.add(up);
    udGroup.add(down);

    //searchPanel
    searchPanel.setLayout(new BorderLayout());
    searchPanel.add(searchLabel, BorderLayout.WEST);
    searchPanel.add(searchField, BorderLayout.CENTER);

    //checkPanel
    checkPanel.setLayout(new GridLayout(2,1));
    checkPanel.add(one);
    checkPanel.add(two);

    //radioPanel
    radioPanel.setLayout(new GridLayout(1,2));
    radioPanel.add(up);
    radioPanel.add(down);

    //buttonPanel
    buttonPanel.setLayout(new GridLayout(2,1));
    buttonPanel.add(nextButton);
    buttonPanel.add(cancelButton);

    //preprecenter
    preprecenter.setLayout(new GridLayout(2,1));
    preprecenter.add(mukiLabel);
    preprecenter.add(radioPanel);

    //precenter
    precenter.setLayout(new GridLayout(1,2));
    precenter.add(checkPanel);
    precenter.add(preprecenter);

    //center
    center.setLayout(new GridLayout(2,1));
    center.add(searchPanel);
    center.add(precenter);

    //main
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(center, BorderLayout.CENTER);
    getContentPane().add(buttonPanel, BorderLayout.EAST);

    //アクションリスナー
    nextButton.addActionListener(this);

    setSize(500, 100);
    setTitle("検索");
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e){
    if (e.getSource() == nextButton) {
      String str = searchField.getText();
      if (str.equals("")) {
        JOptionPane.showMessageDialog(null, "文字が入力されていません。", "エラー", JOptionPane.ERROR_MESSAGE);
      }
    }
   }
}