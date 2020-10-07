
public class Methods {
    public static int addThree(int n) {
        return n+3;
    }

    public static int addFourAndThenMultiplyByThree(int n) {

        return (n+4)*3;
    }

    public static String maybeUppercaseAndDecorateText(String s, boolean uppercase, boolean decorate) {
        if(uppercase==true){
         s=s.toUpperCase();
        }
        if(decorate==true){
            s="-:" + s + ":-";
        }
        return s;
    }

    public static String tellRelationToHundred(int number) {

        if (number > 0) {
            if (number <= 100) {
                return "Add " + (100 - number) + " to " + number + " and you get 100";
            } else if (number > 100) {
                return number + " is greater than 100";
            }
        }return number + " is a negative number";
    }
}
