package com.bridgelabz.GamblingSimulation;
import java.lang.Math;
public class GamblingSimulationGame {

        int Stake=100;
        int BetPerGame=1;

        void Compute() {
            //For every bet remaining money reduces by 1
            int RemainingMoney = Stake - BetPerGame;
            double randno = Math.random();
            //Terminate the game based on conditions
            if(RemainingMoney==0.5*RemainingMoney){
                System.out.println(" Game Terminated for crossing  the min limit");
            }
            else if (RemainingMoney>=1.5*RemainingMoney){
                System.out.println("Game Terminated for crossing the max limit");
            }
        }



    public static void main(String[] args) {

      GamblingSimulationGame G = new GamblingSimulationGame();
      G.Compute();


    }




}
