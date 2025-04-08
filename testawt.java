import java.awt.*;
public class testawt {
    testawt() {
        Frame fm=new Frame();
        Label lb = new Label("Welcome to java graphics");
        fm.add(lb);
        fm.setSize(300, 300);
        fm.setVisible(true);
  
        fm.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
               System.exit(0);
            }
       });
   }
   public static void main(String[] args){
    new testawt();
   }
}
