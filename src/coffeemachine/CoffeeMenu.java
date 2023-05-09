package coffeemachine;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public final class CoffeeMenu extends javax.swing.JFrame {

    private Machine machine;
    private DB db;

    public CoffeeMenu() throws SQLException, ClassNotFoundException, WaterException, BeansException, CleanException {
        db = new DB();
        this.machine = new Machine(new DB().Water(), new DB().Beans(), 100, db);
        initComponents();
        setLocationRelativeTo(null);
    }

    public void labeltext() throws SQLException, ClassNotFoundException {
        water.setText("Water:" + String.valueOf(machine.getWater()));
        jLabel2.setText("Beans:" + String.valueOf(machine.getBeans()));
        jLabel5.setText("Clean:" + String.valueOf(machine.getCleaning()));
        
        jTextArea1.setText("Espresso: " + new DB().CountEspresso()
                + "\nEspresso Double: " + new DB().CountEspressoDouble()
                + "\nAmricano: " + new DB().CountAmricano()
                + "\nAmricano Double: " + new DB().CountAmricanoDouble());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSlider1 = new javax.swing.JSlider();
        gggg = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        water = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        add = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Coffee Machine");
        setMinimumSize(new java.awt.Dimension(120, 50));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(420, 420));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 170));

        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setValue(25);
        jSlider1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSlider1.setFocusCycleRoot(true);
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 30, 120));

        gggg.setFont(new java.awt.Font("Tele-Marines", 1, 18)); // NOI18N
        gggg.setText("Grind");
        getContentPane().add(gggg, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Coffee", "Espresso Single", "Espresso Double", "Amricano Single", "Amricano Double", " " }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jButton2.setText("Pur Coffee");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        water.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        water.setForeground(new java.awt.Color(0, 204, 0));
        water.setText("Water: ---");
        getContentPane().add(water, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setText("Beans: ---");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 0));
        jLabel5.setText("clean: ---");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        add.setText("Add");

        jMenuItem1.setText("Add Water");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        add.add(jMenuItem1);

        jMenuItem2.setText("Add Beans");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        add.add(jMenuItem2);

        jMenuItem4.setText("Clean");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        add.add(jMenuItem4);

        jMenuItem5.setText("Close");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        add.add(jMenuItem5);

        jMenuBar1.add(add);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       
            dispose();
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        try {
            machine.clean();
            labeltext();
        } catch (SQLException | ClassNotFoundException ex) {
                    JOptionPane.showConfirmDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        try {
            machine.setBeans(1000);
            labeltext();
        } catch (SQLException | ClassNotFoundException ex) {
                    JOptionPane.showConfirmDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        try {
            machine.setWater(5000);
            labeltext();
        } catch (SQLException | ClassNotFoundException ex) {
                    JOptionPane.showConfirmDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if ("Espresso Single".equals((String) jComboBox1.getSelectedItem())){
            try {
            machine.Water().findWater(30);
            machine.Beans().findBeans(7);
            machine.Clean().findClean(2);
            machine.makeCoffee("Robusta", "Espresso", 7, 30, jSlider1.getValue(), 2);
            
            labeltext();
        } catch (SQLException | ClassNotFoundException | WaterException | BeansException | CleanException ex) {
                    JOptionPane.showConfirmDialog(null, ex.getMessage());
        }
        }
        else if("Espresso Double".equals((String) jComboBox1.getSelectedItem())){
            try {
            machine.Water().findWater(60);
            machine.Beans().findBeans(14);
            machine.Clean().findClean(3);
            machine.makeCoffee("Robusta", "Espresso Double", 14, 60, jSlider1.getValue(), 3);
     
            labeltext();

        } catch (SQLException | ClassNotFoundException | WaterException | BeansException | CleanException ex) {
                    JOptionPane.showConfirmDialog(null, ex.getMessage());
        }
        }
        else if ("Amricano Single".equals((String) jComboBox1.getSelectedItem())){
             try {
            machine.Water().findWater(170);
            machine.Beans().findBeans(7);
            machine.Clean().findClean(2);
            machine.makeCoffee("Robusta", "Amricano", 7, 170, jSlider1.getValue(), 2);
            
            labeltext();
        } catch (SQLException | ClassNotFoundException | WaterException | BeansException | CleanException ex) {
                    JOptionPane.showConfirmDialog(null, ex.getMessage());
        }
        }
        else if ("Amricano Double".equals((String) jComboBox1.getSelectedItem())){
            try {
            machine.Water().findWater(210);
            machine.Beans().findBeans(14);
            machine.Clean().findClean(4);
            machine.makeCoffee("Robusta", "Amricano Double", 14, 210, jSlider1.getValue(), 4);
            //run();
            labeltext();
        } catch (SQLException | ClassNotFoundException | WaterException | BeansException | CleanException ex) {
                    JOptionPane.showConfirmDialog(null, ex.getMessage());
        }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                try {
                    new CoffeeMenu().setVisible(true);
                } catch (WaterException | BeansException | CleanException ex) {
                    JOptionPane.showConfirmDialog(null, ex.getMessage());
                }
            } catch (SQLException | ClassNotFoundException ex) {
                    JOptionPane.showConfirmDialog(null, ex.getMessage());
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu add;
    private javax.swing.JLabel gggg;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel water;
    // End of variables declaration//GEN-END:variables
}
