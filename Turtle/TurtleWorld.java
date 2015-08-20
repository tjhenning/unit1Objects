import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.GREEN);
        float multi;
        float sevenf;
        sevenf = .75f;
        multi=1f;
        turtle.penDown();
        while (100*Math.pow(sevenf, multi)>1){
            turtle.forward(100*Math.pow(sevenf,multi));
            turtle.turnRight();
            multi= multi+1;
        }
    }
}
