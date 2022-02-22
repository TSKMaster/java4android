package lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private static int rowNumber;
    private static int columnNumber;
    private static int SIZE;
    private static char[][] GAME_FIELD;
    private static int winCounter;

    private static final char EMPTY_CELL = '•';
    private static final char HUMAN_TURN = 'X';
    private static final char AI_TURN = 'O';
    private static final String HEADER_LOGO = "♥";
    private static final String GAME_FIELD_SPACE = " ";

    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();
    private static int turnsCount;

    public static void main(String[] args) {

        turnGame();
    }

    private static void turnGame() {
        do {
            System.out.println("\n\nИГРА НАЧИНАЕТСЯ!!!");
            init();
            printGameField();
            playGame();
        } while (isContinueGame());
        endGame();
    }

    private static void init() {
        System.out.print("Введите размер игрового поля (3 - 30): ");
        SIZE = scanner.nextInt();
        switch (SIZE) {
            case 3, 4, 5 -> winCounter = 3;
            case 6, 7, 8, 9, 10 -> winCounter = 4;
            default -> winCounter = 5;
        }
        GAME_FIELD = new char[SIZE][SIZE];
        turnsCount = 0;
        initGameField();
    }

    private static void initGameField() {


        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                GAME_FIELD[i][j] = EMPTY_CELL;
            }
        }
    }

    private static void printGameField() {
        printGameFieldHeader();
        printGameFieldBody();
    }
    private static void printGameFieldHeader() {
        System.out.print(HEADER_LOGO + GAME_FIELD_SPACE);
        for (int i = 0; i < SIZE; i++) {
            printGameFieldNumber(i);
        }
        System.out.println();
    }

    private static void printGameFieldNumber(int i) {
        System.out.print(i + 1 + GAME_FIELD_SPACE);
    }

    private static void printGameFieldBody() {
        for (int i = 0; i < SIZE; i++) {
            printGameFieldNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(GAME_FIELD[i][j] + GAME_FIELD_SPACE);
            }
            System.out.println();
        }
    }

    private static void playGame() {
        while (true) {
            humanTurn();
            printGameField();
            if (checkEnd(HUMAN_TURN)) {
                break;
            }

            aiTurn();
            printGameField();
            if (checkEnd(AI_TURN)) {
                break;
            }

            // возврат к п.1
        }
    }

    private static void humanTurn() {
        System.out.println("ХОД ЧЕЛОВЕКА");

        while (true) {
            rowNumber = getValidNumberFromUser() - 1;
            columnNumber = getValidNumberFromUser() - 1;

            if (isCellFree(rowNumber, columnNumber)) {
                break;
            }
        }

        GAME_FIELD[rowNumber][columnNumber] = HUMAN_TURN;
        turnsCount++;

    }

    private static int getValidNumberFromUser() {
        while (true) {
            System.out.print("Введите координату (1 - " + SIZE + "): ");
            if (scanner.hasNextInt()) {
                int n = scanner.nextInt();
                if (isNumberValid(n)) {
                    return n;
                }
                System.out.println("\nПроверьте значение координаты. Должно быть от 1 до " + SIZE);
            } else {
                scanner.next();
                System.out.println("\nВвод допускает лишь целые числа");
            }
        }


    }

    private static boolean isNumberValid(int n) {
        return n >= 1 && n <= SIZE;
    }

    private static boolean isCellFree(int rowNumber, int columnNumber) {

        return GAME_FIELD[rowNumber][columnNumber] == EMPTY_CELL;
    }

    private static void aiTurn() {
        System.out.println("ХОД КОМПУКТЕРА");

        /*int rowNumber;
        int columnNumber;*/

        do {
            rowNumber = random.nextInt(SIZE);
            columnNumber = random.nextInt(SIZE);

        } while (!isCellFree(rowNumber, columnNumber));

        GAME_FIELD[rowNumber][columnNumber] = AI_TURN;
        turnsCount++;
    }

    private static boolean checkEnd(char symbol) {
        if (checkWin(symbol, rowNumber, columnNumber, winCounter)) {
            if (symbol == HUMAN_TURN) {
                System.out.println("\nУРААААААААААААААА!!!! Вы победили");
            } else {
                System.out.println("\nВосстание близко... Победил ИИ!!!");
            }
            return true;
        }
        if (checkDraw()) {
            System.out.println("Ничья! ");
            return true;
        }
        return false;
    }

    private static boolean checkDraw() {
//        for (char[] chars : GAME_FIELD) {
//            for (char symbol : chars) {
//                if (symbol == EMPTY_CELL){
//                    return false;
//                }
//            }
//        }

        return turnsCount >= SIZE * SIZE;
    }

    private static boolean checkWin(char symbol, int rowCord, int colCord, int winCounter) {
        int winRow = 0;
        int winCol = 0;
        int winLeftDiag = 0;
        int winRightDiag = 0;

        for (int i = 0; i < SIZE; i++) {
            if (GAME_FIELD[i][colCord] == symbol) {
                winCol++;
            } else
                winCol = 0;

            if (GAME_FIELD[rowCord][i] == symbol) {
                winRow++;
            } else {
                winRow = 0;
            }

            if (GAME_FIELD[i][i] == symbol){
                winLeftDiag++;
            } else {
                winLeftDiag = 0;
            }

            if (GAME_FIELD[SIZE - 1 - i][i] == symbol){
                winRightDiag++;
            } else {
                winRightDiag = 0;
            }

            if (winRow == winCounter || winCol == winCounter || winLeftDiag == winCounter || winRightDiag == winCounter ){
                return true;
            }
        }
        return false;


    }

    private static boolean isContinueGame() {
        System.out.println("Хотите продолжить или нет y\\n");
        return switch (scanner.next()){
            case "y", "yes", "+", "да", "конечно" -> true;
            default -> false;
        };
    }

    private static void endGame() {
        scanner.close();
        System.out.println("ГАМОВЕР");
    }


}

