import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc implements ActionListener {
    JFrame frame;

    JTextField textField;

    JButton[] numberButtons = new JButton[10];

    JButton[] functionButtons = new JButton[9];
    JButton addButton, subtractButton, multiplyButton, divideButton,
            eqButton, decButton, delButton, clearButton, negButton;

    JButton[] trigButtons = new JButton[6];
    JButton sinButton, cosButton, tanButton, sinhButton, coshButton, tanhButton;

    JButton piButton, expButton;

    JButton[] logButtons = new JButton[9];
    JButton logButton, lnButton, sqrtButton, cubeButton, powButton, exponentButton, factorialButton, squareButton;

    JButton[] rootsButtons = new JButton[5];
    JButton inverseButton, cubeRootButton, rootButton, powerTenButton, percentageButton;

    JPanel panel;
    double num1 = 0, num2 = 0, result = 0;
    String operator = "";

    TrigApp trig = new TrigApp();
    LogApp log = new LogApp();
    RootApp roots = new RootApp();

    Calc() {
        frame = new JFrame("Calculator for BADDIESSSS!!!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(new Color(230, 180, 190));
        frame.setLayout(null);
        frame.setBackground(Color.BLACK);

        textField = new JTextField();
        textField.setBounds(50, 39, 700, 80);
        textField.setEditable(false);
        textField.setFont(new Font("Arial", Font.PLAIN, 20));
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setBackground(Color.WHITE);
        textField.setForeground(new Color(255, 20, 147));
        textField.setPreferredSize(new Dimension(0, 100));
        frame.add(textField, BorderLayout.NORTH);

        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("x");
        divideButton = new JButton("÷");

        eqButton = new JButton("=");
        decButton = new JButton(".");
        delButton = new JButton("DEL");
        clearButton = new JButton("CLR");
        negButton = new JButton("(-)");

        sinButton = new JButton("sin");
        cosButton = new JButton("cos");
        tanButton = new JButton("tan");
        sinhButton = new JButton("sinh");
        coshButton = new JButton("cosh");
        tanhButton = new JButton("tanh");

        piButton = new JButton("π");
        expButton = new JButton("e");
        logButton = new JButton("log10");
        lnButton = new JButton("ln");
        sqrtButton = new JButton("√");

        cubeButton = new JButton("x³");
        powButton = new JButton("xʸ");
        exponentButton = new JButton("eˣ");
        factorialButton = new JButton("x!");
        squareButton = new JButton("x²");

        inverseButton = new JButton("1/x");
        cubeRootButton = new JButton("∛x");
        powerTenButton = new JButton("10ˣ");
        rootButton = new JButton("ʸ√x");
        percentageButton = new JButton("%");

        functionButtons[0] = addButton;
        functionButtons[1] = subtractButton;
        functionButtons[2] = multiplyButton;
        functionButtons[3] = divideButton;
        functionButtons[4] = eqButton;
        functionButtons[5] = decButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clearButton;
        functionButtons[8] = negButton;

        trigButtons[0] = sinButton;
        trigButtons[1] = cosButton;
        trigButtons[2] = tanButton;
        trigButtons[3] = sinhButton;
        trigButtons[4] = coshButton;
        trigButtons[5] = tanhButton;

        logButtons[0] = logButton;
        logButtons[1] = lnButton;
        logButtons[2] = sqrtButton;
        logButtons[3] = cubeButton;
        logButtons[4] = powButton;
        logButtons[5] = expButton;
        logButtons[6] = factorialButton;
        logButtons[7] = squareButton;
        logButtons[8] = exponentButton;

        rootsButtons[0] = rootButton;
        rootsButtons[1] = inverseButton;
        rootsButtons[2] = powerTenButton;
        rootsButtons[3] = cubeRootButton;
        rootsButtons[4] = percentageButton;

        for (JButton button : functionButtons) {
            button.addActionListener(this);
            button.setFocusable(false);
            button.setBorder(new RoundedBorder(15));
        }
        for (JButton button : trigButtons) {
            button.addActionListener(this);
            button.setFocusable(false);
            button.setBackground(new Color(255, 200, 221));
            button.setBorder(new RoundedBorder(15));
        }
        for (JButton button : logButtons) {
            button.addActionListener(this);
            button.setFocusable(false);
            button.setBackground(new Color(255, 140, 175));
            button.setBorder(new RoundedBorder(15));
        }
        for (JButton button : rootsButtons) {
            button.addActionListener(this);
            button.setFocusable(false);
            button.setBackground(new Color(255, 140, 175));
            button.setBorder(new RoundedBorder(15));
        }

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFocusable(false);
            numberButtons[i].setBackground(new Color(255, 182, 193));
            numberButtons[i].setForeground(Color.WHITE);
            numberButtons[i].setPreferredSize(new Dimension(60, 60));
            numberButtons[i].setBorder(new RoundedBorder(5));

        }
        delButton.setBackground(new Color(255, 105, 180));
        clearButton.setBackground(new Color(255, 105, 180));

        decButton.setBackground(new Color(255, 215, 230));
        eqButton.setBackground(new Color(255, 215, 230));

        addButton.setBackground(new Color(255, 99, 132));
        subtractButton.setBackground(new Color(255, 99, 132));
        multiplyButton.setBackground(new Color(255, 99, 132));
        divideButton.setBackground(new Color(255, 99, 132));

        negButton.setBackground(new Color(255, 170, 185));
        percentageButton.setBackground(new Color(255, 170, 185));

        logButton.setBackground(new Color(255, 140, 175));
        lnButton.setBackground(new Color(255, 140, 175));
        expButton.setBackground(new Color(255, 140, 175));


        panel = new JPanel();
        panel.setBounds(50, 120, 700, 350);
        panel.setLayout(new GridLayout(4, 10, 0, 0));
        panel.setBackground(new Color(255, 221, 244));


        panel.add(inverseButton);
        panel.add(sqrtButton);
        panel.add(cubeRootButton);
        panel.add(rootButton);
        panel.add(lnButton);
        panel.add(logButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(addButton);

        panel.add(factorialButton);
        panel.add(squareButton);
        panel.add(cubeButton);
        panel.add(powButton);
        panel.add(exponentButton);
        panel.add(powerTenButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subtractButton);

        panel.add(delButton);
        panel.add(negButton);
        panel.add(piButton);
        panel.add(sinButton);
        panel.add(cosButton);
        panel.add(tanButton);
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(multiplyButton);

        panel.add(clearButton);
        panel.add(percentageButton);
        panel.add(expButton);
        panel.add(sinhButton);
        panel.add(coshButton);
        panel.add(tanhButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(eqButton);
        panel.add(divideButton);


        frame.setMinimumSize(new Dimension(500, 400));

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
        piButton.addActionListener(this);
        piButton.setBackground(new Color(230, 150, 170));
        piButton.setBorder(new RoundedBorder(15));
        expButton.addActionListener(this);
        expButton.setBackground(new Color(230, 150, 170));
        expButton.setBorder(new RoundedBorder(15));


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText() + i);
                return;
            }
        }
        if (e.getSource() == decButton) {
            if (!textField.getText().contains(".")) {
                textField.setText(textField.getText() + ".");
            }
            return;
        }
        if (e.getSource() == addButton || e.getSource() == subtractButton ||
                e.getSource() == multiplyButton || e.getSource() == divideButton) {

            if (!textField.getText().isEmpty()) {
                num1 = Double.parseDouble(textField.getText());
                operator = ((JButton) e.getSource()).getText();
                textField.setText("");
            }

        }
        if (e.getSource() == eqButton) {
            if (!textField.getText().isEmpty()) {
                num2 = Double.parseDouble(textField.getText());

                switch (operator) {
                    case "+" -> result = num1 + num2;
                    case "-" -> result = num1 - num2;
                    case "x" -> result = num1 * num2;
                    case "÷" -> {
                        if (num2 == 0) {
                            textField.setText("Error: Division by Zero");
                            return;
                        }
                        result = num1 / num2;
                    }
                    case "^" -> result = log.power(num1, num2);
                    case "%" -> result = num1 % num2;
                    case "^y" -> result = log.root(num1, num2);
                }

                textField.setText(String.valueOf(result));
                num1 = result;
            }
            return;
        }
        if (e.getSource() == clearButton) {
            textField.setText("");
            return;
        }
        if (e.getSource() == delButton) {
            String text = textField.getText();
            if (!text.isEmpty()) {
                textField.setText(text.substring(0, text.length() - 1));
            }
            return;
        }
        if (e.getSource() == negButton) {
            if (!textField.getText().isEmpty()) {
                double temp = Double.parseDouble(textField.getText());
                temp *= -1;
                textField.setText(String.valueOf(temp));
            }
        }
        if (e.getSource() == sinButton) {
            double value = Double.parseDouble(textField.getText());
            textField.setText(String.valueOf(trig.sin(value)));
        }
        if (e.getSource() == cosButton) {
            double value = Double.parseDouble(textField.getText());
            textField.setText(String.valueOf(trig.cos(value)));
        }
        if (e.getSource() == tanButton) {
            double value = Double.parseDouble(textField.getText());
            textField.setText(String.valueOf(trig.tan(value)));
        }
        if (e.getSource() == sinhButton) {
            double value = Double.parseDouble(textField.getText());
            textField.setText(String.valueOf(trig.sinh(value)));
        }
        if (e.getSource() == coshButton) {
            double value = Double.parseDouble(textField.getText());
            textField.setText(String.valueOf(trig.cosh(value)));
        }
        if (e.getSource() == tanhButton) {
            double value = Double.parseDouble(textField.getText());
            textField.setText(String.valueOf(trig.tanh(value)));
        }
        if (e.getSource() == piButton) {
            textField.setText(String.valueOf(Math.PI));
        }
        if (e.getSource() == expButton) {
            textField.setText(String.valueOf(Math.E));
        }
        if (e.getSource() == lnButton) {
            double value = Double.parseDouble(textField.getText());
            if (value > 0) {
                textField.setText(String.valueOf(log.ln(value)));
            } else {
                textField.setText("Error");
            }
        }
        if (e.getSource() == sqrtButton) {
            double value = Double.parseDouble(textField.getText());
            textField.setText(String.valueOf(log.sqrt(value)));
        }
        if (e.getSource() == factorialButton) {
            double value = Double.parseDouble(textField.getText());
            if (value < 0 || value != (int) value) {
                textField.setText("Error");
            } else {
                int x = (int) value;
                textField.setText(String.valueOf(log.factorial(x)));
            }
        }
        if (e.getSource() == logButton) {
            double value = Double.parseDouble(textField.getText());
            textField.setText(String.valueOf(log.log10(value)));
        }
        if (e.getSource() == cubeButton){
            double value = Double.parseDouble(textField.getText());
            textField.setText(String.valueOf(log.cube(value)));
        }
        if (e.getSource() == powButton) {
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");
            operator = "^";
        }
        if (e.getSource() == exponentButton) {
            double value = Double.parseDouble(textField.getText());
            textField.setText(String.valueOf(log.exponential(value)));
        }
        if (e.getSource() == inverseButton) {
            if (!textField.getText().isEmpty()) {
                try {
                    double value = Double.parseDouble(textField.getText());
                    textField.setText(String.valueOf(roots.inverse(value)));
                } catch (NumberFormatException ex) {
                    textField.setText("Error");
                }
            }
        }
        if (e.getSource() == percentageButton) {
            if (!textField.getText().isEmpty()) {
                double value = Double.parseDouble(textField.getText());
                textField.setText(String.valueOf(roots.percentage(value)));
            }
        }
        if (e.getSource() == squareButton) {
            double value = Double.parseDouble(textField.getText());
            textField.setText(String.valueOf(log.square(value)));
        }
        if (e.getSource() == powerTenButton) {
            double value = Double.parseDouble(textField.getText());
            textField.setText(String.valueOf(roots.powerTen(value)));
        }
        if (e.getSource() == cubeRootButton) {
            double value = Double.parseDouble(textField.getText());
            textField.setText(String.valueOf(roots.cubeRoot(value)));
        }
        if (e.getSource() == rootButton){
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");
            operator = "^y";
        }
    }
}

