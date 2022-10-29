import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import java.util.concurrent.TimeUnit;

public class Main {
    public static final String RESET = "\033[0m";  //reset
    public static final String RED = "\033[0;31m";     // square
    public static final String GREEN = "\033[0;32m";   // diamond
    public static final String YELLOW = "\033[0;33m";  // circle
    public static final String BLUE = "\033[0;34m";    // triangle
    public static final String PURPLE = "\033[0;35m";  // checker
    public static final String CYAN = "\033[0;36m";    // L-shape

    public static void main(String[] args) throws InterruptedException {

        CLL<BoardPiece> board = new CLL<>();
        CLL<PlayerPiece> players = new CLL<>();
        // below are all the declarations for the board pieces
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

        //inserting all the pieces into the circly linked list
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

        //creating all the player objects then adding them into a player CLL
        ArrayList<BoardPiece> properties1 = new ArrayList<>();
        PlayerPiece P1 = new PlayerPiece("square", 100, false, 0, properties1, "■", "free", 0, 0, 0, 0, 0, RED);
        ArrayList<BoardPiece> properties2 = new ArrayList<>();
        PlayerPiece P2 = new PlayerPiece("Diamond", 100, false, 0, properties2, "◆", "free", 0, 0, 0, 0, 0, GREEN);
        ArrayList<BoardPiece> properties3 = new ArrayList<>();
        PlayerPiece P3 = new PlayerPiece("Circle", 100, false, 0, properties3, "◕", "free", 0, 0, 0, 0, 0, YELLOW);
        ArrayList<BoardPiece> properties4 = new ArrayList<>();
        PlayerPiece P4 = new PlayerPiece("Triangle", 100, false, 0, properties4, "▲", "free", 0, 0, 0, 0, 0, BLUE);
        ArrayList<BoardPiece> properties5 = new ArrayList<>();
        PlayerPiece P5 = new PlayerPiece("Checker", 100, false, 0, properties5, "▞", "free", 0, 0, 0, 0, 0, PURPLE);
        ArrayList<BoardPiece> properties6 = new ArrayList<>();
        PlayerPiece P6 = new PlayerPiece("L-shape", 100, false, 0, properties6, "▙", "free", 0, 0, 0, 0, 0, CYAN);


        players.insert(P1);
        players.insert(P2);
        players.insert(P3);
        players.insert(P4);
        players.insert(P5);
        players.insert(P6);

        printBoard(board);

        //initial print, prints out the board and some basic instructions while also telling the players what colors each piece is
        System.out.println("Welcome to Monopoly");
        System.out.println("Make Sure you are using the JetBrains Mono font, font size <= 10 is recommended");
        System.out.println();
        System.out.println("Square you are red \nDiamond you are green \nCircle you are yellow \nTriangle you are blue \nChecker you are purple \nL-shape you are cyan");

        //this while loop is the game loop, this cycles through the CLL of players letting each of them go through a turn before moving on to the next. When a player runs out of money, they are removed from the
        //CLL and no longer will have turns
        while (!isGameOver(players, board)) {
            for (int i = 0; i < players.length(); i++) {
                Random dice = new Random();
                //creating all the dice for the initial roll and the secondary roll in case the first roll is doubles
                int d1 = dice.nextInt(6) + 1;
                int d2 = dice.nextInt(6) + 1;
                int d3 = dice.nextInt(6) + 1;
                int d4 = dice.nextInt(6) + 1;
                int total = d1 + d2;
                //times out the program for 3 seconds so we don't get a bunch of boards printed all at once, overwhelming the players. Plus IMO it makes for a much better playing experience
                TimeUnit.SECONDS.sleep(3);
                printBoard(board);
                //this is the turn the player will go through if they are in jail
                if (players.find(i).data.getStatus().equals("jail")) {
                    System.out.println(players.find(i).data.getName() + " your current balance is " + players.find(i).data.getBalance() + "$");
                    jailPlayerTurn(board, players.find(i).data, d1, d2);
                    sellActions(players, board, players.find(i).data);
                }
                //this is the loop they will go through for a turn if they are free
                if (players.find(i).data.getStatus().equals("free")) {
                    System.out.println(players.find(i).data.getName() + " your current balance is " + players.find(i).data.getBalance() + "$");
                    freePlayerTurn(players, board, players.find(i).data, d1, d2);
                    sellActions(players, board, players.find(i).data);
                    //repeats the turn for a free player if the player rolled doubles will new dice and rolls
                    if (d1 == d2 && players.find(i).data.getStatus().equals("free")) {
                        System.out.println("you rolled doubles, you get to go again");
                        System.out.println(players.find(i).data.getName() + " your current balance is " + players.find(i).data.getBalance() + "$");
                        freePlayerTurn(players, board, players.find(i).data, d3, d4);
                        sellActions(players, board, players.find(i).data);
                    }
                }
                if (players.find(i).data.getBalance() <= 0 ){
                    System.out.println("You went broke!");
                    i--;
                }
                System.out.println("Your turn has ended");
                isGameOver(players, board);
            }
        }
        //prints out congrats to the winning player in randomized rainbow font
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

    //does exactly what you think it does, this method prints out the board accounting for the playerpieces and the price of each property along with their either purchased or mortgaged status
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

    //returns the string PrintBoard will print out depending on how many players are on that square at once
    public static String printOccupants(BoardPiece link){
        int count = link.getOccupiedBy().length();
        switch (count){
            case 0:
                return "          ";
            case 1:
                return "     "+link.getOccupiedBy()+"    ";
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

    //returns the string printBoard will print out depending on the price and the status of the board, status takes priority and will be printed first.
    public static String printPrice(BoardPiece link, CLL<BoardPiece> board){
        int count = String.valueOf(link.getPrice()).length();
        //purchased and mortgaged are the same amount of letters, color is added to these words depending on whom the owner of the property is
        if (link.isPurchased() && !link.isMortgaged()){
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

    //this is the main "move" protion of a free player's turn
    public static void freePlayerTurn(CLL<PlayerPiece> Players, CLL<BoardPiece> board, PlayerPiece currentPlayer, int d1, int d2) throws InterruptedException {
            int total = d1 + d2;
            Scanner in = new Scanner(System.in);
            System.out.println("You Rolled A " + d1 + " and a " + d2);
            board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy().replace(currentPlayer.getPiece(), ""));
            //this is for if the player does not pass go, if the player lands on go, the 200 will be given later in this method
            if (currentPlayer.getLocation() + total <= 39) {
                currentPlayer.setLocation(currentPlayer.getLocation() + total);
                board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy() + currentPlayer.getPiece());

            }
            //passing go here resets the location to 0 and gives the player the 200 for passing go
            else {
                currentPlayer.setLocation((currentPlayer.getLocation() + total) - 40);
                currentPlayer.setBalance(currentPlayer.getBalance() + 200);
                board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy() + currentPlayer.getPiece());
            }
            //this is for the GO TO JAIL space, this just sends the player to jail and sets their status to jail
            if (currentPlayer.getLocation() == 30) {
                currentPlayer.setStatus("jail");
                currentPlayer.setLocation(10);
                board.find(10).data.setOccupiedBy(board.find(10).data.getOccupiedBy() + currentPlayer.getPiece());
                System.out.println("You Got Sent To Jail");
            }
            //this is if the player lands on a square that is purchasable and it is not purchased. This gives the player the option to buy the property and if so, adds the property their property list
            //along with subtracting the correct purchase amount
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
                    //if the property to purchase is a railroad the process is exactly the same except now we increase the player's railroad count by 1
                    if (board.find(currentPlayer.getLocation()).data.getSpecial().equals("railroad")){
                        currentPlayer.setRailroadsOwned(currentPlayer.getRailroadsOwned() + 1);
                    }
                    //if the property to purchase is a utility the process is exactly the same except now we increase the player's utility count by 1
                    if (board.find(currentPlayer.getLocation()).data.getSpecial().equals("utility")){
                        currentPlayer.setUtilitiesOwned(currentPlayer.getUtilitiesOwned() + 1);
                    }
                }
            }
            //similar to the buy loop, this triggers when the player lands on a square that is owned by someone other than them, this loop deals with rent paid.
            if (board.find(currentPlayer.getLocation()).data.isPurchasable() && board.find(currentPlayer.getLocation()).data.isPurchased() && board.find(currentPlayer.getLocation()).data.getOwner() != currentPlayer) {
                System.out.println("You Landed on " + board.find(currentPlayer.getLocation()).data.getName());
                // deals with the rent pricing if the player lands on a railroad that is owned by someone else, this multiplies the amount of railroads owned by the owner of the railroad space by the rent
                if (board.find(currentPlayer.getLocation()).data.getSpecial().equals("railroad") && !board.find(currentPlayer.getLocation()).data.isMortgaged()){
                    currentPlayer.setBalance(currentPlayer.getBalance() - board.find(currentPlayer.getLocation()).data.getRent() * board.find(currentPlayer.getLocation()).data.getOwner().getRailroadsOwned());
                    board.find(currentPlayer.getLocation()).data.getOwner().setBalance(board.find(currentPlayer.getLocation()).data.getOwner().getBalance() + board.find(currentPlayer.getLocation()).data.getRent() * board.find(currentPlayer.getLocation()).data.getOwner().getRailroadsOwned());
                    System.out.println("You Paid "+board.find(currentPlayer.getLocation()).data.getRent() * board.find(currentPlayer.getLocation()).data.getOwner().getRailroadsOwned()+"$ Rent to " + board.find(currentPlayer.getLocation()).data.getOwner().getName());
                }
                //deals with the rent pricing if the player lands on a utility
                if (board.find(currentPlayer.getLocation()).data.getSpecial().equals("utility") && !board.find(currentPlayer.getLocation()).data.isMortgaged()) {
                    currentPlayer.setBalance(currentPlayer.getBalance() - currentPlayer.getUtilitiesOwned() * 4 * total);
                    board.find(currentPlayer.getLocation()).data.getOwner().setBalance(board.find(currentPlayer.getLocation()).data.getOwner().getBalance() + currentPlayer.getUtilitiesOwned() * 4 * total);
                    System.out.println("You Paid "+board.find(currentPlayer.getLocation()).data.getOwner().getUtilitiesOwned() * 4 * total+"$ Rent to " + board.find(currentPlayer.getLocation()).data.getOwner().getName());

                }
                //normal rent calculations, this is for a property that is not special (not railroad or utility)
                if (!board.find(currentPlayer.getLocation()).data.isMortgaged() && board.find(currentPlayer.getLocation()).data.getSpecial().equals("")) {
                    currentPlayer.setBalance(currentPlayer.getBalance() - board.find(currentPlayer.getLocation()).data.getRent());
                    board.find(currentPlayer.getLocation()).data.getOwner().setBalance(board.find(currentPlayer.getLocation()).data.getOwner().getBalance() + board.find(currentPlayer.getLocation()).data.getRent());
                    System.out.println("You Paid "+board.find(currentPlayer.getLocation()).data.getRent()+"$ Rent to " + board.find(currentPlayer.getLocation()).data.getOwner().getName());
                }
                //if it isn't any of these it must be a mortgaged property, so no rent is charged
                if (board.find(currentPlayer.getLocation()).data.isMortgaged()){
                    System.out.println("The property you landed on is mortgaged, no rent!");
                }
            }
            // this deals with any special properties that arnt a railroad or utility, all these squares have special rules like GO or community chest
            if (!board.find(currentPlayer.getLocation()).data.isPurchasable() && !currentPlayer.getStatus().equals("jail")) {
                switch (board.find(currentPlayer.getLocation()).data.getSpecial()) {
                    //calls the communtiy chest method
                    case "community chest":
                        System.out.println("Community Chest!");
                        TimeUnit.SECONDS.sleep(2);
                        CommunityChest(Players, board, currentPlayer);
                        break;
                    //calls the chance method
                    case "chance":
                        System.out.println("Chance!");
                        TimeUnit.SECONDS.sleep(2);
                        Chance(Players, board, currentPlayer, total);
                        break;
                    //does nothing pretty much, just gives the player a free place to stay
                    case "free parking":
                        System.out.println("You Landed on Free Parking");
                        break;
                    //gives 200 to the current player, this is the case I was talking about earlier where the player lands on go
                    case "GO":
                        System.out.println("You landed on GO");
                        currentPlayer.setBalance(currentPlayer.getBalance() + 200);
                        System.out.println("200$ was added to your balance");
                        break;
                    //just visiting the jail, same as free parking
                    case "jail":
                        System.out.println("You're just visiting");
                        break;
                    //gives the player a choice between 10% of their balance or 200$, accepts the player response and does the corresponding action
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
                    //simply charges 100$ and then acts like free parking
                    case " luxury tax":
                        System.out.println("You paid 100$ to the feds for luxury tax");
                        currentPlayer.setBalance(currentPlayer.getBalance() - 100);
                        break;
                }
            }
        }

    public static void sellActions(CLL<PlayerPiece> Players, CLL<BoardPiece> board, PlayerPiece currentPlayer) {
            Scanner Choice = new Scanner(System.in);
            //prompts the players about their action
            System.out.println("Press 1 if you would like to sell any properties, 2 to mortgage any properties, 3 to pay off your Debt, or 4 to continue");
            int input = Choice.nextInt();
            switch (input) {
                case 1:
                    //the first case is if the player wants to sell a property, the program will display all the owned properties and ask the player whitch they would like to sell
                    //the program will then reset that property and remove it from the player's ownership
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
                    //the second case is similar to the first, instead of prompting asking the player which property they would like to sell, it is asking which they would like to mortgage
                    //the program then mortgages the property by setting the isMortgaged property to true, telling the rest of the program (mainly the free player loop) that
                    //if a player lands on that space, they should not be charged rent.
                    Scanner scan2 = new Scanner(System.in);
                    printProperties(currentPlayer);
                    String toMort = scan2.nextLine();
                    for (int i = 0; i < currentPlayer.getProperties().size(); i++) {
                        if (toMort.equals(currentPlayer.getProperties().get(i).getName())) {
                            currentPlayer.setBalance(currentPlayer.getBalance() + currentPlayer.getProperties().get(i).getSellValue());
                            System.out.println("You mortgaged " + currentPlayer.getProperties().get(i).getName() + " and got " +  currentPlayer.getProperties().get(i).getSellValue());
                            currentPlayer.getProperties().get(i).setMortgaged(true);
                            currentPlayer.setDebt(currentPlayer.getDebt() + currentPlayer.getProperties().get(i).getSellValue() + currentPlayer.getProperties().get(i).getSellValue()/10);
                            break;
                        }
                    }
                    break;
                case 3:
                    //case 3 prints out the player's properties and asks them which one they would like to un-mortgage. The code will then charge the sell value + 10% to the player's
                    //balance and set the property's isMortgaged property to false
                    for (int i = 0; i<currentPlayer.getProperties().size(); i++){
                        int debt = currentPlayer.getProperties().get(i).getSellValue() + currentPlayer.getProperties().get(i).getSellValue()/10;
                        if (currentPlayer.getProperties().get(i).isMortgaged()){
                            System.out.println(currentPlayer.getProperties().get(i).getName() + "'s price to un-mortgage is " + debt);
                        }
                    }
                    Scanner Debt = new Scanner(System.in);
                    String toPay = Debt.nextLine();
                    for (int i = 0; i < currentPlayer.getProperties().size(); i++) {
                        if (toPay.equals(currentPlayer.getProperties().get(i).getName())) {
                            if (currentPlayer.getBalance() < (currentPlayer.getProperties().get(i).getSellValue() + currentPlayer.getProperties().get(i).getSellValue()/10)) {
                                System.out.println("You do not have enough balance to pay off your Debt");
                                break;
                            }
                            else{
                                currentPlayer.setBalance(currentPlayer.getBalance() - (currentPlayer.getProperties().get(i).getSellValue() + currentPlayer.getProperties().get(i).getSellValue()/10));
                                currentPlayer.getProperties().get(i).setMortgaged(false);
                                System.out.println("You paid off this property's Debt, all your properties have now been un-mortgaged. You now have a balance of " + currentPlayer.getBalance());
                            }
                        }
                    }
                    break;
                default:
                    //the default (case 4) just ends the method, the program will then move on to the next player's turn unless the current player rolled doubles
                    break;
                    }
            }
    //printProperties goes through a player's array of properties owned and prints out their names along with their sale/mortgage price.
    public static void printProperties(PlayerPiece currentPlayer){
            for (int i = 0; i<currentPlayer.getProperties().size(); i++){
                System.out.println(currentPlayer.getProperties().get(i).getName() + "'s Mortgage/Sell price is " + currentPlayer.getProperties().get(i).getSellValue());
            }
            System.out.println("Which property would you like to sell/mortgage");
        }
    //jailPlayerTurn is what main calls if the player's status is jail, this asks the players what they would like to do (jail choices) and executes that choice
    //the first few lines of the method is input taking
    public static void jailPlayerTurn(CLL<BoardPiece> board, PlayerPiece currentPlayer, int d1, int d2){
        if (currentPlayer.getJailCount() < 3){
            if (currentPlayer.getGOOJF() > 0){
                System.out.println("Enter 1 to use a Get Out Of Jail Free card, 2 to pay 50$ and get out of jail, or 3 to attempt to roll doubles");
                Scanner scan = new Scanner(System.in);
                int input = scan.nextInt();
                switch (input){
                    case 1:
                        //the first case is setting the player free and reducing the amount of GOOJF cards they have, this choice is only available if the player has any GOOJF cards
                        currentPlayer.setGOOJF(currentPlayer.getGOOJF() - 1);
                        currentPlayer.setStatus("free");
                        currentPlayer.setJailCount(0);
                        System.out.println("You used a get out of jail free card, you are now just visiting");
                        break;
                    case 2:
                        //takes 50$ from the player's balance and sets them free
                        currentPlayer.setBalance(currentPlayer.getBalance() - 50);
                        currentPlayer.setStatus("free");
                        currentPlayer.setJailCount(0);
                        System.out.println("You paid the 50$ jail fee, you are now just visiting");
                        break;
                    case 3:
                        //takes the rolled dice and if they are the same sets the player free, if not, then the jailcount variable goes up and the player's jailturn ends
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
                //this loop is exactly the same as the first, exept there is no GOOJF option since the player has none if they get here
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
            //if this triggers, the player has rolled three times already and failed, they must now pay the 50$ fee and are set free
            System.out.println("It has been 3 turns in jail, you must pay the 50$ fee");
            currentPlayer.setBalance(currentPlayer.getBalance() - 50);
            currentPlayer.setStatus("free");
            currentPlayer.setJailCount(0);
        }
    }

    public static void CommunityChest(CLL<PlayerPiece> Players, CLL<BoardPiece> board, PlayerPiece currentPlayer) {
        //this method is if the player lands on a community chest space, a random is made that draws a random card from possible community chest cards
        Random rand = new Random();
        int random = rand.nextInt(17);
        switch (random) {
            case 1:
                //sends the player to GO, giving them 200$
                board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy().replace(currentPlayer.getPiece(), ""));
                currentPlayer.setLocation(0);
                board.find(0).data.setOccupiedBy(board.find(0).data.getOccupiedBy() + currentPlayer.getPiece());
                System.out.println("You Advanced To GO");
                currentPlayer.setBalance(currentPlayer.getBalance() + 200);
                break;
            case 2:
                //gives player 200$
                System.out.println("Bank Error In Your Favor, You Got 200$");
                currentPlayer.setBalance(currentPlayer.getBalance() + 200);
                break;
            case 3:
                //takes away 50$ from player
                System.out.println("Doctor's Fee: 50$");
                currentPlayer.setBalance(currentPlayer.getBalance() - 50);
                break;
            case 4:
                //Gives 50$
                System.out.println("Sold Some Stock, Got 50$");
                currentPlayer.setBalance(currentPlayer.getBalance() + 50);
                break;
            case 5:
                //gives a GOOJF, increases GOOJF count by one
                System.out.println("You Got A Get Out Of Jail Free Card");
                currentPlayer.setGOOJF(currentPlayer.getGOOJF() + 1);
                break;
            case 6:
                //send player to jail, sets their status to jail
                System.out.println("You Got Sent To Jail");
                board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy().replace(currentPlayer.getPiece(), ""));
                currentPlayer.setLocation(10);
                board.find(10).data.setOccupiedBy(board.find(10).data.getOccupiedBy() + currentPlayer.getPiece());
                currentPlayer.setStatus("jail");
                break;
            case 7:
                //gives player 100$
                System.out.println("Holiday Fund Matures, You Received 100$");
                currentPlayer.setBalance(currentPlayer.getBalance() + 100);
                break;
            case 8:
                //gives player 20$
                System.out.println("Income Tax Refund, You Received 20$");
                currentPlayer.setBalance(currentPlayer.getBalance() + 20);
                break;
            case 9:
                //goes through the player loop, subtracts 10$ from everyone and gives currentplayer that money
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
                //gives player 100$
                System.out.println("Life Insurance Matures, You Received 100$");
                currentPlayer.setBalance(currentPlayer.getBalance() + 100);
                break;
            case 11:
                //takes 100$ from player
                System.out.println("Hospital Fee: 100$");
                currentPlayer.setBalance(currentPlayer.getBalance() - 100);
                break;
            case 12:
                //takes 50$ from player
                System.out.println("School Fee: 50$");
                currentPlayer.setBalance(currentPlayer.getBalance() - 50);
                break;
            case 13:
                //gives player 50$
                System.out.println("You Received A 50$ Consultancy Fee");
                currentPlayer.setBalance(currentPlayer.getBalance() + 50);
                break;
            case 14:
                //What did you expect, you were up against the best
                System.out.println("You Placed Second In a Beauty Contest (Alex Won), You Receive 10$");
                currentPlayer.setBalance(currentPlayer.getBalance() + 10);
                break;
            case 15:
                //gives the player 100$
                System.out.println("You Inherit 100$");
                currentPlayer.setBalance(currentPlayer.getBalance() + 100);
                break;
            case 16:
                //it's spelled sudo
                System.out.println("You Spell Sudo Code Right! You get 200$");
                currentPlayer.setBalance(currentPlayer.getBalance() + 200);
                break;
        }
    }

    public static void Chance(CLL<PlayerPiece> Players, CLL<BoardPiece> board, PlayerPiece currentPlayer, int roll) throws InterruptedException {
        //this method is if the player lands on a chance space, a random is made that draws a random card from possible chance cards
        Random rand = new Random();
        int random = rand.nextInt(16);
        switch (random){
            case 1:
                //sends the player to boardwalk, gives them the option to buy it if its available, otherwise they are charged rent
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
                //sends the player to go, gives them 200$
                board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy().replace(currentPlayer.getPiece(), ""));
                currentPlayer.setLocation(0);
                board.find(0).data.setOccupiedBy(board.find(0).data.getOccupiedBy() + currentPlayer.getPiece());
                System.out.println("You Advanced To GO");
                currentPlayer.setBalance(currentPlayer.getBalance() + 200);
                break;
            case 3:
                //sends the player to illinois ave, charge them rent if its owned, allows the player to buy it if it's not purchased
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
                //sends the player to St. Charles Place, charge them rent if its owned, allows the player to buy it if it's not purchased
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
                //this case sends the nearest railroad, chance card spaces are always near a railroad
                //so there is pretty much always a clear one to go to (no chance spaces are perfectly between railroads)
                //if the railroad is owned, the player pays double the rent, if not, they have the opportunity to buy it.
                //the reason there seems to be 2 duplicates of each railroad is that if the player is closer to a railroad that is behind them, they have to pass go and go all the way around, giving them 200$    Note: I know I didn't do this the smartest way but sunk cost fallacy
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
                else if (reading < penn && reading < BO && reading < Short){
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
                else if (penn < reading && penn < BO && penn < Short){
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
                else if (BO < reading && BO < penn && BO < Short){
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
                else if (Short < reading && Short < penn && Short < BO){
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

            case 6:
                int Electricity = Math.abs(currentPlayer.getLocation() - 12);
                int Water = Math.abs(currentPlayer.getLocation() - 28);

                if (Electricity < Water && currentPlayer.getLocation() > 12){
                    board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy().replace(currentPlayer.getPiece(), ""));
                    currentPlayer.setBalance(currentPlayer.getBalance() + 200);
                    currentPlayer.setLocation(12);
                    board.find(12).data.setOccupiedBy(board.find(12).data.getOccupiedBy() + currentPlayer.getPiece());
                    System.out.println("You Got Sent To The Electric Company");
                    if (board.find(12).data.isPurchased() && !board.find(currentPlayer.getLocation()).data.isMortgaged() && board.find(currentPlayer.getLocation()).data.getOwner() != currentPlayer){
                        currentPlayer.setBalance(currentPlayer.getBalance() - board.find(currentPlayer.getLocation()).data.getOwner().getUtilitiesOwned() * 4 * roll * 2);
                        board.find(currentPlayer.getLocation()).data.getOwner().setBalance(board.find(currentPlayer.getLocation()).data.getOwner().getBalance() + currentPlayer.getUtilitiesOwned() * 4 * roll * 2);

                        System.out.println("You Paid "+board.find(currentPlayer.getLocation()).data.getOwner().getUtilitiesOwned() * 4 * roll * 2+"$ (double) Rent to " + board.find(currentPlayer.getLocation()).data.getOwner().getName());
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
                else if (Electricity < Water){
                    board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy().replace(currentPlayer.getPiece(), ""));
                    currentPlayer.setLocation(12);
                    board.find(12).data.setOccupiedBy(board.find(12).data.getOccupiedBy() + currentPlayer.getPiece());
                    System.out.println("You Got Sent To The Electric Company");
                    if (board.find(12).data.isPurchased() && !board.find(currentPlayer.getLocation()).data.isMortgaged() && board.find(currentPlayer.getLocation()).data.getOwner() != currentPlayer){
                        currentPlayer.setBalance(currentPlayer.getBalance() - currentPlayer.getUtilitiesOwned() * 4 * roll * 2);
                        board.find(currentPlayer.getLocation()).data.getOwner().setBalance(board.find(currentPlayer.getLocation()).data.getOwner().getBalance() + currentPlayer.getUtilitiesOwned() * 4 * roll * 2);

                        System.out.println("You Paid "+board.find(currentPlayer.getLocation()).data.getOwner().getUtilitiesOwned() * 4 * roll * 2+"$ (double) Rent to " + board.find(currentPlayer.getLocation()).data.getOwner().getName());
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

                        System.out.println("You Paid "+board.find(currentPlayer.getLocation()).data.getOwner().getUtilitiesOwned() * 4 * roll * 2+"$ (double) Rent to " + board.find(currentPlayer.getLocation()).data.getOwner().getName());
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
                else if (Electricity > Water){
                    board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy().replace(currentPlayer.getPiece(), ""));
                    currentPlayer.setLocation(28);
                    board.find(28).data.setOccupiedBy(board.find(28).data.getOccupiedBy() + currentPlayer.getPiece());
                    System.out.println("You Got Sent To Water Works");
                    if (board.find(28).data.isPurchased() && !board.find(currentPlayer.getLocation()).data.isMortgaged() && board.find(currentPlayer.getLocation()).data.getOwner() != currentPlayer){
                        currentPlayer.setBalance(currentPlayer.getBalance() - currentPlayer.getUtilitiesOwned() * 4 * roll * 2);
                        board.find(currentPlayer.getLocation()).data.getOwner().setBalance(board.find(currentPlayer.getLocation()).data.getOwner().getBalance() + currentPlayer.getUtilitiesOwned() * 4 * roll * 2);

                        System.out.println("You Paid "+board.find(currentPlayer.getLocation()).data.getOwner().getUtilitiesOwned() * 4 * roll * 2+"$ (double) Rent to " + board.find(currentPlayer.getLocation()).data.getOwner().getName());
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
            case 7:
                //player gains 50$
                System.out.println("The Bank Pays You A Dividend of $50");
                currentPlayer.setBalance(currentPlayer.getBalance() + 50);
                break;
            case 8:
                //player's GOOJF count increased by one
                System.out.println("You Got A Get Out Of Jail Free Card");
                currentPlayer.setGOOJF(currentPlayer.getGOOJF() + 1);
                break;
            case 9:
                //sends a player back 3 spaces, normally this would be a reason for concirn cuz of passing go and dealing with all that, but in a standard
                //monopoly board, there are no chance squares in the vicinity of go
                System.out.println("You Got Sent Back 3 Spaces (You do not pay rent)");
                board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy().replace(currentPlayer.getPiece(), ""));
                currentPlayer.setLocation(currentPlayer.getLocation() - 3);
                board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy() + currentPlayer.getPiece());

                //this switch is for the two special cases, if u land on chance and get this case 10, there is the chance you will land on a community chest or income tax
                switch (board.find(currentPlayer.getLocation()).data.getSpecial()) {
                    //calls the communtiy chest method
                    case "community chest":
                        System.out.println("Community Chest!");
                        TimeUnit.SECONDS.sleep(2);
                        CommunityChest(Players, board, currentPlayer);
                        break;
                    //gives the player a choice between 10% of their balance or 200$, accepts the player response and does the corresponding action
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
                }
                break;
            case 10:
                //sends player to jail, sets status to jail, sets jailturns to 0
                System.out.println("You Got Sent To Jail");
                board.find(currentPlayer.getLocation()).data.setOccupiedBy(board.find(currentPlayer.getLocation()).data.getOccupiedBy().replace(currentPlayer.getPiece(), ""));
                currentPlayer.setLocation(10);
                board.find(10).data.setOccupiedBy(board.find(currentPlayer.getLocation() - 3).data.getOccupiedBy() + currentPlayer.getPiece());
                currentPlayer.setStatus("jail");
                break;
            case 11:
                //subtracts 15$ from balance
                System.out.println("Speeding Fine: 15$");
                currentPlayer.setBalance(currentPlayer.getBalance() - 15);
                break;
            case 12:
                //same as the code for send player to the nearest railroad except in this case, it is always reading railroad
                //player pays rent if it is purchased, and can buy the railroad if it has not been already
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
            case 13:
                //gives player 150$
                System.out.println("Your building loan matures, You get 150$");
                currentPlayer.setBalance(currentPlayer.getBalance() + 150);
                break;
            case 14:
                //goes through the player CLL and pays each player 50$, takes away total from currentplayer
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

    public static boolean isGameOver(CLL<PlayerPiece> players, CLL<BoardPiece> board){
        //runs through all the players checking if their balance is less than 0, if so, they are removed from the game loop, once one player if left, they win
        for(int i = 0; i<players.length(); i++){
            if(players.find(i).data.getBalance() <= 0){
                board.find(players.find(i).data.getLocation()).data.setOccupiedBy(board.find(players.find(i).data.getLocation()).data.getOccupiedBy().replace(players.find(i).data.getPiece(), ""));
                for (int j = 0; j < players.find(i).data.getProperties().size(); j++) {
                    players.find(i).data.getProperties().get(j).setPrice(players.find(j).data.getProperties().get(j).getSellValue() * 2);
                    players.find(i).data.getProperties().get(j).setPurchased(false);
                    players.find(i).data.getProperties().get(j).setOwner(null);
                    players.find(i).data.getProperties().remove(j);
                    if (players.find(i).data.getProperties().size() > 0){
                        j--;
                    }
                }
                players.delete(players.find(i).data);
                i--;
            }
        }
        return players.length() < 2;
    }
}

