class Recursionn2 {

    public static void printDigits(int number) {

        String digits[] = {
        "zero","one","two","three","four",
        "five","six","seven","eight","nine"
        };
        
        // base case
        if(number == 0){
            return;
        }

        int lastDigit = number % 10;

        printDigits(number / 10);

        System.out.print(digits[lastDigit] + " ");
    }

    public static void main(String[] args) {
        printDigits(5821);
    }
}