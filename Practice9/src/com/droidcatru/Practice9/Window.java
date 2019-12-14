package com.droidcatru.Practice9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;

public class Window extends JFrame {
    JTextField jta = new JTextField(10);
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    JButton button = new JButton("Check user");

    boolean isNumber(String str) {
        int iterator = 0;
        int counter = 0;
        while(iterator < str.length()) {
            if(Character.isDigit(str.charAt(iterator))) counter++;
            iterator++;
        }
        if(str.length() == counter)
            return true;
        else
            return false;
    }

    int numberOfDigits(String str) {
        int iterator = 0;
        int counter = 0;
        while(iterator < str.length()) {
            if(Character.isDigit(str.charAt(iterator))) counter++;
            iterator++;
        }
        return counter;
    }

    Window() {
        super("Window");
        setLayout(new FlowLayout());
        setSize(400, 100);
        setVisible(true);
        add(jta);
        add(button);
        jta.setFont(fnt);
        setVisible(true);

        HashMap<String, String> map = new HashMap<>();
        map.put("123456789012", "John");
        map.put("774389472103", "Sam");
        map.put("274988465656", "Max");
        map.put("476669212145", "David");
        map.put("646648695132", "Alex");

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    if (jta.getText().length() != 0) {
                        if (isNumber(jta.getText())) {
                            if ((numberOfDigits(jta.getText()) == 12)) {
                                if(map.get(jta.getText()) != null) {
                                    JOptionPane.showMessageDialog(null, "ИНН " + jta.getText() + " принадлежит пользователю " + map.get(jta.getText()));
                                }
                                else
                                    throw new UserNotFoundException("User with this document was not found");
                            }
                            else
                                JOptionPane.showMessageDialog(null, "Введенно некорректное значение.");
                        }
                        else
                            JOptionPane.showMessageDialog(null, "Введенное значение не является числом.");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Строка пуста.");
                        throw new EmptyStringException("String is Empty");
                    }
                }
                catch (EmptyStringException ex) {
                    JOptionPane.showMessageDialog(null, "Перехвачено исключение типа EmptyStringException");
                }
                catch (UserNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Перехвачено исключение типа UserNotFoundException");
                }
            }
        });
    }

    public static void main(String[] args) {
        Window sweetApp = new Window();
        sweetApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
