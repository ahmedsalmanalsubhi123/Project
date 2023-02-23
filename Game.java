package com.mycompany.xogame;

public class Game extends Settings {

    public int i;
    public int get;
    public String answerplayer;

    public String answer;

    final int SIZE = 9;
    public String state;

    //This array to store unavailable numbers
    String[] v1 = new String[SIZE];

    public void play() {

        //For change between players 
        if (answerplayer.equalsIgnoreCase("1")) {
            withplayer();

        } else {
            withbot();

        }

        //convert input user to int
        int intuser = Integer.parseInt(user);

        //Condition for unavailable numbers 
        while (user.equals(v1[0]) || user.equals(v1[1]) || user.equals(v1[2]) || user.equals(v1[3]) || user.equals(v1[4]) || user.equals(v1[5]) || user.equals(v1[6]) || user.equals(v1[7]) || user.equals(v1[8]) || intuser > 9 || intuser < 1) {
            if (answerplayer.equalsIgnoreCase("1")) {
                System.out.println("Sorry,Mr " + nameplayer + " This Number Not Available \n Choose any number available in the game: ");
                user = in.next();

                intuser = Integer.parseInt(user);
            } else {

                ronguser();
                intuser = Integer.parseInt(user);
            }

        }

        v1[i] = user;

        //this statment for change state and store it
        state = Board.replace(user, player);

        Board = state;

    }

    //this method to see who is won and print his name
    public void whoWin() {
        if (win) {
            System.out.println(nameplayer + " is Winner ");
        } else {
            System.out.println("Draw!");
            i -= 1;
        }

    }

    //this method for play and if the game is end ccan be contnue
    public void TheGame() {
        Board = size10;
        String answerSameplayers = "yes";

        //this do while to check if the user want to contnue
        do {
            win = false;
            result = true;

            // this statment to check if the user want to play with same player in the second game
            if (answerSameplayers.equalsIgnoreCase("yes")) {
                System.out.println("What do you want play with player or bot? \n for player press 1 \n for bot press 2");
                answerplayer = in.next();

                //this statment to check if the user want to play with player or bot
                if (answerplayer.equalsIgnoreCase("1")) {
                    playersname();
                } else {
                    firstplayername();
                    secondplayer = "bot";
                }
            }

            checkSize();
            returnDefultSetting();

            enterSetting();
            checkSize();
            if (changeDesign != null) {
                Board = Board.replace("_", changeDesign);

            }
            System.out.println(Board);
            for (i = 0; i < 9; i++) {

                play();
                System.out.println(Board);
                if (userSize.equals("5")) {

                    winnerSize5();
                } else if (userSize.equals("10")) {

                    winnerSize10();
                } else if (userSize.equals("20")) {

                    winnerSize20();

                }

                //To finish the game if one of players won
                if (win) {
                    break;
                }

            }
            whoWin();
            System.out.println("do you want play again? ");
            answer = in.next();
            if (answer.equalsIgnoreCase("yes")) {
                //this statment to check if the user want to contnue with same player and will be restart the data
                System.out.println("Do you want Change players?  ");
                answerSameplayers = in.next();

                for (; i != -1; i--) {
                    v1[i] = null;

                }
            }
        } while (answer.equalsIgnoreCase("yes"));

        System.out.println("Game over");

    }
}
