package main;

import actions.Actions;

public class MainClass {

    public static void main(String[] args) {
        int a= 12345;

        System.out.println("Summa otdelnih cifr iz chisla = "+Actions.sumOfIndividualNumbersWithReminder(a));
        System.out.println("Summa otdelnih cifr iz chisla = "+Actions.sumOfIndividualNumbersWithChar(a));

        Actions.maxPalindromeSearchInFourDigitNumber();
    }

}
