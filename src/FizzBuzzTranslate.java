public class FizzBuzzTranslate {
    public static String translate(int number){
        if (number <=0 || number >= 100){
            return "Out of coverage";
        }
        if (number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz";
        } else if (number % 3 == 0 || number / 10 == 3 || number % 10 == 3) {
            return "Fizz";
            
        } else if (number % 5 == 0 || number / 10 == 5) {
            return "Buzz";

        }else {
            return numberToString(number);
        }

    }
    private static String numberToString(int number){
        int tens = number % 100 / 10;
        int ones = number % 10;

        String stringNumber = "";
        if (tens == 1){
            switch (ones){
                case 0:
                    stringNumber = "Ten";
                    break;
                case 1:
                    stringNumber = "Eleven";
                    break;
                case 2:
                    stringNumber = "Twelve";
                    break;
                case 3:
                    stringNumber = "Thirteen";
                    break;
                case 4:
                    stringNumber = "Fourteen";
                    break;
                case 5:
                    stringNumber = "Fifteen";
                    break;
                case 6:
                    stringNumber = "Sixteen";
                    break;
                case 7:
                    stringNumber = "Seventeen";
                    break;
                case 8:
                    stringNumber = "Eighteen";
                    break;
                case 9:
                    stringNumber = "Nineteen";


            }
        }else {
            switch (tens){
                case 2:
                    stringNumber = "Twenty";
                    break;
                case 3:
                    stringNumber = "Thirty";
                    break;
                case 4:
                    stringNumber = "Forty";
                    break;
                case 5:
                    stringNumber = "Fifty";
                    break;
                case 6:
                    stringNumber = "Sixty";
                    break;
                case 7:
                    stringNumber = "Seventy";
                    break;
                case 8:
                    stringNumber = "Eighty";
                    break;
                case 9:
                    stringNumber = "Ninety";

            }
        }if (tens !=1 &&!stringNumber.equals("")) stringNumber += " ";
        switch (ones){
            case 1:
                stringNumber = "One";
                break;
            case 2:
                stringNumber = "Two";
                break;
            case 3:
                stringNumber = "Three";
                break;
            case 4:
                stringNumber = "Four";
                break;
            case 5:
                stringNumber = "Five";
                break;
            case 6:
                stringNumber = "Six";
                break;
            case 7:
                stringNumber = "Seven";
                break;
            case 8:
                stringNumber = "Eight";
                break;
            case 9:
                stringNumber = "Nine";
                break;
        }
        return stringNumber;
    }
}
