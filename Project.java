/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ip.project;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;
/**
 *
 * @author Tiffany
 */
public class Project extends javax.swing.JFrame {

    private CardLayout mainCardLayout;
    private CardLayout centerCardLayout;
    
    public Project() {
        initComponents();
        
        // Set the window title
        setTitle("4UTools - Group 4");
        
        // Set up main layout for JFrame
        mainCardLayout = new CardLayout();
        setLayout(mainCardLayout);
        add(pnlPreview, "preview");
        add(pnlRoot, "pnlRoot");

        // Set up center panel layout
        centerCardLayout = new CardLayout();
        pnlCenter.setLayout(centerCardLayout);  
        
        pnlCenter.add(pnlMath, "math");
        pnlCenter.add(pnlTime, "time");
        pnlCenter.add(pnlMagic, "magic");
        
        // See More Button
        SeeMore_btn1.setVisible(false);
        SeeMore_btn1.addActionListener(e -> {
            outputBinary.setRows(5);
            SeeMore_btn1.setVisible(false);
            
            jPanel9.setPreferredSize(jPanel9.getPreferredSize());
            jPanel9.revalidate();
            jPanel9.repaint();
        });
        
        SeeMore_btn2.setVisible(false);
        SeeMore_btn2.addActionListener(e -> {
            outputDecimal.setRows(5);
            SeeMore_btn2.setVisible(false);
            
            jPanel11.setPreferredSize(jPanel11.getPreferredSize());
            jPanel11.revalidate();
            jPanel11.repaint();
        });
        
        // Conversion buttons
        convertDecimal_btn.addActionListener(e -> {
           String input = inputDecimal.getText();
           String result = performConversion(input); // Replace with actual conversion logic
           updateOutput(result, 1);
        });
        
        convertBinary_btn.addActionListener(e -> {
           String input = inputBinary.getText();
           String result = performConversion(input); // Replace with actual conversion logic
           updateOutput(result, 2);
        });
        
        updateOutput("", 1);
        updateOutput("", 2);
        
        
        // Navigation side buttons
        JButton[] btns = {math_btn, time_btn, magic_btn};
        for (JButton btn : btns) {
            btn.setBackground(new Color(25,55,60));
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {
                @Override 
                public void mouseClicked(MouseEvent e) {
                    CardLayout cl = (CardLayout)(pnlCenter.getLayout());
                    
                    if (btn == math_btn) {
                        cl.show(pnlCenter, "math");
                    } else if (btn == time_btn) {
                        cl.show(pnlCenter, "time");
                    } else if (btn == magic_btn) {
                        cl.show(pnlCenter, "magic");
                    }
                }
                
                @Override 
                public void mousePressed(MouseEvent e) {
                }
                
                @Override 
                public void mouseReleased(MouseEvent e) {
                }
                
                @Override 
                public void mouseEntered(MouseEvent e) {
                    btn.setBackground(new Color(36, 109, 116));
                }
                
                @Override 
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(new Color(25,55,60));

                }
            });
        }
        
        // Show preview on startup
        mainCardLayout.show(getContentPane(), "preview");
        
        // Center the window on screen
        setLocationRelativeTo(null);
        
        // Set up "Check It Out" button
        CheckItOut_btn.addActionListener(e -> {
            mainCardLayout.show(getContentPane(), "pnlRoot");
            centerCardLayout.show(pnlCenter, "math");
        });        
        
        // Direct navigation via side buttons
        math_btn.addActionListener(e -> centerCardLayout.show(pnlCenter, "math"));
        time_btn.addActionListener(e -> centerCardLayout.show(pnlCenter, "time"));
        magic_btn.addActionListener(e -> centerCardLayout.show(pnlCenter, "magic"));
    }
    
    private void updateOutput(String result, int textAreaNumber) {
        if (textAreaNumber == 1) {
            outputBinary.setText(result);
            
            if (result.length() > 20) {
                SeeMore_btn1.setVisible(true);
            } else {
                SeeMore_btn1.setVisible(false);
            }
        } else if (textAreaNumber == 2) {           
            outputDecimal.setText(result);
            
            if (result.length() > 20) {
                SeeMore_btn2.setVisible(true);
            } else {
                SeeMore_btn2.setVisible(false);
            }
        }
    }
    
    private String performConversion(String input) {
        // Replace with actual code
        return input;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRoot = new javax.swing.JPanel();
        pnlSide = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        math_btn = new javax.swing.JButton();
        time_btn = new javax.swing.JButton();
        magic_btn = new javax.swing.JButton();
        pnlCenter = new javax.swing.JPanel();
        pnlMath = new javax.swing.JPanel();
        topFrame2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        DecimalToBinary = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        inputDecimal = new javax.swing.JTextField();
        convertDecimal_btn = new javax.swing.JButton();
        outputBinary = new javax.swing.JTextArea();
        SeeMore_btn1 = new javax.swing.JButton();
        BinaryToDecimal = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        inputBinary = new javax.swing.JTextField();
        convertBinary_btn = new javax.swing.JButton();
        outputDecimal = new javax.swing.JTextArea();
        SeeMore_btn2 = new javax.swing.JButton();
        PrimeNumberCheck = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        inputPrime = new javax.swing.JTextField();
        Check_btn = new javax.swing.JButton();
        outputPrime = new javax.swing.JTextField();
        pnlTime = new javax.swing.JPanel();
        topFrame3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        DaysToHours = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        inputDays = new javax.swing.JTextField();
        ConvertDays_btn = new javax.swing.JButton();
        outputHours = new javax.swing.JTextField();
        HoursToDays = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        inputHours = new javax.swing.JTextField();
        ConvertHours_btn = new javax.swing.JButton();
        outputDays = new javax.swing.JTextField();
        HoursToMinutes = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        inputHours2 = new javax.swing.JTextField();
        ConverHours_btn2 = new javax.swing.JButton();
        outputMinutes = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        MinutesToHours = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        inputMinutes = new javax.swing.JTextField();
        ConvertMinutes_btn = new javax.swing.JButton();
        ouputHours = new javax.swing.JTextField();
        MinutesToSeconds = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        inputSeconds = new javax.swing.JTextField();
        ConvertSeconds_btn = new javax.swing.JButton();
        ouputSeconds = new javax.swing.JTextField();
        SecondsToMinutes = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        inputMinutes2 = new javax.swing.JTextField();
        ConvertMinutes_btn2 = new javax.swing.JButton();
        outputMinutes2 = new javax.swing.JTextField();
        pnlMagic = new javax.swing.JPanel();
        topFrame5 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        ZodiacSignGeneretor = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        inputDay = new javax.swing.JTextField();
        inputMonth = new javax.swing.JTextField();
        Generate_btn = new javax.swing.JButton();
        outputZodiac = new javax.swing.JTextField();
        pnlPreview = new javax.swing.JPanel();
        AppName = new javax.swing.JLabel();
        Tagline = new javax.swing.JLabel();
        CheckItOut_btn = new javax.swing.JButton();
        Tagline1 = new javax.swing.JLabel();
        Tagline2 = new javax.swing.JLabel();
        Tagline3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        pnlRoot.setLayout(new java.awt.BorderLayout());

        pnlSide.setBackground(new java.awt.Color(25, 55, 60));
        pnlSide.setPreferredSize(new java.awt.Dimension(90, 100));

        jPanel1.setBackground(new java.awt.Color(25, 55, 60));
        jPanel1.setPreferredSize(new java.awt.Dimension(90, 175));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 175, Short.MAX_VALUE)
        );

        pnlSide.add(jPanel1);

        math_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/icons/math.png"))); // NOI18N
        math_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                math_btnActionPerformed(evt);
            }
        });
        pnlSide.add(math_btn);

        time_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/icons/time.png"))); // NOI18N
        time_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time_btnActionPerformed(evt);
            }
        });
        pnlSide.add(time_btn);

        magic_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/icons/magic.png"))); // NOI18N
        magic_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                magic_btnActionPerformed(evt);
            }
        });
        pnlSide.add(magic_btn);

        pnlRoot.add(pnlSide, java.awt.BorderLayout.WEST);

        pnlCenter.setBackground(new java.awt.Color(11, 20, 20));
        pnlCenter.setLayout(new java.awt.CardLayout());

        pnlMath.setBackground(new java.awt.Color(11, 20, 20));
        pnlMath.setLayout(new java.awt.BorderLayout());

        topFrame2.setBackground(new java.awt.Color(11, 20, 20));
        topFrame2.setMinimumSize(new java.awt.Dimension(256, 248));
        topFrame2.setPreferredSize(new java.awt.Dimension(901, 120));

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei UI", 2, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 230, 255));
        jLabel13.setText("4UTools");
        jLabel13.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 30, 0, 20));

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Basic Number Tools");
        jLabel14.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 30, 0, 0));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Convert numbers and check for primes.");
        jLabel15.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 30, 20, 0));

        javax.swing.GroupLayout topFrame2Layout = new javax.swing.GroupLayout(topFrame2);
        topFrame2.setLayout(topFrame2Layout);
        topFrame2Layout.setHorizontalGroup(
            topFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topFrame2Layout.createSequentialGroup()
                .addGroup(topFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 1309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 1309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 1309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        topFrame2Layout.setVerticalGroup(
            topFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topFrame2Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pnlMath.add(topFrame2, java.awt.BorderLayout.NORTH);

        jPanel2.setBackground(new java.awt.Color(11, 20, 20));
        jPanel2.setPreferredSize(new java.awt.Dimension(287, 500));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 0));

        DecimalToBinary.setBackground(new java.awt.Color(25, 55, 60));
        DecimalToBinary.setPreferredSize(new java.awt.Dimension(200, 260));
        DecimalToBinary.setLayout(new java.awt.BorderLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/icons/math62.png"))); // NOI18N
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel16.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 0, 5));
        jLabel16.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel16.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel16.setPreferredSize(new java.awt.Dimension(50, 60));
        jLabel16.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        DecimalToBinary.add(jLabel16, java.awt.BorderLayout.PAGE_START);

        jPanel9.setBackground(new java.awt.Color(25, 55, 60));
        jPanel9.setPreferredSize(new java.awt.Dimension(200, 200));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(160, 194, 200));
        jLabel17.setText("Decimal to Binary         ");
        jLabel17.setAlignmentY(0.0F);
        jPanel9.add(jLabel17);

        inputDecimal.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        inputDecimal.setForeground(new java.awt.Color(153, 153, 153));
        inputDecimal.setText("Enter a decimal number");
        inputDecimal.setPreferredSize(new java.awt.Dimension(155, 22));
        inputDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDecimalActionPerformed(evt);
            }
        });
        jPanel9.add(inputDecimal);

        convertDecimal_btn.setBackground(new java.awt.Color(69, 177, 196));
        convertDecimal_btn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        convertDecimal_btn.setForeground(new java.awt.Color(255, 255, 255));
        convertDecimal_btn.setText("Convert");
        convertDecimal_btn.setBorderPainted(false);
        convertDecimal_btn.setMaximumSize(new java.awt.Dimension(150, 24));
        convertDecimal_btn.setMinimumSize(new java.awt.Dimension(150, 24));
        convertDecimal_btn.setPreferredSize(new java.awt.Dimension(155, 25));
        convertDecimal_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertDecimal_btnActionPerformed(evt);
            }
        });
        jPanel9.add(convertDecimal_btn);

        outputBinary.setBackground(new java.awt.Color(79, 79, 79));
        outputBinary.setColumns(14);
        outputBinary.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        outputBinary.setForeground(new java.awt.Color(255, 255, 255));
        outputBinary.setLineWrap(true);
        outputBinary.setRows(1);
        outputBinary.setTabSize(1);
        outputBinary.setPreferredSize(new java.awt.Dimension(166, 15));
        jPanel9.add(outputBinary);

        SeeMore_btn1.setBackground(new java.awt.Color(69, 177, 196));
        SeeMore_btn1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        SeeMore_btn1.setForeground(new java.awt.Color(69, 177, 196));
        SeeMore_btn1.setText("See More");
        SeeMore_btn1.setBorderPainted(false);
        SeeMore_btn1.setContentAreaFilled(false);
        SeeMore_btn1.setMaximumSize(new java.awt.Dimension(150, 24));
        SeeMore_btn1.setMinimumSize(new java.awt.Dimension(150, 24));
        SeeMore_btn1.setPreferredSize(new java.awt.Dimension(155, 15));
        SeeMore_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeeMore_btn1ActionPerformed(evt);
            }
        });
        jPanel9.add(SeeMore_btn1);

        DecimalToBinary.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel2.add(DecimalToBinary);

        BinaryToDecimal.setBackground(new java.awt.Color(25, 55, 60));
        BinaryToDecimal.setLayout(new java.awt.BorderLayout());

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/icons/math62.png"))); // NOI18N
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel18.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 0, 5));
        jLabel18.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel18.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel18.setPreferredSize(new java.awt.Dimension(50, 60));
        jLabel18.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        BinaryToDecimal.add(jLabel18, java.awt.BorderLayout.PAGE_START);

        jPanel11.setBackground(new java.awt.Color(25, 55, 60));
        jPanel11.setPreferredSize(new java.awt.Dimension(200, 200));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(160, 194, 200));
        jLabel19.setText("Binary to Decimal        ");
        jLabel19.setAlignmentY(0.0F);
        jPanel11.add(jLabel19);

        inputBinary.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        inputBinary.setForeground(new java.awt.Color(153, 153, 153));
        inputBinary.setText("Enter a binary number");
        inputBinary.setPreferredSize(new java.awt.Dimension(155, 22));
        inputBinary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBinaryActionPerformed(evt);
            }
        });
        jPanel11.add(inputBinary);

        convertBinary_btn.setBackground(new java.awt.Color(69, 177, 196));
        convertBinary_btn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        convertBinary_btn.setForeground(new java.awt.Color(255, 255, 255));
        convertBinary_btn.setText("Convert");
        convertBinary_btn.setBorderPainted(false);
        convertBinary_btn.setMaximumSize(new java.awt.Dimension(150, 24));
        convertBinary_btn.setMinimumSize(new java.awt.Dimension(150, 24));
        convertBinary_btn.setPreferredSize(new java.awt.Dimension(155, 25));
        convertBinary_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertBinary_btnActionPerformed(evt);
            }
        });
        jPanel11.add(convertBinary_btn);

        outputDecimal.setBackground(new java.awt.Color(79, 79, 79));
        outputDecimal.setColumns(14);
        outputDecimal.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        outputDecimal.setForeground(new java.awt.Color(255, 255, 255));
        outputDecimal.setLineWrap(true);
        outputDecimal.setRows(1);
        outputDecimal.setTabSize(1);
        outputDecimal.setPreferredSize(new java.awt.Dimension(166, 15));
        jPanel11.add(outputDecimal);

        SeeMore_btn2.setBackground(new java.awt.Color(69, 177, 196));
        SeeMore_btn2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        SeeMore_btn2.setForeground(new java.awt.Color(69, 177, 196));
        SeeMore_btn2.setText("See More");
        SeeMore_btn2.setBorderPainted(false);
        SeeMore_btn2.setContentAreaFilled(false);
        SeeMore_btn2.setMaximumSize(new java.awt.Dimension(150, 24));
        SeeMore_btn2.setMinimumSize(new java.awt.Dimension(150, 24));
        SeeMore_btn2.setPreferredSize(new java.awt.Dimension(155, 15));
        SeeMore_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeeMore_btn2ActionPerformed(evt);
            }
        });
        jPanel11.add(SeeMore_btn2);

        BinaryToDecimal.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel2.add(BinaryToDecimal);

        PrimeNumberCheck.setBackground(new java.awt.Color(25, 55, 60));
        PrimeNumberCheck.setPreferredSize(new java.awt.Dimension(200, 260));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/icons/math62.png"))); // NOI18N
        jLabel11.setText("jLabel7");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(160, 194, 200));
        jLabel12.setText("Prime Number Check");

        inputPrime.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        inputPrime.setForeground(new java.awt.Color(153, 153, 153));
        inputPrime.setText("Enter a prime number");
        inputPrime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPrimeActionPerformed(evt);
            }
        });

        Check_btn.setBackground(new java.awt.Color(69, 177, 196));
        Check_btn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        Check_btn.setForeground(new java.awt.Color(255, 255, 255));
        Check_btn.setText("Check");
        Check_btn.setToolTipText("");
        Check_btn.setBorderPainted(false);
        Check_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Check_btnActionPerformed(evt);
            }
        });

        outputPrime.setBackground(new java.awt.Color(79, 79, 79));
        outputPrime.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        outputPrime.setForeground(new java.awt.Color(255, 255, 255));
        outputPrime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputPrimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrimeNumberCheckLayout = new javax.swing.GroupLayout(PrimeNumberCheck);
        PrimeNumberCheck.setLayout(PrimeNumberCheckLayout);
        PrimeNumberCheckLayout.setHorizontalGroup(
            PrimeNumberCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrimeNumberCheckLayout.createSequentialGroup()
                .addGroup(PrimeNumberCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrimeNumberCheckLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PrimeNumberCheckLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(PrimeNumberCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12)
                            .addComponent(inputPrime)
                            .addComponent(Check_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(outputPrime))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        PrimeNumberCheckLayout.setVerticalGroup(
            PrimeNumberCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrimeNumberCheckLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputPrime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Check_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputPrime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jPanel2.add(PrimeNumberCheck);

        pnlMath.add(jPanel2, java.awt.BorderLayout.CENTER);

        pnlCenter.add(pnlMath, "card2");

        pnlTime.setBackground(new java.awt.Color(11, 20, 20));
        pnlTime.setLayout(new java.awt.BorderLayout());

        topFrame3.setBackground(new java.awt.Color(11, 20, 20));
        topFrame3.setMinimumSize(new java.awt.Dimension(256, 248));
        topFrame3.setPreferredSize(new java.awt.Dimension(901, 120));

        jLabel22.setFont(new java.awt.Font("Microsoft YaHei UI", 2, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 230, 255));
        jLabel22.setText("4UTools");
        jLabel22.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 30, 0, 20));

        jLabel23.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Time Conversion Utilities");
        jLabel23.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 30, 0, 0));

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Quickly convert between different time units.");
        jLabel24.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 30, 20, 0));

        javax.swing.GroupLayout topFrame3Layout = new javax.swing.GroupLayout(topFrame3);
        topFrame3.setLayout(topFrame3Layout);
        topFrame3Layout.setHorizontalGroup(
            topFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topFrame3Layout.createSequentialGroup()
                .addGroup(topFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 1309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 1309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 1309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        topFrame3Layout.setVerticalGroup(
            topFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topFrame3Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pnlTime.add(topFrame3, java.awt.BorderLayout.NORTH);

        jPanel6.setBackground(new java.awt.Color(11, 20, 20));
        jPanel6.setPreferredSize(new java.awt.Dimension(901, 150));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 0));

        DaysToHours.setBackground(new java.awt.Color(25, 55, 60));
        DaysToHours.setPreferredSize(new java.awt.Dimension(200, 200));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/icons/time62.png"))); // NOI18N
        jLabel25.setText("jLabel7");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(160, 194, 200));
        jLabel26.setText("Days to Hours");

        inputDays.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        inputDays.setForeground(new java.awt.Color(153, 153, 153));
        inputDays.setText("Enter number of days");
        inputDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDaysActionPerformed(evt);
            }
        });

        ConvertDays_btn.setBackground(new java.awt.Color(69, 177, 196));
        ConvertDays_btn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        ConvertDays_btn.setForeground(new java.awt.Color(255, 255, 255));
        ConvertDays_btn.setText("Convert");
        ConvertDays_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertDays_btnActionPerformed(evt);
            }
        });

        outputHours.setBackground(new java.awt.Color(79, 79, 79));
        outputHours.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        outputHours.setForeground(new java.awt.Color(255, 255, 255));
        outputHours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputHoursActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DaysToHoursLayout = new javax.swing.GroupLayout(DaysToHours);
        DaysToHours.setLayout(DaysToHoursLayout);
        DaysToHoursLayout.setHorizontalGroup(
            DaysToHoursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DaysToHoursLayout.createSequentialGroup()
                .addGroup(DaysToHoursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DaysToHoursLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DaysToHoursLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(DaysToHoursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel26)
                            .addComponent(inputDays, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(ConvertDays_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(outputHours))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        DaysToHoursLayout.setVerticalGroup(
            DaysToHoursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DaysToHoursLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConvertDays_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel6.add(DaysToHours);

        HoursToDays.setBackground(new java.awt.Color(25, 55, 60));
        HoursToDays.setPreferredSize(new java.awt.Dimension(200, 200));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/icons/time62.png"))); // NOI18N
        jLabel27.setText("jLabel7");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(160, 194, 200));
        jLabel28.setText("Hours to Days");

        inputHours.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        inputHours.setForeground(new java.awt.Color(153, 153, 153));
        inputHours.setText("Enter number of hours");
        inputHours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputHoursActionPerformed(evt);
            }
        });

        ConvertHours_btn.setBackground(new java.awt.Color(69, 177, 196));
        ConvertHours_btn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        ConvertHours_btn.setForeground(new java.awt.Color(255, 255, 255));
        ConvertHours_btn.setText("Convert");
        ConvertHours_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertHours_btnActionPerformed(evt);
            }
        });

        outputDays.setBackground(new java.awt.Color(79, 79, 79));
        outputDays.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        outputDays.setForeground(new java.awt.Color(255, 255, 255));
        outputDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputDaysActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HoursToDaysLayout = new javax.swing.GroupLayout(HoursToDays);
        HoursToDays.setLayout(HoursToDaysLayout);
        HoursToDaysLayout.setHorizontalGroup(
            HoursToDaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoursToDaysLayout.createSequentialGroup()
                .addGroup(HoursToDaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HoursToDaysLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HoursToDaysLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(HoursToDaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel28)
                            .addComponent(inputHours)
                            .addComponent(ConvertHours_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(outputDays))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        HoursToDaysLayout.setVerticalGroup(
            HoursToDaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoursToDaysLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConvertHours_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel6.add(HoursToDays);

        HoursToMinutes.setBackground(new java.awt.Color(25, 55, 60));
        HoursToMinutes.setPreferredSize(new java.awt.Dimension(200, 200));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/icons/time62.png"))); // NOI18N
        jLabel29.setText("jLabel7");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(160, 194, 200));
        jLabel30.setText("Hours to Minutes");

        inputHours2.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        inputHours2.setForeground(new java.awt.Color(153, 153, 153));
        inputHours2.setText("Enter number of minutes");
        inputHours2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputHours2ActionPerformed(evt);
            }
        });

        ConverHours_btn2.setBackground(new java.awt.Color(69, 177, 196));
        ConverHours_btn2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        ConverHours_btn2.setForeground(new java.awt.Color(255, 255, 255));
        ConverHours_btn2.setText("Convert");
        ConverHours_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConverHours_btn2ActionPerformed(evt);
            }
        });

        outputMinutes.setBackground(new java.awt.Color(79, 79, 79));
        outputMinutes.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        outputMinutes.setForeground(new java.awt.Color(255, 255, 255));
        outputMinutes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputMinutesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HoursToMinutesLayout = new javax.swing.GroupLayout(HoursToMinutes);
        HoursToMinutes.setLayout(HoursToMinutesLayout);
        HoursToMinutesLayout.setHorizontalGroup(
            HoursToMinutesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoursToMinutesLayout.createSequentialGroup()
                .addGroup(HoursToMinutesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HoursToMinutesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HoursToMinutesLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(HoursToMinutesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel30)
                            .addComponent(inputHours2)
                            .addComponent(ConverHours_btn2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(outputMinutes))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        HoursToMinutesLayout.setVerticalGroup(
            HoursToMinutesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoursToMinutesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputHours2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConverHours_btn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel6.add(HoursToMinutes);

        pnlTime.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel14.setBackground(new java.awt.Color(11, 20, 20));
        jPanel14.setPreferredSize(new java.awt.Dimension(901, 270));
        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 0));

        MinutesToHours.setBackground(new java.awt.Color(25, 55, 60));
        MinutesToHours.setPreferredSize(new java.awt.Dimension(200, 200));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/icons/time62.png"))); // NOI18N
        jLabel31.setText("jLabel7");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(160, 194, 200));
        jLabel32.setText("Minutes to Hours");

        inputMinutes.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        inputMinutes.setForeground(new java.awt.Color(153, 153, 153));
        inputMinutes.setText("Enter number of minutes");
        inputMinutes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMinutesActionPerformed(evt);
            }
        });

        ConvertMinutes_btn.setBackground(new java.awt.Color(69, 177, 196));
        ConvertMinutes_btn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        ConvertMinutes_btn.setForeground(new java.awt.Color(255, 255, 255));
        ConvertMinutes_btn.setText("Convert");
        ConvertMinutes_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertMinutes_btnActionPerformed(evt);
            }
        });

        ouputHours.setBackground(new java.awt.Color(79, 79, 79));
        ouputHours.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        ouputHours.setForeground(new java.awt.Color(255, 255, 255));
        ouputHours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ouputHoursActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MinutesToHoursLayout = new javax.swing.GroupLayout(MinutesToHours);
        MinutesToHours.setLayout(MinutesToHoursLayout);
        MinutesToHoursLayout.setHorizontalGroup(
            MinutesToHoursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MinutesToHoursLayout.createSequentialGroup()
                .addGroup(MinutesToHoursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MinutesToHoursLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MinutesToHoursLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(MinutesToHoursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel32)
                            .addComponent(inputMinutes)
                            .addComponent(ConvertMinutes_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(ouputHours))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        MinutesToHoursLayout.setVerticalGroup(
            MinutesToHoursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MinutesToHoursLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConvertMinutes_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ouputHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel14.add(MinutesToHours);

        MinutesToSeconds.setBackground(new java.awt.Color(25, 55, 60));
        MinutesToSeconds.setPreferredSize(new java.awt.Dimension(200, 200));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/icons/time62.png"))); // NOI18N
        jLabel33.setText("jLabel7");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(160, 194, 200));
        jLabel34.setText("Minutes to Seconds");

        inputSeconds.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        inputSeconds.setForeground(new java.awt.Color(153, 153, 153));
        inputSeconds.setText("Enter number of seconds");
        inputSeconds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSecondsActionPerformed(evt);
            }
        });

        ConvertSeconds_btn.setBackground(new java.awt.Color(69, 177, 196));
        ConvertSeconds_btn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        ConvertSeconds_btn.setForeground(new java.awt.Color(255, 255, 255));
        ConvertSeconds_btn.setText("Convert");
        ConvertSeconds_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertSeconds_btnActionPerformed(evt);
            }
        });

        ouputSeconds.setBackground(new java.awt.Color(79, 79, 79));
        ouputSeconds.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        ouputSeconds.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout MinutesToSecondsLayout = new javax.swing.GroupLayout(MinutesToSeconds);
        MinutesToSeconds.setLayout(MinutesToSecondsLayout);
        MinutesToSecondsLayout.setHorizontalGroup(
            MinutesToSecondsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MinutesToSecondsLayout.createSequentialGroup()
                .addGroup(MinutesToSecondsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MinutesToSecondsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MinutesToSecondsLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(MinutesToSecondsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel34)
                            .addComponent(inputSeconds)
                            .addComponent(ConvertSeconds_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(ouputSeconds))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        MinutesToSecondsLayout.setVerticalGroup(
            MinutesToSecondsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MinutesToSecondsLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputSeconds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConvertSeconds_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ouputSeconds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel14.add(MinutesToSeconds);

        SecondsToMinutes.setBackground(new java.awt.Color(25, 55, 60));
        SecondsToMinutes.setPreferredSize(new java.awt.Dimension(200, 200));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/icons/time62.png"))); // NOI18N
        jLabel35.setText("jLabel7");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(160, 194, 200));
        jLabel36.setText("Seconds to Minutes");

        inputMinutes2.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        inputMinutes2.setForeground(new java.awt.Color(153, 153, 153));
        inputMinutes2.setText("Enter number of minutes");
        inputMinutes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMinutes2ActionPerformed(evt);
            }
        });

        ConvertMinutes_btn2.setBackground(new java.awt.Color(69, 177, 196));
        ConvertMinutes_btn2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        ConvertMinutes_btn2.setForeground(new java.awt.Color(255, 255, 255));
        ConvertMinutes_btn2.setText("Convert");
        ConvertMinutes_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertMinutes_btn2ActionPerformed(evt);
            }
        });

        outputMinutes2.setBackground(new java.awt.Color(79, 79, 79));
        outputMinutes2.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        outputMinutes2.setForeground(new java.awt.Color(255, 255, 255));
        outputMinutes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputMinutes2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SecondsToMinutesLayout = new javax.swing.GroupLayout(SecondsToMinutes);
        SecondsToMinutes.setLayout(SecondsToMinutesLayout);
        SecondsToMinutesLayout.setHorizontalGroup(
            SecondsToMinutesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SecondsToMinutesLayout.createSequentialGroup()
                .addGroup(SecondsToMinutesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SecondsToMinutesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SecondsToMinutesLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(SecondsToMinutesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel36)
                            .addComponent(inputMinutes2)
                            .addComponent(ConvertMinutes_btn2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(outputMinutes2))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        SecondsToMinutesLayout.setVerticalGroup(
            SecondsToMinutesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SecondsToMinutesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputMinutes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConvertMinutes_btn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputMinutes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel14.add(SecondsToMinutes);

        pnlTime.add(jPanel14, java.awt.BorderLayout.SOUTH);

        pnlCenter.add(pnlTime, "card2");

        pnlMagic.setBackground(new java.awt.Color(11, 20, 20));
        pnlMagic.setLayout(new java.awt.BorderLayout());

        topFrame5.setBackground(new java.awt.Color(11, 20, 20));
        topFrame5.setMinimumSize(new java.awt.Dimension(256, 248));
        topFrame5.setPreferredSize(new java.awt.Dimension(901, 120));

        jLabel44.setFont(new java.awt.Font("Microsoft YaHei UI", 2, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 230, 255));
        jLabel44.setText("4UTools");
        jLabel44.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 30, 0, 20));

        jLabel45.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Personality & Fun Tools");
        jLabel45.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 30, 0, 0));

        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Discover your zodiac and more fun generators.");
        jLabel46.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 30, 20, 0));

        javax.swing.GroupLayout topFrame5Layout = new javax.swing.GroupLayout(topFrame5);
        topFrame5.setLayout(topFrame5Layout);
        topFrame5Layout.setHorizontalGroup(
            topFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topFrame5Layout.createSequentialGroup()
                .addGroup(topFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 1309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 1309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 1309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        topFrame5Layout.setVerticalGroup(
            topFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topFrame5Layout.createSequentialGroup()
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pnlMagic.add(topFrame5, java.awt.BorderLayout.NORTH);

        ZodiacSignGeneretor.setBackground(new java.awt.Color(11, 20, 20));
        ZodiacSignGeneretor.setPreferredSize(new java.awt.Dimension(901, 400));
        ZodiacSignGeneretor.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 0));

        jPanel12.setBackground(new java.awt.Color(25, 55, 60));
        jPanel12.setPreferredSize(new java.awt.Dimension(400, 260));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/icons/magic62.png"))); // NOI18N
        jLabel20.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel20.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 23, 0, 5));
        jLabel20.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel20.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel20.setPreferredSize(new java.awt.Dimension(50, 60));
        jLabel20.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel12.add(jLabel20, java.awt.BorderLayout.PAGE_START);

        jPanel18.setBackground(new java.awt.Color(25, 55, 60));
        jPanel18.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel18.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(160, 194, 200));
        jLabel21.setText("Zodiac Sign Generator                                          ");
        jLabel21.setAlignmentY(0.0F);
        jPanel18.add(jLabel21);

        inputDay.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        inputDay.setForeground(new java.awt.Color(153, 153, 153));
        inputDay.setText("Enter Day");
        inputDay.setPreferredSize(new java.awt.Dimension(155, 35));
        inputDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDayActionPerformed(evt);
            }
        });
        jPanel18.add(inputDay);

        inputMonth.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        inputMonth.setForeground(new java.awt.Color(153, 153, 153));
        inputMonth.setText("Enter Month");
        inputMonth.setPreferredSize(new java.awt.Dimension(155, 35));
        inputMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMonthActionPerformed(evt);
            }
        });
        jPanel18.add(inputMonth);

        Generate_btn.setBackground(new java.awt.Color(69, 177, 196));
        Generate_btn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        Generate_btn.setForeground(new java.awt.Color(255, 255, 255));
        Generate_btn.setText("Generate");
        Generate_btn.setBorderPainted(false);
        Generate_btn.setMaximumSize(new java.awt.Dimension(150, 24));
        Generate_btn.setMinimumSize(new java.awt.Dimension(150, 24));
        Generate_btn.setPreferredSize(new java.awt.Dimension(320, 35));
        Generate_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Generate_btnActionPerformed(evt);
            }
        });
        jPanel18.add(Generate_btn);

        outputZodiac.setBackground(new java.awt.Color(79, 79, 79));
        outputZodiac.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        outputZodiac.setForeground(new java.awt.Color(255, 255, 255));
        outputZodiac.setPreferredSize(new java.awt.Dimension(320, 35));
        outputZodiac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputZodiacActionPerformed(evt);
            }
        });
        jPanel18.add(outputZodiac);

        jPanel12.add(jPanel18, java.awt.BorderLayout.CENTER);

        ZodiacSignGeneretor.add(jPanel12);

        pnlMagic.add(ZodiacSignGeneretor, java.awt.BorderLayout.CENTER);

        pnlCenter.add(pnlMagic, "card2");

        pnlRoot.add(pnlCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlRoot, "card3");

        pnlPreview.setBackground(new java.awt.Color(25, 55, 60));
        pnlPreview.setPreferredSize(new java.awt.Dimension(758, 545));

        AppName.setBackground(new java.awt.Color(0, 230, 255));
        AppName.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 48)); // NOI18N
        AppName.setForeground(new java.awt.Color(0, 230, 255));
        AppName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AppName.setText("4UTools");
        AppName.setBorder(javax.swing.BorderFactory.createEmptyBorder(125, 1, 1, 1));
        AppName.setPreferredSize(new java.awt.Dimension(758, 200));

        Tagline.setFont(new java.awt.Font("Microsoft YaHei UI", 2, 14)); // NOI18N
        Tagline.setForeground(new java.awt.Color(255, 255, 255));
        Tagline.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tagline.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/icons/magic124.png"))); // NOI18N
        Tagline.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Tagline.setPreferredSize(new java.awt.Dimension(758, 24));
        Tagline.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        CheckItOut_btn.setBackground(new java.awt.Color(69, 177, 196));
        CheckItOut_btn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        CheckItOut_btn.setForeground(new java.awt.Color(255, 255, 255));
        CheckItOut_btn.setText("Check It Out");
        CheckItOut_btn.setPreferredSize(new java.awt.Dimension(200, 50));
        CheckItOut_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckItOut_btnActionPerformed(evt);
            }
        });

        Tagline1.setFont(new java.awt.Font("Microsoft YaHei UI", 2, 14)); // NOI18N
        Tagline1.setForeground(new java.awt.Color(255, 255, 255));
        Tagline1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tagline1.setText("Tools made 4u, just the way you like.");
        Tagline1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Tagline1.setPreferredSize(new java.awt.Dimension(758, 24));
        Tagline1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        Tagline2.setFont(new java.awt.Font("Microsoft YaHei UI", 2, 14)); // NOI18N
        Tagline2.setForeground(new java.awt.Color(255, 255, 255));
        Tagline2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tagline2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/icons/math124.png"))); // NOI18N
        Tagline2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Tagline2.setPreferredSize(new java.awt.Dimension(758, 24));
        Tagline2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        Tagline3.setFont(new java.awt.Font("Microsoft YaHei UI", 2, 14)); // NOI18N
        Tagline3.setForeground(new java.awt.Color(255, 255, 255));
        Tagline3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tagline3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/icons/time124.png"))); // NOI18N
        Tagline3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Tagline3.setPreferredSize(new java.awt.Dimension(758, 24));
        Tagline3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout pnlPreviewLayout = new javax.swing.GroupLayout(pnlPreview);
        pnlPreview.setLayout(pnlPreviewLayout);
        pnlPreviewLayout.setHorizontalGroup(
            pnlPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPreviewLayout.createSequentialGroup()
                .addGroup(pnlPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPreviewLayout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(Tagline2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Tagline3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Tagline, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPreviewLayout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(CheckItOut_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPreviewLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(pnlPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AppName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tagline1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnlPreviewLayout.setVerticalGroup(
            pnlPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPreviewLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(AppName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tagline1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(pnlPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tagline, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tagline2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tagline3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(CheckItOut_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(pnlPreview, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void math_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_math_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_math_btnActionPerformed

    private void time_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_time_btnActionPerformed

    private void magic_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_magic_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_magic_btnActionPerformed

    private void inputPrimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPrimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPrimeActionPerformed

    private void Check_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Check_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Check_btnActionPerformed

    private void outputPrimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputPrimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputPrimeActionPerformed

    private void inputDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDaysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDaysActionPerformed

    private void ConvertDays_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertDays_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConvertDays_btnActionPerformed

    private void outputHoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputHoursActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputHoursActionPerformed

    private void inputHoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputHoursActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputHoursActionPerformed

    private void ConvertHours_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertHours_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConvertHours_btnActionPerformed

    private void outputDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputDaysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputDaysActionPerformed

    private void inputHours2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputHours2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputHours2ActionPerformed

    private void ConverHours_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConverHours_btn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConverHours_btn2ActionPerformed

    private void outputMinutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputMinutesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputMinutesActionPerformed

    private void inputDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDecimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDecimalActionPerformed

    private void convertDecimal_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertDecimal_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_convertDecimal_btnActionPerformed

    private void SeeMore_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeeMore_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeeMore_btn1ActionPerformed

    private void inputBinaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBinaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputBinaryActionPerformed

    private void convertBinary_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertBinary_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_convertBinary_btnActionPerformed

    private void SeeMore_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeeMore_btn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeeMore_btn2ActionPerformed

    private void outputMinutes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputMinutes2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputMinutes2ActionPerformed

    private void ConvertMinutes_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertMinutes_btn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConvertMinutes_btn2ActionPerformed

    private void inputMinutes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMinutes2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputMinutes2ActionPerformed

    private void ConvertSeconds_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertSeconds_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConvertSeconds_btnActionPerformed

    private void inputSecondsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSecondsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSecondsActionPerformed

    private void ouputHoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ouputHoursActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ouputHoursActionPerformed

    private void ConvertMinutes_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertMinutes_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConvertMinutes_btnActionPerformed

    private void inputMinutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMinutesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputMinutesActionPerformed

    private void inputDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDayActionPerformed

    private void Generate_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Generate_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Generate_btnActionPerformed

    private void inputMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputMonthActionPerformed

    private void outputZodiacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputZodiacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputZodiacActionPerformed

    private void CheckItOut_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckItOut_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckItOut_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Project().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppName;
    private javax.swing.JPanel BinaryToDecimal;
    private javax.swing.JButton CheckItOut_btn;
    private javax.swing.JButton Check_btn;
    private javax.swing.JButton ConverHours_btn2;
    private javax.swing.JButton ConvertDays_btn;
    private javax.swing.JButton ConvertHours_btn;
    private javax.swing.JButton ConvertMinutes_btn;
    private javax.swing.JButton ConvertMinutes_btn2;
    private javax.swing.JButton ConvertSeconds_btn;
    private javax.swing.JPanel DaysToHours;
    private javax.swing.JPanel DecimalToBinary;
    private javax.swing.JButton Generate_btn;
    private javax.swing.JPanel HoursToDays;
    private javax.swing.JPanel HoursToMinutes;
    private javax.swing.JPanel MinutesToHours;
    private javax.swing.JPanel MinutesToSeconds;
    private javax.swing.JPanel PrimeNumberCheck;
    private javax.swing.JPanel SecondsToMinutes;
    private javax.swing.JButton SeeMore_btn1;
    private javax.swing.JButton SeeMore_btn2;
    private javax.swing.JLabel Tagline;
    private javax.swing.JLabel Tagline1;
    private javax.swing.JLabel Tagline2;
    private javax.swing.JLabel Tagline3;
    private javax.swing.JPanel ZodiacSignGeneretor;
    private javax.swing.JButton convertBinary_btn;
    private javax.swing.JButton convertDecimal_btn;
    private javax.swing.JTextField inputBinary;
    private javax.swing.JTextField inputDay;
    private javax.swing.JTextField inputDays;
    private javax.swing.JTextField inputDecimal;
    private javax.swing.JTextField inputHours;
    private javax.swing.JTextField inputHours2;
    private javax.swing.JTextField inputMinutes;
    private javax.swing.JTextField inputMinutes2;
    private javax.swing.JTextField inputMonth;
    private javax.swing.JTextField inputPrime;
    private javax.swing.JTextField inputSeconds;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton magic_btn;
    private javax.swing.JButton math_btn;
    private javax.swing.JTextField ouputHours;
    private javax.swing.JTextField ouputSeconds;
    private javax.swing.JTextArea outputBinary;
    private javax.swing.JTextField outputDays;
    private javax.swing.JTextArea outputDecimal;
    private javax.swing.JTextField outputHours;
    private javax.swing.JTextField outputMinutes;
    private javax.swing.JTextField outputMinutes2;
    private javax.swing.JTextField outputPrime;
    private javax.swing.JTextField outputZodiac;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlMagic;
    private javax.swing.JPanel pnlMath;
    private javax.swing.JPanel pnlPreview;
    private javax.swing.JPanel pnlRoot;
    private javax.swing.JPanel pnlSide;
    private javax.swing.JPanel pnlTime;
    private javax.swing.JButton time_btn;
    private javax.swing.JPanel topFrame2;
    private javax.swing.JPanel topFrame3;
    private javax.swing.JPanel topFrame5;
    // End of variables declaration//GEN-END:variables
}
