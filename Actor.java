import java.awt.Graphics;
import java.awt.color.*;

public abstract class Actor {
    Color c;
    Cell location;
    int cellOffset =5;
    public Actor Cell location;
    c = Color.GREEN;
}

public void paint(Graphics g){
    g.setColor(c);
    fillRect location.x + cellOffset, location.y
}
