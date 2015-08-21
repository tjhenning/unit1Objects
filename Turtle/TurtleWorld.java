import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    throws InterruptedException
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        turtle.setPenColor(Color.GREEN);
        int multi;
        float sevenf;
        sevenf = .75f;
        multi=1;
        turtle.penDown();
        turtle.setWidth(100);
        turtle.setHeight(5);
        turtle2.setShellColor(Color.BLACK);
        turtle2.setPenColor(Color.YELLOW);        
        turtle2.turnLeft();
        turtle2.forward(200);
        turtle2.turnLeft();
        turtle2.forward(100);
        turtle2.penDown();
        turtle2.setWidth(40);
        turtle2.setHeight(40);
        while (100*Math.pow(sevenf, multi)>1){
            //turtle.forward(100*Math.pow(sevenf, multi));
        turtle.setShellColor(Color.GREEN);
        Thread.sleep(10);
        turtle.forward(100);
        turtle.turnRight();
        turtle.setShellColor(Color.BLUE);
        Thread.sleep(10);
        turtle.forward(100);
        turtle.turnLeft();
        turtle.setShellColor(Color.RED);
        Thread.sleep(10);
        turtle.forward(100);
        turtle.turnRight();
        turtle2.turnLeft();
            //multi= multi+1f;
        }
        
    }
}
