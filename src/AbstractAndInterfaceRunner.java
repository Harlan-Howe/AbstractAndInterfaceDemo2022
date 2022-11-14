import javax.swing.*;
import java.awt.*;

public class AbstractAndInterfaceRunner extends JFrame
{
    public static void main(String[] args)
    {
        DisplayBox[] myBoxes = new DisplayBox[12];
        // assume we initialize the boxes...
        // a little distraction code to make a Graphics object... this isn't the right way to do this.
        AbstractAndInterfaceRunner myWindow = new AbstractAndInterfaceRunner();
        Graphics g = myWindow.getGraphics();

        for (DisplayBox db: myBoxes)
        {
            db.drawSelf(g);
        }
        myBoxes[4].drawSelectionOutline(g);
    }
}
