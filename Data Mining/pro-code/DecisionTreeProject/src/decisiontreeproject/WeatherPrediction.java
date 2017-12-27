package decisiontreeproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class WeatherPrediction extends javax.swing.JFrame {

    public WeatherPrediction() {
        initComponents();
        showtree.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel = new javax.swing.JLabel();
        wind = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        temp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        hum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        press = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        showtree = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel.setText("Wind");

        jButton1.setText("Predict");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Temperature");

        jLabel2.setText("Humidity");

        jLabel3.setText("Pressure");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Weather Forcasting Using Data Mining Techniques ");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel4.setText("(1 to 15)");

        jLabel6.setText("(55 to 100)");

        jLabel7.setText("(50 to 95)");

        jLabel8.setText("(29.50 to 29.99 )");

        showtree.setText("Show Tree");
        showtree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showtreeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(3, 3, 3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1)
                                .addComponent(jLabel3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(press)
                                    .addComponent(hum)
                                    .addComponent(temp)
                                    .addComponent(wind, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jButton2)
                                .addGap(29, 29, 29)
                                .addComponent(showtree))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel5)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel5)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(temp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(hum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(press, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(showtree))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String user_wind = wind.getText();
        String user_temp = temp.getText();
        String user_hum = hum.getText();
        String user_press = press.getText();
        //String totRecord = user_wind + " " + user_temp + " " + user_hum + " " + user_press + " ";
        String totRecord = user_temp + " " + user_wind + " " + user_press + " " + user_hum + " ";


        ArrayList rainal = new ArrayList();
        ArrayList rain_thunderstormal = new ArrayList();
        ArrayList fogal = new ArrayList();
        ArrayList hazeal = new ArrayList();
        ArrayList haze_mistal = new ArrayList();
        ArrayList thcal = new ArrayList();
        ArrayList rcal = new ArrayList();
        ArrayList fcal = new ArrayList();
        ArrayList hcal = new ArrayList();
        ArrayList hmcal = new ArrayList();

        ArrayList dataset = new ArrayList();
        ArrayList datasetTokens = new ArrayList();

        try {
            BufferedReader br = new BufferedReader(new FileReader("c:\\wdata.txt"));
            String temp = "";

            while ((temp = br.readLine()) != null) {
                dataset.add(temp);
                StringTokenizer st = new StringTokenizer(temp, " ");
                while (st.hasMoreTokens()) {
                    datasetTokens.add(st.nextToken());
                }
                char c = temp.charAt(temp.length() - 1);
                if (c == 'm') {
                    thcal.add(temp);
                    StringTokenizer str = new StringTokenizer(temp, " ");
                    while (str.hasMoreTokens()) {
                        rain_thunderstormal.add(str.nextToken());
                    }
                } else if (c == 'n') {
                    rcal.add(temp);
                    StringTokenizer str = new StringTokenizer(temp, " ");
                    while (str.hasMoreTokens()) {
                        rainal.add(str.nextToken());
                    }
                } else if (c == 'g') {
                    fcal.add(temp);
                    StringTokenizer str = new StringTokenizer(temp, " ");
                    while (str.hasMoreTokens()) {
                        fogal.add(str.nextToken());
                    }
                } else if (c == 'e') {
                    hcal.add(temp);
                    StringTokenizer str = new StringTokenizer(temp, " ");
                    while (str.hasMoreTokens()) {
                        hazeal.add(str.nextToken());
                    }
                } else if (c == 't') {
                    hmcal.add(temp);
                    StringTokenizer str = new StringTokenizer(temp, " ");
                    while (str.hasMoreTokens()) {
                        haze_mistal.add(str.nextToken());
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

//matching 4 records
        if (datasetTokens.contains(user_wind)) {
            int index = datasetTokens.indexOf(user_wind);
            String temperature = (String) datasetTokens.get(index - 1);
            if (datasetTokens.contains(temperature)) {
                String pressure = (String) datasetTokens.get(index + 1);
                if (datasetTokens.contains(pressure)) {
                    String humidity = (String) datasetTokens.get(index + 2);
                    if (datasetTokens.contains(humidity)) {
                        String class_label = (String) datasetTokens.get(index + 3);
                        JOptionPane.showMessageDialog(null, "Predicted Weather:\n " + class_label);
                        showtree.setVisible(false);
                    }
                }
            }
        } else if (datasetTokens.contains(user_wind)) {
            int index = datasetTokens.indexOf(user_wind);
            String temperature = (String) datasetTokens.get(index - 1);
            if (datasetTokens.contains(temperature)) {
                String pressure = (String) datasetTokens.get(index + 1);
                if (datasetTokens.contains(pressure)) {
                    String humidity = (String) datasetTokens.get(index + 2);
                    String class_label = (String) datasetTokens.get(index + 3);
                    JOptionPane.showMessageDialog(null, "Predicted Weather:\n " + class_label);
                    showtree.setVisible(false);
                }
            }
        } else if (datasetTokens.contains(user_wind)) {
            int index = datasetTokens.indexOf(user_wind);
            String temperature = (String) datasetTokens.get(index - 1);
            if (datasetTokens.contains(temperature)) {
                String pressure = (String) datasetTokens.get(index + 1);
                String class_label = (String) datasetTokens.get(index + 3);
                JOptionPane.showMessageDialog(null, "Predicted Weather:\n " + class_label);
                showtree.setVisible(false);
            }
        } else if (datasetTokens.contains(user_wind)) {
            int index = datasetTokens.indexOf(user_wind);
            String class_label = (String) datasetTokens.get(index + 3);
            JOptionPane.showMessageDialog(null,"Predicted Weather:\n " + class_label);
            showtree.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Can't be Predicted (Dataset Not Found)");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        wind.setText("");
        temp.setText("");
        hum.setText("");
        press.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void showtreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showtreeActionPerformed
        // TODO add your handling code here:

        

    }//GEN-LAST:event_showtreeActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new WeatherPrediction().setVisible(true);
      }
        });
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField hum;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField press;
    private javax.swing.JButton showtree;
    private javax.swing.JTextField temp;
    private javax.swing.JTextField wind;
    // End of variables declaration//GEN-END:variables
}
