package LabSheet2;

import javax.swing.*;

public class RollTheDice {
    public static void main(String[] args) {
        char result;
        int cWin=0, pWin=0, draws=0, games = 0;
        String ques = JOptionPane.showInputDialog("Would you like to play a game of roll the dice? (yes or no)");
        while(ques.equals("yes")){
            result = rollTheDice();
            games++;

            if(result == 'c')
                cWin++;
            else if (result == 'p')
                pWin++;
            else
                draws++;

            JOptionPane.showMessageDialog(null,"Games played: " + games + "\nComputer Wins: " +
                    cWin + "\nPlayer Wins: " + pWin + "\nDraws: " + draws,"Game info",JOptionPane.INFORMATION_MESSAGE);

            ques = JOptionPane.showInputDialog("Would you like to play a game of roll the dice? (yes or no)");
        }
        JOptionPane.showMessageDialog(null,"Thanks for playing the game!","Farewell",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

    private static char rollTheDice() {
        int cRoll = (int)(Math.random()*11) + 2;
        JOptionPane.showMessageDialog(null, "The computer roll generated the value "+cRoll
                +"\n...now hit return to see the player roll","Computer Roll",JOptionPane.INFORMATION_MESSAGE);

        int pRoll = (int)(Math.random()*12) + 2;
        JOptionPane.showMessageDialog(null, "The player roll generated the value "+pRoll,
                "Player Roll",JOptionPane.INFORMATION_MESSAGE);

        if(cRoll == pRoll)
            return 'd';
        else if(pRoll > cRoll)
            return 'p';
        else
            return 'c';
    }
}
