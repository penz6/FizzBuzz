class Solution{
    public static void main (String[] args){
        for (int x = 1; x<=100; x++){
            //checks if x is less than or equal to 100 then adds one
            if (x%3 == 0 && x%5 == 0){
                System.out.println("FizzBuzz");
                //checks if it is divisible by 3 and 5
            }
            else if (x%3 ==0){
                System.out.println("Fizz");
                //checks if it is divisible by 3
            }
            else if (x%5 == 0){
                System.out.println("Buzz");
                //checks if it is divisible by 5
            }
            else{
                System.out.println(x);
                //if it matches none of the others than print x
            }
        }

    }
}