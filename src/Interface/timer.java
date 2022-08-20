// TIMER
package Interface;

import static java.lang.Thread.sleep;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author jesus
 */
public class timer extends Thread{
    private int m;
    private int s;
    private JLabel TimeLabel;
private boolean corriendo= true;
    public timer(int m, int s, JLabel TimeLabel) {
        this.m = m;
        this.s = s;
        this.TimeLabel = TimeLabel;
    }
    
    public void run(){
        while(corriendo){
            try {
                if (s == 0) {
                    s = 60;
                    if (m == 0) {
                        m = 60;
                        notificacion();
                        break;
                    }
                    m--;
                }
                s= s-1;
                TimeLabel.setText(m+":"+s);
                sleep(1000);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ocurrió un error");
            }
        }
        
    }
    public void notificacion(){
            JOptionPane.showMessageDialog(null, "Tiempo de espera terminado");
        }
}
