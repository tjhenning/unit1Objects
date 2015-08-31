import java.awt.Color;
import javax.swing.JFrame;

public class BrighterDemo
{
    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        frame.setSize(200, 200);
        Color myColor= new Color(150,50,50);
        myColor=myColor.brighter();
        frame.getContentPane().setBackground(myColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        //System.out.println(c);
    }
}