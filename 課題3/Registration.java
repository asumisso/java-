import java.io.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.text.*;


public class Registration extends JFrame implements ActionListener, MouseListener {
  //マウス
  JPopupMenu　popup = new JPopupMenu();;
  JMenuItem copyItem = new JMenuItem("コピー");
  JMenuItem pasteItem = new JMenuItem("貼り付け");
  JMenuItem cutItem = new JMenuItem("カット");
  JTextComponent textComp;

  //topPanel
  JPanel topPanel = new JPanel();
  JLabel text = new JLabel("下記の項目を入力してください");
  //namePanel
  JPanel namePanel = new JPanel();
  JLabel nameLabel = new JLabel("名前:");
  JTextField nameField = new JTextField();

  //addressPanel
  JPanel addressPanel = new JPanel();
  JLabel addressLabel = new JLabel("住所");
  //ken
  JPanel kenPanel = new JPanel();
  JLabel kenLabel = new JLabel("都道府県:");
  JComboBox<String> kenCombo = new JComboBox<String>(); 
  //shi
  JPanel shiPanel = new JPanel();
  JLabel shiLabel = new JLabel("市区町村以下:");
  JTextField shiField = new JTextField();

  //sexPanel
  JPanel sexPanel = new JPanel();
  JLabel sexLabel = new JLabel("性別:");
  //groupPanel
  JPanel groupPanel = new JPanel();
  JRadioButton womenRadio = new JRadioButton("女");
  JRadioButton menRadio = new JRadioButton("男");
  ButtonGroup sexGroup = new ButtonGroup();

  //agePanel
  JLabel ageLabel = new JLabel("年齢:");
  JList<String> ageList;
  JScrollPane scroll;

  //buttonPanel
  JPanel buttonPanel = new JPanel();
  JButton rButton = new JButton("登録");
  JButton cButton = new JButton("クリア");

  public Registration() {

    //都道府県
    kenCombo.addItem("北海道");
    kenCombo.addItem("青森県");
    kenCombo.addItem("岩手県");
    kenCombo.addItem("宮城県");
    kenCombo.addItem("秋田県");
    kenCombo.addItem("山形県");
    kenCombo.addItem("福島県");
    kenCombo.addItem("茨城県");
    kenCombo.addItem("栃木県");
    kenCombo.addItem("群馬県");
    kenCombo.addItem("埼玉県");
    kenCombo.addItem("千葉県");
    kenCombo.addItem("東京都");
    kenCombo.addItem("神奈川県");
    kenCombo.addItem("新潟県");
    kenCombo.addItem("富山県");
    kenCombo.addItem("石川県");
    kenCombo.addItem("福井県");
    kenCombo.addItem("山梨県");
    kenCombo.addItem("長野県");
    kenCombo.addItem("岐阜県");
    kenCombo.addItem("静岡県");
    kenCombo.addItem("愛知県");
    kenCombo.addItem("三重県");
    kenCombo.addItem("滋賀県");
    kenCombo.addItem("京都府");
    kenCombo.addItem("大阪府");
    kenCombo.addItem("兵庫県");
    kenCombo.addItem("奈良県");
    kenCombo.addItem("和歌山県");
    kenCombo.addItem("鳥取県");
    kenCombo.addItem("島根県");
    kenCombo.addItem("岡山県");
    kenCombo.addItem("広島県");
    kenCombo.addItem("山口県");
    kenCombo.addItem("徳島県");
    kenCombo.addItem("香川県");
    kenCombo.addItem("愛媛県");
    kenCombo.addItem("高知県");
    kenCombo.addItem("福岡県");
    kenCombo.addItem("佐賀県");
    kenCombo.addItem("長崎県");
    kenCombo.addItem("熊本県");
    kenCombo.addItem("大分県");
    kenCombo.addItem("宮崎県");
    kenCombo.addItem("鹿児島県");
    kenCombo.addItem("沖縄県");

    //ラジオボタンのグループ化
    sexGroup.add(menRadio);
    sexGroup.add(womenRadio);

    //リスト作成
    String[] ages = new String[]{"〜10歳","11歳〜20歳","21歳〜30歳","31歳〜40歳","41歳〜50歳","51歳〜60歳","61歳〜70歳","71歳以上"};
    ageList = new JList<String>(ages);
    scroll = new JScrollPane(ageList); //scrollをgetcontentpaneに貼り付ける

    //namePanel
    namePanel.setLayout(new BorderLayout());
    namePanel.add(nameLabel, BorderLayout.WEST);
    namePanel.add(nameField, BorderLayout.CENTER);
    //topPanel
    topPanel.setLayout(new GridLayout(2,1));
    topPanel.add(text);
    topPanel.add(namePanel);

    //kenPanel
    kenPanel.setLayout(new GridLayout(2,1));
    kenPanel.add(kenLabel);
    kenPanel.add(kenCombo);
    //shiPanel
    shiPanel.setLayout(new GridLayout(2,1));
    shiPanel.add(shiLabel);
    shiPanel.add(shiField);
    //addressPanel
    addressPanel.setLayout(new BorderLayout());
    addressPanel.add(kenPanel, BorderLayout.WEST);
    addressPanel.add(shiPanel, BorderLayout.CENTER);

    //groupPanel
    groupPanel.setLayout(new FlowLayout());
    groupPanel.add(menRadio);
    groupPanel.add(womenRadio);
    //sexPanel
    sexPanel.setLayout(new BorderLayout());
    sexPanel.add(sexLabel, BorderLayout.WEST);
    sexPanel.add(groupPanel, BorderLayout.CENTER);

    //buttonPanel
    buttonPanel.setLayout(new FlowLayout());
    buttonPanel.add(rButton);
    buttonPanel.add(cButton);

    //main
    getContentPane().setLayout(new GridLayout(7,1));
    getContentPane().add(topPanel);
    getContentPane().add(addressLabel);
    getContentPane().add(addressPanel);
    getContentPane().add(sexPanel);
    getContentPane().add(ageLabel);
    getContentPane().add(scroll);
    getContentPane().add(buttonPanel);

    //アクションリスナー:名前
    nameField.addActionListener(this);
    //アクションリスナー:市区町村以下
    shiField.addActionListener(this);
    //アクションリスナー:性別
    womenRadio.addActionListener(this);
    menRadio.addActionListener(this);
    //アクションリスナー:登録
    rButton.addActionListener(this);
    //マウスリスナー

    //基本設定
    setTitle("顧客登録");
    setSize(350,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

  }

  //アクションリスナー
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == copyItem) {
      textComp.copy();
    } else if(e.getSource() == cutItem) {
      textComp.cut();
    } else if (e.getSource() == pasteItem) {
      textComp.paste();
    } else if (e.getSource() == rButton) {
      //名前
      String name = nameField.getText();
      if (name.equals("")) {
        name = "名前未入力";        
      }
      //都道府県
      String ken;
      ken = (String) kenCombo.getSelectedItem();
      //市区町村
      String shi = shiField.getText();
      if (shi.equals("")) {
        shi = "市区町村未入力";        
      }
      //年齢
      String age;
      age = (String) ageList.getSelectedValue();
      //男女
      String sex;
      if (menRadio.isSelected() == true) {
        // 「男性」のJRadioButtonが選択されている場合
        sex = "男性";
      } else if (womenRadio.isSelected() == true) {
        // 「女性」のJRadioButtonが選択されている場合
        sex = "女性";
      } else {
        // 性別のJRadioButtonが選択されていない場合
        sex = "未選択";
      }
      //全部一括
      String info = name + "," +shi + "," +ken +"," +age + "," +sex;
      System.out.println(info);
      try{
        FileWriter fw = new FileWriter("Sample.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(fw);        
        pw.println(info);
        pw.close();
        bw.close();
        fw.close();
      }catch(IOException f){
        System.out.println("どこかがまちがっている。");
      }
    }
  }
  public void mousePressed(MouseEvent e) {
    if (e.getButton() == MouseEvent.BUTTON3) {
      copyItem.addActionListener(this);
      pasteItem.addActionListener(this);
      cutItem.addActionListener(this);
      popup.add(copyItem);
      popup.add(pasteItem);
      popup.add(cutItem);
      popup.show(e.getComponent(), e.getX(), e.getY());
      textComp = (JTextComponent) e.getSource();
    }
  }
  public void mouseClicked(MouseEvent e) {}
  public void mouseReleased(MouseEvent e) {}
  public void mouseEntered(MouseEvent e) {}
  public void mouseExited(MouseEvent e) {}

  public static void main(String[] args) {
    new Registration();
  }

}