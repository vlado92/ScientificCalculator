import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ProgrammerCalculator extends javax.swing.JFrame implements KeyListener{

    private boolean decimalChecked;
    private boolean binarChecked;
    private boolean octalChecked;
    private boolean hexadecimalChecked;
    private int result;
    private int number1;
    private int number2;

    private int base = 10;

    public ProgrammerCalculator() {
        initComponents();
        display1.setFocusable(true);
        display1.grabFocus();
        display1.requestFocus();
        display1.requestFocusInWindow();
        display1.addKeyListener(this);
        
        RightClickMenu contextMenu = new RightClickMenu();
            contextMenu.add(display1);
    }

    Calculator cc = new Calculator();
    boolean beginsWithZero = cc.beginsWithZero;
    boolean hasDecimalPoint = cc.hasDecimalPoint;
    boolean equalPressed = cc.equalPressed;
    byte operator = cc.operator;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        reset = new javax.swing.JButton();
        numberSeven = new javax.swing.JButton();
        numberFour = new javax.swing.JButton();
        numberOne = new javax.swing.JButton();
        mr = new javax.swing.JButton();
        mc = new javax.swing.JButton();
        ms = new javax.swing.JButton();
        add = new javax.swing.JButton();
        e = new javax.swing.JButton();
        substract = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        f = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        display1 = new javax.swing.JTextField();
        display2 = new javax.swing.JTextField();
        numberThree = new javax.swing.JButton();
        memory_display = new javax.swing.JTextField();
        numberSix = new javax.swing.JButton();
        scientificMode = new javax.swing.JButton();
        numberNine = new javax.swing.JButton();
        backspace = new javax.swing.JButton();
        numberZero = new javax.swing.JButton();
        numberTwo = new javax.swing.JButton();
        numberFive = new javax.swing.JButton();
        numberEight = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        programmerMode = new javax.swing.JLabel();
        simpleMode = new javax.swing.JButton();
        d = new javax.swing.JButton();
        c = new javax.swing.JButton();
        b = new javax.swing.JButton();
        a = new javax.swing.JButton();
        decimal = new javax.swing.JRadioButton();
        binar = new javax.swing.JRadioButton();
        octal = new javax.swing.JRadioButton();
        hexadecimal = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(710, 509));

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
        mr.setPreferredSize(new java.awt.Dimension(61, 40));
        mr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mrActionPerformed(evt);
            }
        });

        mc.setBackground(new java.awt.Color(51, 51, 51));
        mc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mc.setForeground(new java.awt.Color(204, 204, 204));
        mc.setText("MC");
        mc.setPreferredSize(new java.awt.Dimension(61, 40));
        mc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcActionPerformed(evt);
            }
        });

        ms.setBackground(new java.awt.Color(51, 51, 51));
        ms.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ms.setForeground(new java.awt.Color(204, 204, 204));
        ms.setText("MS");
        ms.setPreferredSize(new java.awt.Dimension(61, 40));
        ms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(51, 51, 51));
        add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(204, 204, 204));
        add.setText("+");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        e.setBackground(new java.awt.Color(51, 51, 51));
        e.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        e.setForeground(new java.awt.Color(204, 204, 204));
        e.setText("E");
        e.setEnabled(false);
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
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

        equal.setBackground(new java.awt.Color(153, 0, 153));
        equal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        equal.setForeground(new java.awt.Color(204, 204, 204));
        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        f.setBackground(new java.awt.Color(51, 51, 51));
        f.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        f.setForeground(new java.awt.Color(204, 204, 204));
        f.setText("F");
        f.setEnabled(false);
        f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fActionPerformed(evt);
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

        display1.setEditable(false);
        display1.setBackground(new java.awt.Color(102, 102, 102));
        display1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        display1.setForeground(new java.awt.Color(255, 255, 255));
        display1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display1.setText("0");
        display1.setAutoscrolls(false);
        display1.setBorder(null);
        display1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        display2.setEditable(false);
        display2.setBackground(new java.awt.Color(102, 102, 102));
        display2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        display2.setForeground(new java.awt.Color(255, 255, 255));
        display2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display2.setAutoscrolls(false);
        display2.setBorder(null);
        display2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        numberThree.setBackground(new java.awt.Color(51, 51, 51));
        numberThree.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numberThree.setForeground(new java.awt.Color(204, 204, 204));
        numberThree.setText("3");
        numberThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberThreeActionPerformed(evt);
            }
        });

        memory_display.setEditable(false);
        memory_display.setBackground(new java.awt.Color(102, 102, 102));
        memory_display.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        memory_display.setForeground(new java.awt.Color(255, 255, 255));
        memory_display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        memory_display.setAutoscrolls(false);
        memory_display.setBorder(null);
        memory_display.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        numberSix.setBackground(new java.awt.Color(51, 51, 51));
        numberSix.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numberSix.setForeground(new java.awt.Color(204, 204, 204));
        numberSix.setText("6");
        numberSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberSixActionPerformed(evt);
            }
        });

        scientificMode.setBackground(new java.awt.Color(51, 51, 51));
        scientificMode.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        scientificMode.setText("Scientific");
        scientificMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scientificModeActionPerformed(evt);
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

        programmerMode.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        programmerMode.setForeground(new java.awt.Color(204, 204, 204));
        programmerMode.setText("Programmer");
        programmerMode.setName("simple"); // NOI18N

        simpleMode.setBackground(new java.awt.Color(51, 51, 51));
        simpleMode.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        simpleMode.setText("Simple");
        simpleMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpleModeActionPerformed(evt);
            }
        });

        d.setBackground(new java.awt.Color(51, 51, 51));
        d.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        d.setForeground(new java.awt.Color(204, 204, 204));
        d.setText("D");
        d.setEnabled(false);
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });

        c.setBackground(new java.awt.Color(51, 51, 51));
        c.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c.setForeground(new java.awt.Color(204, 204, 204));
        c.setText("C");
        c.setEnabled(false);
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        b.setBackground(new java.awt.Color(51, 51, 51));
        b.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b.setForeground(new java.awt.Color(204, 204, 204));
        b.setText("B");
        b.setEnabled(false);
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        a.setBackground(new java.awt.Color(51, 51, 51));
        a.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a.setForeground(new java.awt.Color(204, 204, 204));
        a.setText("A");
        a.setEnabled(false);
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });

        decimal.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(decimal);
        decimal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        decimal.setForeground(new java.awt.Color(204, 204, 204));
        decimal.setSelected(true);
        decimal.setText("Decimal");
        decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalActionPerformed(evt);
            }
        });

        binar.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(binar);
        binar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        binar.setForeground(new java.awt.Color(204, 204, 204));
        binar.setText("Binar");
        binar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binarActionPerformed(evt);
            }
        });

        octal.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(octal);
        octal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        octal.setForeground(new java.awt.Color(204, 204, 204));
        octal.setText("Octal");
        octal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                octalActionPerformed(evt);
            }
        });

        hexadecimal.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(hexadecimal);
        hexadecimal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        hexadecimal.setForeground(new java.awt.Color(204, 204, 204));
        hexadecimal.setText("Hexadecimal");
        hexadecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hexadecimalActionPerformed(evt);
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
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(b, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(c, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(d, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(f, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                        .addComponent(e, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(hexadecimal)
                                            .addComponent(octal, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(binar, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(decimal, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(46, 46, 46))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(mr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(mc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(61, 61, 61)
                                                .addComponent(ms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(20, 20, 20)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(numberOne, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                                .addComponent(numberFour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(numberSeven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(numberTwo, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                                .addComponent(numberEight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(numberFive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(numberZero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(numberThree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(numberSix, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(numberNine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(backspace, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(divide, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(2, 2, 2)))
                                            .addComponent(substract, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(display1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(memory_display, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(simpleMode)
                        .addGap(19, 19, 19)
                        .addComponent(scientificMode)
                        .addGap(18, 18, 18)
                        .addComponent(programmerMode)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(programmerMode, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scientificMode)
                    .addComponent(simpleMode))
                .addGap(5, 5, 5)
                .addComponent(memory_display, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(display2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(display1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decimal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(binar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numberNine, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberEight, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(octal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(numberSix, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(numberFive, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(numberFour, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(substract, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(hexadecimal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numberThree, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberOne, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberZero, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void writeNumber(String num){
        if(!beginsWithZero && !hasDecimalPoint) {
            display1.setText(null);
        }
        if(equalPressed){
            display1.setText(num);
            beginsWithZero = true;
            equalPressed = false;
        }
        else{
            display1.setText(display1.getText() + num);
            beginsWithZero = true; 
            display1.grabFocus();
        }
    }
    
    public void checkOperatorValue(){
        if (operator == 0) {
            number1 = Integer.parseInt(String.valueOf(display1.getText()), base);
        } else {
            number2 = Integer.parseInt(String.valueOf(display1.getText()), base);
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

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        display1.setText("0");
        display2.setText(null);
        hasDecimalPoint = false;
        beginsWithZero = false;
        number1 = 0;
        number2 = 0;
        result = 0;
        display1.grabFocus();
    }//GEN-LAST:event_resetActionPerformed

    private void numberSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberSevenActionPerformed
        writeNumber("7");
    }//GEN-LAST:event_numberSevenActionPerformed

    private void numberFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberFourActionPerformed
        writeNumber("4");
    }//GEN-LAST:event_numberFourActionPerformed

    private void numberOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberOneActionPerformed
        writeNumber("1");
    }//GEN-LAST:event_numberOneActionPerformed

    private void mrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mrActionPerformed
            cc.mr(display1, memory_display);
            display1.grabFocus();
    }//GEN-LAST:event_mrActionPerformed

    private void mcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcActionPerformed
            cc.mc(memory_display);
            display1.grabFocus();
    }//GEN-LAST:event_mcActionPerformed

    private void msActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msActionPerformed
            cc.ms(display1, memory_display);
            display1.grabFocus();
    }//GEN-LAST:event_msActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        checkOperatorValue();
        display2.setText(String.valueOf(number1) + " + ");
        operator = 1;
        hasDecimalPoint = false;
        beginsWithZero = false;
        display1.grabFocus();
    }//GEN-LAST:event_addActionPerformed

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
        if (!beginsWithZero) {
            display1.setText(null);
        }
        display1.setText(display1.getText() + "e");
        beginsWithZero = true;
        display1.grabFocus();
    }//GEN-LAST:event_eActionPerformed

    private void substractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_substractActionPerformed
        checkOperatorValue();
        display2.setText(String.valueOf(number1) + " - ");
        operator = 2;
        hasDecimalPoint = false;
        beginsWithZero = false;
        display1.grabFocus();
    }//GEN-LAST:event_substractActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        number2 = Integer.parseInt(String.valueOf(display1.getText()), base);
        if (operator == 0) {
            result = number2;
            display2.setText(String.valueOf(number2));
        }
        if (operator == 1) {
            result = number1 + Integer.parseInt(display1.getText(), base);
            display2.setText(display2.getText() + String.valueOf(number2));
            display1.setText(String.valueOf(result));
        }
        if (operator == 2) {
            result = number1 - Integer.parseInt(display1.getText(), base);
            display2.setText(display2.getText() + String.valueOf(number2));
            display1.setText(String.valueOf(result));
        }
        if (operator == 3) {
            result = number1 * Integer.parseInt(display1.getText(), base);
            display2.setText(display2.getText() + String.valueOf(number2));
            display1.setText(String.valueOf(result));
        }
        if (operator == 4) {
            result = number1 / Integer.parseInt(display1.getText(), base);
            display2.setText(display2.getText() + String.valueOf(number2));
            display1.setText(String.valueOf(result));
        }
        if (result > -100000000 && result < 100000000) {
            display1.setText(Integer.toString(result, base));
        } else {
            display1.setText("Error");
        }

        number1 = 0;
        number2 = 0;
        result = 0;
        operator = 0;
        hasDecimalPoint = false;
        beginsWithZero = false;
        equalPressed = true;
        display1.grabFocus();
    }//GEN-LAST:event_equalActionPerformed

    private void fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fActionPerformed
        if (!beginsWithZero) {
            display1.setText(null);
        }
        display1.setText(display1.getText() + "f");
        beginsWithZero = true;
        display1.grabFocus();
    }//GEN-LAST:event_fActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        checkOperatorValue();
        display2.setText(String.valueOf(number1) + " / ");
        operator = 4;
        hasDecimalPoint = false;
        beginsWithZero = false;
        display1.grabFocus();
    }//GEN-LAST:event_divideActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
        checkOperatorValue();
        display2.setText(String.valueOf(number1) + " * ");
        operator = 3;
        hasDecimalPoint = false;
        beginsWithZero = false;
        display1.grabFocus();
    }//GEN-LAST:event_multiplyActionPerformed

    private void numberThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberThreeActionPerformed
        writeNumber("3");
    }//GEN-LAST:event_numberThreeActionPerformed

    private void numberSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberSixActionPerformed
        writeNumber("6");
    }//GEN-LAST:event_numberSixActionPerformed

    private void scientificModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scientificModeActionPerformed
        ScientificCalculator scientificCalc = new ScientificCalculator();
        scientificCalc.setLocation(this.getLocation());
        scientificCalc.setVisible(true);
        this.dispose();
        display1.grabFocus();
    }//GEN-LAST:event_scientificModeActionPerformed

    private void numberNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberNineActionPerformed
        writeNumber("9");
    }//GEN-LAST:event_numberNineActionPerformed

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceActionPerformed
           cc.backspace(display1);
           display1.grabFocus();
    }//GEN-LAST:event_backspaceActionPerformed

    private void numberZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberZeroActionPerformed
        if (!beginsWithZero && !hasDecimalPoint) {
            display1.setText(null);
        }
        if(equalPressed){
            display1.setText("0");
            equalPressed = false;
        }
        else{
            display1.setText(display1.getText() + "0");
        }
        display1.grabFocus();
    }//GEN-LAST:event_numberZeroActionPerformed

    private void numberTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberTwoActionPerformed
        writeNumber("2");
    }//GEN-LAST:event_numberTwoActionPerformed

    private void numberFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberFiveActionPerformed
        writeNumber("5");
    }//GEN-LAST:event_numberFiveActionPerformed

    private void numberEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberEightActionPerformed
        writeNumber("8");
    }//GEN-LAST:event_numberEightActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        display1.setText("0");
        display2.setText(null);
        hasDecimalPoint = false;
        beginsWithZero = false;
        display1.grabFocus();
    }//GEN-LAST:event_clearActionPerformed

    private void simpleModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpleModeActionPerformed
        SimpleCalculator calc = new SimpleCalculator();
        calc.setLocation(this.getLocation());
        calc.setVisible(true);
        this.dispose();
        display1.grabFocus();
    }//GEN-LAST:event_simpleModeActionPerformed

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        if (!beginsWithZero) {
            display1.setText(null);
        }
        display1.setText(display1.getText() + "d");
        beginsWithZero = true;
        display1.grabFocus();
    }//GEN-LAST:event_dActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        if (!beginsWithZero) {
            display1.setText(null);
        }
        display1.setText(display1.getText() + "c");
        beginsWithZero = true;
        display1.grabFocus();
    }//GEN-LAST:event_cActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        if (!beginsWithZero) {
            display1.setText(null);
        }
        display1.setText(display1.getText() + "b");
        beginsWithZero = true;
        display1.grabFocus();
    }//GEN-LAST:event_bActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        if (!beginsWithZero) {
            display1.setText(null);
        }
        display1.setText(display1.getText() + "a");
        beginsWithZero = true;
        display1.grabFocus();
    }//GEN-LAST:event_aActionPerformed

    private void decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalActionPerformed
        decimalChecked = true;
        a.setEnabled(false);
        b.setEnabled(false);
        c.setEnabled(false);
        d.setEnabled(false);
        e.setEnabled(false);
        f.setEnabled(false);
        numberEight.setEnabled(true);
        numberNine.setEnabled(true);
        numberTwo.setEnabled(true);
        numberThree.setEnabled(true);
        numberFour.setEnabled(true);
        numberFive.setEnabled(true);
        numberSix.setEnabled(true);
        numberSeven.setEnabled(true);
        int number = Integer.parseInt(String.valueOf(display1.getText()), base);
        display1.setText(Integer.toString(number));
        display2.setText(null);
        display2.setText(null);
        base = 10;
        display1.grabFocus();
    }//GEN-LAST:event_decimalActionPerformed

    private void binarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binarActionPerformed
        binarChecked = true;
        a.setEnabled(false);
        b.setEnabled(false);
        c.setEnabled(false);
        d.setEnabled(false);
        e.setEnabled(false);
        f.setEnabled(false);
        numberEight.setEnabled(false);
        numberNine.setEnabled(false);
        numberTwo.setEnabled(false);
        numberThree.setEnabled(false);
        numberFour.setEnabled(false);
        numberFive.setEnabled(false);
        numberSix.setEnabled(false);
        numberSeven.setEnabled(false);
        //plus_minus.setEnabled(false);
        //display1.setText("0");
        int number = Integer.parseInt(String.valueOf(display1.getText()), base);
        display1.setText(Integer.toBinaryString(number));
        display2.setText(null);
        base = 2;
        display1.grabFocus();
    }//GEN-LAST:event_binarActionPerformed

    private void octalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_octalActionPerformed
        octalChecked = true;
        a.setEnabled(false);
        b.setEnabled(false);
        c.setEnabled(false);
        d.setEnabled(false);
        e.setEnabled(false);
        f.setEnabled(false);
        numberEight.setEnabled(false);
        numberNine.setEnabled(false);
        numberTwo.setEnabled(true);
        numberThree.setEnabled(true);
        numberFour.setEnabled(true);
        numberFive.setEnabled(true);
        numberSix.setEnabled(true);
        numberSeven.setEnabled(true);
        //plus_minus.setEnabled(false);
        int number = Integer.parseInt(String.valueOf(display1.getText()), base);
        display1.setText(Integer.toOctalString(number));
        display2.setText(null);
        display2.setText(null);
        base = 8;
        display1.grabFocus();
    }//GEN-LAST:event_octalActionPerformed

    private void hexadecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hexadecimalActionPerformed
        hexadecimalChecked = true;
        a.setEnabled(true);
        b.setEnabled(true);
        c.setEnabled(true);
        d.setEnabled(true);
        e.setEnabled(true);
        f.setEnabled(true);
        numberEight.setEnabled(true);
        numberNine.setEnabled(true);
        numberTwo.setEnabled(true);
        numberThree.setEnabled(true);
        numberFour.setEnabled(true);
        numberFive.setEnabled(true);
        numberSix.setEnabled(true);
        numberSeven.setEnabled(true);
        //plus_minus.setEnabled(false);
        int number = Integer.parseInt(String.valueOf(display1.getText()), base);
        display1.setText(Integer.toHexString(number));
        display2.setText(null);
        display2.setText(null);
        base = 16;
        display1.grabFocus();
    }//GEN-LAST:event_hexadecimalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a;
    private javax.swing.JButton add;
    private javax.swing.JButton b;
    private javax.swing.JButton backspace;
    private javax.swing.JRadioButton binar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton c;
    private javax.swing.JButton clear;
    private javax.swing.JButton d;
    private javax.swing.JRadioButton decimal;
    private javax.swing.JTextField display1;
    private javax.swing.JTextField display2;
    private javax.swing.JButton divide;
    private javax.swing.JButton e;
    private javax.swing.JButton equal;
    private javax.swing.JButton f;
    private javax.swing.JRadioButton hexadecimal;
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
    private javax.swing.JRadioButton octal;
    private javax.swing.JLabel programmerMode;
    private javax.swing.JButton reset;
    private javax.swing.JButton scientificMode;
    private javax.swing.JButton simpleMode;
    private javax.swing.JButton substract;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        int keyCode = ke.getKeyCode();
        /*if(ke.getKeyChar() <= '9' && ke.getKeyChar() >= '1')
        {
            writeNumber(""+ke.getKeyChar());
        }*/
        if(ke.getKeyChar() == KeyEvent.VK_0){
            this.numberZeroActionPerformed(null);
        }
        else if (ke.getKeyChar() == KeyEvent.VK_1){
            this.numberOneActionPerformed(null);
        }
        else if (ke.getKeyChar() == KeyEvent.VK_2){
            if(base == 8 || base == 10 || base == 16){
                this.numberTwoActionPerformed(null);
            }
        }
        else if (ke.getKeyChar() == KeyEvent.VK_3){
            if(base == 8 || base == 10 || base == 16){
                this.numberThreeActionPerformed(null);
            }
        }
        else if (ke.getKeyChar() == KeyEvent.VK_4){
            if(base == 8 || base == 10 || base == 16){
                this.numberFourActionPerformed(null);
            }
        }
        else if (ke.getKeyChar() == KeyEvent.VK_5){
            if(base == 8 || base == 10 || base == 16){
                this.numberFiveActionPerformed(null);
            }
        }
        else if (ke.getKeyChar() == KeyEvent.VK_6){
            if(base == 8 || base == 10 || base == 16){
                this.numberSixActionPerformed(null);
            }
        }
        else if (ke.getKeyChar() == KeyEvent.VK_7){
            if(base == 8 || base == 10 || base == 16){
                this.numberSevenActionPerformed(null);
            }
        }
        else if (ke.getKeyChar() == KeyEvent.VK_8){
            if(base == 10 || base == 16){
                this.numberEightActionPerformed(null);
            }
        }
        else if (ke.getKeyChar() == KeyEvent.VK_9){
            if(base == 10 || base == 16){
                this.numberNineActionPerformed(null);
            }
        }
        else if (ke.getKeyChar() == 'a' || ke.getKeyChar() == 'A'){
            if(base == 16){
                this.aActionPerformed(null);
            }
        }
        else if (ke.getKeyChar() == 'b' || ke.getKeyChar() == 'B'){
            if(base == 16){
                this.bActionPerformed(null);
            }
        }
        else if (ke.getKeyChar() == 'c' || ke.getKeyChar() == 'C'){
            if(base == 16){
                this.cActionPerformed(null);
            }
        }
        else if (ke.getKeyChar() == 'd' || ke.getKeyChar() == 'D'){
            if(base == 16){
                this.dActionPerformed(null);
            }
        }
        else if (ke.getKeyChar() == 'e' || ke.getKeyChar() == 'E'){
            if(base == 16){
                this.eActionPerformed(null);
            }
        }
        else if (ke.getKeyChar() == 'f' || ke.getKeyChar() == 'F'){
            if(base == 16){
                this.fActionPerformed(null);
            }
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
        else if(keyCode == KeyEvent.VK_MULTIPLY){
            this.multiplyActionPerformed(null);
        }
        else if(keyCode == KeyEvent.VK_DIVIDE){
            this.divideActionPerformed(null);
        }
        else if(ke.isControlDown() && ke.getKeyChar() != 'c' && ke.getKeyCode() == 67){
            cc.copy(display1);
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }
}
