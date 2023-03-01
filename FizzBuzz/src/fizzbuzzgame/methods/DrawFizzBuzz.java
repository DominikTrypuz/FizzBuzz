package fizzbuzzgame.methods;

import static fizzbuzzgame.methods.DrawNumber.drawNumber;

public class DrawFizzBuzz {
    public String drawFizzBuzz() {

        int i = drawNumber();

        if(i % 3 == 0 && i % 5 == 0){
            return "FizzBuzz";
        }
        else if(i % 3 == 0){
            return "Fizz";
        }
        else if(i % 5 == 0){
            return "Buzz";
        }
        return "Neither fizz nor buzz :(";
    }
}