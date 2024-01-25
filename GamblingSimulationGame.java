package com.bridgelabz.GamblingSimulation;
import java.lang.Math;
public class GamblingSimulationGame {

        int Stake=100;
        int BetPerGame=1;

        void Compute() {
            //For every bet remaining money reduces by 1
            int RemainingMoney = Stake - BetPerGame;

            int moneywon=0,moneylost=0;  //stores the value of money lost and money won
            //
            for(int i=1;i<=20;i++){   // To calculate the money won and lost for 20 days
           for(int j=1;j<=24;j++){    // To calculate the number of  plays per day(24 hours)
               double randno = Math.random(); //generating random number to calculate chances
               if(randno<=0.5){
                   moneylost=moneylost+1;


               }
               else {
                   moneywon=moneywon+1;
                   RemainingMoney=RemainingMoney+1;


               }
           }}
            System.out.println("money lost :"+moneylost);
            System.out.println("money won :" + moneywon );

            }




    public static void main(String[] args) {

      GamblingSimulationGame G = new GamblingSimulationGame();
      G.Compute();


    }




}
