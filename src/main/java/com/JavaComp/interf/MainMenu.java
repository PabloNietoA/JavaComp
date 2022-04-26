package com.JavaComp.interf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class MainMenu {
    private JList list1;
    private JPasswordField passwordField1;
    private JButton button1;

    public MainMenu() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultListModel<String> model = new DefaultListModel<>();
                list1.setModel(model);
                model.addElement("mecagoentusmuertos");
            }
        });
    }
}
