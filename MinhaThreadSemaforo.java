
import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;


public class MinhaThreadSemaforo extends Thread {
    
    private JPanel panelGreen;
    private JPanel panelYellow;
    private JPanel panelRed;
    private boolean suspendFlag = false;
    private JButton botao;
    private static final Semaphore semaphore = new Semaphore(1, false); 
    public MinhaThreadSemaforo(JPanel panelGreen, JPanel panelYellow, JPanel panelRed) {
        this.panelGreen = panelGreen;
        this.panelYellow = panelYellow;
        this.panelRed = panelRed;
    }

    public MinhaThreadSemaforo() {
    }
    
    
    @Override
    public void run() {
        try {
            while(true) {
                semaphore.acquire();
                System.out.println();
                getpanelRed().setBackground(Color.white);
                getpanelYellow().setBackground(Color.white);
                getpanelGreen().setBackground(Color.green);
                sleep(4001);
                getpanelGreen().setBackground(Color.white);
                getpanelYellow().setBackground(Color.yellow);
                sleep(300l);
                semaphore.release();
                getpanelYellow().setBackground(Color.white);
                getpanelRed().setBackground(Color.red);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(MinhaThreadSemaforo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public synchronized void myResume() {
        botao.setText("Start");
        suspendFlag = false;
        notify();
    }
    public void suspendS() {
        this.suspendFlag = true;
    }

    public boolean isSuspendFlag() {
        return suspendFlag;
    }

    public void setBotao(JButton botao) {
        this.botao = botao;
    }

    public JPanel getpanelGreen() {
        return panelGreen;
    }

    public void setpanelGreen(JPanel jPanelGreen) {
        this.panelGreen = jPanelGreen;
    }

    public JPanel getpanelYellow() {
        return panelYellow;
    }

    public void setpanelYellow(JPanel jPanelYellow) {
        this.panelYellow = jPanelYellow;
    }

    public JPanel getpanelRed() {
        return panelRed;
    }

    public void setpanelRed(JPanel jPanelRed) {
        this.panelRed = jPanelRed;
    }
}


