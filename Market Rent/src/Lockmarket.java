
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author theerapol
 */
public class Lockmarket extends javax.swing.JFrame {

    private String selectedLockID;
    private ArrayList<String> selectedLocks = new ArrayList<>();
    private String currentUserID;

    public Lockmarket() {
        initComponents();
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // รูปแบบวันที่
        String formattedDate = currentDate.format(formatter);
        Lock1.setBackground(new Color(242, 242, 242));
        Lock2.setBackground(new Color(242, 242, 242));
        Lock3.setBackground(new Color(242, 242, 242));
        Lock4.setBackground(new Color(242, 242, 242));
        Lock5.setBackground(new Color(242, 242, 242));
        Lock6.setBackground(new Color(242, 242, 242));
        Lock7.setBackground(new Color(242, 242, 242));
        Lock8.setBackground(new Color(242, 242, 242));
        Lock9.setBackground(new Color(242, 242, 242));
        Lock10.setBackground(new Color(242, 242, 242));
        Lock11.setBackground(new Color(242, 242, 242));
        Lock12.setBackground(new Color(242, 242, 242));
        Lock13.setBackground(new Color(242, 242, 242));
        Lock14.setBackground(new Color(242, 242, 242));
        Lock15.setBackground(new Color(242, 242, 242));
        Lock16.setBackground(new Color(242, 242, 242));
        Lock17.setBackground(new Color(242, 242, 242));

       

    }
    
    String Producttype1;
    String Detail1;

    public Lockmarket(String Producttype, String Detail, String userID) {
        initComponents();
        setLocationRelativeTo(null);
        this.currentUserID = userID;
        Producttype1 = Producttype;
        Detail1 = Detail;
        currentUserID = userID;

        System.out.println("UserID in Lockmarket: " + currentUserID);
        System.out.println(Producttype1 + ";;;;");
        System.out.println(Detail1 + ";;;;;;;;;;;;;");

        Lock1.setBackground(new Color(242, 242, 242));
        Lock2.setBackground(new Color(242, 242, 242));
        Lock3.setBackground(new Color(242, 242, 242));
        Lock4.setBackground(new Color(242, 242, 242));
        Lock5.setBackground(new Color(242, 242, 242));
        Lock6.setBackground(new Color(242, 242, 242));
        Lock7.setBackground(new Color(242, 242, 242));
        Lock8.setBackground(new Color(242, 242, 242));
        Lock9.setBackground(new Color(242, 242, 242));
        Lock10.setBackground(new Color(242, 242, 242));
        Lock11.setBackground(new Color(242, 242, 242));
        Lock12.setBackground(new Color(242, 242, 242));
        Lock13.setBackground(new Color(242, 242, 242));
        Lock14.setBackground(new Color(242, 242, 242));
        Lock15.setBackground(new Color(242, 242, 242));
        Lock16.setBackground(new Color(242, 242, 242));
        Lock17.setBackground(new Color(242, 242, 242));
        
        checkIfAnyLockBooked();

    }

    public void checkIfAnyLockBooked() {
        String databaseURL = "jdbc:ucanaccess://C:\\Users\\tmgam\\Desktop\\ProjectKKNew\\reservation.accdb";

        String checkSQL = "SELECT LockID FROM LockReservations WHERE Status = true"; // ค้นหา LockID ที่ Status เป็น true

        try (Connection conn = DriverManager.getConnection(databaseURL); PreparedStatement checkStmt = conn.prepareStatement(checkSQL); ResultSet rs = checkStmt.executeQuery()) {

            StringBuilder bookedLocks = new StringBuilder("The following locks are already booked:\n");

            String lockID = null;
            boolean anyBooked = false;
            while (rs.next()) {
                anyBooked = true;
                lockID = rs.getString("LockID");
                bookedLocks.append("- ").append(lockID).append("\n");

                if (anyBooked) {

                    if (lockID.equals("Lock1")) {
                        Lock1.setBackground(Color.BLACK);
                        Lock1.setEnabled(false);
                    } else if (lockID.equals("Lock2")) {
                        Lock2.setBackground(Color.BLACK);
                        Lock2.setEnabled(false);
                    } else if (lockID.equals("Lock3")) {
                        Lock3.setBackground(Color.BLACK);
                        Lock3.setEnabled(false);
                    } else if (lockID.equals("Lock4")) {
                        Lock4.setBackground(Color.BLACK);
                        Lock4.setEnabled(false);
                    } else if (lockID.equals("Lock5")) {
                        Lock5.setBackground(Color.BLACK);
                        Lock5.setEnabled(false);
                    } else if (lockID.equals("Lock6")) {
                        Lock6.setBackground(Color.BLACK);
                        Lock6.setEnabled(false);
                    } else if (lockID.equals("Lock7")) {
                        Lock7.setBackground(Color.BLACK);
                        Lock7.setEnabled(false);
                    } else if (lockID.equals("Lock8")) {
                        Lock8.setBackground(Color.BLACK);
                        Lock8.setEnabled(false);
                    } else if (lockID.equals("Lock9")) {
                        Lock9.setBackground(Color.BLACK);
                        Lock9.setEnabled(false);
                    } else if (lockID.equals("Lock10")) {
                        Lock10.setBackground(Color.BLACK);
                        Lock10.setEnabled(false);
                    } else if (lockID.equals("Lock11")) {
                        Lock11.setBackground(Color.BLACK);
                        Lock11.setEnabled(false);
                    } else if (lockID.equals("Lock12")) {
                        Lock12.setBackground(Color.BLACK);
                        Lock12.setEnabled(false);
                    } else if (lockID.equals("Lock13")) {
                        Lock13.setBackground(Color.BLACK);
                        Lock13.setEnabled(false);
                    } else if (lockID.equals("Lock14")) {
                        Lock14.setBackground(Color.BLACK);
                        Lock14.setEnabled(false);
                    } else if (lockID.equals("Lock15")) {
                        Lock15.setBackground(Color.BLACK);
                        Lock15.setEnabled(false);
                    } else if (lockID.equals("Lock16")) {
                        Lock16.setBackground(Color.BLACK);
                        Lock16.setEnabled(false);
                    } else if (lockID.equals("Lock17")) {
                        Lock17.setBackground(Color.BLACK);
                        Lock17.setEnabled(false);
                    } 

//                    JOptionPane.showMessageDialog(null, bookedLocks.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "No locks are currently booked.");
                }

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }

    public boolean isLockBooked(String lockID) {
        boolean isBooked = false;
        String databaseURL = "jdbc:ucanaccess://C:\\Users\\tmgam\\Desktop\\ProjectKKNew\\reservation.accdb";

        String checkSQL = "SELECT Status FROM LockReservations WHERE LockID = ?";
        try (Connection conn = DriverManager.getConnection(databaseURL); PreparedStatement checkStmt = conn.prepareStatement(checkSQL)) {

            checkStmt.setString(1, lockID);
            ResultSet rs = checkStmt.executeQuery(); 

            if (rs.next()) {
                // ถ้ามีผลลัพธ์ ให้ตรวจสอบค่าของ Status
                isBooked = rs.getBoolean("Status"); // สมมติ Status เป็นชนิด boolean
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }

        return isBooked;
    }

    public static void main(String[] args) {
        JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        ImageIcon icon = new ImageIcon("/pic/Market.jpg");
        Image img = icon.getImage();
        Image resizedImg = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImg);

        label.setIcon(resizedIcon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Lock1 = new javax.swing.JPanel();
        Lock3 = new javax.swing.JPanel();
        Lock4 = new javax.swing.JPanel();
        Lock7 = new javax.swing.JPanel();
        Lock6 = new javax.swing.JPanel();
        Lock5 = new javax.swing.JPanel();
        Lock8 = new javax.swing.JPanel();
        Lock2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Lock9 = new javax.swing.JPanel();
        Lock10 = new javax.swing.JPanel();
        Lock11 = new javax.swing.JPanel();
        Lock12 = new javax.swing.JPanel();
        Lock13 = new javax.swing.JPanel();
        Lock14 = new javax.swing.JPanel();
        Lock15 = new javax.swing.JPanel();
        Lock16 = new javax.swing.JPanel();
        Lock17 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lock1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lock1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Lock1Layout = new javax.swing.GroupLayout(Lock1);
        Lock1.setLayout(Lock1Layout);
        Lock1Layout.setHorizontalGroup(
            Lock1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        Lock1Layout.setVerticalGroup(
            Lock1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(Lock1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 140, -1));

        Lock3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lock3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Lock3Layout = new javax.swing.GroupLayout(Lock3);
        Lock3.setLayout(Lock3Layout);
        Lock3Layout.setHorizontalGroup(
            Lock3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        Lock3Layout.setVerticalGroup(
            Lock3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(Lock3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 140, -1));

        Lock4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lock4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Lock4Layout = new javax.swing.GroupLayout(Lock4);
        Lock4.setLayout(Lock4Layout);
        Lock4Layout.setHorizontalGroup(
            Lock4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        Lock4Layout.setVerticalGroup(
            Lock4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(Lock4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 150, 100));

        Lock7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lock7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Lock7Layout = new javax.swing.GroupLayout(Lock7);
        Lock7.setLayout(Lock7Layout);
        Lock7Layout.setHorizontalGroup(
            Lock7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Lock7Layout.setVerticalGroup(
            Lock7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jPanel1.add(Lock7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        Lock6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lock6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Lock6Layout = new javax.swing.GroupLayout(Lock6);
        Lock6.setLayout(Lock6Layout);
        Lock6Layout.setHorizontalGroup(
            Lock6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Lock6Layout.setVerticalGroup(
            Lock6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jPanel1.add(Lock6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        Lock5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lock5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Lock5Layout = new javax.swing.GroupLayout(Lock5);
        Lock5.setLayout(Lock5Layout);
        Lock5Layout.setHorizontalGroup(
            Lock5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        Lock5Layout.setVerticalGroup(
            Lock5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(Lock5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 150, 100));

        Lock8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lock8MouseClicked(evt);
            }
        });
        Lock8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Lock8KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout Lock8Layout = new javax.swing.GroupLayout(Lock8);
        Lock8.setLayout(Lock8Layout);
        Lock8Layout.setHorizontalGroup(
            Lock8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Lock8Layout.setVerticalGroup(
            Lock8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jPanel1.add(Lock8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        Lock2.setForeground(new java.awt.Color(242, 242, 242));
        Lock2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lock2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Lock2Layout = new javax.swing.GroupLayout(Lock2);
        Lock2.setLayout(Lock2Layout);
        Lock2Layout.setHorizontalGroup(
            Lock2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        Lock2Layout.setVerticalGroup(
            Lock2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(Lock2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 140, -1));

        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 640, -1, 50));

        Lock9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lock9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Lock9Layout = new javax.swing.GroupLayout(Lock9);
        Lock9.setLayout(Lock9Layout);
        Lock9Layout.setHorizontalGroup(
            Lock9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Lock9Layout.setVerticalGroup(
            Lock9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanel1.add(Lock9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 100, 130));

        Lock10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lock10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Lock10Layout = new javax.swing.GroupLayout(Lock10);
        Lock10.setLayout(Lock10Layout);
        Lock10Layout.setHorizontalGroup(
            Lock10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Lock10Layout.setVerticalGroup(
            Lock10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanel1.add(Lock10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, -1));

        Lock11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lock11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Lock11Layout = new javax.swing.GroupLayout(Lock11);
        Lock11.setLayout(Lock11Layout);
        Lock11Layout.setHorizontalGroup(
            Lock11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Lock11Layout.setVerticalGroup(
            Lock11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanel1.add(Lock11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, -1, -1));

        Lock12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lock12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Lock12Layout = new javax.swing.GroupLayout(Lock12);
        Lock12.setLayout(Lock12Layout);
        Lock12Layout.setHorizontalGroup(
            Lock12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Lock12Layout.setVerticalGroup(
            Lock12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanel1.add(Lock12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, -1, -1));

        Lock13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lock13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Lock13Layout = new javax.swing.GroupLayout(Lock13);
        Lock13.setLayout(Lock13Layout);
        Lock13Layout.setHorizontalGroup(
            Lock13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Lock13Layout.setVerticalGroup(
            Lock13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanel1.add(Lock13, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, -1, -1));

        Lock14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lock14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Lock14Layout = new javax.swing.GroupLayout(Lock14);
        Lock14.setLayout(Lock14Layout);
        Lock14Layout.setHorizontalGroup(
            Lock14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Lock14Layout.setVerticalGroup(
            Lock14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanel1.add(Lock14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, -1, -1));

        Lock15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lock15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Lock15Layout = new javax.swing.GroupLayout(Lock15);
        Lock15.setLayout(Lock15Layout);
        Lock15Layout.setHorizontalGroup(
            Lock15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Lock15Layout.setVerticalGroup(
            Lock15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanel1.add(Lock15, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, -1, -1));

        Lock16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lock16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Lock16Layout = new javax.swing.GroupLayout(Lock16);
        Lock16.setLayout(Lock16Layout);
        Lock16Layout.setHorizontalGroup(
            Lock16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Lock16Layout.setVerticalGroup(
            Lock16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanel1.add(Lock16, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 530, -1, -1));

        Lock17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lock17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Lock17Layout = new javax.swing.GroupLayout(Lock17);
        Lock17.setLayout(Lock17Layout);
        Lock17Layout.setHorizontalGroup(
            Lock17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Lock17Layout.setVerticalGroup(
            Lock17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanel1.add(Lock17, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 530, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel1MouseClicked

    private void Lock1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lock1MouseClicked
        String lockID = "Lock1"; // ID สำหรับพื้นที่นี้  
        if (Lock1.getBackground().getRGB() == new Color(242, 242, 242).getRGB()) {
            Lock1.setBackground(Color.RED);
            selectedLocks.add(lockID); // เพิ่ม Lock ที่เลือก
        } else {
            Lock1.setBackground(new Color(242, 242, 242));
            selectedLocks.remove(lockID); // ลบ Lock ที่ไม่ได้เลือก
        }
    }//GEN-LAST:event_Lock1MouseClicked

    private void Lock2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lock2MouseClicked
        String lockID = "Lock2";
        if (Lock2.getBackground().getRGB() == new Color(242, 242, 242).getRGB()) {
            Lock2.setBackground(java.awt.Color.RED);
            selectedLocks.add(lockID);
        } else {
            Lock2.setBackground(new Color(242, 242, 242));
            selectedLocks.remove(lockID);
        }
    }//GEN-LAST:event_Lock2MouseClicked

    private void Lock3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lock3MouseClicked
        // TODO add your handling code here:
        String lockID = "Lock3";
        if (Lock3.getBackground().getRGB() == new Color(242, 242, 242).getRGB()) {
            Lock3.setBackground(java.awt.Color.RED);
            selectedLocks.add(lockID);
        } else {
            Lock3.setBackground(new Color(242, 242, 242));
            selectedLocks.remove(lockID);
        }
    }//GEN-LAST:event_Lock3MouseClicked

    private void Lock4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lock4MouseClicked
        // TODO add your handling code here:
        String lockID = "Lock4";
        if (Lock4.getBackground().getRGB() == new Color(242, 242, 242).getRGB()) {
            Lock4.setBackground(java.awt.Color.RED);
            selectedLocks.add(lockID);
        } else {
            Lock4.setBackground(new Color(242, 242, 242));
            selectedLocks.remove(lockID);
        }
    }//GEN-LAST:event_Lock4MouseClicked

    private void Lock5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lock5MouseClicked
        // TODO add your handling code here:
        String lockID = "Lock5";
        if (Lock5.getBackground().getRGB() == new Color(242, 242, 242).getRGB()) {
            Lock5.setBackground(java.awt.Color.RED);
            selectedLocks.add(lockID);
        } else {
            Lock5.setBackground(new Color(242, 242, 242));
            selectedLocks.remove(lockID);
        }
    }//GEN-LAST:event_Lock5MouseClicked

    private void Lock6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lock6MouseClicked
        // TODO add your handling code here:
        String lockID = "Lock6";
        if (Lock6.getBackground().getRGB() == new Color(242, 242, 242).getRGB()) {
            Lock6.setBackground(java.awt.Color.RED);
            selectedLocks.add(lockID);
        } else {
            Lock6.setBackground(new Color(242, 242, 242));
            selectedLocks.remove(lockID);
        }
    }//GEN-LAST:event_Lock6MouseClicked

    private void Lock7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lock7MouseClicked
        // TODO add your handling code here:
        String lockID = "Lock7";
        if (Lock7.getBackground().getRGB() == new Color(242, 242, 242).getRGB()) {
            Lock7.setBackground(java.awt.Color.RED);
            selectedLocks.add(lockID);
        } else {
            Lock7.setBackground(new Color(242, 242, 242));
            selectedLocks.remove(lockID);
        }
    }//GEN-LAST:event_Lock7MouseClicked

    private void Lock8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Lock8KeyPressed
        // TODO add your handling code here
    }//GEN-LAST:event_Lock8KeyPressed

    private void Lock8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lock8MouseClicked
        // TODO add your handling code here:
        String lockID = "Lock8";
        if (Lock8.getBackground().getRGB() == new Color(242, 242, 242).getRGB()) {
            Lock8.setBackground(java.awt.Color.RED);
            selectedLocks.add(lockID);
        } else {
            Lock8.setBackground(new Color(242, 242, 242));
            selectedLocks.remove(lockID);
        }
    }//GEN-LAST:event_Lock8MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if (selectedLocks.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select at least one lock.");
        return;
    }
    if (Producttype1 == null || Detail1 == null || currentUserID == null) {
        JOptionPane.showMessageDialog(this, "Incomplete data. Please try again.");
        return;
    }
    Bill billPage = new Bill(selectedLocks, Producttype1, Detail1, currentUserID);
    billPage.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Lock9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lock9MouseClicked
        // TODO add your handling code here:
         String lockID = "Lock9";
        if (Lock9.getBackground().getRGB() == new Color(242, 242, 242).getRGB()) {
            Lock9.setBackground(java.awt.Color.RED);
            selectedLocks.add(lockID);
        } else {
            Lock9.setBackground(new Color(242, 242, 242));
            selectedLocks.remove(lockID);
        }
    }//GEN-LAST:event_Lock9MouseClicked

    private void Lock10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lock10MouseClicked
        // TODO add your handling code here:
         String lockID = "Lock10";
        if (Lock10.getBackground().getRGB() == new Color(242, 242, 242).getRGB()) {
            Lock10.setBackground(java.awt.Color.RED);
            selectedLocks.add(lockID);
        } else {
            Lock10.setBackground(new Color(242, 242, 242));
            selectedLocks.remove(lockID);
        }
    }//GEN-LAST:event_Lock10MouseClicked

    private void Lock11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lock11MouseClicked
        // TODO add your handling code here:
         String lockID = "Lock11";
        if (Lock11.getBackground().getRGB() == new Color(242, 242, 242).getRGB()) {
            Lock11.setBackground(java.awt.Color.RED);
            selectedLocks.add(lockID);
        } else {
            Lock11.setBackground(new Color(242, 242, 242));
            selectedLocks.remove(lockID);
        }
    }//GEN-LAST:event_Lock11MouseClicked

    private void Lock12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lock12MouseClicked
        // TODO add your handling code here:
         String lockID = "Lock12";
        if (Lock12.getBackground().getRGB() == new Color(242, 242, 242).getRGB()) {
            Lock12.setBackground(java.awt.Color.RED);
            selectedLocks.add(lockID);
        } else {
            Lock12.setBackground(new Color(242, 242, 242));
            selectedLocks.remove(lockID);
        }
    }//GEN-LAST:event_Lock12MouseClicked

    private void Lock13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lock13MouseClicked
        // TODO add your handling code here:
         String lockID = "Lock13";
        if (Lock13.getBackground().getRGB() == new Color(242, 242, 242).getRGB()) {
            Lock13.setBackground(java.awt.Color.RED);
            selectedLocks.add(lockID);
        } else {
            Lock13.setBackground(new Color(242, 242, 242));
            selectedLocks.remove(lockID);
        }
    }//GEN-LAST:event_Lock13MouseClicked

    private void Lock14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lock14MouseClicked
        // TODO add your handling code here:
         String lockID = "Lock14";
        if (Lock14.getBackground().getRGB() == new Color(242, 242, 242).getRGB()) {
            Lock14.setBackground(java.awt.Color.RED);
            selectedLocks.add(lockID);
        } else {
            Lock14.setBackground(new Color(242, 242, 242));
            selectedLocks.remove(lockID);
        }
    }//GEN-LAST:event_Lock14MouseClicked

    private void Lock15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lock15MouseClicked
        // TODO add your handling code here:
         String lockID = "Lock15";
        if (Lock15.getBackground().getRGB() == new Color(242, 242, 242).getRGB()) {
            Lock15.setBackground(java.awt.Color.RED);
            selectedLocks.add(lockID);
        } else {
            Lock15.setBackground(new Color(242, 242, 242));
            selectedLocks.remove(lockID);
        }
    }//GEN-LAST:event_Lock15MouseClicked

    private void Lock16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lock16MouseClicked
        // TODO add your handling code here:
         String lockID = "Lock16";
        if (Lock16.getBackground().getRGB() == new Color(242, 242, 242).getRGB()) {
            Lock16.setBackground(java.awt.Color.RED);
            selectedLocks.add(lockID);
        } else {
            Lock16.setBackground(new Color(242, 242, 242));
            selectedLocks.remove(lockID);
        }
    }//GEN-LAST:event_Lock16MouseClicked

    private void Lock17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lock17MouseClicked
        // TODO add your handling code here:
         String lockID = "Lock17";
        if (Lock17.getBackground().getRGB() == new Color(242, 242, 242).getRGB()) {
            Lock17.setBackground(java.awt.Color.RED);
            selectedLocks.add(lockID);
        } else {
            Lock17  .setBackground(new Color(242, 242, 242));
            selectedLocks.remove(lockID);
        }
    }//GEN-LAST:event_Lock17MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Lock1;
    private javax.swing.JPanel Lock10;
    private javax.swing.JPanel Lock11;
    private javax.swing.JPanel Lock12;
    private javax.swing.JPanel Lock13;
    private javax.swing.JPanel Lock14;
    private javax.swing.JPanel Lock15;
    private javax.swing.JPanel Lock16;
    private javax.swing.JPanel Lock17;
    private javax.swing.JPanel Lock2;
    private javax.swing.JPanel Lock3;
    private javax.swing.JPanel Lock4;
    private javax.swing.JPanel Lock5;
    private javax.swing.JPanel Lock6;
    private javax.swing.JPanel Lock7;
    private javax.swing.JPanel Lock8;
    private javax.swing.JPanel Lock9;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
