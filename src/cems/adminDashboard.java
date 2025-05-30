/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cems;

import java.awt.Component;
import java.awt.Font;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author PC
 */
public class adminDashboard extends javax.swing.JFrame {
    
    /**
     * Creates new form Organizer_Dashboard_Admin
     */
    public adminDashboard() {
        initComponents();
        cems.GlobalMemoryManager.registerFrame(this);
        
        FontLoader.applyFontToLabel(jLabel1, "/fonts/ROCKB.TTF", 48f, Font.PLAIN, true);
        FontLoader.applyFontToLabel(jLabel2, "/fonts/ROCKI.TTF", 24f, Font.PLAIN, true);
        
        FontLoader.applyFontToButton(organizer_new, "/fonts/ReemKufi-Regular.ttf", 12f, Font.BOLD);
        FontLoader.applyFontToButton(organizer_edit, "/fonts/ReemKufi-Regular.ttf", 12f, Font.BOLD);
        FontLoader.applyFontToButton(organizer_delete, "/fonts/ReemKufi-Regular.ttf", 12f, Font.BOLD);
        FontLoader.applyFontToButton(organizer_viewusers, "/fonts/ReemKufi-Regular.ttf", 12f, Font.BOLD);
        FontLoader.applyFontToButton(logout, "/fonts/ReemKufi-Regular.ttf", 12f, Font.BOLD);

        // clean jtable
        if (eventTable instanceof CleanJTable) {
            ((CleanJTable) eventTable).setEmptyBackgroundColor("3366FF");
            CleanJTable.decorateScrollPane(jScrollPane1);
        }
        
        loadEventsToAdminTable();
        sortDefault();
        
        eventTable.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                                                           boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (value != null) {
                    setToolTipText(value.toString());  // Show cell content as tooltip
                } else {
                    setToolTipText(null);
                }
                return c;
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DBlue_panel = new javax.swing.JPanel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        eventTable = new cems.CleanJTable()
        ;
        organizer_new = new com.k33ptoo.components.KButton();
        organizer_edit = new com.k33ptoo.components.KButton();
        organizer_delete = new com.k33ptoo.components.KButton();
        organizer_viewusers = new com.k33ptoo.components.KButton();
        logout = new com.k33ptoo.components.KButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DBlue_panel.setBackground(new java.awt.Color(0, 0, 51));
        DBlue_panel.setForeground(new java.awt.Color(0, 0, 0));

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 51));
        kGradientPanel1.setkGradientFocus(1000);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 0, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BISU Campus Event Manager");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Event Organizer Dashboard");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE))
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        kGradientPanel2.setkBorderRadius(0);
        kGradientPanel2.setkEndColor(new java.awt.Color(51, 102, 255));
        kGradientPanel2.setkGradientFocus(0);
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 0, 51));

        jScrollPane1.setOpaque(false);

        eventTable.setAutoCreateRowSorter(true);
        eventTable.setBackground(new java.awt.Color(0, 0, 51));
        eventTable.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        eventTable.setForeground(new java.awt.Color(255, 255, 255));
        eventTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No.", "Events", "Event Type", "Location", "Start Time", "End Time", "Participants"
            }
        ));
        eventTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eventTable.setFocusable(false);
        eventTable.setOpaque(false);
        eventTable.setRowHeight(30);
        eventTable.setSelectionBackground(new java.awt.Color(51, 102, 255));
        eventTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        eventTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eventTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(eventTable);

        organizer_new.setText("New Event");
        organizer_new.setkEndColor(new java.awt.Color(30, 153, 0));
        organizer_new.setkHoverEndColor(new java.awt.Color(15, 76, 0));
        organizer_new.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        organizer_new.setkHoverStartColor(new java.awt.Color(30, 153, 0));
        organizer_new.setkPressedColor(new java.awt.Color(30, 153, 0));
        organizer_new.setkStartColor(new java.awt.Color(0, 76, 0));
        organizer_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizer_newActionPerformed(evt);
            }
        });

        organizer_edit.setText("Edit Event");
        organizer_edit.setkEndColor(new java.awt.Color(30, 153, 0));
        organizer_edit.setkHoverEndColor(new java.awt.Color(15, 76, 0));
        organizer_edit.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        organizer_edit.setkHoverStartColor(new java.awt.Color(30, 153, 0));
        organizer_edit.setkPressedColor(new java.awt.Color(30, 153, 0));
        organizer_edit.setkStartColor(new java.awt.Color(0, 76, 0));
        organizer_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizer_editActionPerformed(evt);
            }
        });

        organizer_delete.setText("Delete Event");
        organizer_delete.setkEndColor(new java.awt.Color(153, 0, 0));
        organizer_delete.setkHoverEndColor(new java.awt.Color(76, 0, 0));
        organizer_delete.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        organizer_delete.setkHoverStartColor(new java.awt.Color(153, 0, 0));
        organizer_delete.setkPressedColor(new java.awt.Color(153, 0, 0));
        organizer_delete.setkStartColor(new java.awt.Color(76, 0, 0));
        organizer_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizer_deleteActionPerformed(evt);
            }
        });

        organizer_viewusers.setText("View Registered Users");
        organizer_viewusers.setkEndColor(new java.awt.Color(153, 153, 0));
        organizer_viewusers.setkHoverEndColor(new java.awt.Color(76, 76, 0));
        organizer_viewusers.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        organizer_viewusers.setkHoverStartColor(new java.awt.Color(153, 153, 0));
        organizer_viewusers.setkPressedColor(new java.awt.Color(153, 153, 0));
        organizer_viewusers.setkStartColor(new java.awt.Color(76, 76, 0));
        organizer_viewusers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizer_viewusersActionPerformed(evt);
            }
        });

        logout.setText("Logout");
        logout.setkEndColor(new java.awt.Color(153, 0, 0));
        logout.setkHoverEndColor(new java.awt.Color(76, 0, 0));
        logout.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        logout.setkHoverStartColor(new java.awt.Color(153, 0, 0));
        logout.setkPressedColor(new java.awt.Color(153, 0, 0));
        logout.setkStartColor(new java.awt.Color(76, 0, 0));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jLabel3.setText("Tip: Click on the column headers to sort.");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(organizer_edit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(organizer_delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(organizer_viewusers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(organizer_new, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(organizer_new, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(organizer_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(organizer_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(organizer_viewusers, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(19, 19, 19))))
        );

        javax.swing.GroupLayout DBlue_panelLayout = new javax.swing.GroupLayout(DBlue_panel);
        DBlue_panel.setLayout(DBlue_panelLayout);
        DBlue_panelLayout.setHorizontalGroup(
            DBlue_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DBlue_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DBlue_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        DBlue_panelLayout.setVerticalGroup(
            DBlue_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DBlue_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(DBlue_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void eventTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventTableMousePressed
        // Disables click editing
        if (evt.getClickCount() > 1) {
            int row = eventTable.rowAtPoint(evt.getPoint());
            int column = eventTable.columnAtPoint(evt.getPoint());
            
            // Cancel the editing on double-click
            eventTable.getCellEditor(row, column).stopCellEditing();
        }
    }//GEN-LAST:event_eventTableMousePressed

    private void organizer_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizer_newActionPerformed
        createEvent event = new createEvent();
        this.setEnabled(false);

        event.setVisible(true);

        // When the new window is closed, enable the parent window again
        event.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                setEnabled(true);  // Re-enable the parent window when the new window is closed
                setVisible(true);
                loadEventsToAdminTable();
                sortDefault();
            }
        });
    }//GEN-LAST:event_organizer_newActionPerformed

    private void organizer_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizer_editActionPerformed
        int selectedRow = eventTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select an event to edit.");
            return;
        }

        try {
            // Get event details from the selected row in the table
            int eventNo = Integer.parseInt(eventTable.getValueAt(selectedRow, 0).toString());
            String title = eventTable.getValueAt(selectedRow, 1).toString();
            String type = eventTable.getValueAt(selectedRow, 2).toString();
            String location = eventTable.getValueAt(selectedRow, 3).toString();

            // Get the merged datetime strings from the table
            String dateTimeStartStr = eventTable.getValueAt(selectedRow, 4).toString(); // format: yyyy-MM-dd HH:mm:ss
            String dateTimeEndStr = eventTable.getValueAt(selectedRow, 5).toString();

            // Define the date/time format used in the table (you can adjust if needed)
            SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy hh:mm a");

            // Parse the datetime strings into java.util.Date objects
            java.util.Date utilStart = sdf.parse(dateTimeStartStr);
            java.util.Date utilEnd = sdf.parse(dateTimeEndStr);

            // Convert to java.sql.Date and java.sql.Time for database compatibility
            java.sql.Date sqlDateStart = new java.sql.Date(utilStart.getTime());
            java.sql.Time sqlTimeStart = new java.sql.Time(utilStart.getTime());
            java.sql.Date sqlDateEnd = new java.sql.Date(utilEnd.getTime());
            java.sql.Time sqlTimeEnd = new java.sql.Time(utilEnd.getTime());

            // Create an EditEventData object to pass to the editEvent form
            EditEventData data = new EditEventData(eventNo, title, type, location, sqlDateStart, sqlTimeStart, sqlDateEnd, sqlTimeEnd);

            // Create and display the editEvent form, passing the data for editing
            editEvent event = new editEvent(this, data);

            // Disable the parent window while editing
            this.setEnabled(false);

            // Show the editEvent form
            event.setVisible(true);

            // Add a window listener to re-enable the parent window and refresh the event list after closing the edit form
            event.addWindowListener(new java.awt.event.WindowAdapter() {
                public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                    setEnabled(true);  // Re-enable the parent window when the new window is closed
                    setVisible(true);
                    loadEventsToAdminTable();  // Reload events to the admin table
                    sortDefault();             // Optionally, you can sort the table here as well
                }
            });

        } catch (ParseException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to parse date/time data.");
        }
    }//GEN-LAST:event_organizer_editActionPerformed

    private void organizer_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizer_deleteActionPerformed
        int selectedRow = eventTable.getSelectedRow();
        if (selectedRow != -1) {
            // Get the event_no from the selected row (assuming event_no is in column 0)
            int eventNo = (int) eventTable.getValueAt(selectedRow, 0);

            int confirm = JOptionPane.showConfirmDialog(null,
                    "Are you sure you want to delete this event?",
                    "Confirm Deletion", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                boolean deleted = DBHelper.deleteEvent(eventNo);
                if (deleted) {
                    JOptionPane.showMessageDialog(null, "Event deleted successfully.");
                    loadEventsToAdminTable(); // Reload the updated table
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to delete event.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select an event to delete.");
        }
    }//GEN-LAST:event_organizer_deleteActionPerformed

    private void organizer_viewusersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizer_viewusersActionPerformed
        new usersDashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_organizer_viewusersActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void loadEventsToAdminTable() {
        ResultSet rs = DBHelper.getAllEvents();
        DefaultTableModel model = (DefaultTableModel) eventTable.getModel();
        model.setRowCount(0);

        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy hh:mm a");
        
        try {
            while (rs.next()) {
                Timestamp start = rs.getTimestamp("date_start");
                Timestamp end = rs.getTimestamp("date_end");

                String formattedStart = formatter.format(start);
                String formattedEnd = formatter.format(end);
                
                Object[] row = {
                    rs.getInt("event_no"),
                    rs.getString("event_name"),
                    rs.getString("event_type"),
                    rs.getString("location"),
                    formattedStart,
                    formattedEnd,
                    rs.getString("participants")
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void sortDefault() {
        DefaultTableModel model = (DefaultTableModel) eventTable.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        eventTable.setRowSorter(sorter);

        // Sort by event date column (index 4)
        sorter.setSortKeys(Arrays.asList(
            new RowSorter.SortKey(0, SortOrder.ASCENDING)
        ));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DBlue_panel;
    private javax.swing.JTable eventTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private com.k33ptoo.components.KButton logout;
    private com.k33ptoo.components.KButton organizer_delete;
    private com.k33ptoo.components.KButton organizer_edit;
    private com.k33ptoo.components.KButton organizer_new;
    private com.k33ptoo.components.KButton organizer_viewusers;
    // End of variables declaration//GEN-END:variables
}
