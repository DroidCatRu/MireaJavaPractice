package com.droidcatru.FootballScore;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class FootballScoreUI extends JFrame {

    private int ACMilanScore = 0;
    private int RealMadridScore = 0;

    private JButton ACMilan = new JButton("AC Milan");
    private JButton RealMadrid = new JButton("Real Madrid");

    private JLabel Score = new JLabel("0:0", SwingConstants.CENTER);
    private JLabel LastScorer = new JLabel("Last Scorer: none", SwingConstants.LEFT);
    private JLabel Winner = new JLabel("Winner: none", SwingConstants.LEFT);

    public FootballScoreUI() {
        setLayout(null);

        ACMilan.setBounds(16, 16, 120, 32);
        ACMilan.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                ACMilanScore++;
                SetScore();
                LastScorer.setText("Last Scorer: AC Milan");
                SetWinner();
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });

        Score.setBounds(16*2+120, 16, 120, 32);
        Score.setFont(new Font("Raleway SemiBold", Font.PLAIN, 18));

        RealMadrid.setBounds(16*3+120*2, 16, 120, 32);
        RealMadrid.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                RealMadridScore++;
                SetScore();
                LastScorer.setText("Last Scorer: Real Madrid");
                SetWinner();
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });

        LastScorer.setBounds(16, 16+32+16, 408, 18);
        LastScorer.setFont(new Font("Raleway SemiBold", Font.PLAIN, 18));

        Winner.setBounds(16, 16+32+16+18+16, 408, 18);
        Winner.setFont(new Font("Raleway SemiBold", Font.PLAIN, 18));

        add(ACMilan);
        add(Score);
        add(RealMadrid);
        add(LastScorer);
        add(Winner);

        setSize(440, 168);
    }

    private void SetWinner() {
        if(this.ACMilanScore > this.RealMadridScore) {
            Winner.setText("Winner: AC Milan");
        }
        else if(this.ACMilanScore < this.RealMadridScore) {
            Winner.setText("Winner: Real Madrid");
        }
        else {
            Winner.setText("Winner: DRAW");
        }
    }

    private void SetScore() {
        String newScore = this.ACMilanScore + ":" + this.RealMadridScore;
        Score.setText(newScore);
    }
}
