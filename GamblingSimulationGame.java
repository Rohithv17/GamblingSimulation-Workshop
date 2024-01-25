package com.bridgelabz.GamblingSimulation;
import java.lang.Math;
public class GamblingSimulationGame {

        int Stake=100;
        int BetPerGame=1;


     void GameRule(){}


        void Compute(){
        //For every bet remaining money reduces by 1
        int RemainingMoney=Stake-BetPerGame;
        double randno=Math.random();
//Calculating the Win and loss
        if(randno<=0.5){
            System.out.println("You lose ");

            System.out.println("Remaining Money is "+RemainingMoney);

        }
        else {
            System.out.println("You win");
            RemainingMoney=RemainingMoney+1;
            System.out.println("Remaining Money is "+RemainingMoney);
        }
    }



    public static void main(String[] args) {

      GamblingSimulationGame G = new GamblingSimulationGame();
      G.Compute();


    }




}
