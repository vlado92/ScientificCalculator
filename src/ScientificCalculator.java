import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;


public class ScientificCalculator extends javax.swing.JFrame implements KeyListener {
    
    private boolean radians_checked;
    
    public ScientificCalculator() {
        initComponents();
        display.setFocusable(true);
        display.grabFocus();
        display.requestFocus();
        display.requestFocusInWindow();
        display.addKeyListener(this);
        
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        numberOne = new javax.swing.JButton();
        mr = new javax.swing.JButton();
        mc = new javax.swing.JButton();
        ms = new javax.swing.JButton();
        oneDivideX = new javax.swing.JButton();
        plusMinus = new javax.swing.JButton();
        sqrt = new javax.swing.JButton();
        scientificMode = new javax.swing.JLabel();
        display = new javax.swing.JTextField();
        numberThree = new javax.swing.JButton();
        display2 = new javax.swing.JTextField();
        numberSix = new javax.swing.JButton();
        memory_display = new javax.swing.JTextField();
        numberNine = new javax.swing.JButton();
        simpleMode = new javax.swing.JButton();
        backspace = new javax.swing.JButton();
        numberZero = new javax.swing.JButton();
        numberTwo = new javax.swing.JButton();
        numberFive = new javax.swing.JButton();
        numberEight = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        add = new javax.swing.JButton();
        substract = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        decimalPoint = new javax.swing.JButton();
        numberSeven = new javax.swing.JButton();
        numberFour = new javax.swing.JButton();
        sinus = new javax.swing.JButton();
        cosinus = new javax.swing.JButton();
        tangensHyperbolicus = new javax.swing.JButton();
        tangens = new javax.swing.JButton();
        cosinusHyperbolicus = new javax.swing.JButton();
        sinusHyperbolicus = new javax.swing.JButton();
        cubeRoot = new javax.swing.JButton();
        cubed = new javax.swing.JButton();
        squared = new javax.swing.JButton();
        pi = new javax.swing.JButton();
        exp = new javax.swing.JButton();
        percent = new javax.swing.JButton();
        degrees = new javax.swing.JRadioButton();
        radians = new javax.swing.JRadioButton();
        arcusTangens = new javax.swing.JButton();
        arcusCosinus = new javax.swing.JButton();
        arcusSinus = new javax.swing.JButton();
        logarithm = new javax.swing.JButton();
        naturalLogarithm = new javax.swing.JButton();
        prgrammerMode = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setName("scientificCalc"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(710, 509));

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

        scientificMode.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        scientificMode.setForeground(new java.awt.Color(204, 204, 204));
        scientificMode.setText("Scientific");
        scientificMode.setName("scientificMode"); // NOI18N

        display.setEditable(false);
        display.setBackground(new java.awt.Color(102, 102, 102));
        display.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        display.setForeground(new java.awt.Color(255, 255, 255));
        display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display.setText("0");
        display.setAutoscrolls(false);
        display.setBorder(null);
        display.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        numberThree.setBackground(new java.awt.Color(51, 51, 51));
        numberThree.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numberThree.setForeground(new java.awt.Color(204, 204, 204));
        numberThree.setText("3");
        numberThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberThreeActionPerformed(evt);
            }
        });

        display2.setEditable(false);
        display2.setBackground(new java.awt.Color(102, 102, 102));
        display2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        display2.setForeground(new java.awt.Color(255, 255, 255));
        display2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display2.setAutoscrolls(false);
        display2.setBorder(null);
        display2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        numberSix.setBackground(new java.awt.Color(51, 51, 51));
        numberSix.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numberSix.setForeground(new java.awt.Color(204, 204, 204));
        numberSix.setText("6");
        numberSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberSixActionPerformed(evt);
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

        numberNine.setBackground(new java.awt.Color(51, 51, 51));
        numberNine.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numberNine.setForeground(new java.awt.Color(204, 204, 204));
        numberNine.setText("9");
        numberNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberNineActionPerformed(evt);
            }
        });

        simpleMode.setBackground(new java.awt.Color(51, 51, 51));
        simpleMode.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        simpleMode.setText("Simple");
        simpleMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpleModeActionPerformed(evt);
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

        equal.setBackground(new java.awt.Color(0, 153, 204));
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

        sinus.setBackground(new java.awt.Color(51, 51, 51));
        sinus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sinus.setForeground(new java.awt.Color(204, 204, 204));
        sinus.setText("sin");
        sinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinusActionPerformed(evt);
            }
        });

        cosinus.setBackground(new java.awt.Color(51, 51, 51));
        cosinus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cosinus.setForeground(new java.awt.Color(204, 204, 204));
        cosinus.setText("cos");
        cosinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosinusActionPerformed(evt);
            }
        });

        tangensHyperbolicus.setBackground(new java.awt.Color(51, 51, 51));
        tangensHyperbolicus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tangensHyperbolicus.setForeground(new java.awt.Color(204, 204, 204));
        tangensHyperbolicus.setText("th");
        tangensHyperbolicus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tangensHyperbolicusActionPerformed(evt);
            }
        });

        tangens.setBackground(new java.awt.Color(51, 51, 51));
        tangens.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tangens.setForeground(new java.awt.Color(204, 204, 204));
        tangens.setText("tan");
        tangens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tangensActionPerformed(evt);
            }
        });

        cosinusHyperbolicus.setBackground(new java.awt.Color(51, 51, 51));
        cosinusHyperbolicus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cosinusHyperbolicus.setForeground(new java.awt.Color(204, 204, 204));
        cosinusHyperbolicus.setText("ch");
        cosinusHyperbolicus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosinusHyperbolicusActionPerformed(evt);
            }
        });

        sinusHyperbolicus.setBackground(new java.awt.Color(51, 51, 51));
        sinusHyperbolicus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sinusHyperbolicus.setForeground(new java.awt.Color(204, 204, 204));
        sinusHyperbolicus.setText("sh");
        sinusHyperbolicus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinusHyperbolicusActionPerformed(evt);
            }
        });

        cubeRoot.setBackground(new java.awt.Color(51, 51, 51));
        cubeRoot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cubeRoot.setForeground(new java.awt.Color(204, 204, 204));
        cubeRoot.setText("3√"); // NOI18N
        cubeRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cubeRootActionPerformed(evt);
            }
        });

        cubed.setBackground(new java.awt.Color(51, 51, 51));
        cubed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cubed.setForeground(new java.awt.Color(204, 204, 204));
        cubed.setText("x^3");
        cubed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cubedActionPerformed(evt);
            }
        });

        squared.setBackground(new java.awt.Color(51, 51, 51));
        squared.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        squared.setForeground(new java.awt.Color(204, 204, 204));
        squared.setText("x^2");
        squared.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squaredActionPerformed(evt);
            }
        });

        pi.setBackground(new java.awt.Color(51, 51, 51));
        pi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pi.setForeground(new java.awt.Color(204, 204, 204));
        pi.setText("π");
        pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piActionPerformed(evt);
            }
        });

        exp.setBackground(new java.awt.Color(51, 51, 51));
        exp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exp.setForeground(new java.awt.Color(204, 204, 204));
        exp.setText("e^x");
        exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expActionPerformed(evt);
            }
        });

        percent.setBackground(new java.awt.Color(51, 51, 51));
        percent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        percent.setForeground(new java.awt.Color(204, 204, 204));
        percent.setText("%");
        percent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentActionPerformed(evt);
            }
        });

        degrees.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(degrees);
        degrees.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        degrees.setForeground(new java.awt.Color(204, 204, 204));
        degrees.setSelected(true);
        degrees.setText("Degrees");
        degrees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreesActionPerformed(evt);
            }
        });

        radians.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(radians);
        radians.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radians.setForeground(new java.awt.Color(204, 204, 204));
        radians.setText("Radians");
        radians.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiansActionPerformed(evt);
            }
        });

        arcusTangens.setBackground(new java.awt.Color(51, 51, 51));
        arcusTangens.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        arcusTangens.setForeground(new java.awt.Color(204, 204, 204));
        arcusTangens.setText("atan");
        arcusTangens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arcusTangensActionPerformed(evt);
            }
        });

        arcusCosinus.setBackground(new java.awt.Color(51, 51, 51));
        arcusCosinus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        arcusCosinus.setForeground(new java.awt.Color(204, 204, 204));
        arcusCosinus.setText("acos");
        arcusCosinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arcusCosinusActionPerformed(evt);
            }
        });

        arcusSinus.setBackground(new java.awt.Color(51, 51, 51));
        arcusSinus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        arcusSinus.setForeground(new java.awt.Color(204, 204, 204));
        arcusSinus.setText("asin");
        arcusSinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arcusSinusActionPerformed(evt);
            }
        });

        logarithm.setBackground(new java.awt.Color(51, 51, 51));
        logarithm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logarithm.setForeground(new java.awt.Color(204, 204, 204));
        logarithm.setText("log");
        logarithm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logarithmActionPerformed(evt);
            }
        });

        naturalLogarithm.setBackground(new java.awt.Color(51, 51, 51));
        naturalLogarithm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        naturalLogarithm.setForeground(new java.awt.Color(204, 204, 204));
        naturalLogarithm.setText("ln");
        naturalLogarithm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naturalLogarithmActionPerformed(evt);
            }
        });

        prgrammerMode.setBackground(new java.awt.Color(51, 51, 51));
        prgrammerMode.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        prgrammerMode.setText("Programmer");
        prgrammerMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prgrammerModeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(memory_display, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(simpleMode, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(scientificMode, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(prgrammerMode)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(display2)
                            .addComponent(display, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(oneDivideX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ms, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(plusMinus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sqrt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(sinusHyperbolicus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cosinusHyperbolicus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tangensHyperbolicus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(pi, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(exp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(squared, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(cubed, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(cubeRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(percent, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(sinus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cosinus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(5, 5, 5)
                                            .addComponent(tangens, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(radians, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(degrees, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(logarithm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(naturalLogarithm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(arcusSinus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(arcusCosinus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(arcusTangens, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(numberSeven, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                                .addComponent(numberFour, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                                .addComponent(numberOne, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                                            .addComponent(reset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(numberFive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(numberEight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(numberTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(numberZero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 19, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(numberNine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(backspace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(numberThree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(decimalPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numberSix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(substract, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                                .addComponent(equal, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scientificMode, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simpleMode)
                    .addComponent(prgrammerMode))
                .addGap(5, 5, 5)
                .addComponent(memory_display, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(display2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(degrees)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(naturalLogarithm, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logarithm, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radians))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(exp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(percent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cubeRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cubed, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(squared, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tangensHyperbolicus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cosinusHyperbolicus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sinusHyperbolicus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sinus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tangens, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cosinus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(mc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ms, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(plusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decimalPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberZero, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oneDivideX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arcusTangens, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arcusCosinus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arcusSinus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("scientificCalc");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
    
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
        else {
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
    
    private void numberFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberFourActionPerformed
        writeNumber("4");
    }//GEN-LAST:event_numberFourActionPerformed

    private void numberSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberSevenActionPerformed
        writeNumber("7");
    }//GEN-LAST:event_numberSevenActionPerformed

    private void decimalPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalPointActionPerformed
        if(!hasDecimalPoint) {
            display.setText(display.getText() + ".");
            hasDecimalPoint = true;
        }
        display.grabFocus();
    }//GEN-LAST:event_decimalPointActionPerformed

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

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        /* operator == 0 (nothing)
        operator == 1 (addition)
        operator  == 2 (substraction)
        operator == 3 (multiplication)
        operator == 4 (dividing)
        operator == 5 (percentage)*/
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
        
        if (operator == 5) {
            result = number1 * number2 / 100;
            display2.setText(display2.getText() + String.valueOf(number2) + ")");
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

    private void substractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_substractActionPerformed
        checkOperatorValue();
        display2.setText(String.valueOf(number1) + " - ");
        operator = 2;
        hasDecimalPoint = false;
        beginsWithZero = false;
        display.grabFocus();
    }//GEN-LAST:event_substractActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        checkOperatorValue();
        display2.setText(String.valueOf(number1) + " + ");
        operator = 1;
        hasDecimalPoint = false;
        beginsWithZero = false;
        display.grabFocus();
    }//GEN-LAST:event_addActionPerformed

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

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        display.setText("0");
        display2.setText(null);
        hasDecimalPoint = false;
        beginsWithZero = false;
        display.grabFocus();
    }//GEN-LAST:event_clearActionPerformed

    private void numberEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberEightActionPerformed
        writeNumber("8");
    }//GEN-LAST:event_numberEightActionPerformed

    private void numberFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberFiveActionPerformed
        writeNumber("5");
    }//GEN-LAST:event_numberFiveActionPerformed

    private void numberTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberTwoActionPerformed
        writeNumber("2");
    }//GEN-LAST:event_numberTwoActionPerformed

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

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceActionPerformed
        c.backspace(display);
        hasDecimalPoint = display.getText().contains(".");
        display.grabFocus();
    }//GEN-LAST:event_backspaceActionPerformed

    private void simpleModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpleModeActionPerformed
        SimpleCalculator calc = new SimpleCalculator();
        calc.setLocation(this.getLocation());
        calc.setVisible(true);
        this.dispose();
        display.grabFocus();
    }//GEN-LAST:event_simpleModeActionPerformed

    private void numberNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberNineActionPerformed
        writeNumber("9");
    }//GEN-LAST:event_numberNineActionPerformed

    private void numberSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberSixActionPerformed
        writeNumber("6");
    }//GEN-LAST:event_numberSixActionPerformed

    private void numberThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberThreeActionPerformed
        writeNumber("3");
    }//GEN-LAST:event_numberThreeActionPerformed

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
            //display.setText(String.valueOf(result));
            display.setText(format.format(doubleFromTextField));
        }
        else {
            display.setText("0");
            display2.setText("Error!");
        }
        result = 0;
        display.grabFocus();
    }//GEN-LAST:event_plusMinusActionPerformed

    private void oneDivideXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneDivideXActionPerformed
        Calculator cc = new Calculator();
        cc.oneDivideX(number2, result, display, display2);
        DecimalFormat format = new DecimalFormat("#.##########");
        double doubleFromTextField = Double.parseDouble(display.getText());
        System.out.println(format.format(doubleFromTextField));
        
        if(number2 == 0){
            display.setText("0");
            //display2.setText("Error!");
        }
        
        if (result > -100000000 && result < 100000000) {
            //display.setText(String.valueOf(result));
            display.setText(format.format(doubleFromTextField));
        }
        else {
            display.setText("0");
            //display2.setText("Error!");
        }
        
        hasDecimalPoint = display.getText().contains(".");
        equalPressed = true;
        display.grabFocus();
    }//GEN-LAST:event_oneDivideXActionPerformed

    private void msActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msActionPerformed
        //memory_display.setText(String.valueOf(display.getText()));
        Calculator cc = new Calculator();
        cc.ms(display, memory_display);
        display.grabFocus();
    }//GEN-LAST:event_msActionPerformed

    private void mcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcActionPerformed
        //memory_display.setText(null);
        Calculator cc = new Calculator();
        cc.mc(memory_display);
        display.grabFocus();
    }//GEN-LAST:event_mcActionPerformed

    private void mrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mrActionPerformed
        //display.setText(String.valueOf(memory_display.getText()));
        Calculator cc = new Calculator();
        cc.mr(display, memory_display);
        display.grabFocus();
    }//GEN-LAST:event_mrActionPerformed

    private void numberOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberOneActionPerformed
        if(!beginsWithZero && !hasDecimalPoint) {
            display.setText(null);
        }
        display.setText(display.getText() + "1");
        beginsWithZero = true;
        display.grabFocus();
    }//GEN-LAST:event_numberOneActionPerformed

    private void sinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinusActionPerformed
        //Java performs trigonometric functions in radians, so if degrees are selected
        //it will be converted from degrees to radians
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        display2.setText("sin(" + String.valueOf(number2) + ")");
        if (!radians_checked) {
            number2 = number2 * 0.0174532925;
        }
        result = round(Math.sin(number2),8);
        //display.setText(String.valueOf(result));
        DecimalFormat format = new DecimalFormat("#.########");
        double doubleFromTextField = Double.parseDouble(String.valueOf(result));
        
        if (result > -100000000 && result < 100000000) {
            display.setText(format.format(doubleFromTextField));
        }
        else {
            display.setText("0");
            display2.setText("Error!");
        }
        hasDecimalPoint = display.getText().contains(".");
        result = 0;
        equalPressed = true;
        display.grabFocus();
    }//GEN-LAST:event_sinusActionPerformed

    private void cosinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosinusActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        display2.setText("cos(" + String.valueOf(number2) + ")");
        if (!radians_checked) {
            number2 = number2 * 0.0174532925;
        }
        result = round( Math.cos(number2), 8);
        DecimalFormat format = new DecimalFormat("#.########");
        double doubleFromTextField = Double.parseDouble(String.valueOf(result));
        
        if (result > -100000000 && result < 100000000) {
            display.setText(format.format(doubleFromTextField));
        }
        else {
            display.setText("0");
            display2.setText("Error!");
        }
        hasDecimalPoint = display.getText().contains(".");
        result = 0;
        equalPressed = true;
        display.grabFocus();
    }//GEN-LAST:event_cosinusActionPerformed

    private void tangensHyperbolicusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tangensHyperbolicusActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        display2.setText("tanh(" + String.valueOf(number2) + ")");
        result = Math.tanh(number2);
        DecimalFormat format = new DecimalFormat("#.########");
        double doubleFromTextField = Double.parseDouble(String.valueOf(result));
        
        if (result > -100000000 && result < 100000000) {
            display.setText(format.format(doubleFromTextField));
        }
        else {
            display.setText("0");
            display2.setText("Error!");
        }
        hasDecimalPoint = display.getText().contains(".");
        result = 0; 
        equalPressed = true;
        display.grabFocus();
    }//GEN-LAST:event_tangensHyperbolicusActionPerformed

    private void tangensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tangensActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        display2.setText("tan(" + String.valueOf(number2) + ")");
        if (!radians_checked) {
            number2 = number2 * 0.0174532925;
        }
        result = Math.tan(number2);
        DecimalFormat format = new DecimalFormat("#.########");
        double doubleFromTextField = Double.parseDouble(String.valueOf(result));
        
        if (result > -100000000 && result < 100000000) {
            display.setText(format.format(doubleFromTextField));
        }
        else {
            display.setText("0");
            display2.setText("Error!");
        }
        hasDecimalPoint = display.getText().contains(".");
        result = 0;
        equalPressed = true;
        display.grabFocus();
    }//GEN-LAST:event_tangensActionPerformed

    private void cosinusHyperbolicusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosinusHyperbolicusActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        display2.setText("cosh(" + String.valueOf(number2) + ")");
        result = Math.cosh(number2);
        DecimalFormat format = new DecimalFormat("#.########");
        double doubleFromTextField = Double.parseDouble(String.valueOf(result));
        
        if (result > -100000000 && result < 100000000) {
            display.setText(format.format(doubleFromTextField));
        }
        else {
            display.setText("0");
            display2.setText("Error!");
        }
        hasDecimalPoint = display.getText().contains(".");
        result = 0; 
        equalPressed = true;
        display.grabFocus();
    }//GEN-LAST:event_cosinusHyperbolicusActionPerformed

    private void sinusHyperbolicusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinusHyperbolicusActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        display2.setText("sinh(" + String.valueOf(number2) + ")");
        result = Math.sinh(number2);
        DecimalFormat format = new DecimalFormat("#.########");
        double doubleFromTextField = Double.parseDouble(String.valueOf(result));
        
        if (result > -100000000 && result < 100000000) {
            display.setText(format.format(doubleFromTextField));
        }
        else {
            display.setText("0");
            display2.setText("Error!");
        }
        hasDecimalPoint = display.getText().contains(".");
        result = 0;    
        equalPressed = true;
        display.grabFocus();
    }//GEN-LAST:event_sinusHyperbolicusActionPerformed

    private void cubeRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cubeRootActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        result = Math.cbrt(number2);

        DecimalFormat format = new DecimalFormat("#.##########");
        double doubleFromTextField = Double.parseDouble(String.valueOf(result));
        if (result > -100000000 && result < 100000000) {
            display.setText(format.format(doubleFromTextField));
        }
        else {
            display.setText("0");
            display2.setText("Error!");
        }
        display2.setText("3√" + String.valueOf(number2));
        
        hasDecimalPoint = display.getText().contains(".");
        result = 0;
        equalPressed = true;
        display.grabFocus();
    }//GEN-LAST:event_cubeRootActionPerformed

    private void cubedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cubedActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        result = number2 * number2 * number2;

        DecimalFormat format = new DecimalFormat("#.##########");
        double doubleFromTextField = Double.parseDouble(String.valueOf(result));
        if (result > -100000000 && result < 100000000) {
            display.setText(format.format(doubleFromTextField));
        }
        else {
            display.setText("0");
            display2.setText("Error!");
        }
        display2.setText(String.valueOf(number2) + "^3");
        hasDecimalPoint = display.getText().contains(".");
        result = 0;
        equalPressed = true;
        display.grabFocus();
    }//GEN-LAST:event_cubedActionPerformed

    private void squaredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squaredActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        result = number2 * number2;

        DecimalFormat format = new DecimalFormat("#.##########");
        double doubleFromTextField = Double.parseDouble(String.valueOf(result));
        if (result > -100000000 && result < 100000000) {
            display.setText(format.format(doubleFromTextField));
        }
        else {
            display.setText("0");
            display2.setText("Error!");
        }
        display2.setText(String.valueOf(number2) + "^2");
        hasDecimalPoint = display.getText().contains(".");
        result = 0;
        number1 = 0;
        number2 = 0;
        operator = 0;
        beginsWithZero = false;
        equalPressed = true;
        display.grabFocus();
    }//GEN-LAST:event_squaredActionPerformed

    private void piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piActionPerformed
        display.setText(String.valueOf(Math.PI));
        hasDecimalPoint = true;
        equalPressed = true;
        display.grabFocus();
    }//GEN-LAST:event_piActionPerformed

    private void expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        display2.setText("e^(" + String.valueOf(number2) + ")");
        result = Math.exp(number2);
        DecimalFormat format = new DecimalFormat("#.##########");
        double doubleFromTextField = Double.parseDouble(String.valueOf(result));
        
        if (result > -100000000 && result < 100000000) {
            display.setText(format.format(doubleFromTextField));
        }
        else {
            display.setText("0");
            display2.setText("Error!");
        }
        hasDecimalPoint = true;
        result = 0; 
        equalPressed = true;
        display.grabFocus();
    }//GEN-LAST:event_expActionPerformed

    private void percentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentActionPerformed
        number1 = Double.parseDouble(String.valueOf(display.getText()));
        display.setText("0");
        display2.setText(String.valueOf(number1) + "%(");
        hasDecimalPoint = false;
        beginsWithZero = false;
        operator = 5;
        equalPressed = true;
        display.grabFocus();
    }//GEN-LAST:event_percentActionPerformed

    private void degreesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreesActionPerformed
        radians_checked = false;
        display.grabFocus();
    }//GEN-LAST:event_degreesActionPerformed

    private void radiansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiansActionPerformed
        radians_checked = true;
        display.grabFocus();
    }//GEN-LAST:event_radiansActionPerformed

    private void arcusTangensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arcusTangensActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        display2.setText("arctan(" + String.valueOf(number2) + ")");
        if (!radians_checked) {
            result = Math.toDegrees(Math.atan(number2));
            display.setText(String.valueOf(result));
            result = 0;
        }
        else{
            result = Math.atan(number2);
            display.setText(String.valueOf(result));
            result = 0;
        }
        equalPressed = true;
        display.grabFocus();
    }//GEN-LAST:event_arcusTangensActionPerformed

    private void arcusCosinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arcusCosinusActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        display2.setText("arccos(" + String.valueOf(number2) + ")");
        if (!radians_checked) {
            result = Math.toDegrees(Math.acos(number2));
            display.setText(String.valueOf(result));
            result = 0;
        }
        else{
            result = Math.acos(number2);
            display.setText(String.valueOf(result));
            result = 0;
        }
        equalPressed = true;
        display.grabFocus();
    }//GEN-LAST:event_arcusCosinusActionPerformed

    private void arcusSinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arcusSinusActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        display2.setText("arcsin(" + String.valueOf(number2) + ")");
        if (!radians_checked) {
            result = Math.toDegrees(Math.asin(number2));
            display.setText(String.valueOf(result));
            result = 0;
        }
        else{
            result = Math.asin(number2);
            display.setText(String.valueOf(result));
            result = 0;
        }
        equalPressed = true;
        display.grabFocus();
    }//GEN-LAST:event_arcusSinusActionPerformed

    private void logarithmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logarithmActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        display2.setText("log(" + String.valueOf(number2) + ")");
        result = Math.log10(number2);
        display.setText(String.valueOf(result));
        result = 0; 
        equalPressed = true;
        display.grabFocus();
    }//GEN-LAST:event_logarithmActionPerformed

    private void naturalLogarithmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naturalLogarithmActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        display2.setText("ln(" + String.valueOf(number2) + ")");
        result = Math.log(number2);
        display.setText(String.valueOf(result));
        hasDecimalPoint = display.getText().contains(".");
        result = 0;
        number1 = 0;
        number2 = 0;
        operator = 0;
        //beginsWithZero = false;
        equalPressed = true;
        display.grabFocus();
    }//GEN-LAST:event_naturalLogarithmActionPerformed

    private void prgrammerModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prgrammerModeActionPerformed
        ProgrammerCalculator progMode = new ProgrammerCalculator();
        progMode.setLocation(this.getLocation());
        progMode.setVisible(true);
        this.dispose();
        display.grabFocus();
    }//GEN-LAST:event_prgrammerModeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton arcusCosinus;
    private javax.swing.JButton arcusSinus;
    private javax.swing.JButton arcusTangens;
    private javax.swing.JButton backspace;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JButton cosinus;
    private javax.swing.JButton cosinusHyperbolicus;
    private javax.swing.JButton cubeRoot;
    private javax.swing.JButton cubed;
    private javax.swing.JButton decimalPoint;
    private javax.swing.JRadioButton degrees;
    private javax.swing.JTextField display;
    private javax.swing.JTextField display2;
    private javax.swing.JButton divide;
    private javax.swing.JButton equal;
    private javax.swing.JButton exp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logarithm;
    private javax.swing.JButton mc;
    private javax.swing.JTextField memory_display;
    private javax.swing.JButton mr;
    private javax.swing.JButton ms;
    private javax.swing.JButton multiply;
    private javax.swing.JButton naturalLogarithm;
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
    private javax.swing.JButton percent;
    private javax.swing.JButton pi;
    private javax.swing.JButton plusMinus;
    private javax.swing.JButton prgrammerMode;
    private javax.swing.JRadioButton radians;
    private javax.swing.JButton reset;
    private javax.swing.JLabel scientificMode;
    private javax.swing.JButton simpleMode;
    private javax.swing.JButton sinus;
    private javax.swing.JButton sinusHyperbolicus;
    private javax.swing.JButton sqrt;
    private javax.swing.JButton squared;
    private javax.swing.JButton substract;
    private javax.swing.JButton tangens;
    private javax.swing.JButton tangensHyperbolicus;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent ke) {
    }

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
    public void keyReleased(KeyEvent ke) {
    }
}
