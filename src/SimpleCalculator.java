import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;

public class SimpleCalculator extends javax.swing.JFrame implements KeyListener{
    
    public SimpleCalculator() {
        initComponents();
        display.addKeyListener(this);
        setVisible(true);
        display.requestFocus();
        
        RightClickMenu contextMenu = new RightClickMenu();
            contextMenu.add(display);
    }
    
    
    Calculator c = new Calculator();
    boolean beginsWithZero = c.beginsWithZero;
    boolean hasDecimalPoint = c.hasDecimalPoint;
    boolean equalPressed = c.equalPressed;
    byte operator = c.operator;
    double number1 = c.number1;
    double number2 = c.number2;
    double result = c.result;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        substract = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        decimalPoint = new javax.swing.JButton();
        numberThree = new javax.swing.JButton();
        numberSix = new javax.swing.JButton();
        numberNine = new javax.swing.JButton();
        backspace = new javax.swing.JButton();
        numberZero = new javax.swing.JButton();
        numberTwo = new javax.swing.JButton();
        numberFive = new javax.swing.JButton();
        numberEight = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        numberSeven = new javax.swing.JButton();
        numberFour = new javax.swing.JButton();
        numberOne = new javax.swing.JButton();
        mr = new javax.swing.JButton();
        mc = new javax.swing.JButton();
        ms = new javax.swing.JButton();
        oneDivideX = new javax.swing.JButton();
        plusMinus = new javax.swing.JButton();
        sqrt = new javax.swing.JButton();
        simpleMode = new javax.swing.JLabel();
        display = new javax.swing.JTextField();
        display2 = new javax.swing.JTextField();
        memory_display = new javax.swing.JTextField();
        scientificMode = new javax.swing.JButton();
        programmerMode = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setLocation(new java.awt.Point(300, 100));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setName("simpleCalculator"); // NOI18N
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);

        add.setBackground(new java.awt.Color(51, 51, 51));
        add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(204, 204, 204));
        add.setText("+");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        substract.setBackground(new java.awt.Color(51, 51, 51));
        substract.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        substract.setForeground(new java.awt.Color(204, 204, 204));
        substract.setText("-");
        substract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                substractActionPerformed(evt);
            }
        });

        equal.setBackground(new java.awt.Color(0, 204, 0));
        equal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        equal.setForeground(new java.awt.Color(204, 204, 204));
        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        divide.setBackground(new java.awt.Color(51, 51, 51));
        divide.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        divide.setForeground(new java.awt.Color(204, 204, 204));
        divide.setText("/");
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        multiply.setBackground(new java.awt.Color(51, 51, 51));
        multiply.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        multiply.setForeground(new java.awt.Color(204, 204, 204));
        multiply.setText("*");
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });

        decimalPoint.setBackground(new java.awt.Color(51, 51, 51));
        decimalPoint.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        decimalPoint.setForeground(new java.awt.Color(204, 204, 204));
        decimalPoint.setText(",");
        decimalPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalPointActionPerformed(evt);
            }
        });

        numberThree.setBackground(new java.awt.Color(51, 51, 51));
        numberThree.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numberThree.setForeground(new java.awt.Color(204, 204, 204));
        numberThree.setText("3");
        numberThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberThreeActionPerformed(evt);
            }
        });

        numberSix.setBackground(new java.awt.Color(51, 51, 51));
        numberSix.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numberSix.setForeground(new java.awt.Color(204, 204, 204));
        numberSix.setText("6");
        numberSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberSixActionPerformed(evt);
            }
        });

        numberNine.setBackground(new java.awt.Color(51, 51, 51));
        numberNine.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numberNine.setForeground(new java.awt.Color(204, 204, 204));
        numberNine.setText("9");
        numberNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberNineActionPerformed(evt);
            }
        });

        backspace.setBackground(new java.awt.Color(51, 51, 51));
        backspace.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backspace.setForeground(new java.awt.Color(204, 204, 204));
        backspace.setText("<-");
        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceActionPerformed(evt);
            }
        });

        numberZero.setBackground(new java.awt.Color(51, 51, 51));
        numberZero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numberZero.setForeground(new java.awt.Color(204, 204, 204));
        numberZero.setText("0");
        numberZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberZeroActionPerformed(evt);
            }
        });

        numberTwo.setBackground(new java.awt.Color(51, 51, 51));
        numberTwo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numberTwo.setForeground(new java.awt.Color(204, 204, 204));
        numberTwo.setText("2");
        numberTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberTwoActionPerformed(evt);
            }
        });

        numberFive.setBackground(new java.awt.Color(51, 51, 51));
        numberFive.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numberFive.setForeground(new java.awt.Color(204, 204, 204));
        numberFive.setText("5");
        numberFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberFiveActionPerformed(evt);
            }
        });

        numberEight.setBackground(new java.awt.Color(51, 51, 51));
        numberEight.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numberEight.setForeground(new java.awt.Color(204, 204, 204));
        numberEight.setText("8");
        numberEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberEightActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(51, 51, 51));
        clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clear.setForeground(new java.awt.Color(204, 204, 204));
        clear.setText("C");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(51, 51, 51));
        reset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reset.setForeground(new java.awt.Color(204, 204, 204));
        reset.setText("CE");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        numberSeven.setBackground(new java.awt.Color(51, 51, 51));
        numberSeven.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numberSeven.setForeground(new java.awt.Color(204, 204, 204));
        numberSeven.setText("7");
        numberSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberSevenActionPerformed(evt);
            }
        });

        numberFour.setBackground(new java.awt.Color(51, 51, 51));
        numberFour.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numberFour.setForeground(new java.awt.Color(204, 204, 204));
        numberFour.setText("4");
        numberFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberFourActionPerformed(evt);
            }
        });

        numberOne.setBackground(new java.awt.Color(51, 51, 51));
        numberOne.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numberOne.setForeground(new java.awt.Color(204, 204, 204));
        numberOne.setText("1");
        numberOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberOneActionPerformed(evt);
            }
        });

        mr.setBackground(new java.awt.Color(51, 51, 51));
        mr.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mr.setForeground(new java.awt.Color(204, 204, 204));
        mr.setText("MR");
        mr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mrActionPerformed(evt);
            }
        });

        mc.setBackground(new java.awt.Color(51, 51, 51));
        mc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mc.setForeground(new java.awt.Color(204, 204, 204));
        mc.setText("MC");
        mc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcActionPerformed(evt);
            }
        });

        ms.setBackground(new java.awt.Color(51, 51, 51));
        ms.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ms.setForeground(new java.awt.Color(204, 204, 204));
        ms.setText("MS");
        ms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msActionPerformed(evt);
            }
        });

        oneDivideX.setBackground(new java.awt.Color(51, 51, 51));
        oneDivideX.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        oneDivideX.setForeground(new java.awt.Color(204, 204, 204));
        oneDivideX.setText("1⁄x");
        oneDivideX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneDivideXActionPerformed(evt);
            }
        });

        plusMinus.setBackground(new java.awt.Color(51, 51, 51));
        plusMinus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        plusMinus.setForeground(new java.awt.Color(204, 204, 204));
        plusMinus.setText("±");
        plusMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusMinusActionPerformed(evt);
            }
        });

        sqrt.setBackground(new java.awt.Color(51, 51, 51));
        sqrt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sqrt.setForeground(new java.awt.Color(204, 204, 204));
        sqrt.setText("√");
        sqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrtActionPerformed(evt);
            }
        });

        simpleMode.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        simpleMode.setForeground(new java.awt.Color(204, 204, 204));
        simpleMode.setText("Simple");
        simpleMode.setName("simpleMode"); // NOI18N

        display.setEditable(false);
        display.setBackground(new java.awt.Color(102, 102, 102));
        display.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        display.setForeground(new java.awt.Color(255, 255, 255));
        display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display.setText("0");
        display.setAutoscrolls(false);
        display.setBorder(null);
        display.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        display2.setEditable(false);
        display2.setBackground(new java.awt.Color(102, 102, 102));
        display2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        display2.setForeground(new java.awt.Color(255, 255, 255));
        display2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display2.setAutoscrolls(false);
        display2.setBorder(null);
        display2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        memory_display.setEditable(false);
        memory_display.setBackground(new java.awt.Color(102, 102, 102));
        memory_display.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        memory_display.setForeground(new java.awt.Color(255, 255, 255));
        memory_display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        memory_display.setAutoscrolls(false);
        memory_display.setBorder(null);
        memory_display.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        scientificMode.setBackground(new java.awt.Color(51, 51, 51));
        scientificMode.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        scientificMode.setText("Scientific");
        scientificMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scientificModeActionPerformed(evt);
            }
        });

        programmerMode.setBackground(new java.awt.Color(51, 51, 51));
        programmerMode.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        programmerMode.setText("Programmer");
        programmerMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programmerModeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(display2)
                            .addComponent(display, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(mr, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(oneDivideX, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ms, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mc, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(plusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(numberZero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(decimalPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(numberOne, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(numberTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(numberThree, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(numberFour, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(numberFive, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(numberSix, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(numberSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(numberEight, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(numberNine, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(substract, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(simpleMode, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(memory_display, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(scientificMode, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(programmerMode, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpleMode, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scientificMode)
                    .addComponent(programmerMode))
                .addGap(5, 5, 5)
                .addComponent(memory_display, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(display2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberNine, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberEight, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(substract, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberSix, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberFive, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberFour, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberThree, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberOne, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ms, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(plusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decimalPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberZero, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oneDivideX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("simpleCalculator");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void writeNumber(String num){
        if(!beginsWithZero && !hasDecimalPoint) {
            display.setText(null);
        }
        if(equalPressed){
            display.setText(num);
            hasDecimalPoint = false;
            beginsWithZero = true;
            equalPressed = false;
        }
        else{
            display.setText(display.getText() + num);
            beginsWithZero = true; 
            display.grabFocus();
        }
    }
    
    public void checkOperatorValue(){
        if(operator == 0) {
            number1 = Double.parseDouble(String.valueOf(display.getText()));
        }
        else {
            number2 = Double.parseDouble(String.valueOf(display.getText()));
        }
        
        if (operator == 1) {
            number1 = number1 + number2;
        }
        
        if (operator == 2) {
            number1 = number1 - number2;
        }
        
        if (operator == 3) {
            number1 = number1 * number2;
        }
        
        if (operator == 4) {
            number1 = number1 / number2;
        }
    }
    
    private void numberThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberThreeActionPerformed
        writeNumber ("3");
    }//GEN-LAST:event_numberThreeActionPerformed
    
    private void numberZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberZeroActionPerformed
        if(!beginsWithZero && !hasDecimalPoint) {
            display.setText(null);
        }
        if(equalPressed){
            display.setText("0");
            hasDecimalPoint = false;
            equalPressed = false;
        }
        else{
            display.setText(display.getText() + "0");
        }
        display.grabFocus();
    }//GEN-LAST:event_numberZeroActionPerformed

    private void numberOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberOneActionPerformed
        writeNumber("1");
    }//GEN-LAST:event_numberOneActionPerformed

    private void numberTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberTwoActionPerformed
        writeNumber("2");
    }//GEN-LAST:event_numberTwoActionPerformed

    private void numberFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberFourActionPerformed
        writeNumber("4");
    }//GEN-LAST:event_numberFourActionPerformed

    private void numberFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberFiveActionPerformed
        writeNumber("5");
    }//GEN-LAST:event_numberFiveActionPerformed

    private void numberSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberSixActionPerformed
        writeNumber("6");
    }//GEN-LAST:event_numberSixActionPerformed

    private void numberSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberSevenActionPerformed
        writeNumber("7");
    }//GEN-LAST:event_numberSevenActionPerformed

    private void numberEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberEightActionPerformed
        writeNumber("8");
    }//GEN-LAST:event_numberEightActionPerformed

    private void numberNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberNineActionPerformed
        writeNumber("9");
    }//GEN-LAST:event_numberNineActionPerformed

    private void decimalPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalPointActionPerformed
        if(!hasDecimalPoint) {
            display.setText(display.getText() + ".");
            hasDecimalPoint = true;
        }
        display.grabFocus();
    }//GEN-LAST:event_decimalPointActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        /* operator == 0 (nothing)
           operator == 1 (addition)
           operator  == 2 (substraction)
           operator == 3 (multiplication)
           operator == 4 (dividing)*/
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        if (operator == 0) {
            result = number2;
            display2.setText(String.valueOf(number2));
        }
        
        if (operator == 1) {
            result = number1 + number2;
            display2.setText(display2.getText() + String.valueOf(number2)); 
            display.setText(String.valueOf(result));
        }
        
        if (operator == 2) {
            result = number1 - number2;
            display2.setText(display2.getText() + String.valueOf(number2)); 
            display.setText(String.valueOf(result));
        }
        
        if (operator == 3) {
            result = number1 * number2;
            display2.setText(display2.getText() + String.valueOf(number2)); 
            display.setText(String.valueOf(result));
        }
        
        if (operator == 4) {
            result = number1 / number2;
            display2.setText(display2.getText() + String.valueOf(number2)); 
            display.setText(String.valueOf(result));
        }
        
        DecimalFormat format = new DecimalFormat("#.##########");
        double doubleFromTextField = Double.parseDouble(display.getText());
        System.out.println(format.format(doubleFromTextField));
        
        if (result > -100000000 && result < 100000000) {
            //display.setText(String.valueOf(result));
            display.setText(format.format(doubleFromTextField));
        }
        else {
            display.setText("0");
            display2.setText("Error!");
        }
        
        number1 = 0;
        number2 = 0;
        result = 0;
        operator = 0;
        hasDecimalPoint = display.getText().contains(".");
        beginsWithZero = false;
        equalPressed = true;
        display.grabFocus();
    }//GEN-LAST:event_equalActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        checkOperatorValue();
        display2.setText(String.valueOf(number1) + " + ");
        operator = 1;
        hasDecimalPoint = false;
        beginsWithZero = false;
        display.grabFocus();
    }//GEN-LAST:event_addActionPerformed

    private void substractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_substractActionPerformed
        checkOperatorValue();
        display2.setText(String.valueOf(number1) + " - ");
        operator = 2;
        hasDecimalPoint = false;
        beginsWithZero = false;
        display.grabFocus();
    }//GEN-LAST:event_substractActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
        checkOperatorValue();
        display2.setText(String.valueOf(number1) + " * ");
        operator = 3;
        hasDecimalPoint = false;
        beginsWithZero = false;
        display.grabFocus();
    }//GEN-LAST:event_multiplyActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        checkOperatorValue();
        display2.setText(String.valueOf(number1) + " / ");
        operator = 4;
        hasDecimalPoint = false;
        beginsWithZero = false;
        display.grabFocus();
    }//GEN-LAST:event_divideActionPerformed

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceActionPerformed
        c.backspace(display);
        hasDecimalPoint = display.getText().contains(".");
        display.grabFocus();
    }//GEN-LAST:event_backspaceActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        c.clear(display, display2);
        hasDecimalPoint = false;
        beginsWithZero = false;  
        display.grabFocus();
    }//GEN-LAST:event_clearActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        display.setText("0");
        display2.setText(null);
        hasDecimalPoint = false;
        beginsWithZero = false;
        number1 = 0;
        number2 = 0;
        result = 0;
        display.grabFocus();
    }//GEN-LAST:event_resetActionPerformed

    private void oneDivideXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneDivideXActionPerformed
        Calculator cc = new Calculator();
        cc.oneDivideX(number2, result, display, display2);
        DecimalFormat format = new DecimalFormat("#.##########");
        double doubleFromTextField = Double.parseDouble(display.getText());
        System.out.println(format.format(doubleFromTextField));
        
        if(number2 == 0){
            display.setText("0");
          //  display2.setText("Error!");
        }
        
        if (result > -100000000 && result < 100000000) {
            //display.setText(String.valueOf(result));
            display.setText(format.format(doubleFromTextField));
        }
        else {
            display.setText("0");
           // display2.setText("Error!");
        }
        
        //hasDecimalPoint = display.getText().contains(".");
        beginsWithZero = true;
        number1 = 0;
        number2 = 0;
        result = 0;
        operator = 0;
        equalPressed = true;
        display.grabFocus();
    }//GEN-LAST:event_oneDivideXActionPerformed

    private void sqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrtActionPerformed
        Calculator cc = new Calculator();
        cc.sqrt(number2, result, display, display2);
        
        DecimalFormat format = new DecimalFormat("#.##########");
        double doubleFromTextField = Double.parseDouble(display.getText());
        System.out.println(format.format(doubleFromTextField));
        
        if (result > -100000000 && result < 100000000) {
            display.setText(format.format(doubleFromTextField));
        }
        else {
            display.setText("0");
            display2.setText("Error!");
        }
        
        hasDecimalPoint = display.getText().contains(".");
        number1 = 0;
        number2 = 0;
        result = 0;
        operator = 0;
        beginsWithZero = false;
        equalPressed = true;
        display.grabFocus();
    }//GEN-LAST:event_sqrtActionPerformed

    private void plusMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusMinusActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        result = number2 * (-1);
        
        
        DecimalFormat format = new DecimalFormat("#.##########");
        double doubleFromTextField = Double.parseDouble(Double.toString(result));
        System.out.println(format.format(doubleFromTextField));

        if (result > -100000000 && result < 100000000) {
            display.setText(format.format(doubleFromTextField));
        }
        else {
            display.setText("0");
            display2.setText("Error!");
        }
        result = 0;
        display.grabFocus();
    }//GEN-LAST:event_plusMinusActionPerformed

    private void msActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msActionPerformed
        c.ms(display, memory_display);
        display.grabFocus();
    }//GEN-LAST:event_msActionPerformed

    private void mcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcActionPerformed
        c.mc(memory_display);
        display.grabFocus();
    }//GEN-LAST:event_mcActionPerformed

    private void mrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mrActionPerformed
        c.mr(display, memory_display);
        display.grabFocus();
    }//GEN-LAST:event_mrActionPerformed

    private void scientificModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scientificModeActionPerformed
        //System.setProperty("sun.java2d.d3d", "false");
        //System.setProperty("sun.java2d.opengl", "true");
        ScientificCalculator scientificCalc = new ScientificCalculator();
        //scientificCalc.setLocation(300, 100);
        scientificCalc.setLocation(this.getLocation());
        //scientificCalc.setVisible(true);
        this.dispose();
           /*SwingWorker<?,?> worker;
        worker = new SwingWorker<Void,Integer>(){
            protected Void doInBackground() throws InterruptedException{
                for (int x = 0; x <= 100; x+=10)
                {
                    publish(x);
                    Thread.sleep(1);
                }
                return null;
            }
        };
        worker.execute();*/
        scientificCalc.setVisible(true);
    }//GEN-LAST:event_scientificModeActionPerformed

    private void programmerModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programmerModeActionPerformed
        ProgrammerCalculator progMode = new ProgrammerCalculator();
        progMode.setLocation(this.getLocation());
        progMode.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_programmerModeActionPerformed

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(SimpleCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimpleCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimpleCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimpleCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new SimpleCalculator().setVisible(true);
                new SimpleCalculator().display.requestFocusInWindow();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton backspace;
    private javax.swing.JButton clear;
    private javax.swing.JButton decimalPoint;
    private javax.swing.JTextField display;
    private javax.swing.JTextField display2;
    private javax.swing.JButton divide;
    private javax.swing.JButton equal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mc;
    private javax.swing.JTextField memory_display;
    private javax.swing.JButton mr;
    private javax.swing.JButton ms;
    private javax.swing.JButton multiply;
    private javax.swing.JButton numberEight;
    private javax.swing.JButton numberFive;
    private javax.swing.JButton numberFour;
    private javax.swing.JButton numberNine;
    private javax.swing.JButton numberOne;
    private javax.swing.JButton numberSeven;
    private javax.swing.JButton numberSix;
    private javax.swing.JButton numberThree;
    private javax.swing.JButton numberTwo;
    private javax.swing.JButton numberZero;
    private javax.swing.JButton oneDivideX;
    private javax.swing.JButton plusMinus;
    private javax.swing.JButton programmerMode;
    private javax.swing.JButton reset;
    private javax.swing.JButton scientificMode;
    private javax.swing.JLabel simpleMode;
    private javax.swing.JButton sqrt;
    private javax.swing.JButton substract;
    // End of variables declaration//GEN-END:variables

    
    
    @Override
    public void keyTyped(KeyEvent ke) {}

    @Override
    public void keyPressed(KeyEvent ke) {
        int keyCode = ke.getKeyCode();
        if(ke.getKeyChar() <= '9' && ke.getKeyChar() >= '1')
        {
            writeNumber(""+ke.getKeyChar());
        }
        else if(ke.getKeyChar() == KeyEvent.VK_0){
            this.numberZeroActionPerformed(null);
        }
        else if(keyCode == KeyEvent.VK_BACK_SPACE){
            this.backspaceActionPerformed(null);
        }
        else if(keyCode == KeyEvent.VK_ENTER) {
            this.equalActionPerformed(null);
        }
        else if(keyCode == KeyEvent.VK_ADD) {
            this.addActionPerformed(null);
        }
        else if(ke.getKeyChar() == KeyEvent.VK_MINUS){
            this.substractActionPerformed(null);
        }
        else if(ke.getKeyChar() == KeyEvent.VK_COMMA){
            this.decimalPointActionPerformed(null);
        }
        else if(keyCode == KeyEvent.VK_MULTIPLY){
            this.multiplyActionPerformed(null);
        }
        else if(keyCode == KeyEvent.VK_DIVIDE){
            this.divideActionPerformed(null);
        }
        else if(ke.isControlDown() && ke.getKeyChar() != 'c' && ke.getKeyCode() == 67){
            c.copy(display);
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {}

    }
