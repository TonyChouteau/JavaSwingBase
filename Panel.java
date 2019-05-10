import javax.swing.JPanel;

import java.awt.*;
/*
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Toolkit;
*/

public class Panel extends JPanel
{
  private final int W;
  private final int H;

  private int x = 0;
  private int y = 0;

  public Panel(Dimension size, boolean isDecorated)
  {
    W = (int)size.getWidth();

    H = (isDecorated)?((int)size.getHeight()-30) : ((int)size.getHeight());

    System.out.println(W+" "+H);
  }
  public void display()
  {
    Graphics g = getGraphics();

    Toolkit.getDefaultToolkit().sync();

    drawBackground(g, Color.gray);
  }

  // SubFunctions for drawing

  private void drawBackground(Graphics g, Color color)
  {
    g.setColor(color);
    g.fillRect(0,0,W,H);
  }
}
