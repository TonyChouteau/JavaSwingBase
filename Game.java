
public class Game
{
  Frame frame;
  Panel panel;

  public Game()
  {
    openFrame();
    initGame();

    start();
  }

  // Frame functions

  private void openFrame()
  {
    frame = new Frame();
    initPanel();
    //initPanelSize();
  }

  // Panel functions

  private void initPanel()
  {
    panel = frame.getPanel();
  }

  // Game functions

  private void initGame()
  {

  }

  private void start()
  {
    boolean isFinished = false;
    while(!isFinished)
    {
      panel.display();

      try
      {
        Thread.sleep(1);
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }
  }
}
