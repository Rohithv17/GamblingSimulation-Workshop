package com.bridgelabz.GamblingSimulation;
import java.lang.Math;
public class GamblingSimulationGame {

        int Stake=100;
        int BetPerGame=1;

        void Compute() {
            //For every bet remaining money reduces by 1
            int RemainingMoney = Stake - BetPerGame;
            int hourswon = 0, hourslost = 0,unluckiesthour=0,luckiesthour=0;
            int unluckiestday = 0, luckiestday = 0;  //stores the value of luckiest day (max wins) and unluckiest day(max losses) //
            for (int i = 1; i <= 20; i++) {   // To calculate the money won and lost for 20 days
                for (int j = 0; j <= 24; j++) {    // To calculate the number of  plays per day(24 hours,1 chance per hr)
                    double randno = Math.random(); //generating random number to calculate chances



                    if (randno <= 0.5) {     //To Compute for loss
                        unluckiesthour=unluckiesthour+1;
                        hourslost = hourslost + 1;


                    }
                    else {  //To compute for win
                        luckiesthour=luckiesthour+1;
                        hourswon = hourswon + 1;

                    }

                }
                if(luckiesthour>unluckiesthour){         //to calculate luckiest and unluckiest days ,if wins>losses it is a lucky day and vice versa
                    luckiestday=luckiestday+1;
                }
                else{
                    unluckiestday=unluckiestday+1;
                }
            }


                System.out.println("Luckiest Days :" + luckiestday);
                System.out.println("Unluckiest Days:" + unluckiestday);

            }

            public static void main (String[]args){

                GamblingSimulationGame G = new GamblingSimulationGame();
                G.Compute();


            }


        }
