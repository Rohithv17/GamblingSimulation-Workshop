package com.bridgelabz.GamblingSimulation;
import java.lang.Math;
public class GamblingSimulationGame {

        int Stake=100;
        int BetPerGame=1;

        void Compute() {
            //For every bet remaining money reduces by 1
            int RemainingMoney = Stake - BetPerGame;
            int hourswon=0,hourslost=0,dayswon=0,dayslost=0;
            int moneywon=0,moneylost=0;  //stores the value of money lost and money won //
            for(int i=1;i<=20;i++){   // To calculate the money won and lost for 20 days
           for(int j=0;j<=24;j++){    // To calculate the number of  plays per day(24 hours,1 chance per hr)
               double randno = Math.random(); //generating random number to calculate chances
               if(randno<=0.5){     //To Compute for loss
                   moneylost=moneylost+1;
                   hourslost=hourslost+1;
                   dayslost=hourslost/24;


               }
               else {  //To compute for win
                   moneywon=moneywon+1;
                   RemainingMoney=RemainingMoney+1;
                   hourswon=hourswon+1;
                   dayswon=hourswon/24;


               }
           }}
            System.out.println("money lost :"+moneylost + " || Days lost : " + dayslost);
            System.out.println("money won :" + moneywon +" || Days won: "+dayswon);

            }

            public static void main(String[] args) {

      GamblingSimulationGame G = new GamblingSimulationGame();
      G.Compute();


    }




}
