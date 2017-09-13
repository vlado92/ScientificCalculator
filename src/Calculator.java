
import javax.swing.JTextField;
import java.awt.datatransfer.*;
import java.awt.Toolkit;

public class Calculator {

    public boolean beginsWithZero;
    public boolean hasDecimalPoint;
    public boolean equalPressed;

    public byte operator;

    public double number1;
    public double number2;
    public double result;

    public void writeNumber(String num, JTextField display) {
        if (!beginsWithZero && !hasDecimalPoint) {
            display.setText(null);
        }
        display.setText(display.getText() + num);
        beginsWithZero = true;
        display.grabFocus();
    }

    public void mr(JTextField display, JTextField memory_display) {
        display.setText(String.valueOf(memory_display.getText()));
    }

    public void mc(JTextField memory_display) {
        memory_display.setText(null);
    }

    public void ms(JTextField display, JTextField memory_display) {
        memory_display.setText(String.valueOf(display.getText()));
    }

    public void clear(JTextField display, JTextField display2) {
        display.setText("0");
        display2.setText(null);
    }

    public void oneDivideX(double number2, double result, JTextField display, JTextField display2) {
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        result = 1 / number2;

        if (number2 == 0) {
            display.setText("0");
            //display2.setText("Error!");
        }

        if (result > -100000000 && result < 100000000) {
            display.setText(String.valueOf(result));
        } else {
            display.setText("0");
            //display2.setText("Error!");
        }

        display2.setText("1/" + String.valueOf(number2));
        result = 0;
    }

    public void sqrt(double number2, double result, JTextField display, JTextField display2) {
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        result = Math.sqrt(number2);

        if (result > -100000000 && result < 100000000) {
            display.setText(String.valueOf(result));
        } else {
            display.setText("0");
            display2.setText("Error!");
        }
        display2.setText("√" + String.valueOf(number2));
        result = 0;
        number2 = 0;
    }

    public void backspace(JTextField display) {
        if (display.getText().length() > 0) {
            display.setText(display.getText().substring(0, display.getText().length() - 1));
        }
    }

    public void copy(JTextField display) {
        String myString = display.getSelectedText();
        StringSelection stringSelection = new StringSelection(myString);
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        clpbrd.setContents(stringSelection, null);
    }


    public void checkOperatorValue(JTextField display) {
        if (operator == 0) {
            number1 = Double.parseDouble(String.valueOf(display.getText()));
        } else {
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

}
