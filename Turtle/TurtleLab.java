import java.awt.Color;
import java.util.Random;
//This program has a few things that have a random chance of happening so don't just open it once
//(although I don't know why the picture is only there half the time)

public class TurtleLab
{
    public static void main(String args[])
    throws InterruptedException
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        Turtle turtle3 = new Turtle(turtleWorld);
        Turtle turtle4 = new Turtle(turtleWorld);
        turtle.setPenColor(Color.BLACK);
        int multi;
        double sevenf;
        sevenf = .95;
        multi=1;               
        //PictureExplorer explorer= new PictureExplorer(pic);        
        //turtle2.setShowInfo(true);
        turtle2.updateDisplay();
        turtle.penUp();
        turtle.setPenWidth(2);
        turtle.turnRight();
        turtle.forward(400);
        turtle.turnRight();
        turtle.forward(200);
        turtle.turnRight();
        turtle.turnRight();
        turtle.penDown();
        turtle.setWidth(300);
        turtle.setHeight(10);
        turtle2.penUp();
        turtle2.setShellColor(Color.BLACK);
        turtle2.setPenColor(Color.YELLOW);        
        turtle2.penUp();
        //turtle2.setPenWidth(2);
        turtle2.forward(1);
        turtle2.turnLeft();
        turtle2.backward(9);
        turtle2.penDown();
        turtle2.turnLeft();       
        turtle2.setWidth(40);
        turtle2.setHeight(40);
        turtle3.setPenColor(Color.GRAY);
        turtle3.setPenWidth(3);
        turtle3.penUp();
        turtle3.turn(120);
        turtle3.forward(300);
        turtle3.penDown();
        turtle4.penUp();
        turtle4.setPenColor(Color.GREEN);
        turtle4.forward(125);
        turtle4.turn(90);
        turtle4.backward(65);
        turtle4.penDown();
        double hundred=100;
        int forward=0;
        Random random1=new Random();
        int num=random1.nextInt(2);
        while (multi<200){
            hundred=Math.pow(sevenf, multi);
            forward=(int) Math.round(hundred*800);
            turtle.forward(forward);
            turtle.turnLeft();
            turtle2.forward(multi*4);
            turtle2.turnRight();                
            multi++;
        }
        if (num < 1){
            while (multi<400)
            {
                turtle4.forward(100);
                turtle4.turn(-40);
                turtle4.forward(30);
                turtle4.turn(80);turtle3.turn(134.5);
                turtle3.forward(100);    
                multi++;
            }
        }else{
            turtle3.setPenWidth(1);
            while (multi<400)
            {
                turtle4.forward(100);
                turtle4.turn(-30);
                turtle4.forward(30);
                turtle4.turn(80);
                turtle3.turn(134);
                turtle3.forward(100);    
                multi++;
            }
        }
        turtle3.hide();
        turtle4.hide();
        turtle.penUp();
        turtle.turnLeft();
        turtle.forward(200);
        turtle.turnLeft();
        turtle.turnLeft();
        turtle2.penUp();
        turtle2.forward(150);
        turtle2.turnLeft();
        turtle2.backward(100);
        //turtle2.turnLeft();
        //turtle2.turnLeft();
        Picture pic= new Picture("C:\\Users\\tjhenning\\Desktop\\reddot.jpg");
        turtle2.drop(pic);        
    }
}
