import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;
//from   ww w.j  a  v a 2s. c  om
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Main {

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(new ClockPane());
    frame.pack();
    frame.setVisible(true);
  }
}

class ClockPane extends JPanel {

  private JLabel clock = new JLabel();

  public ClockPane() {
    setLayout(new BorderLayout());
    tickTock();
    add(clock);
    Timer timer = new Timer(500, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        tickTock();
      }
    });
    timer.setRepeats(true);
    timer.setCoalesce(true);
    timer.setInitialDelay(0);
    timer.start();
  }

  public void tickTock() {
    clock.setText(DateFormat.getDateTimeInstance().format(new Date()));
  }
}
