package actions;

public class Actions {

    public static int sumOfIndividualNumbersWithReminder(int input) {
        int summ = 0;
        while (input > 0) {
            summ += (input % 10);
            input = input / 10;
        }
        return summ;
    }

    public static int sumOfIndividualNumbersWithChar(int input) {
        int summ = 0;
        String string = Integer.toString(input);
        char[] array = string.toCharArray();
        for (char c : array) {
            summ += Character.getNumericValue(c);
        }
        return summ;
    }


    public static void maxPalindromeSearchInFourDigitNumber() {//аргументы - диапазон чисел
       int maxPalindrome=0;
        for (int i = 1000; i <=9999 ; i++) {
            for (int j = 1000; j <=9999 ; j++) {
                int multiplicationResult=i*j;
                String sMultiplicationResult= Integer.toString(multiplicationResult);
                String reverseSMultiplicationResult= new StringBuilder(sMultiplicationResult).reverse().toString();
                if(sMultiplicationResult.equals(reverseSMultiplicationResult)){
                    maxPalindrome=Integer.parseInt(sMultiplicationResult);
                }
            }
        }
        System.out.println("Max palindrome - " + maxPalindrome);
    }

}
