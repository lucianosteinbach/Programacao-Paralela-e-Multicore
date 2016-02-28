
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.JPanel;
import java.awt.Component;
import javax.swing.Box;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author Guilherme
 */
public class Tela extends javax.swing.JPanel{
	public Semaforo() {
	}
   
    MinhaThreadSemaforo sem1 = new MinhaThreadSemaforo();
    MinhaThreadSemaforo sem2 = new MinhaThreadSemaforo();
    MinhaThreadSemaforo sem3 = new MinhaThreadSemaforo();
    MinhaThreadSemaforo sem4 = new MinhaThreadSemaforo();
    
    public static void main(String ...args){
        Tela tela = new Tela();
        JFrame frame = new JFrame("Semaforo 1 por vez"); 
        frame.getContentPane().add(tela);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    
    public Tela() {
    	setBackground(Color.DARK_GRAY);
        initComponents();
        }   
   
    private void initComponents() {

        botaoAStart = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanelYellow1 = new javax.swing.JPanel();
        jPanelYellow1.setForeground(UIManager.getColor("Button.disabledShadow"));
        jPanelRed1 = new javax.swing.JPanel();
        jPanelGreen1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanelYellow2 = new javax.swing.JPanel();
        jPanelRed2 = new javax.swing.JPanel();
        jPanelGreen2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanelYellow3 = new javax.swing.JPanel();
        jPanelRed3 = new javax.swing.JPanel();
        jPanelGreen3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();

        botaoAStart.setText("Iniciar");
        botaoAStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAStartActionPerformed(evt);
            }
        });

        jPanel8.setBackground(SystemColor.inactiveCaption);
        jPanel8.setForeground(new java.awt.Color(23, 12, 13));

        jPanelYellow1.setBackground(new java.awt.Color(255, 255,255));

        javax.swing.GroupLayout jPanelYellow1Layout = new javax.swing.GroupLayout(jPanelYellow1);
        jPanelYellow1.setLayout(jPanelYellow1Layout);
        jPanelYellow1Layout.setHorizontalGroup(
            jPanelYellow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelYellow1Layout.setVerticalGroup(
            jPanelYellow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        jPanelRed1.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanelRed1Layout = new javax.swing.GroupLayout(jPanelRed1);
        jPanelRed1.setLayout(jPanelRed1Layout);
        jPanelRed1Layout.setHorizontalGroup(
            jPanelRed1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        jPanelRed1Layout.setVerticalGroup(
            jPanelRed1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0,10, Short.MAX_VALUE)
        );

        jPanelGreen1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelGreen1Layout = new javax.swing.GroupLayout(jPanelGreen1);
        jPanelGreen1.setLayout(jPanelGreen1Layout);
        jPanelGreen1Layout.setHorizontalGroup(
            jPanelGreen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelGreen1Layout.setVerticalGroup(
            jPanelGreen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8Layout.setHorizontalGroup(
        	jPanel8Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel8Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jPanelRed1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jPanelGreen1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(jPanelYellow1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
        	jPanel8Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel8Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanelRed1, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jPanelYellow1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jPanelGreen1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        jPanel8.setLayout(jPanel8Layout);

        jPanel9.setBackground(SystemColor.inactiveCaption);
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));

        jPanelYellow2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelYellow2Layout = new javax.swing.GroupLayout(jPanelYellow2);
        jPanelYellow2.setLayout(jPanelYellow2Layout);
        jPanelYellow2Layout.setHorizontalGroup(
            jPanelYellow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanelYellow2Layout.setVerticalGroup(
            jPanelYellow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        jPanelRed2.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanelRed2Layout = new javax.swing.GroupLayout(jPanelRed2);
        jPanelRed2.setLayout(jPanelRed2Layout);
        jPanelRed2Layout.setHorizontalGroup(
            jPanelRed2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanelRed2Layout.setVerticalGroup(
            jPanelRed2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        jPanelGreen2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelGreen2Layout = new javax.swing.GroupLayout(jPanelGreen2);
        jPanelGreen2.setLayout(jPanelGreen2Layout);
        jPanelGreen2Layout.setHorizontalGroup(
            jPanelGreen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanelGreen2Layout.setVerticalGroup(
            jPanelGreen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelYellow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelGreen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelRed2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelRed2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelYellow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jPanelGreen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel10.setBackground(SystemColor.inactiveCaption);
        jPanel10.setForeground(new java.awt.Color(23, 12, 13));

        jPanelYellow3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelYellow3Layout = new javax.swing.GroupLayout(jPanelYellow3);
        jPanelYellow3.setLayout(jPanelYellow3Layout);
        jPanelYellow3Layout.setHorizontalGroup(
            jPanelYellow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );
        jPanelYellow3Layout.setVerticalGroup(
            jPanelYellow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        jPanelRed3.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanelRed3Layout = new javax.swing.GroupLayout(jPanelRed3);
        jPanelRed3.setLayout(jPanelRed3Layout);
        jPanelRed3Layout.setHorizontalGroup(
            jPanelRed3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );
        jPanelRed3Layout.setVerticalGroup(
            jPanelRed3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        jPanelGreen3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelGreen3Layout = new javax.swing.GroupLayout(jPanelGreen3);
        jPanelGreen3.setLayout(jPanelGreen3Layout);
        jPanelGreen3Layout.setHorizontalGroup(
            jPanelGreen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );
        jPanelGreen3Layout.setVerticalGroup(
            jPanelGreen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelRed3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelYellow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelGreen3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelRed3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelYellow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelGreen3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jPanel11.setBackground(SystemColor.inactiveCaption);
        jPanel11.setForeground(Color.CYAN);
        jPanelRed4 = new javax.swing.JPanel();
        
                jPanelRed4.setBackground(new java.awt.Color(255, 0, 0));
                
                        javax.swing.GroupLayout jPanelRed4Layout = new javax.swing.GroupLayout(jPanelRed4);
                        jPanelRed4.setLayout(jPanelRed4Layout);
                        jPanelRed4Layout.setHorizontalGroup(
                            jPanelRed4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 0, Short.MAX_VALUE)
                        );
                        jPanelRed4Layout.setVerticalGroup(
                            jPanelRed4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 32, Short.MAX_VALUE)
                        );
        jPanelYellow4 = new javax.swing.JPanel();
        
                jPanelYellow4.setBackground(new java.awt.Color(255, 255, 255));
                
                        javax.swing.GroupLayout jPanelYellow4Layout = new javax.swing.GroupLayout(jPanelYellow4);
                        jPanelYellow4.setLayout(jPanelYellow4Layout);
                        jPanelYellow4Layout.setHorizontalGroup(
                            jPanelYellow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 46, Short.MAX_VALUE)
                        );
                        jPanelYellow4Layout.setVerticalGroup(
                            jPanelYellow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 32, Short.MAX_VALUE)
                        );
        jPanelGreen4 = new javax.swing.JPanel();
        
                jPanelGreen4.setBackground(new java.awt.Color(255, 255, 255));
                
                        javax.swing.GroupLayout jPanelGreen4Layout = new javax.swing.GroupLayout(jPanelGreen4);
                        jPanelGreen4.setLayout(jPanelGreen4Layout);
                        jPanelGreen4Layout.setHorizontalGroup(
                            jPanelGreen4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 0, Short.MAX_VALUE)
                        );
                        jPanelGreen4Layout.setVerticalGroup(
                            jPanelGreen4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 32, Short.MAX_VALUE)
                        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11Layout.setHorizontalGroup(
        	jPanel11Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel11Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel11Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jPanelRed4, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jPanelYellow4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jPanelGreen4, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
        	jPanel11Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel11Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanelRed4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jPanelYellow4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jPanelGreen4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel11.setLayout(jPanel11Layout);
        
        JButton Stop = new JButton("STOP");
        Stop.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(145)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(Stop, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(botaoAStart, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
        			.addGap(138)
        			.addComponent(jPanel11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(87))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(249)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jPanel9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jPanel10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 311, Short.MAX_VALUE)))
        			.addGap(49))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jPanel9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(jPanel11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(33)
        							.addComponent(botaoAStart)
        							.addGap(18)
        							.addComponent(Stop))))
        				.addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
        			.addGap(20)
        			.addComponent(jPanel10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        this.setLayout(layout);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAStartActionPerformed
        sem1.setpanelGreen(jPanelGreen1);
        sem1.setpanelYellow(jPanelYellow1);
        sem1.setpanelRed(jPanelRed1);
        sem1.start();
        sem2.setpanelGreen(jPanelGreen2);
        sem2.setpanelYellow(jPanelYellow2);
        sem2.setpanelRed(jPanelRed2);
        sem2.start();
        sem3.setpanelGreen(jPanelGreen3);
        sem3.setpanelYellow(jPanelYellow3);
        sem3.setpanelRed(jPanelRed3);
        sem3.start();
        sem4.setpanelGreen(jPanelGreen4);
        sem4.setpanelYellow(jPanelYellow4);
        sem4.setpanelRed(jPanelRed4);
        sem4.start(); 
        
        

     
      
    }//GEN-LAST:event_botaoAStartActionPerformed
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAStart;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelGreen1;
    private javax.swing.JPanel jPanelGreen2;
    private javax.swing.JPanel jPanelGreen3;
    private javax.swing.JPanel jPanelGreen4;
    private javax.swing.JPanel jPanelRed1;
    private javax.swing.JPanel jPanelRed2;
    private javax.swing.JPanel jPanelRed3;
    private javax.swing.JPanel jPanelRed4;
    private javax.swing.JPanel jPanelYellow1;
    private javax.swing.JPanel jPanelYellow2;
    private javax.swing.JPanel jPanelYellow3;
    private javax.swing.JPanel jPanelYellow4;
}
