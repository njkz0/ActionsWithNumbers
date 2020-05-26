package actions;

public class Actions {

    public static int sumOfIndividualNumbersWithReminder(int input){
        int summ=0;
        while(input>0){
           summ+=(input%10);
           input=input/10;
       }
        return summ;}

    public static int sumOfIndividualNumbersWithChar(int input){
        int summ=0;
        String string= Integer.toString(input);
        char[] array= string.toCharArray();
        for (char c: array) {
            summ+=Character.getNumericValue(c);
        }
  return summ;  }

}
