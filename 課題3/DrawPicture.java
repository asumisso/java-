import java.awt.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class DrawPicture extends JFrame{
  CanvasPanel canv;
  public DrawPicture() {
    canv = new CanvasPanel();
    getContentPane().add(canv);
    setTitle("お絵かき");
    setSize(480, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

  }
  public static void main(String[] args) {
    new DrawPicture();
  }
}