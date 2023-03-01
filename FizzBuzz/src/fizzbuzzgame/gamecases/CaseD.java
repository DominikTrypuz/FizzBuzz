package fizzbuzzgame.gamecases;

import fizzbuzzgame.methods.DrawFizzBuzz;

import static fizzbuzzgame.methods.DrawNumber.drawNumber;

public class CaseD {
    public static void caseD() {

        DrawFizzBuzz draw = new DrawFizzBuzz();

        int i = drawNumber();

        System.out.println("Your number is " + i + "\n" + draw.drawFizzBuzz() + "\n");
    }
}
