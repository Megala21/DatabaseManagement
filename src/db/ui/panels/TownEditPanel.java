/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package db.ui.panels;

/**
 *
 * @author Gobinath
 */
public class TownEditPanel extends javax.swing.JPanel {

    /**
     * Creates new form TownEditPanel
     */
    public TownEditPanel() {
        initComponents();
    }

    public void refersh() {
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelScroll = new javax.swing.JScrollPane();
        panelMain = new javax.swing.JPanel();
        panelDetails = new javax.swing.JPanel();
        lblTownID = new javax.swing.JLabel();
        lblTownName = new javax.swing.JLabel();
        lblOvernightStop = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        panelBills = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstBillsLeft = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstBillsRight = new javax.swing.JList();
        panelRouteTowns = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstRouteTowsnLeft = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstRouteTownsRight = new javax.swing.JList();
        panelHotels = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstHotelsLeft = new javax.swing.JList();
        jScrollPane6 = new javax.swing.JScrollPane();
        lstHotelsRight = new javax.swing.JList();
        panelControlls = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        panelDetails.setBorder(javax.swing.BorderFactory.createTitledBorder("Details"));
        panelDetails.setName(""); // NOI18N

        lblTownID.setText("Town ID");

        lblTownName.setText("Town Name");

        lblOvernightStop.setText("Overnight Stop");

        jCheckBox1.setText("Allowed");

        javax.swing.GroupLayout panelDetailsLayout = new javax.swing.GroupLayout(panelDetails);
        panelDetails.setLayout(panelDetailsLayout);
        panelDetailsLayout.setHorizontalGroup(
            panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDetailsLayout.createSequentialGroup()
                        .addComponent(lblTownID)
                        .addGap(73, 73, 73)
                        .addComponent(jTextField1))
                    .addGroup(panelDetailsLayout.createSequentialGroup()
                        .addGroup(panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTownName)
                            .addComponent(lblOvernightStop))
                        .addGap(40, 40, 40)
                        .addGroup(panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDetailsLayout.createSequentialGroup()
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelDetailsLayout.setVerticalGroup(
            panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetailsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTownID)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTownName)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOvernightStop)
                    .addComponent(jCheckBox1)))
        );

        panelBills.setBorder(javax.swing.BorderFactory.createTitledBorder("Bills"));
        panelBills.setName(""); // NOI18N
        panelBills.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        jScrollPane1.setViewportView(lstBillsLeft);

        panelBills.add(jScrollPane1);

        lstBillsRight.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstBillsRight);

        panelBills.add(jScrollPane2);

        panelRouteTowns.setBorder(javax.swing.BorderFactory.createTitledBorder("Route Towns"));
        panelRouteTowns.setName(""); // NOI18N
        panelRouteTowns.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        lstRouteTowsnLeft.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lstRouteTowsnLeft);

        panelRouteTowns.add(jScrollPane3);

        lstRouteTownsRight.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(lstRouteTownsRight);

        panelRouteTowns.add(jScrollPane4);

        panelHotels.setBorder(javax.swing.BorderFactory.createTitledBorder("Hotels"));
        panelHotels.setName(""); // NOI18N
        panelHotels.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        lstHotelsLeft.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(lstHotelsLeft);

        panelHotels.add(jScrollPane5);

        lstHotelsRight.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstHotelsRight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstHotelsRightMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(lstHotelsRight);

        panelHotels.add(jScrollPane6);

        panelControlls.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnReset.setText("Reset");

        btnSave.setText("Save");

        javax.swing.GroupLayout panelControllsLayout = new javax.swing.GroupLayout(panelControlls);
        panelControlls.setLayout(panelControllsLayout);
        panelControllsLayout.setHorizontalGroup(
            panelControllsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelControllsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(18, 18, 18)
                .addComponent(btnReset)
                .addContainerGap())
        );
        panelControllsLayout.setVerticalGroup(
            panelControllsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelControllsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelControllsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnSave))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBills, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRouteTowns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelHotels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelControlls, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(panelDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBills, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRouteTowns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelHotels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelControlls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        panelScroll.setViewportView(panelMain);

        add(panelScroll, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void lstHotelsRightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstHotelsRightMouseClicked
        if(evt.getClickCount()==2) {

        }
    }//GEN-LAST:event_lstHotelsRightMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblOvernightStop;
    private javax.swing.JLabel lblTownID;
    private javax.swing.JLabel lblTownName;
    private javax.swing.JList lstBillsLeft;
    private javax.swing.JList lstBillsRight;
    private javax.swing.JList lstHotelsLeft;
    private javax.swing.JList lstHotelsRight;
    private javax.swing.JList lstRouteTownsRight;
    private javax.swing.JList lstRouteTowsnLeft;
    private javax.swing.JPanel panelBills;
    private javax.swing.JPanel panelControlls;
    private javax.swing.JPanel panelDetails;
    private javax.swing.JPanel panelHotels;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelRouteTowns;
    private javax.swing.JScrollPane panelScroll;
    // End of variables declaration//GEN-END:variables
}
