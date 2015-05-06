package cst1201;

/**
 * A class representing a Bowtie drawn by a Turtle object.
 *
 * @author Goutam Kundu
 */
public class Bowtie {

    /**
     * (Fill in a brief bescription of what method does)
     */
    public void draw() {
        //this is the *body* of the draw() method
        //implement the algorithm to draw a bowtie below
      
        Turtle myTurtle = new Turtle();
        myTurtle.setPenColor("blue");
        myTurtle.left(90);
        myTurtle.forward(300);
        myTurtle.right(135);
        myTurtle.forward(425);
        myTurtle.left(135);
        myTurtle.forward(300);
        myTurtle.left(135);
        myTurtle.forward(425);

    }

}
