package com.example.whichnumberisbigger;

public class BiggerNumberGame {
    private int number1;
    private int number2;
    private int score;
    private int lowerLimit;
    private int upperLimit;
    private int biggerNumber;

    public BiggerNumberGame(int lowerLimit, int upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
        generateRandom();
    }

    public void generateRandom() {
        number1 = (int)(Math.random() * (upperLimit - lowerLimit + 1) + lowerLimit);
        number2 = (int)(Math.random() * (upperLimit - lowerLimit + 1) + lowerLimit);
        while(number1 == number2){
            number2 = (int)(Math.random() * (upperLimit - lowerLimit + 1) + lowerLimit);
        }
        if(number1 > number2){
            biggerNumber = number1;
        }
        else{
            biggerNumber = number2;
        }

    }

    public String checkAnswer(int answer){

        if(answer == biggerNumber){
            score += 50;
            return "Good job!";
        }
        else{
            score -= 100;
            return "GO BACK TO PRESCHOOL!!!!!!!!!!";
        }

    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(int lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }
}
