
package com.mycompany.xogame;

import java.util.Scanner;
import java.util.Random;

public class Player {
    public String firstplayer;
     public String secondplayer;
   public String Symbol1 ="X";
      public String Symbol2 = "O";
   public String Board;
    public  String userSize = "10";
    public boolean rong;
    public String user;
    boolean result = true;
    public String player;
     int random;
    public String nameplayer;
    
    

    Scanner in = new Scanner(System.in);
  //this method for get first player
    public void firstplayername() {
        System.out.println("player 1: Enter your name:");

        firstplayer = in.next();

    }
//this method to get two players name
    public void playersname() {
        firstplayername();

        System.out.println("player 2: Enter your name:");

        secondplayer = in.next();

    }
    // this method for playing with player
    public void withplayer() {
        if (result) {
            firstplayer();

        } else {
            player = Symbol2;
            nameplayer = secondplayer;
            System.out.println(secondplayer + " Choose Number from 1 to 9: ");
            user = in.next();
            result = true;

        }

    }
// this method for playing with bot
    public void withbot() {

        if (result) {
            
            
                
         
            firstplayer();
           
        } else {
           
            
          
            normal();
        
           result=true;
    }
    }
    
    //this method to check the rong number with bot
    public void ronguser() {
        if (rong) {
            System.out.println("Sorry,Mr " + nameplayer + " This Number Not Available \n Choose any number available in the game ");

            firstplayer();

        } else {
            normal();
        }

    }
    // this method for the first player to play
    public void firstplayer() {

        player = Symbol1;

        nameplayer = firstplayer;
        System.out.println(firstplayer + " Choose Number from 1 to 9: ");
        user = in.next();
        rong = true;
            result=false;

    }
   

   //this three methods for 3 sizes for bot to win

    public void normalSize5() {
secondPlayerBot();
        
        
        if (Board.charAt(11) != '1' && Board.charAt(15) != '2' && Board.charAt(19) == '3' || Board.charAt(40) != '6' && Board.charAt(61) != '9' && Board.charAt(19) == '3') {
            user = "3";
        } else if (Board.charAt(11) == '1' && Board.charAt(15) != '2' && Board.charAt(19) != '3' || Board.charAt(11) == '1' && Board.charAt(32) != '4' && Board.charAt(53) != '7') {
            user = "1";

        } else if (Board.charAt(11) != '1' && Board.charAt(15) == '2' && Board.charAt(19) != '3' || Board.charAt(15) == '2' && Board.charAt(36) != '5' && Board.charAt(61) != '8') {
            user = "2";

        } else {
            random();

        }
        
        rong = false;}
    
    public void normalSize10() {
secondPlayerBot();
        
       if (Board.charAt(13) != '1' && Board.charAt(17) != '2' && Board.charAt(21) == '3' || Board.charAt(45) != '6' && Board.charAt(69) != '9' && Board.charAt(21) == '3') {
            user = "3";
        } else if (Board.charAt(13) == '1' && Board.charAt(17) != '2' && Board.charAt(21) != '3' || Board.charAt(13) == '1' && Board.charAt(37) != '4' && Board.charAt(61) != '7') {
            user = "1";

       } else if (Board.charAt(13) != '1' && Board.charAt(17) == '2' && Board.charAt(21) != '3' || Board.charAt(17) == '2' && Board.charAt(41) != '5' && Board.charAt(65) != '8') {
            user = "2";

        } else {
            random();

        
        
        rong = false;}}
    
    public void normalSize20() {
secondPlayerBot();
        
        
        if (Board.charAt(25) != '1' && Board.charAt(34) != '2' && Board.charAt(43) == '3' || Board.charAt(90) != '6' && Board.charAt(69) != '9' && Board.charAt(43) == '3') {
            user = "3";
        } else if (Board.charAt(25) == '1' && Board.charAt(34) != '2' && Board.charAt(43) != '3' || Board.charAt(25) == '1' && Board.charAt(72) != '4' && Board.charAt(119) != '7') {
            user = "1";

        } else if (Board.charAt(25) != '1' && Board.charAt(34) == '2' && Board.charAt(43) != '3' || Board.charAt(34) == '2' && Board.charAt(81) != '5' && Board.charAt(128) != '8') {
            user = "2";

        } else {
            random();

        }
       
        rong = false;}
    // this method to check size for play
    public void normal(){
    switch (userSize) {
            case "5":
                normalSize5();
                break;
            case "10":
                normalSize10();
                break;
            case "20":
                normalSize20();
                
                break;

        }
    
    
    
    
    }
    
    
    
    public void secondPlayerBot(){
    player = Symbol2;
        secondplayer = "bot";
        nameplayer = secondplayer;
    
    
    }
    public void random(){
        
        Random rand = new Random();
            random = rand.nextInt(1, 10);
            user = String.valueOf(random);
    }

}
