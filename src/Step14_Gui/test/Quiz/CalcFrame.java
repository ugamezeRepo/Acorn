package Step14_Gui.test.Quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.HashSet;
import java.util.Set;

public class CalcFrame extends JFrame {
    Double num1, num2, calc;
    JTextField numText1, numText2;
    JLabel result;
    public CalcFrame (String title) {
        super(title);

        setBounds(100, 100, 700, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());


        this.numText1 = new JTextField(10);
        this.numText2 = new JTextField(10);
        Set<JButton> calcBtns = new HashSet<>();
        JButton addBtn = new JButton("+");
        JButton subBtn = new JButton("-");
        JButton mulBtn = new JButton("*");
        JButton divBtn = new JButton("/");

        JLabel equal = new JLabel("=");
        result = new JLabel("0");
        
        calcBtns.add(addBtn);
        calcBtns.add(subBtn);
        calcBtns.add(mulBtn);
        calcBtns.add(divBtn);

        calcBtns.forEach(btn -> btn.addActionListener(this::Calc));

        add(numText1);
        add(addBtn);
        add(subBtn);
        add(mulBtn);
        add(divBtn);
        add(numText2);
        add(equal);
        add(result);
    }

    public static void main(String[] args) {
        CalcFrame cf = new CalcFrame("간단한 계산기");
        cf.setVisible(true);
    }

    public void Calc(ActionEvent btn) {
        try {
            this.num1 = Double.parseDouble(numText1.getText());
            this.num2 = Double.parseDouble(numText2.getText());
            
            switch (btn.getActionCommand().toString()) {
                case "+":
                    calc = num1 + num2;
                    break;
                case "-":
                    calc = num1 - num2;
                    break;
                case "*":
                    calc = num1 * num2;
                    break;
                case "/":
                    if ( num2 == 0) {
                        throw new ArithmeticException();
                    }
                    calc = num1 / num2;
                    break;
            }

            result.setText(calc.toString());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "숫자를 입력하세요.");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(this, "0으로 나눌 수 없습니다.");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
