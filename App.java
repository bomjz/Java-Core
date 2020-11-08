package ru.geekbrains;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class App extends JFrame {

    protected boolean isAlive = true;

    public App(final int SIZE){
        setTitle("Слабое подобие на игру <Сапёр>");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);

        //создание бомб
        boolean[][] bombs = new boolean[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                bombs[i][j] = Math.random() <= 0.5;
            }
        }

        JButton[][] buttons = new JButton[5][5];

        setLayout(new GridLayout(SIZE, SIZE));

        //создание кнопок
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                final JButton button = new JButton();
                buttons[i][j] = button;
                int ii = i;
                int jj = j;
                button.setText("\u2753");


                button.addActionListener((ActionEvent actionEvent) -> {
                    if (!isAlive) return;
                    if (bombs[ii][jj]) {
                        button.setText("\u2620"); //вывод бомбы
                        //вывод всех бомб
                        for (int k = 0; k < SIZE; k++) {
                            for (int l = 0; l < SIZE; l++) {
                                int kk = k;
                                int ll = l;
                                if (bombs[kk][ll]) {
                                    buttons[kk][ll].setText("\u2620");
                                    buttons[kk][ll].setFont(button.getFont().deriveFont(40.F));//размер бомбы
                                    button.setBackground(Color.RED); //цвет ячейки
                                    buttons[kk][ll].setBackground(Color.BLACK); //цвет ячейки
                                    buttons[kk][ll].setForeground(Color.WHITE); //цвет юникода
                                }
                            }
                        }

                        isAlive = false;

                    } else {
                        if (!bombs[ii][jj])
                        button.setText("1");
                        button.setBackground(Color.GREEN);

                        if (!bombs[ii+1][jj+1] && !bombs[ii-1][jj-1] && !bombs[ii][jj-1] && !bombs[ii-1][jj] && !bombs[ii+1][jj] && !bombs[ii][jj+1] && !bombs[ii+1][jj-1] && !bombs[ii-1][jj+1]){
                            button.setText("0");
                        }
                    }
                });
                add(button);
            }
        }
        setVisible(true);
    }
}
