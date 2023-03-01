package fizzbuzzgame.methods;

import java.util.Scanner;

import static fizzbuzzgame.gamecases.CaseD.caseD;
import static fizzbuzzgame.gamecases.CaseE.caseE;
import static fizzbuzzgame.gamecases.CaseI.caseI;
import static fizzbuzzgame.gamedescriptions.GameDescriptions2.gameDescriptions2;

public class StartGame {
    public static void startGame() {

        Scanner scanner = new Scanner(System.in);

        String choose = "startLoop";
        while (!choose.equals("e")) {

            gameDescriptions2();

            switch (choose = scanner.next()) {
                case "d":
                    caseD();
                    break;
                case "e":
                    caseE();
                    break;
                case "i":
                    caseI();
                    break;
            }
        }
    }
}
