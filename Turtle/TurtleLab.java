import java.awt.Color;

public class TurtleLab
{
    public static void main(String args[])
    throws InterruptedException
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        turtle.setPenColor(Color.BLACK);
        int multi;
        double sevenf;
        sevenf = .95;
        multi=1;
       // while (multisevenf){
            //this is where the picture would go if it worked
        
        //PictureExplorer explorer= new PictureExplorer(pic);
        
            //turtle2.setShowInfo(true);
        turtle2.updateDisplay();
        //}
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
        //turtle2.setShellColor(Color.BLACK);
        turtle2.setPenColor(Color.YELLOW);        
        //turtle2.turnLeft();
       // turtle2.forward(200);
       // turtle2.turnLeft();
       // turtle2.forward(100);
       turtle2.penUp();
        turtle2.backward(10);
        turtle2.penDown();
        turtle2.turnLeft();
       
        turtle2.setWidth(40);
        turtle2.setHeight(40);
        
        double hundred=100;
        int forward=0;
        while (multi<200){
            hundred=Math.pow(sevenf, multi);
            forward=(int) Math.round(hundred*800);
            turtle.forward(forward);
            turtle.turnLeft();
            turtle2.forward(multi*4);
            turtle2.turnRight();
            multi++;
        }
        turtle.penUp();
        turtle.turnLeft();
        turtle.forward(200);
        turtle.turnLeft();
        turtle.turnLeft();
        turtle2.turnToFace(0,0);
        turtle2.forward(500);
        turtle2.turnLeft();
        turtle2.forward(100);
        turtle2.turnLeft();
        turtle2.turnLeft();
        Picture pic= new Picture("C:\\Users\\tjhenning\\Desktop\\reddot.jpg");
        turtle2.drop(pic);
        //turtle2.hide();
    }
}
