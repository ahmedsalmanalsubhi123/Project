package com.mycompany.xogame;

public class Settings extends Player {

    public String answerFirst;

    public String changeDesign;
    private String answerSettings;
    private String answerreturnnormal;
    public String ChangePlayer;
    public  String size5;
   public  String  size10;
           public  String size20;
     boolean win = false;
     
     
    
//this method to ask user who want to play first

    public void WhoStart() {

        System.out.println("Who want to play first : " + firstplayer + " Or " + secondplayer);
        answerFirst = in.next();
        if (answerFirst.equalsIgnoreCase(secondplayer)) {
            result = false;
        }
        System.out.println("Do you want to change symbols? ");
        answerSettings = in.next();
        if (answerSettings.equalsIgnoreCase("yes")) {
            do {

                System.out.println("Hello " + firstplayer + "\n What do you want Your Symbol ?");
                System.out.println("Hint// Sybmol like (X , O , & , * , %...etc)");
                System.out.println("Hint// Don't repet symbol");
                Symbol1 = in.next();
                System.out.println("Hello " + secondplayer + "\n What do you want Your Symbol ?");
                System.out.println("Hint// Sybmol like (X , O , & , * , %...etc)");
                System.out.println("Hint// Don't repet symbol");
                Symbol2 = in.next();

                if (Symbol1.length() > 1 || Symbol1.length() > 1) {
                    System.out.println(" \nplease enter 1 symbol \n ");
                }

            } while (Symbol1.length() != 1 || Symbol2.length() != 1 || Symbol1.equalsIgnoreCase(Symbol2) || Symbol1.length() > 1 || Symbol1.length() > 1);
            {
            }
        }
    }
//this method for all sizes
    public void sizes() {
        //Size 5
        size5 = "__________\n1 | 2 | 3\n__|___|___\n4 | 5 | 6\n__|___|___\n7 | 8 | 9\n__________";
        System.out.println("Size 5: ");
        System.out.println(size5);
//Size 10
        System.out.println("Size 10: ");
        size10 =  "___________\n 1 | 2 | 3 \n___|___|___\n 4 | 5 | 6 \n___|___|___\n 7 | 8 | 9 \n____________";
        System.out.println(size10);
//Size 20
        size20 = "______________________\n  1   |    2    |   3  \n______|_________|_____\n  4   |    5    |   6  \n______|_________|_____\n  7   |    8    |   9  \n______________________";
        System.out.println("Size 20: ");
        System.out.println(size20);
        System.out.println("\n Enter number of size: ");
        userSize = in.next();

    }
//this method to check if user want to change size

    public void checkSize() {
        size10 = "___________\n 1 | 2 | 3 \n___|___|___\n 4 | 5 | 6 \n___|___|___\n 7 | 8 | 9 \n____________";

        switch (userSize) {
            case "5" -> {
                System.out.println("your Size 5 ");
                Board = size5;
            }
            case "10" -> {
                System.out.println("your Size 10 ");
                Board = size10;
            }
            case "20" -> {
                System.out.println("your Size 20 ");
                Board = size20;
            }

        }

    }
//This method for get a design to board

    public void design() {
        do {

            System.out.println("Enter your symbol for design: ");
            changeDesign = in.next();

            if (changeDesign.length() != 1) {
                System.out.println(" \nplease enter 1 symbol \n ");
            }

        } while (changeDesign.length() != 1);

    }

    //this method to check if he want to Enter settings
    public void enterSetting() {
        System.out.println("Do you want to change settings? ");
        answerSettings = in.next();
        if (answerSettings.equalsIgnoreCase("yes")) {
            WhoStart();

            System.out.println("Do you want to change size? ");
            answerSettings = in.next();
            if (answerSettings.equalsIgnoreCase("yes")) {
                sizes();
                checkSize();
            }
            System.out.println("Do you want to change design? ");
            answerSettings = in.next();
            if (answerSettings.equalsIgnoreCase("yes")) {
                design();
            }
        } else {
        }

    }

    //this method for return defult Settings
    public void returnDefultSetting() {
        if (changeDesign != null || !Board.equals(size10) || Symbol1 != "X" || Symbol2 != "O") {
            System.out.println("Do you want to return defult Settings? ");
            answerreturnnormal = in.next();
            if (answerreturnnormal.equalsIgnoreCase("yes")) {
                changeDesign = null;
                userSize = "10";
                Symbol1 = "X";
                Symbol2 = "O";

            } else {

            }
        }
    }

    public void winnerSize5() {
        //row
        if (Board.charAt(11) == Board.charAt(15) && Board.charAt(15) == Board.charAt(19) || Board.charAt(32) == Board.charAt(36) && Board.charAt(36) == Board.charAt(40) || Board.charAt(53) == Board.charAt(57) && Board.charAt(57) == Board.charAt(61)) {

            win = true;
        } //column
        else if (Board.charAt(11) == Board.charAt(32) && Board.charAt(32) == Board.charAt(53) || Board.charAt(15) == Board.charAt(36) && Board.charAt(36) == Board.charAt(57) || Board.charAt(19) == Board.charAt(40) && Board.charAt(40) == Board.charAt(61)) {
            win = true;

        } //corner
        else if (Board.charAt(19) == Board.charAt(36) && Board.charAt(36) == Board.charAt(53) || Board.charAt(11) == Board.charAt(36) && Board.charAt(36) == Board.charAt(61)) {

            win = true;
        }
    }

    public void winnerSize10() {
        //row
        if (Board.charAt(13) == Board.charAt(17) && Board.charAt(17) == Board.charAt(21) || Board.charAt(37) == Board.charAt(41) && Board.charAt(41) == Board.charAt(45) || Board.charAt(61) == Board.charAt(65) && Board.charAt(65) == Board.charAt(69)) {

            win = true;
        } //column
        else if (Board.charAt(13) == Board.charAt(37) && Board.charAt(37) == Board.charAt(61) || Board.charAt(17) == Board.charAt(41) && Board.charAt(41) == Board.charAt(65) || Board.charAt(21) == Board.charAt(45) && Board.charAt(45) == Board.charAt(69)) {

            win = true;

        } //corner
        else if (Board.charAt(21) == Board.charAt(41) && Board.charAt(41) == Board.charAt(61) || Board.charAt(13) == Board.charAt(41) && Board.charAt(41) == Board.charAt(69)) {

            win = true;
        }
    }

    public void winnerSize20() {
        //row
        if (Board.charAt(25) == Board.charAt(34) && Board.charAt(34) == Board.charAt(43) || Board.charAt(72) == Board.charAt(81) && Board.charAt(81) == Board.charAt(90) || Board.charAt(119) == Board.charAt(128) && Board.charAt(128) == Board.charAt(137)) {

            win = true;
        } //column
        else if (Board.charAt(25) == Board.charAt(72) && Board.charAt(72) == Board.charAt(119) || Board.charAt(34) == Board.charAt(81) && Board.charAt(81) == Board.charAt(128) || Board.charAt(43) == Board.charAt(90) && Board.charAt(90) == Board.charAt(137)) {
            win = true;

        } //corner
        else if (Board.charAt(25) == Board.charAt(81) && Board.charAt(81) == Board.charAt(137) || Board.charAt(43) == Board.charAt(81) && Board.charAt(81) == Board.charAt(119)) {

            win = true;
        }
    }
}
