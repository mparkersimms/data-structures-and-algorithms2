package utilities;
//*Greed is a dice game played with five six-sided dice.
// Your mission, should you choose to accept it, is to score a throw according
// to these rules. You will always be given an array with five six-sided dice values.
//*
// Three 1's => 1000 points
// Three 6's =>  600 points
// Three 5's =>  500 points
// Three 4's =>  400 points
// Three 3's =>  300 points
// Three 2's =>  200 points
// One   1   =>  100 points
// One   5   =>   50 point
//*A single die can only be counted once in each roll. For example, a given "5"
// can only count as part of a triplet (contributing to the 500 points) or as a
// single 50 points, but not both in the same roll.
//
//Example scoring
//
// Throw       Score
// ---------   ------------------
// 5 1 3 4 1   250:  50 (for the 5) + 2 * 100 (for the 1s)
// 1 1 1 3 1   1100: 1000 (for three 1s) + 100 (for the other 1)
// 2 4 4 5 4   450:  400 (for three 4s) + 50 (for the 5)

//If you mutate the input, you will not be able to pass all the tests.
public class Greed {
    public static int greedy(int[] dice){
        int result = 0, ones = 0,twos = 0,threes = 0,fours = 0,fives = 0, sixes = 0;
        for(int i =0; i<dice.length; i++){
            if(dice[i] == 1) ones ++;
            if(dice[i] == 2) twos++;
            if(dice[i] == 3) threes++;
            if(dice[i] == 4) fours++;
            if(dice[i] == 5) fives++;
            if(dice[i] == 6) sixes++;
        }

//        code for the ones
        switch (ones){
            case 0:
                break;
            case 1:
                result += 100;
                break;
            case 2:
                result += 200;
                break;
            case 3:
                result += 1000;
                break;
            case 4:
                result += 1100;
                break;
            case 5:
                result += 1200;
                break;
        }
//        code for the twos
        switch (twos){
            case 0:
            case 1:
            case 2:
                break;
            case 3:
            case 4:
            case 5:
                result += 200;
                break;
        }
//        code for the threes
        switch (threes){
            case 0:
            case 1:
            case 2:
                break;
            case 3:
            case 4:
            case 5:
                result += 300;
                break;
        }
//        code for the fours
        switch (fours){
            case 0:
            case 1:
            case 2:
                break;
            case 3:
            case 4:
            case 5:
                result += 400;
                break;
        }
//        code for the fives
        switch (fives){
            case 0:
                break;
            case 1:
                result += 50;
                break;
            case 2:
                result += 100;
                break;
            case 3:
                result += 500;
                break;
            case 4:
                result += 550;
                break;
            case 5:
                result += 600;
                break;
        }
//        code for the sixes
        switch (sixes){
            case 0:
            case 1:
            case 2:
                break;
            case 3:
            case 4:
            case 5:
                result += 600;
                break;
        }

        //code here
        return result;
    }
}
