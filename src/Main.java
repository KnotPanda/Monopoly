import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import java.util.concurrent.TimeUnit;

public class Main {
    public static final String RESET = "\033[0m";
    public static final String RED = "\033[0;31m";     // square
    public static final String GREEN = "\033[0;32m";   // diamond
    public static final String YELLOW = "\033[0;33m";  // circle
    public static final String BLUE = "\033[0;34m";    // triangle
    public static final String PURPLE = "\033[0;35m";  // checker
    public static final String CYAN = "\033[0;36m";    // L-shape

    public static void main(String[] args) throws InterruptedException {

        CLL<BoardPiece> board = new CLL<>();
        CLL<PlayerPiece> players = new CLL<>();
        BoardPiece zero = new BoardPiece("GO", 0, false, null, 0, false, "GO", 0, "■◆◕▲▞▙", 0, false);
        BoardPiece one = new BoardPiece("Mediterranean Ave.", 60, false, null, 10, true, "", 30, "", 1, false);
        BoardPiece two = new BoardPiece("Community Chest", 0, false, null, 0, false, "community chest", 0, "", 2, false);
        BoardPiece three = new BoardPiece("Baltic Ave.", 60, false, null, 20, true, "", 30, "", 3, false);
        BoardPiece four = new BoardPiece("Income Tax", 0, false, null, 0, false, "income tax", 0, "", 4, false);
        BoardPiece five = new BoardPiece("Reading Railroad", 200, false, null, 25, true, "railroad", 100, "", 5, false);
        BoardPiece six = new BoardPiece("Oriental Ave.", 100, false, null, 30, true, "", 50, "", 6, false);
        BoardPiece seven = new BoardPiece("Chance", 0, false, null, 0, false, "chance", 0, "", 7, false);
        BoardPiece eight = new BoardPiece("Vermont Ave.", 100, false, null, 30, true, "", 50, "", 8, false);
        BoardPiece nine = new BoardPiece("Connecticut Ave.", 120, false, null, 40, true, "", 60, "", 9, false);
        BoardPiece ten = new BoardPiece("Jail/Just Visiting", 0, false, null, 0, false, "jail", 0, "", 10, false);
        BoardPiece eleven = new BoardPiece("St. Charles Place", 140, false, null, 50, true, "", 70, "", 11, false);
        BoardPiece twelve = new BoardPiece("Electric Company", 150, false, null, 0, true, "utility", 75, "", 12, false);
        BoardPiece thirteen = new BoardPiece("States Ave.", 140, false, null, 50, true, "", 70, "", 13, false);
        BoardPiece fourteen = new BoardPiece("Virginia Ave.", 160, false, null, 60, true, "", 80, "", 14, false);
        BoardPiece fifteen = new BoardPiece("Pennsylvania Railroad", 200, false, null, 25, true, "railroad", 100, "", 15, false);
        BoardPiece sixteen = new BoardPiece("St. James Place", 180, false, null, 70, true, "", 90, "", 16, false);
        BoardPiece seventeen = new BoardPiece("Community Chest", 0, false, null, 0, false, "community chest", 0, "", 17, false);
        BoardPiece eighteen = new BoardPiece("Tennessee Ave.", 180, false, null, 70, true, "", 90, "", 18, false);
        BoardPiece nineteen = new BoardPiece("New York Ave.", 200, false, null, 80, true, "", 100, "", 19, false);
        BoardPiece twenty = new BoardPiece("Free Parking", 0, false, null, 0, false, "free parking", 0, "", 20, false);
        BoardPiece twentyone = new BoardPiece("Kentucky Ave.", 220, false, null, 90, true, "", 110, "", 21, false);
        BoardPiece twentytwo = new BoardPiece("Chance", 0, false, null, 0, false, "chance", 0, "", 22, false);
        BoardPiece twentythree = new BoardPiece("Indiana Ave.", 220, false, null, 90, true, "", 110, "", 23, false);
        BoardPiece twentyfour = new BoardPiece("Illinois Ave.", 240, false, null, 100, true, "", 120, "", 24, false);
        BoardPiece twentyfive = new BoardPiece("B. & O. Railroad", 200, false, null, 25, true, "railroad", 100, "", 25, false);
        BoardPiece twentysix = new BoardPiece("Atlantic Ave.", 260, false, null, 110, true, "", 130, "", 26, false);
        BoardPiece twentyseven = new BoardPiece("Ventnor Ave.", 260, false, null, 110, true, "", 130, "", 27, false);
        BoardPiece twentyeight = new BoardPiece("Water Works", 150, false, null, 0, true, "utility", 75, "", 28, false);
        BoardPiece twentynine = new BoardPiece("Marvin Gardens", 280, false, null, 120, true, "", 140, "", 29, false);
        BoardPiece thirty = new BoardPiece("Go To Jail", 0, false, null, 0, false, "", 0, "", 30, false);
        BoardPiece thirtyone = new BoardPiece("Pacific Ave.", 300, false, null, 130, true, "", 150, "", 31, false);
        BoardPiece thirtytwo = new BoardPiece("North Carolina Ave.", 300, false, null, 130, true, "", 150, "", 32, false);
        BoardPiece thirtythree = new BoardPiece("Community Chest", 0, false, null, 0, false, "community chest", 0, "", 33, false);
        BoardPiece thirtyfour = new BoardPiece("Pennsylvania Ave.", 320, false, null, 150, true, "", 160, "", 34, false);
        BoardPiece thirtyfive = new BoardPiece("Short Line", 200, false, null, 25, true, "railroad", 100, "", 35, false);
        BoardPiece thirtysix = new BoardPiece("Chance", 0, false, null, 0, false, "chance", 0, "", 36, false);
        BoardPiece thirtyseven = new BoardPiece("Park Place", 350, false, null, 175, true, "", 175, "", 37, false);
        BoardPiece thirtyeight = new BoardPiece("Luxury Tax", 0, false, null, 0, false, "luxury tax", 0, "", 38, false);
        BoardPiece thirtynine = new BoardPiece("Boardwalk", 400, false, null, 200, true, "", 200, "", 39, false);

        board.insert(zero);
        board.insert(one);
        board.insert(two);
        board.insert(three);
        board.insert(four);
        board.insert(five);
        board.insert(six);
        board.insert(seven);
        board.insert(eight);
        board.insert(nine);
        board.insert(ten);
        board.insert(eleven);
        board.insert(twelve);
        board.insert(thirteen);
        board.insert(fourteen);
        board.insert(fifteen);
        board.insert(sixteen);
        board.insert(seventeen);
        board.insert(eighteen);
        board.insert(nineteen);
        board.insert(twenty);
        board.insert(twentyone);
        board.insert(twentytwo);
        board.insert(twentythree);
        board.insert(twentyfour);
        board.insert(twentyfive);
        board.insert(twentysix);
        board.insert(twentyseven);
        board.insert(twentyeight);
        board.insert(twentynine);
        board.insert(thirty);
        board.insert(thirtyone);
        board.insert(thirtytwo);
        board.insert(thirtythree);
        board.insert(thirtyfour);
        board.insert(thirtyfive);
        board.insert(thirtysix);
        board.insert(thirtyseven);
        board.insert(thirtyeight);
        board.insert(thirtynine);
        // |     |
        // |   ■ |
        // |   ◆ |
        // |   ◕ |
        // |   ▲ |
        // |   ▞ |
        // |   ▙ |
        ArrayList<BoardPiece> properties1 = new ArrayList<>();
        PlayerPiece P1 = new PlayerPiece("square", 1500, false, 0, properties1, "■", "free", 0, 0, 0, 0, 0, RED);
        ArrayList<BoardPiece> properties2 = new ArrayList<>();
        PlayerPiece P2 = new PlayerPiece("Diamond", 1500, false, 0, properties2, "◆", "free", 0, 0, 0, 0, 0, GREEN);
        ArrayList<BoardPiece> properties3 = new ArrayList<>();
        PlayerPiece P3 = new PlayerPiece("Circle", 1500, false, 0, properties3, "◕", "free", 0, 0, 0, 0, 0, YELLOW);
        ArrayList<BoardPiece> properties4 = new ArrayList<>();
        PlayerPiece P4 = new PlayerPiece("Triangle", 1500, false, 0, properties4, "▲", "free", 0, 0, 0, 0, 0, BLUE);
        ArrayList<BoardPiece> properties5 = new ArrayList<>();
        PlayerPiece P5 = new PlayerPiece("Checker", 1500, false, 0, properties5, "▞", "free", 0, 0, 0, 0, 0, PURPLE);
        ArrayList<BoardPiece> properties6 = new ArrayList<>();
        PlayerPiece P6 = new PlayerPiece("L-shape", 1500, false, 0, properties6, "▙", "free", 0, 0, 0, 0, 0, CYAN);


        players.insert(P1);
        players.insert(P2);
        players.insert(P3);
        players.insert(P4);
        players.insert(P5);
        players.insert(P6);

        printBoard(board);
        System.out.println("Welcome to Monopoly");
        System.out.println("Square you are red \nDiamond you are green \nCircle you are yellow \nTriangle you are blue \nChecker you are purple \nL-shape you are cyan");

        while (!isGameOver(players)) {
            for (int i = 0; i < players.length(); i++) {
                Random dice = new Random();
                int d1 = dice.nextInt(6) + 1;
                int d2 = dice.nextInt(6) + 1;
                int d3 = dice.nextInt(6) + 1;
                int d4 = dice.nextInt(6) + 1;
                int total = d1 + d2;
                TimeUnit.SECONDS.sleep(3);
                printBoard(board);
                if (players.find(i).data.getStatus().equals("jail")) {
                    System.out.println(players.find(i).data.getName() + " your current balance is " + players.find(i).data.getBalance() + "$");
                    jailPlayerTurn(board, players.find(i).data, d1, d2);
                    sellActions(players, board, players.find(i).data);
                }
                if (players.find(i).data.getStatus().equals("free")) {
                    System.out.println(players.find(i).data.getName() + " your current balance is " + players.find(i).data.getBalance() + "$");
                    freePlayerTurn(players, board, players.find(i).data, d1, d2);
                    sellActions(players, board, players.find(i).data);

                    if (d1 == d2 && players.find(i).data.getStatus().equals("free")) {
                        System.out.println("you rolled doubles, you get to go again");
                        System.out.println(players.find(i).data.getName() + " your current balance is " + players.find(i).data.getBalance() + "$");
                        freePlayerTurn(players, board, players.find(i).data, d3, d4);
                        sellActions(players, board, players.find(i).data);
                    }
                }
                System.out.println("Your turn has ended");
            }
        }
        Random colorRand = new Random();
        int upperbound = 6;
        String color = "";
        String winString = "Congrats! " + players.find(1).data.getName() + " wins!";
        for (int i = 0; i<winString.length() - 1; i++) {
            int j = i + 1;
            int RandColor = colorRand.nextInt(upperbound);
            int colornumb = RandColor + 31;
            color = "\u001B[4;" + colornumb + "m";
            System.out.print(color + winString.substring(i,j) +RESET);
        }
    }

    public static void printBoard(CLL<BoardPiece> board){
        System.out.println("┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐");
        System.out.println("|   Free   | | Kentucky | |  Chance  | | Indiana  | | Illinois | | B. & O.  | | Atlantic | | Ventnor  | |   Water  | |  Marvin  | |   GO TO  |");
        System.out.println("|  Parking | |    Ave   | |          | |    Ave   | |    Ave   | | Railroad | |    Ave   | |    Ave   | |   Works  | |  Gardens | |   JAIL   |");
        System.out.println("|"+ printOccupants(board.find(22).data) +"| |"+ printOccupants(board.find(21).data) +"| |"+ printOccupants(board.find(22).data) +
                "| |"+ printOccupants(board.find(23).data) +"| |"+ printOccupants(board.find(24).data) +"| |"+ printOccupants(board.find(25).data) +
                "| |"+ printOccupants(board.find(26).data) +"| |"+ printOccupants(board.find(27).data) +"| |"+ printOccupants(board.find(28).data) +
                "| |"+ printOccupants(board.find(29).data) +"| |"+ printOccupants(board.find(30).data) +"|");
        System.out.println("|          | |"+ printPrice(board.find(21).data, board) +"| |          | |"+ printPrice(board.find(23).data, board) +"| |"+ printPrice(board.find(24).data, board) +
        "| |"+ printPrice(board.find(25).data, board) +"| |"+ printPrice(board.find(26).data, board) +"| |"+ printPrice(board.find(27).data, board) +"| |"+ printPrice(board.find(28).data, board) +
        "| |"+ printPrice(board.find(29).data, board) +"| |          |");
        System.out.println("└----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘");
        System.out.println("┌----------┐                                                                                                                      ┌----------┐");
        System.out.println("| New York |                                                                                                                      | Pacific  |");
        System.out.println("|    Ave   |                                                                                                                      |    Ave   |");
        System.out.println("|"+ printOccupants(board.find(19).data) +"|                                                                                                                      |"+ printOccupants(board.find(31).data) +"|");
        System.out.println("|"+ printPrice(board.find(19).data, board) +"|                                                                                                                      |"+ printPrice(board.find(31).data, board) +"|");
        System.out.println("└----------┘                                                                                                                      └----------┘");
        System.out.println("┌----------┐           ___ _  _   _   _  _  ___ ___                                                                               ┌----------┐");
        System.out.println("|Tennessee |          / __| || | /_\\ | \\| |/ __| __|                                                                              |   North  |");
        System.out.println("|    Ave   |         | (__| __ |/ _ \\| .` | (__| _|                                                                               | Caro. Ave|");
        System.out.println("|"+ printOccupants(board.find(18).data) +"|          \\___|_||_/_/ \\_\\_|\\_|\\___|___|                                                                              |"+ printOccupants(board.find(32).data) +"|");
        System.out.println("|"+ printPrice(board.find(18).data, board) +"|                                                                                                                      |"+ printPrice(board.find(32).data, board) +"|");
        System.out.println("└----------┘                                                                                                                      └----------┘");
        System.out.println("┌----------┐                                                                                                                      ┌----------┐");
        System.out.println("|Community |                                                                                                                      |Community |");
        System.out.println("|  Chest   |                                                                                                                      |  Chest   |");
        System.out.println("|"+ printOccupants(board.find(17).data) +"|                                                                                                                      |"+ printOccupants(board.find(33).data) +"|");
        System.out.println("|          |                                                                                                                      |          |");
        System.out.println("└----------┘                                                                                                                      └----------┘");
        System.out.println("┌----------┐                                                                                                                      ┌----------┐");
        System.out.println("| St. James|                                                                                                                      |   Penn.  |");
        System.out.println("|   Place  |                                                                                                                      |    Ave   |");
        System.out.println("|"+ printOccupants(board.find(16).data) +"|                                                                                                                      |"+ printOccupants(board.find(34).data) +"|");
        System.out.println("|"+ printPrice(board.find(16).data, board) +"|                                                                                                                      |"+ printPrice(board.find(34).data, board) +"|");
        System.out.println("└----------┘                                                                                                                      └----------┘");
        System.out.println("┌----------┐                 .___  ___.   ______   .__   __.   ______   .______     ______    __      ____    ____                ┌----------┐");
        System.out.println("|   Penn.  |                 |   \\/   |  /  __  \\  |  \\ |  |  /  __  \\  |   _  \\   /  __  \\  |  |     \\   \\  /   /                |   Short  |");
        System.out.println("| Railroad |                 |  \\  /  | |  |  |  | |   \\|  | |  |  |  | |  |_)  | |  |  |  | |  |      \\   \\/   /                 | Line (rr)|");
        System.out.println("|"+ printOccupants(board.find(15).data) +"|                 |  |\\/|  | |  |  |  | |  . `  | |  |  |  | |   ___/  |  |  |  | |  |       \\_    _/                  |"+ printOccupants(board.find(35).data) +"|");
        System.out.println("|"+ printPrice(board.find(15).data, board) +"|                 |  |  |  | |  `--'  | |  |\\   | |  `--'  | |  |      |  `--'  | |  `----.    |  |                    |"+ printPrice(board.find(35).data, board) +"|");
        System.out.println("└----------┘                 |__|  |__|  \\______/  |__| \\__|  \\______/  | _|       \\______/  |_______|    |__|                    └----------┘");
        System.out.println("┌----------┐                                                                                                                      ┌----------┐");
        System.out.println("| Virginia |                                                                                                                      |  Chance  |");
        System.out.println("|    Ave   |                                                                                                                      |          |");
        System.out.println("|"+ printOccupants(board.find(14).data) +"|                                                                                                                      |"+ printOccupants(board.find(36).data) +"|");
        System.out.println("|"+ printPrice(board.find(14).data, board) +"|                                                                                                                      |          |");
        System.out.println("└----------┘                                                                                                                      └----------┘");
        System.out.println("┌----------┐                                                                                                                      ┌----------┐");
        System.out.println("|  States  |                                                                                                                      |   Park   |");
        System.out.println("|    Ave   |                                                                                                                      |   Place  |");
        System.out.println("|"+ printOccupants(board.find(13).data) +"|                                                                                                                      |"+ printOccupants(board.find(37).data) +"|");
        System.out.println("|"+ printPrice(board.find(13).data, board) +"|                                                                                                                      |"+ printPrice(board.find(37).data, board) +"|");
        System.out.println("└----------┘                                                                                                                      └----------┘");
        System.out.println("┌----------┐                                                                                                                      ┌----------┐");
        System.out.println("| Electric |                                                                                                                      |  Luxury  |");
        System.out.println("|  Company |                               ___ ___  __  __ __  __ _   _ _  _ ___ _______   __   ___ _  _ ___ ___ _____            |    Tax   |");
        System.out.println("|"+ printOccupants(board.find(12).data) +"|                              / __/ _ \\|  \\/  |  \\/  | | | | \\| |_ _|_   _\\ \\ / /  / __| || | __/ __|_   _|           |"+ printOccupants(board.find(38).data) +"|");
        System.out.println("|"+ printPrice(board.find(12).data, board) +"|                             | (_| (_) | |\\/| | |\\/| | |_| | .` || |  | |  \\ V /  | (__| __ | _|\\__ \\ | |             | Pay 100$ |");
        System.out.println("└----------┘                              \\___\\___/|_|  |_|_|  |_|\\___/|_|\\_|___| |_|   |_|    \\___|_||_|___|___/ |_|             └----------┘");
        System.out.println("┌----------┐                                                                                                                      ┌----------┐");
        System.out.println("|St Charles|                                                                                                                      |Boardwalk |");
        System.out.println("|   Place  |                                                                                                                      |          |");
        System.out.println("|"+ printOccupants(board.find(11).data) +"|                                                                                                                      |"+ printOccupants(board.find(39).data) +"|");
        System.out.println("|"+ printPrice(board.find(11).data, board) +"|                                                                                                                      |"+ printPrice(board.find(39).data, board) +"|");
        System.out.println("└----------┘                                                                                                                      └----------┘");
        System.out.println("┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐");
        System.out.println("|  JAIL &  | |   Conn.  | |  Vermont | |  Chance  | | Oriental | |  Reading | |  Income  | |  Baltic  | |Community | | Mediter. | |    GO    |");
        System.out.println("|  Just V. | |    Ave   | |    Ave   | |          | |    Ave   | | Railroad | |    Tax   | |    Ave   | |   Chest  | |   Ave    | |          |");
        System.out.println("|"+ printOccupants(board.find(10).data) +"| |"+ printOccupants(board.find(9).data) +"| |"+ printOccupants(board.find(8).data) +
                "| |"+ printOccupants(board.find(7).data) +"| |"+ printOccupants(board.find(6).data) +"| |"+ printOccupants(board.find(5).data) +
                "| |"+ printOccupants(board.find(4).data) +"| |"+ printOccupants(board.find(3).data) +"| |"+ printOccupants(board.find(2).data) +
                "| |"+ printOccupants(board.find(1).data) +"| |"+ printOccupants(board.find(0).data) +"|");
        System.out.println("|          | |"+ printPrice(board.find(9).data, board) +"| |"+ printPrice(board.find(8).data, board) +"| |          | |"+ printPrice(board.find(6).data, board) +
                "| |"+ printPrice(board.find(5).data, board) +"| | Pay  Tax | |"+ printPrice(board.find(3).data, board) +"| |          | |"+ printPrice(board.find(1).data, board) +"| |  +200$   |");
        System.out.println("└----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘");
    }

    public static String printOccupants(BoardPiece link){
        int count = link.getOccupiedBy().length();
        switch (count){
            case 0:
                return "          ";
            case 1:
                return "    "+link.getOccupiedBy()+"     ";
            case 2:
                return "     "+link.getOccupiedBy().substring(0,1)+"  "+link.getOccupiedBy().substring(1,2)+"     ";
            case 3:
                return "   "+link.getOccupiedBy().substring(0,1)+"   "+link.getOccupiedBy().substring(1,2)+"   "+link.getOccupiedBy().substring(2,3)+"   ";
            case 4:
                return "   "+link.getOccupiedBy().substring(0,1)+"   "+link.getOccupiedBy().substring(1,2)+" "+link.getOccupiedBy().substring(2,3)+"   "+link.getOccupiedBy().substring(3,4)+"   ";
            case 5:
                return  "  "+link.getOccupiedBy().substring(0,1)+" "+link.getOccupiedBy().substring(1,2)+"   "+link.getOccupiedBy().substring(2,3)+" "+link.getOccupiedBy().substring(3,4)+" "+link.getOccupiedBy().substring(4,5)+"   ";
            case 6:
                return  "   "+link.getOccupiedBy().substring(0,1)+"  "+link.getOccupiedBy().substring(1,2)+"  "+link.getOccupiedBy().substring(2,3)+"  "+link.getOccupiedBy().substring(3,4)+"  "+link.getOccupiedBy().substring(4,5)+"  "+link.getOccupiedBy().substring(5,6) + "   ";
        }
        return "          ";
    }
    
    public static String printPrice(BoardPiece link, CLL<BoardPiece> board){
        int count = String.valueOf(link.getPrice()).length();
        if (link.getPrice() == 0 && link.isPurchasable() && !link.isMortgaged()){
            return "  " + board.find(link.getLocation()).data.getOwner().getColor() + "PURCHASED" + RESET + "  ";
        }
        if (link.isMortgaged()){
            return "  " +board.find(link.getLocation()).data.getOwner().getColor() + "MORTGAGED" + RESET + "  ";
        }
        else{
            switch (count){
                case 2:
                    return "    "+ link.getPrice() +"$   ";
                case 3:
                    return "   "+ link.getPrice() +"$   ";
            }
        }
        return "          ";
    }

    public static void freePlayerTurn(CLL<PlayerPiece> Players, CLL<BoardPiece> board, PlayerPiece currentPlayer, int d1, int d2) throws InterruptedException {
            int total = d1 + d2;
            Scanner in = new Scanner(System.in);
            System.out.println("You Rolled A " + d1 + " and a " + d2);
            board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy().replace(currentPlayer.getPiece(), ""));
            if (currentPlayer.getLocation() + total <= 39) {
                currentPlayer.setLocation(currentPlayer.getLocation() + total);
                board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy() + currentPlayer.getPiece());

            } else {
                currentPlayer.setLocation((currentPlayer.getLocation() + total) - 40);
                currentPlayer.setBalance(currentPlayer.getBalance() + 200);
                board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy() + currentPlayer.getPiece());
            }
            if (currentPlayer.getLocation() == 30) {
                currentPlayer.setStatus("jail");
                currentPlayer.setLocation(10);
                board.find(10).data.setOccupiedBy(board.find(10).data.getOccupiedBy() + currentPlayer.getPiece());
                System.out.println("You Got Sent To Jail");
            }
            if (board.find(currentPlayer.getLocation()).data.isPurchasable() && !board.find(currentPlayer.getLocation()).data.isPurchased()) {
                System.out.println("You Landed on " + board.find(currentPlayer.getLocation()).data.getName());
                System.out.println("Would You Like To Purchase It?");
                Scanner Scan = new Scanner(System.in);
                if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")) {
                    currentPlayer.setBalance(currentPlayer.getBalance() - board.find(currentPlayer.getLocation()).data.getPrice());
                    board.find(currentPlayer.getLocation()).data.setOwner(currentPlayer);
                    board.find(currentPlayer.getLocation()).data.setPurchased(true);
                    currentPlayer.getProperties().add(board.find(currentPlayer.getLocation()).data);
                    board.find(currentPlayer.getLocation()).data.setPrice(0);
                    if (board.find(currentPlayer.getLocation()).data.getSpecial().equals("railroad")){
                        currentPlayer.setRailroadsOwned(currentPlayer.getRailroadsOwned() + 1);
                    }
                    if (board.find(currentPlayer.getLocation()).data.getSpecial().equals("utility")){
                        currentPlayer.setRailroadsOwned(currentPlayer.getUtilitiesOwned() + 1);
                    }
                }
            }
            if (board.find(currentPlayer.getLocation()).data.isPurchasable() && board.find(currentPlayer.getLocation()).data.isPurchased() && board.find(currentPlayer.getLocation()).data.getOwner() != currentPlayer) {
                System.out.println("You Landed on " + board.find(currentPlayer.getLocation()).data.getName());
                if (board.find(currentPlayer.getLocation()).data.getSpecial().equals("railroad") && !board.find(currentPlayer.getLocation()).data.isMortgaged()){
                    currentPlayer.setBalance(currentPlayer.getBalance() - board.find(currentPlayer.getLocation()).data.getRent() * board.find(currentPlayer.getLocation()).data.getOwner().getRailroadsOwned());
                    board.find(currentPlayer.getLocation()).data.getOwner().setBalance(board.find(currentPlayer.getLocation()).data.getOwner().getBalance() + board.find(currentPlayer.getLocation()).data.getRent() * board.find(currentPlayer.getLocation()).data.getOwner().getRailroadsOwned());
                    System.out.println("You Paid "+board.find(currentPlayer.getLocation()).data.getRent() * board.find(currentPlayer.getLocation()).data.getOwner().getRailroadsOwned()+"$ Rent to " + board.find(currentPlayer.getLocation()).data.getOwner().getName());
                }
                if (board.find(currentPlayer.getLocation()).data.getSpecial().equals("utility") && !board.find(currentPlayer.getLocation()).data.isMortgaged()) {
                    currentPlayer.setBalance(currentPlayer.getBalance() - currentPlayer.getUtilitiesOwned() * 4 * total);
                    board.find(currentPlayer.getLocation()).data.getOwner().setBalance(board.find(currentPlayer.getLocation()).data.getOwner().getBalance() + currentPlayer.getUtilitiesOwned() * 4 * total);
                    System.out.println("You Paid "+currentPlayer.getUtilitiesOwned() * 4 * total+"$ Rent to " + board.find(currentPlayer.getLocation()).data.getOwner().getName());

                }
                else if (!board.find(currentPlayer.getLocation()).data.isMortgaged()) {
                    currentPlayer.setBalance(currentPlayer.getBalance() - board.find(currentPlayer.getLocation()).data.getRent());
                    board.find(currentPlayer.getLocation()).data.getOwner().setBalance(board.find(currentPlayer.getLocation()).data.getOwner().getBalance() + board.find(currentPlayer.getLocation()).data.getRent());
                    System.out.println("You Paid "+board.find(currentPlayer.getLocation()).data.getRent()+"$ Rent to " + board.find(currentPlayer.getLocation()).data.getOwner().getName());
                }
                else{
                    System.out.println("The property you landed on is mortgaged, no rent!");
                }
            }
            if (!board.find(currentPlayer.getLocation()).data.isPurchasable()) {
                switch (board.find(currentPlayer.getLocation()).data.getSpecial()) {
                    case "community chest":
                        System.out.println("Community Chest!");
                        TimeUnit.SECONDS.sleep(2);
                        CommunityChest(Players, board, currentPlayer);
                        break;
                    case "chance":
                        System.out.println("Chance!");
                        TimeUnit.SECONDS.sleep(2);
                        Chance(Players, board, currentPlayer, total);
                        break;
                    case "free parking":
                        System.out.println("You Landed on Free Parking");
                        break;
                    case "GO":
                        System.out.println("You landed on GO");
                        currentPlayer.setBalance(currentPlayer.getBalance() + 200);
                        System.out.println("200$ was added to your balance");
                        break;
                    case "jail":
                        System.out.println("You're just visiting");
                        break;
                    case "income tax":
                        Scanner taxChoice = new Scanner(System.in);
                        System.out.println("You landed on income tax, enter 1 to pay 10% of your balance or 2 to pay 200$");
                        int choice = taxChoice.nextInt();
                        if (choice == 1) {
                            System.out.println("You paid " + currentPlayer.getBalance() / 10 + " to the feds");
                            currentPlayer.setBalance((9 * currentPlayer.getBalance()) / 10);
                        } else {
                            System.out.println("You paid 200$");
                            currentPlayer.setBalance(currentPlayer.getBalance() - 200);
                        }
                        break;
                    case " luxury tax":
                        System.out.println("You paid 100$ to the feds for luxury tax");
                        currentPlayer.setBalance(currentPlayer.getBalance() - 100);
                        break;
                }
            }
        }

        public static void sellActions(CLL<PlayerPiece> Players, CLL<BoardPiece> board, PlayerPiece currentPlayer) {
            Scanner Choice = new Scanner(System.in);
            System.out.println("Press 1 if you would like to sell any properties, 2 to mortgage any properties, 3 to pay off your dept, or 4 to continue");
            int input = Choice.nextInt();
            switch (input) {
                case 1:
                    Scanner scan1 = new Scanner(System.in);
                    printProperties(currentPlayer);
                    String toSell = scan1.nextLine();
                    for (int i = 0; i < currentPlayer.getProperties().size(); i++) {
                        if (toSell.equals(currentPlayer.getProperties().get(i).getName())) {
                            currentPlayer.setBalance(currentPlayer.getBalance() + currentPlayer.getProperties().get(i).getSellValue());
                            System.out.println("You sold " + currentPlayer.getProperties().get(i).getName() + " and got " +  currentPlayer.getProperties().get(i).getSellValue());
                            currentPlayer.getProperties().get(i).setPrice(currentPlayer.getProperties().get(i).getSellValue() * 2);
                            currentPlayer.getProperties().get(i).setPurchased(false);
                            currentPlayer.getProperties().get(i).setOwner(null);
                            currentPlayer.getProperties().remove(i);
                            break;
                        }
                    }
                    break;
                case 2:
                    Scanner scan2 = new Scanner(System.in);
                    printProperties(currentPlayer);
                    String toMort = scan2.nextLine();
                    for (int i = 0; i < currentPlayer.getProperties().size(); i++) {
                        if (toMort.equals(currentPlayer.getProperties().get(i).getName())) {
                            currentPlayer.setBalance(currentPlayer.getBalance() + currentPlayer.getProperties().get(i).getSellValue());
                            System.out.println("You mortgaged " + currentPlayer.getProperties().get(i).getName() + " and got " +  currentPlayer.getProperties().get(i).getSellValue());
                            currentPlayer.getProperties().get(i).setMortgaged(true);
                            currentPlayer.setDept(currentPlayer.getDept() + currentPlayer.getProperties().get(i).getSellValue() + currentPlayer.getProperties().get(i).getSellValue()/10);
                            break;
                        }
                    }
                    break;
                case 3:
                    if (currentPlayer.getBalance() < currentPlayer.getDept()){
                        System.out.println("You do not have enough balance to pay off your dept");
                        break;
                    }
                    else{
                        currentPlayer.setBalance(currentPlayer.getBalance() - currentPlayer.getDept());
                        for (int i = 0; i < currentPlayer.getProperties().size(); i++){
                            currentPlayer.getProperties().get(i).setMortgaged(false);
                        }
                        System.out.println("You paid off all your dept, all your properties have now been un-mortgaged. You now have a balance of " + currentPlayer.getBalance());
                    }
                    break;
                default:
                    break;
                    }
            }

        public static void printProperties(PlayerPiece currentPlayer){
            for (int i = 0; i<currentPlayer.getProperties().size(); i++){
                System.out.println(currentPlayer.getProperties().get(i).getName() + "'s Mortgage/Sell price is " + currentPlayer.getProperties().get(i).getSellValue());
            }
            System.out.println("Which property would you like to sell/mortgage");
        }

    public static void jailPlayerTurn(CLL<BoardPiece> board, PlayerPiece currentPlayer, int d1, int d2){
        if (currentPlayer.getJailCount() < 3){
            if (currentPlayer.getGOOJF() > 0){
                System.out.println("Enter 1 to use a Get Out Of Jail Free card, 2 to pay 50$ and get out of jail, or 3 to attempt to roll doubles");
                Scanner scan = new Scanner(System.in);
                int input = scan.nextInt();
                switch (input){
                    case 1:
                        currentPlayer.setGOOJF(currentPlayer.getGOOJF() - 1);
                        currentPlayer.setStatus("free");
                        currentPlayer.setJailCount(0);
                        System.out.println("You used a get out of jail free card, you are now just visiting");
                        break;
                    case 2:
                        currentPlayer.setBalance(currentPlayer.getBalance() - 50);
                        currentPlayer.setStatus("free");
                        currentPlayer.setJailCount(0);
                        System.out.println("You paid the 50$ jail fee, you are now just visiting");
                        break;
                    case 3:
                        System.out.println("You rolled a " + d1 + " and a " + d2);
                        if (d1 == d2){
                            currentPlayer.setStatus("free");
                            currentPlayer.setJailCount(0);
                            System.out.println("You rolled doubles! You are now just visiting");
                        }
                        else{
                            currentPlayer.setJailCount(currentPlayer.getJailCount() + 1);
                            System.out.println("You didn't roll doubles");
                        }
                        break;
                }
            }
            else {
                System.out.println("Enter 1 to pay 50$ and get out of jail, or 2 to attempt to roll doubles");
                Scanner scan = new Scanner(System.in);
                int input = scan.nextInt();
                switch (input){
                    case 1:
                        currentPlayer.setBalance(currentPlayer.getBalance() - 50);
                        currentPlayer.setStatus("free");
                        currentPlayer.setJailCount(0);
                        System.out.println("You paid the 50$ jail fee, you are now just visiting");
                        break;
                    case 2:
                        System.out.println("You rolled a " + d1 + " and a " + d2);
                        if (d1 == d2){
                            currentPlayer.setStatus("free");
                            currentPlayer.setJailCount(0);
                            System.out.println("You rolled doubles! You are now just visiting");
                        }
                        else{
                            currentPlayer.setJailCount(currentPlayer.getJailCount() + 1);
                            System.out.println("You didn't roll doubles");
                        }
                        break;
                }
            }
        }
        else{
            System.out.println("It has been 3 turns in jail, you must pay the 50$ fee");
            currentPlayer.setBalance(currentPlayer.getBalance() - 50);
            currentPlayer.setStatus("free");
            currentPlayer.setJailCount(0);
        }
    }

    public static void CommunityChest(CLL<PlayerPiece> Players, CLL<BoardPiece> board, PlayerPiece currentPlayer) {
        Random rand = new Random();
        int random = rand.nextInt(17);
        switch (random) {
            case 1:
                board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy().replace(currentPlayer.getPiece(), ""));
                currentPlayer.setLocation(40);
                board.find(40).data.setOccupiedBy(board.find(40).data.getOccupiedBy() + currentPlayer.getPiece());
                System.out.println("You Advanced To GO");
                currentPlayer.setBalance(currentPlayer.getBalance() + 200);
                break;
            case 2:
                System.out.println("Bank Error In Your Favor, You Got 200$");
                currentPlayer.setBalance(currentPlayer.getBalance() + 200);
                break;
            case 3:
                System.out.println("Doctor's Fee: 50$");
                currentPlayer.setBalance(currentPlayer.getBalance() - 50);
                break;
            case 4:
                System.out.println("Sold Some Stock, Got 50$");
                currentPlayer.setBalance(currentPlayer.getBalance() + 50);
                break;
            case 5:
                System.out.println("You Got A Get Out Of Jail Free Card");
                currentPlayer.setGOOJF(currentPlayer.getGOOJF() + 1);
                break;
            case 6:
                System.out.println("You Got Sent To Jail");
                board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy().replace(currentPlayer.getPiece(), ""));
                currentPlayer.setLocation(10);
                board.find(10).data.setOccupiedBy(board.find(10).data.getOccupiedBy() + currentPlayer.getPiece());
                currentPlayer.setStatus("jail");
                break;
            case 7:
                System.out.println("Holiday Fund Matures, You Received 100$");
                currentPlayer.setBalance(currentPlayer.getBalance() + 100);
                break;
            case 8:
                System.out.println("Income Tax Refund, You Received 20$");
                currentPlayer.setBalance(currentPlayer.getBalance() + 20);
                break;
            case 9:
                System.out.println("It's Your Birthday! You Collect 10$ From Everyone");
                for (int i = 0; i<Players.length(); i++){
                    if (Players.find(i).data == currentPlayer){
                        currentPlayer.setBalance(currentPlayer.getBalance() + 10 * Players.length());
                    }
                    else{
                        Players.find(i).data.setBalance(Players.find(i).data.getBalance() - 10);
                    }
                }
                break;
            case 10:
                System.out.println("Life Insurance Matures, You Received 100$");
                currentPlayer.setBalance(currentPlayer.getBalance() + 100);
                break;
            case 11:
                System.out.println("Hospital Fee: 100$");
                currentPlayer.setBalance(currentPlayer.getBalance() - 100);
                break;
            case 12:
                System.out.println("School Fee: 50$");
                currentPlayer.setBalance(currentPlayer.getBalance() - 50);
                break;
            case 13:
                System.out.println("You Received A 50$ Consultancy Fee");
                currentPlayer.setBalance(currentPlayer.getBalance() + 50);
                break;
            case 14:
                System.out.println("You Placed Second In a Beauty Contest (Alex Won), You Receive 10$");
                currentPlayer.setBalance(currentPlayer.getBalance() + 10);
                break;
            case 15:
                System.out.println("You Inherit 100$");
                currentPlayer.setBalance(currentPlayer.getBalance() + 100);
                break;
            case 16:
                System.out.println("You Spell Sudo Code Right! You get 200$");
                currentPlayer.setBalance(currentPlayer.getBalance() + 200);
                break;
        }
    }
    public static void Chance(CLL<PlayerPiece> Players, CLL<BoardPiece> board, PlayerPiece currentPlayer, int roll){
        Random rand = new Random();
        int random = rand.nextInt(16);
        switch (random){
            case 1:
                board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy().replace(currentPlayer.getPiece(), ""));
                currentPlayer.setLocation(39);
                board.find(39).data.setOccupiedBy(board.find(39).data.getOccupiedBy() + currentPlayer.getPiece());
                System.out.println("You Got Sent To Boardwalk");
                if (board.find(39).data.isPurchased() && !board.find(currentPlayer.getLocation()).data.isMortgaged() && board.find(currentPlayer.getLocation()).data.getOwner() != currentPlayer){
                    currentPlayer.setBalance(currentPlayer.getBalance() - board.find(39).data.getRent());
                    board.find(currentPlayer.getLocation()).data.getOwner().setBalance(board.find(currentPlayer.getLocation()).data.getOwner().getBalance() + board.find(currentPlayer.getLocation()).data.getRent());
                    System.out.println("You Paid "+board.find(currentPlayer.getLocation()).data.getRent()+"$ Rent to " + board.find(currentPlayer.getLocation()).data.getOwner().getName());

                }
                else if (board.find(currentPlayer.getLocation()).data.isMortgaged()){
                    System.out.println("The property you landed on is mortgaged, no rent!");
                }
                else{
                    System.out.println("Would You Like To Purchase It?");
                    Scanner Scan = new Scanner(System.in);
                    if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                        currentPlayer.setBalance(currentPlayer.getBalance() - board.find(39).data.getPrice());
                        board.find(39).data.setOwner(currentPlayer);
                        board.find(39).data.setPurchased(true);
                        currentPlayer.getProperties().add(board.find(39).data);
                        board.find(currentPlayer.getLocation()).data.setPrice(0);
                    }
                }
                break;
            case 2:
                board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy().replace(currentPlayer.getPiece(), ""));
                currentPlayer.setLocation(0);
                board.find(0).data.setOccupiedBy(board.find(0).data.getOccupiedBy() + currentPlayer.getPiece());
                System.out.println("You Advanced To GO");
                currentPlayer.setBalance(currentPlayer.getBalance() + 200);
                break;
            case 3:
                board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy().replace(currentPlayer.getPiece(), ""));
                if (currentPlayer.getLocation() > 24){
                    currentPlayer.setBalance(currentPlayer.getBalance() + 200);
                }
                currentPlayer.setLocation(24);
                board.find(24).data.setOccupiedBy(board.find(24).data.getOccupiedBy() + currentPlayer.getPiece());
                System.out.println("You Got Sent To Illinois Ave.");
                if (board.find(24).data.isPurchased() && !board.find(currentPlayer.getLocation()).data.isMortgaged() && board.find(currentPlayer.getLocation()).data.getOwner() != currentPlayer){
                    currentPlayer.setBalance(currentPlayer.getBalance() - board.find(24).data.getRent());
                    board.find(currentPlayer.getLocation()).data.getOwner().setBalance(board.find(currentPlayer.getLocation()).data.getOwner().getBalance() + board.find(currentPlayer.getLocation()).data.getRent());
                    System.out.println("You Paid "+board.find(currentPlayer.getLocation()).data.getRent()+"$ Rent to " + board.find(currentPlayer.getLocation()).data.getOwner().getName());
                }
                else if (board.find(currentPlayer.getLocation()).data.isMortgaged()){
                    System.out.println("The property you landed on is mortgaged, no rent!");
                }
                else{
                    System.out.println("Would You Like To Purchase It?");
                    Scanner Scan = new Scanner(System.in);
                    if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                        currentPlayer.setBalance(currentPlayer.getBalance() - board.find(24).data.getPrice());
                        board.find(24).data.setOwner(currentPlayer);
                        board.find(24).data.setPurchased(true);
                        currentPlayer.getProperties().add(board.find(24).data);
                        board.find(currentPlayer.getLocation()).data.setPrice(0);
                    }
                }
                break;
            case 4:
                board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy().replace(currentPlayer.getPiece(), ""));
                if (currentPlayer.getLocation() > 11){
                    currentPlayer.setBalance(currentPlayer.getBalance() + 200);
                }
                currentPlayer.setLocation(11);
                board.find(11).data.setOccupiedBy(board.find(11).data.getOccupiedBy() + currentPlayer.getPiece());
                System.out.println("You Got Sent To St. Charles Place");
                if (board.find(11).data.isPurchased() && !board.find(currentPlayer.getLocation()).data.isMortgaged() && board.find(currentPlayer.getLocation()).data.getOwner() != currentPlayer){
                    currentPlayer.setBalance(currentPlayer.getBalance() - board.find(11).data.getRent());
                    board.find(currentPlayer.getLocation()).data.getOwner().setBalance(board.find(currentPlayer.getLocation()).data.getOwner().getBalance() + board.find(currentPlayer.getLocation()).data.getRent());
                    System.out.println("You Paid "+board.find(currentPlayer.getLocation()).data.getRent()+"$ Rent to " + board.find(currentPlayer.getLocation()).data.getOwner().getName());

                }
                else if (board.find(currentPlayer.getLocation()).data.isMortgaged()){
                    System.out.println("The property you landed on is mortgaged, no rent!");
                }
                else{
                    System.out.println("Would You Like To Purchase It?");
                    Scanner Scan = new Scanner(System.in);
                    if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                        currentPlayer.setBalance(currentPlayer.getBalance() - board.find(11).data.getPrice());
                        board.find(11).data.setOwner(currentPlayer);
                        board.find(11).data.setPurchased(true);
                        currentPlayer.getProperties().add(board.find(11).data);
                        board.find(currentPlayer.getLocation()).data.setPrice(0);
                    }
                }
                break;
            case 5:
            case 6:
                int reading = Math.abs(currentPlayer.getLocation() - 5);
                int penn = Math.abs(currentPlayer.getLocation() - 15);
                int BO = Math.abs(currentPlayer.getLocation() - 25);
                int Short = Math.abs(currentPlayer.getLocation() - 35);

                if (reading < penn && reading < BO && reading < Short && currentPlayer.getLocation() > 5){
                    board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy().replace(currentPlayer.getPiece(), ""));
                    currentPlayer.setBalance(currentPlayer.getBalance() + 200);
                    currentPlayer.setLocation(5);
                    board.find(5).data.setOccupiedBy(board.find(5).data.getOccupiedBy() + currentPlayer.getPiece());
                    System.out.println("You Got Sent To Reading Railroad");
                    if (board.find(5).data.isPurchased() && !board.find(currentPlayer.getLocation()).data.isMortgaged() && board.find(currentPlayer.getLocation()).data.getOwner() != currentPlayer){
                        currentPlayer.setBalance(currentPlayer.getBalance() - board.find(5).data.getRent() * board.find(5).data.getOwner().getRailroadsOwned() * 2);
                        board.find(currentPlayer.getLocation()).data.getOwner().setBalance(board.find(currentPlayer.getLocation()).data.getOwner().getBalance() + board.find(currentPlayer.getLocation()).data.getRent() * board.find(currentPlayer.getLocation()).data.getOwner().getRailroadsOwned() * 2);

                        System.out.println("You Paid "+board.find(5).data.getRent() * board.find(5).data.getOwner().getRailroadsOwned() * 2+"$ (double) Rent to " + board.find(currentPlayer.getLocation()).data.getOwner().getName());

                    }
                    else if (board.find(currentPlayer.getLocation()).data.isMortgaged()){
                        System.out.println("The property you landed on is mortgaged, no rent!");
                    }
                    else{
                        System.out.println("Would You Like To Purchase It?");
                        Scanner Scan = new Scanner(System.in);
                        if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                            currentPlayer.setBalance(currentPlayer.getBalance() - board.find(5).data.getPrice());
                            board.find(5).data.setOwner(currentPlayer);
                            board.find(5).data.setPurchased(true);
                            currentPlayer.getProperties().add(board.find(5).data);
                            currentPlayer.setRailroadsOwned(currentPlayer.getRailroadsOwned() + 1);
                            board.find(currentPlayer.getLocation()).data.setPrice(0);
                        }
                    }
                }
                if (reading < penn && reading < BO && reading < Short){
                    board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy().replace(currentPlayer.getPiece(), ""));
                    currentPlayer.setLocation(5);
                    board.find(5).data.setOccupiedBy(board.find(5).data.getOccupiedBy() + currentPlayer.getPiece());
                    System.out.println("You Got Sent To Reading Railroad");
                    if (board.find(5).data.isPurchased() && !board.find(currentPlayer.getLocation()).data.isMortgaged() && board.find(currentPlayer.getLocation()).data.getOwner() != currentPlayer){
                        currentPlayer.setBalance(currentPlayer.getBalance() - board.find(5).data.getRent() * board.find(5).data.getOwner().getRailroadsOwned() * 2);
                        board.find(currentPlayer.getLocation()).data.getOwner().setBalance(board.find(currentPlayer.getLocation()).data.getOwner().getBalance() + board.find(currentPlayer.getLocation()).data.getRent() * board.find(currentPlayer.getLocation()).data.getOwner().getRailroadsOwned() * 2);

                        System.out.println("You Paid "+board.find(5).data.getRent() * board.find(5).data.getOwner().getRailroadsOwned() * 2+"$ (double) Rent to " + board.find(currentPlayer.getLocation()).data.getOwner().getName());

                    }
                    else if (board.find(currentPlayer.getLocation()).data.isMortgaged()){
                        System.out.println("The property you landed on is mortgaged, no rent!");
                    }
                    else{
                        System.out.println("Would You Like To Purchase It?");
                        Scanner Scan = new Scanner(System.in);
                        if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                            currentPlayer.setBalance(currentPlayer.getBalance() - board.find(5).data.getPrice());
                            board.find(5).data.setOwner(currentPlayer);
                            board.find(5).data.setPurchased(true);
                            currentPlayer.getProperties().add(board.find(5).data);
                            currentPlayer.setRailroadsOwned(currentPlayer.getRailroadsOwned() + 1);
                            board.find(currentPlayer.getLocation()).data.setPrice(0);
                        }
                    }
                }


                if (penn < reading && penn < BO && penn < Short && currentPlayer.getLocation() > 15){
                    board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy().replace(currentPlayer.getPiece(), ""));
                    currentPlayer.setBalance(currentPlayer.getBalance() + 200);
                    currentPlayer.setLocation(15);
                    board.find(15).data.setOccupiedBy(board.find(15).data.getOccupiedBy() + currentPlayer.getPiece());
                    System.out.println("You Got Sent To Pennsylvania Railroad");
                    if (board.find(15).data.isPurchased() && !board.find(currentPlayer.getLocation()).data.isMortgaged() && board.find(currentPlayer.getLocation()).data.getOwner() != currentPlayer){
                        currentPlayer.setBalance(currentPlayer.getBalance() - board.find(15).data.getRent() * board.find(15).data.getOwner().getRailroadsOwned() * 2);
                        board.find(currentPlayer.getLocation()).data.getOwner().setBalance(board.find(currentPlayer.getLocation()).data.getOwner().getBalance() + board.find(currentPlayer.getLocation()).data.getRent() * board.find(currentPlayer.getLocation()).data.getOwner().getRailroadsOwned() * 2);

                        System.out.println("You Paid "+board.find(15).data.getRent() * board.find(15).data.getOwner().getRailroadsOwned() * 2+"$ (double) Rent to " + board.find(currentPlayer.getLocation()).data.getOwner().getName());
                    }
                    else if (board.find(currentPlayer.getLocation()).data.isMortgaged()){
                        System.out.println("The property you landed on is mortgaged, no rent!");
                    }
                    else{
                        System.out.println("Would You Like To Purchase It?");
                        Scanner Scan = new Scanner(System.in);
                        if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                            currentPlayer.setBalance(currentPlayer.getBalance() - board.find(15).data.getPrice());
                            board.find(15).data.setOwner(currentPlayer);
                            board.find(15).data.setPurchased(true);
                            currentPlayer.getProperties().add(board.find(15).data);
                            currentPlayer.setRailroadsOwned(currentPlayer.getRailroadsOwned() + 1);
                            board.find(currentPlayer.getLocation()).data.setPrice(0);
                        }
                    }
                }
                if (penn < reading && penn < BO && penn < Short){
                    board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy().replace(currentPlayer.getPiece(), ""));
                    currentPlayer.setLocation(15);
                    board.find(15).data.setOccupiedBy(board.find(15).data.getOccupiedBy() + currentPlayer.getPiece());
                    System.out.println("You Got Sent To Pennsylvania Railroad");
                    if (board.find(15).data.isPurchased() && !board.find(currentPlayer.getLocation()).data.isMortgaged() && board.find(currentPlayer.getLocation()).data.getOwner() != currentPlayer){
                        currentPlayer.setBalance(currentPlayer.getBalance() - board.find(15).data.getRent() * board.find(15).data.getOwner().getRailroadsOwned() * 2);
                        board.find(currentPlayer.getLocation()).data.getOwner().setBalance(board.find(currentPlayer.getLocation()).data.getOwner().getBalance() + board.find(currentPlayer.getLocation()).data.getRent() * board.find(currentPlayer.getLocation()).data.getOwner().getRailroadsOwned() * 2);

                        System.out.println("You Paid "+board.find(15).data.getRent() * board.find(15).data.getOwner().getRailroadsOwned() * 2+"$ (double) Rent to " + board.find(currentPlayer.getLocation()).data.getOwner().getName());
                    }
                    else if (board.find(currentPlayer.getLocation()).data.isMortgaged()){
                        System.out.println("The property you landed on is mortgaged, no rent!");
                    }
                    else{
                        System.out.println("Would You Like To Purchase It?");
                        Scanner Scan = new Scanner(System.in);
                        if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                            currentPlayer.setBalance(currentPlayer.getBalance() - board.find(15).data.getPrice());
                            board.find(15).data.setOwner(currentPlayer);
                            board.find(15).data.setPurchased(true);
                            currentPlayer.getProperties().add(board.find(15).data);
                            currentPlayer.setRailroadsOwned(currentPlayer.getRailroadsOwned() + 1);
                            board.find(currentPlayer.getLocation()).data.setPrice(0);
                        }
                    }
                }


                if (BO < reading && BO < penn && BO < Short && currentPlayer.getLocation() > 25){
                    board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy().replace(currentPlayer.getPiece(), ""));
                    currentPlayer.setBalance(currentPlayer.getBalance() + 200);
                    currentPlayer.setLocation(25);
                    board.find(25).data.setOccupiedBy(board.find(25).data.getOccupiedBy() + currentPlayer.getPiece());
                    System.out.println("You Got Sent To B. & O. Railroad");
                    if (board.find(25).data.isPurchased() && !board.find(currentPlayer.getLocation()).data.isMortgaged() && board.find(currentPlayer.getLocation()).data.getOwner() != currentPlayer){
                        currentPlayer.setBalance(currentPlayer.getBalance() - board.find(25).data.getRent() * board.find(25).data.getOwner().getRailroadsOwned() * 2);
                        board.find(currentPlayer.getLocation()).data.getOwner().setBalance(board.find(currentPlayer.getLocation()).data.getOwner().getBalance() + board.find(currentPlayer.getLocation()).data.getRent() * board.find(currentPlayer.getLocation()).data.getOwner().getRailroadsOwned() * 2);

                        System.out.println("You Paid "+board.find(25).data.getRent() * board.find(25).data.getOwner().getRailroadsOwned() * 2+"$ (double) Rent to " + board.find(currentPlayer.getLocation()).data.getOwner().getName());
                    }
                    else if (board.find(currentPlayer.getLocation()).data.isMortgaged()){
                        System.out.println("The property you landed on is mortgaged, no rent!");
                    }
                    else{
                        System.out.println("Would You Like To Purchase It?");
                        Scanner Scan = new Scanner(System.in);
                        if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                            currentPlayer.setBalance(currentPlayer.getBalance() - board.find(25).data.getPrice());
                            board.find(25).data.setOwner(currentPlayer);
                            board.find(25).data.setPurchased(true);
                            currentPlayer.getProperties().add(board.find(25).data);
                            currentPlayer.setRailroadsOwned(currentPlayer.getRailroadsOwned() + 1);
                            board.find(currentPlayer.getLocation()).data.setPrice(0);
                        }
                    }
                }
                if (BO < reading && BO < penn && BO < Short){
                    board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy().replace(currentPlayer.getPiece(), ""));
                    currentPlayer.setLocation(25);
                    board.find(25).data.setOccupiedBy(board.find(25).data.getOccupiedBy() + currentPlayer.getPiece());
                    System.out.println("You Got Sent To B. & O. Railroad");
                    if (board.find(25).data.isPurchased() && !board.find(currentPlayer.getLocation()).data.isMortgaged() && board.find(currentPlayer.getLocation()).data.getOwner() != currentPlayer){
                        currentPlayer.setBalance(currentPlayer.getBalance() - board.find(25).data.getRent() * board.find(25).data.getOwner().getRailroadsOwned() * 2);
                        board.find(currentPlayer.getLocation()).data.getOwner().setBalance(board.find(currentPlayer.getLocation()).data.getOwner().getBalance() + board.find(currentPlayer.getLocation()).data.getRent() * board.find(currentPlayer.getLocation()).data.getOwner().getRailroadsOwned() * 2);

                        System.out.println("You Paid "+board.find(25).data.getRent() * board.find(25).data.getOwner().getRailroadsOwned() * 2+"$ (double) Rent to " + board.find(currentPlayer.getLocation()).data.getOwner().getName());
                    }
                    else if (board.find(currentPlayer.getLocation()).data.isMortgaged()){
                        System.out.println("The property you landed on is mortgaged, no rent!");
                    }
                    else{
                        System.out.println("Would You Like To Purchase It?");
                        Scanner Scan = new Scanner(System.in);
                        if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                            currentPlayer.setBalance(currentPlayer.getBalance() - board.find(25).data.getPrice());
                            board.find(25).data.setOwner(currentPlayer);
                            board.find(25).data.setPurchased(true);
                            currentPlayer.getProperties().add(board.find(25).data);
                            currentPlayer.setRailroadsOwned(currentPlayer.getRailroadsOwned() + 1);
                            board.find(currentPlayer.getLocation()).data.setPrice(0);
                        }
                    }
                }


                if (Short < reading && Short < penn && Short < BO && currentPlayer.getLocation() > 35){
                    board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy().replace(currentPlayer.getPiece(), ""));
                    currentPlayer.setBalance(currentPlayer.getBalance() + 200);
                    currentPlayer.setLocation(35);
                    board.find(35).data.setOccupiedBy(board.find(35).data.getOccupiedBy() + currentPlayer.getPiece());
                    System.out.println("You Got Sent To The Short Line");
                    if (board.find(35).data.isPurchased() && !board.find(currentPlayer.getLocation()).data.isMortgaged() && board.find(currentPlayer.getLocation()).data.getOwner() != currentPlayer){
                        currentPlayer.setBalance(currentPlayer.getBalance() - board.find(35).data.getRent() * board.find(35).data.getOwner().getRailroadsOwned() * 2);
                        board.find(currentPlayer.getLocation()).data.getOwner().setBalance(board.find(currentPlayer.getLocation()).data.getOwner().getBalance() + board.find(currentPlayer.getLocation()).data.getRent() * board.find(currentPlayer.getLocation()).data.getOwner().getRailroadsOwned() * 2);

                        System.out.println("You Paid "+board.find(35).data.getRent() * board.find(35).data.getOwner().getRailroadsOwned() * 2+"$ (double) Rent to " + board.find(currentPlayer.getLocation()).data.getOwner().getName());
                    }
                    else if (board.find(currentPlayer.getLocation()).data.isMortgaged()){
                        System.out.println("The property you landed on is mortgaged, no rent!");
                    }
                    else{
                        System.out.println("Would You Like To Purchase It?");
                        Scanner Scan = new Scanner(System.in);
                        if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                            currentPlayer.setBalance(currentPlayer.getBalance() - board.find(35).data.getPrice());
                            board.find(35).data.setOwner(currentPlayer);
                            board.find(35).data.setPurchased(true);
                            currentPlayer.getProperties().add(board.find(35).data);
                            currentPlayer.setRailroadsOwned(currentPlayer.getRailroadsOwned() + 1);
                            board.find(currentPlayer.getLocation()).data.setPrice(0);
                        }
                    }
                }
                if (Short < reading && Short < penn && Short < BO){
                    board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy().replace(currentPlayer.getPiece(), ""));
                    currentPlayer.setLocation(35);
                    board.find(35).data.setOccupiedBy(board.find(35).data.getOccupiedBy() + currentPlayer.getPiece());
                    System.out.println("You Got Sent To The Short Line");
                    if (board.find(35).data.isPurchased() && !board.find(currentPlayer.getLocation()).data.isMortgaged() && board.find(currentPlayer.getLocation()).data.getOwner() != currentPlayer){
                        currentPlayer.setBalance(currentPlayer.getBalance() - board.find(35).data.getRent() * board.find(35).data.getOwner().getRailroadsOwned() * 2);
                        board.find(currentPlayer.getLocation()).data.getOwner().setBalance(board.find(currentPlayer.getLocation()).data.getOwner().getBalance() + board.find(currentPlayer.getLocation()).data.getRent() * board.find(currentPlayer.getLocation()).data.getOwner().getRailroadsOwned() * 2);

                        System.out.println("You Paid "+board.find(35).data.getRent() * board.find(35).data.getOwner().getRailroadsOwned() * 2+"$ (double) Rent to " + board.find(currentPlayer.getLocation()).data.getOwner().getName());
                    }
                    else if (board.find(currentPlayer.getLocation()).data.isMortgaged()){
                        System.out.println("The property you landed on is mortgaged, no rent!");
                    }
                    else{
                        System.out.println("Would You Like To Purchase It?");
                        Scanner Scan = new Scanner(System.in);
                        if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                            currentPlayer.setBalance(currentPlayer.getBalance() - board.find(35).data.getPrice());
                            board.find(35).data.setOwner(currentPlayer);
                            board.find(35).data.setPurchased(true);
                            currentPlayer.getProperties().add(board.find(35).data);
                            currentPlayer.setRailroadsOwned(currentPlayer.getRailroadsOwned() + 1);
                            board.find(currentPlayer.getLocation()).data.setPrice(0);
                        }
                    }
                }
                break;

            case 7:
                int Electricity = Math.abs(currentPlayer.getLocation() - 12);
                int Water = Math.abs(currentPlayer.getLocation() - 28);

                if (Electricity < Water && currentPlayer.getLocation() > 12){
                    board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy().replace(currentPlayer.getPiece(), ""));
                    currentPlayer.setBalance(currentPlayer.getBalance() + 200);
                    currentPlayer.setLocation(12);
                    board.find(12).data.setOccupiedBy(board.find(12).data.getOccupiedBy() + currentPlayer.getPiece());
                    System.out.println("You Got Sent To The Electric Company");
                    if (board.find(12).data.isPurchased() && !board.find(currentPlayer.getLocation()).data.isMortgaged() && board.find(currentPlayer.getLocation()).data.getOwner() != currentPlayer){
                        currentPlayer.setBalance(currentPlayer.getBalance() - currentPlayer.getUtilitiesOwned() * 4 * roll * 2);
                        board.find(currentPlayer.getLocation()).data.getOwner().setBalance(board.find(currentPlayer.getLocation()).data.getOwner().getBalance() + currentPlayer.getUtilitiesOwned() * 4 * roll * 2);

                        System.out.println("You Paid "+board.find(12).data.getRent() * board.find(12).data.getOwner().getRailroadsOwned() * 2+"$ (double) Rent to " + board.find(currentPlayer.getLocation()).data.getOwner().getName());
                    }
                    else if (board.find(currentPlayer.getLocation()).data.isMortgaged()){
                        System.out.println("The property you landed on is mortgaged, no rent!");
                    }
                    else{
                        System.out.println("Would You Like To Purchase It?");
                        Scanner Scan = new Scanner(System.in);
                        if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                            currentPlayer.setBalance(currentPlayer.getBalance() - board.find(12).data.getPrice());
                            board.find(12).data.setOwner(currentPlayer);
                            board.find(12).data.setPurchased(true);
                            currentPlayer.getProperties().add(board.find(12).data);
                            board.find(currentPlayer.getLocation()).data.setPrice(0);
                        }
                    }
                }
                if (Electricity < Water){
                    board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy().replace(currentPlayer.getPiece(), ""));
                    currentPlayer.setLocation(12);
                    board.find(12).data.setOccupiedBy(board.find(12).data.getOccupiedBy() + currentPlayer.getPiece());
                    System.out.println("You Got Sent To The Electric Company");
                    if (board.find(12).data.isPurchased() && !board.find(currentPlayer.getLocation()).data.isMortgaged() && board.find(currentPlayer.getLocation()).data.getOwner() != currentPlayer){
                        currentPlayer.setBalance(currentPlayer.getBalance() - currentPlayer.getUtilitiesOwned() * 4 * roll * 2);
                        board.find(currentPlayer.getLocation()).data.getOwner().setBalance(board.find(currentPlayer.getLocation()).data.getOwner().getBalance() + currentPlayer.getUtilitiesOwned() * 4 * roll * 2);

                        System.out.println("You Paid "+board.find(12).data.getRent() * board.find(12).data.getOwner().getRailroadsOwned() * 2+"$ (double) Rent to " + board.find(currentPlayer.getLocation()).data.getOwner().getName());
                    }
                    else if (board.find(currentPlayer.getLocation()).data.isMortgaged()){
                        System.out.println("The property you landed on is mortgaged, no rent!");
                    }
                    else{
                        System.out.println("Would You Like To Purchase It?");
                        Scanner Scan = new Scanner(System.in);
                        if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                            currentPlayer.setBalance(currentPlayer.getBalance() - board.find(12).data.getPrice());
                            board.find(12).data.setOwner(currentPlayer);
                            board.find(12).data.setPurchased(true);
                            currentPlayer.getProperties().add(board.find(12).data);
                            board.find(currentPlayer.getLocation()).data.setPrice(0);
                        }
                    }
                }


                if (Electricity > Water && currentPlayer.getLocation() > 28){
                    board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy().replace(currentPlayer.getPiece(), ""));
                    currentPlayer.setBalance(currentPlayer.getBalance() + 200);
                    currentPlayer.setLocation(28);
                    board.find(28).data.setOccupiedBy(board.find(28).data.getOccupiedBy() + currentPlayer.getPiece());
                    System.out.println("You Got Sent To The Water Works");
                    if (board.find(28).data.isPurchased() && !board.find(currentPlayer.getLocation()).data.isMortgaged() && board.find(currentPlayer.getLocation()).data.getOwner() != currentPlayer){
                        currentPlayer.setBalance(currentPlayer.getBalance() - currentPlayer.getUtilitiesOwned() * 4 * roll * 2);
                        board.find(currentPlayer.getLocation()).data.getOwner().setBalance(board.find(currentPlayer.getLocation()).data.getOwner().getBalance() + currentPlayer.getUtilitiesOwned() * 4 * roll * 2);

                        System.out.println("You Paid "+board.find(28).data.getRent() * board.find(28).data.getOwner().getRailroadsOwned() * 2+"$ (double) Rent to " + board.find(currentPlayer.getLocation()).data.getOwner().getName());
                    }
                    else if (board.find(currentPlayer.getLocation()).data.isMortgaged()){
                        System.out.println("The property you landed on is mortgaged, no rent!");
                    }
                    else{
                        System.out.println("Would You Like To Purchase It?");
                        Scanner Scan = new Scanner(System.in);
                        if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                            currentPlayer.setBalance(currentPlayer.getBalance() - board.find(28).data.getPrice());
                            board.find(28).data.setOwner(currentPlayer);
                            board.find(28).data.setPurchased(true);
                            currentPlayer.getProperties().add(board.find(28).data);
                            board.find(currentPlayer.getLocation()).data.setPrice(0);
                        }
                    }
                }
                if (Electricity > Water){
                    board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy().replace(currentPlayer.getPiece(), ""));
                    currentPlayer.setLocation(28);
                    board.find(28).data.setOccupiedBy(board.find(28).data.getOccupiedBy() + currentPlayer.getPiece());
                    System.out.println("You Got Sent To Water Works");
                    if (board.find(28).data.isPurchased() && !board.find(currentPlayer.getLocation()).data.isMortgaged() && board.find(currentPlayer.getLocation()).data.getOwner() != currentPlayer){
                        currentPlayer.setBalance(currentPlayer.getBalance() - currentPlayer.getUtilitiesOwned() * 4 * roll * 2);
                        board.find(currentPlayer.getLocation()).data.getOwner().setBalance(board.find(currentPlayer.getLocation()).data.getOwner().getBalance() + currentPlayer.getUtilitiesOwned() * 4 * roll * 2);

                        System.out.println("You Paid "+board.find(28).data.getRent() * board.find(28).data.getOwner().getRailroadsOwned() * 2+"$ (double) Rent to " + board.find(currentPlayer.getLocation()).data.getOwner().getName());
                    }
                    else if (board.find(currentPlayer.getLocation()).data.isMortgaged()){
                        System.out.println("The property you landed on is mortgaged, no rent!");
                    }
                    else{
                        System.out.println("Would You Like To Purchase It?");
                        Scanner Scan = new Scanner(System.in);
                        if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                            currentPlayer.setBalance(currentPlayer.getBalance() - board.find(28).data.getPrice());
                            board.find(28).data.setOwner(currentPlayer);
                            board.find(28).data.setPurchased(true);
                            currentPlayer.getProperties().add(board.find(28).data);
                            board.find(currentPlayer.getLocation()).data.setPrice(0);
                        }
                    }
                }

                break;
            case 8:
                System.out.println("The Bank Pays You A Dividend of $50");
                currentPlayer.setBalance(currentPlayer.getBalance() + 50);
                break;
            case 9:
                System.out.println("You Got A Get Out Of Jail Free Card");
                currentPlayer.setGOOJF(currentPlayer.getGOOJF() + 1);
                break;
            case 10:
                System.out.println("You Got Sent Back 3 Spaces (You do not pay rent)");
                board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy().replace(currentPlayer.getPiece(), ""));
                currentPlayer.setLocation(currentPlayer.getLocation() - 3);
                board.find(currentPlayer.getLocation() - 3).data.setOccupiedBy(board.find(currentPlayer.getLocation() - 3).data.getOccupiedBy() + currentPlayer.getPiece());
                break;
            case 11:
                System.out.println("You Got Sent To Jail");
                board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy().replace(currentPlayer.getPiece(), ""));
                currentPlayer.setLocation(10);
                board.find(10).data.setOccupiedBy(board.find(currentPlayer.getLocation() - 3).data.getOccupiedBy() + currentPlayer.getPiece());
                currentPlayer.setStatus("jail");
                break;
            case 12:
                System.out.println("Speeding Fine: 15$");
                currentPlayer.setBalance(currentPlayer.getBalance() - 15);
                break;
            case 13:
                board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy().replace(currentPlayer.getPiece(), ""));
                if (currentPlayer.getLocation() > 5) {
                    currentPlayer.setBalance(currentPlayer.getBalance() + 200);
                }
                    currentPlayer.setLocation(5);
                board.find(5).data.setOccupiedBy(board.find(5).data.getOccupiedBy() + currentPlayer.getPiece());
                    System.out.println("You Got Sent To Reading Railroad");
                    if (board.find(5).data.isPurchased()){
                        currentPlayer.setBalance(currentPlayer.getBalance() - board.find(5).data.getRent() * board.find(5).data.getOwner().getRailroadsOwned());
                        board.find(currentPlayer.getLocation()).data.getOwner().setBalance(board.find(currentPlayer.getLocation()).data.getOwner().getBalance() + board.find(currentPlayer.getLocation()).data.getRent() * board.find(currentPlayer.getLocation()).data.getOwner().getRailroadsOwned());

                        System.out.println("You Paid "+board.find(5).data.getRent() * board.find(5).data.getOwner().getRailroadsOwned()+"$ Rent to " + board.find(currentPlayer.getLocation()).data.getOwner().getName());
                    }
                    else{
                        System.out.println("Would You Like To Purchase It?");
                        Scanner Scan = new Scanner(System.in);
                        if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                            currentPlayer.setBalance(currentPlayer.getBalance() - board.find(5).data.getPrice());
                            board.find(5).data.setOwner(currentPlayer);
                            board.find(5).data.setPurchased(true);
                            currentPlayer.getProperties().add(board.find(5).data);
                            currentPlayer.setRailroadsOwned(currentPlayer.getRailroadsOwned() + 1);
                            board.find(currentPlayer.getLocation()).data.setPrice(0);
                        }
                    }
                break;
            case 14:
                System.out.println("Your building loan matures, You get 150$");
                currentPlayer.setBalance(currentPlayer.getBalance() + 150);
                break;
            case 15:
                System.out.println("You have been elected Chairman of the Board. You pay each player $50");
                for (int i = 0; i<Players.length(); i++){
                    if (Players.find(i).data == currentPlayer){
                        currentPlayer.setBalance(currentPlayer.getBalance() - 50 * Players.length());
                    }
                    else{
                        Players.find(i).data.setBalance(Players.find(i).data.getBalance() + 50);
                    }
                }
                break;
        }
    }
    public static boolean isGameOver(CLL<PlayerPiece> players){
        PlayerPiece current;
        for(int i = 0; i<players.length(); i++){
            if(players.find(i).data.getBalance() <= 0){
                players.delete(players.find(i).data);
            }
        }
        if(players.length() <= 1){
            return true;
        }
        return false;
    }
}

