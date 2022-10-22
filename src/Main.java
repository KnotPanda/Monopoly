import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        CLL<BoardPiece> board = new CLL<>();
        CLL<PlayerPiece> players = new CLL<>();
        BoardPiece zero = new BoardPiece("GO", 0, false, null, 0, false, "", 0, "", 0);
        BoardPiece one = new BoardPiece("Mediterranean Ave.", 60, false, null, 10, true, "", 30, "", 1);
        BoardPiece two = new BoardPiece("Community Chest", 0, false, null, 0, false, "Community Chest", 0, "", 2);
        BoardPiece three = new BoardPiece("Baltic Ave.", 60, false, null, 20, true, "", 30, "", 3);
        BoardPiece four = new BoardPiece("Income Tax", 0, false, null, 0, false, "", 0, "", 4);
        BoardPiece five = new BoardPiece("Reading Railroad", 200, false, null, 0, false, "", 0, "", 5);
        BoardPiece six = new BoardPiece("Oriental Ave.", 100, false, null, 0, false, "", 0, "", 6);
        BoardPiece seven = new BoardPiece("Chance", 0, false, null, 0, false, "", 0, "cyau", 7);
        BoardPiece eight = new BoardPiece("Vermont Ave.", 100, false, null, 0, false, "", 0, "", 8);
        BoardPiece nine = new BoardPiece("Connecticut Ave.", 120, false, null, 0, false, "", 0, "sy", 9);
        BoardPiece ten = new BoardPiece("Jail/Just Visiting", 0, false, null, 0, false, "", 0, "", 10);
        BoardPiece eleven = new BoardPiece("St. Charles Place", 140, false, null, 0, false, "", 0, "", 11);
        BoardPiece twelve = new BoardPiece("Electric Company", 150, false, null, 0, false, "", 0, "", 12);
        BoardPiece thirteen = new BoardPiece("States Ave.", 140, false, null, 0, false, "", 0, "", 13);
        BoardPiece fourteen = new BoardPiece("Virginia Ave.", 160, false, null, 0, false, "", 0, "", 14);
        BoardPiece fifteen = new BoardPiece("Pennsylvania Railroad", 200, false, null, 0, false, "", 0, "", 15);
        BoardPiece sixteen = new BoardPiece("St. James Place", 180, false, null, 0, false, "", 0, "", 16);
        BoardPiece seventeen = new BoardPiece("Community Chest", 0, false, null, 0, false, "", 0, "", 17);
        BoardPiece eighteen = new BoardPiece("Tennessee Ave.", 180, false, null, 0, false, "", 0, "", 18);
        BoardPiece nineteen = new BoardPiece("New York Ave.", 200, false, null, 0, false, "", 0, "", 19);
        BoardPiece twenty = new BoardPiece("Free Parking", 0, false, null, 0, false, "", 0, "", 20);
        BoardPiece twentyone = new BoardPiece("Kentucky Ave.", 220, false, null, 0, false, "", 0, "", 21);
        BoardPiece twentytwo = new BoardPiece("Chance", 0, false, null, 0, false, "", 0, "", 22);
        BoardPiece twentythree = new BoardPiece("Indiana Ave.", 220, false, null, 0, false, "", 0, "", 23);
        BoardPiece twentyfour = new BoardPiece("Illinois Ave.", 240, false, null, 0, false, "", 0, "", 24);
        BoardPiece twentyfive = new BoardPiece("B. & O. Railroad", 200, false, null, 0, false, "", 0, "", 25);
        BoardPiece twentysix = new BoardPiece("Atlantic Ave.", 260, false, null, 0, false, "", 0, "", 26);
        BoardPiece twentyseven = new BoardPiece("Ventnor Ave.", 260, false, null, 0, false, "", 0, "", 27);
        BoardPiece twentyeight = new BoardPiece("Water Works", 150, false, null, 0, false, "", 0, "", 28);
        BoardPiece twentynine = new BoardPiece("Marvin Gardens", 280, false, null, 0, false, "", 0, "", 29);
        BoardPiece thirty = new BoardPiece("Go To Jail", 0, false, null, 0, false, "", 0, "", 30);
        BoardPiece thirtyone = new BoardPiece("Pacific Ave.", 300, false, null, 0, false, "", 0, "", 31);
        BoardPiece thirtytwo = new BoardPiece("North Carolina Ave.", 300, false, null, 0, false, "", 0, "", 32);
        BoardPiece thirtythree = new BoardPiece("Community Chest", 0, false, null, 0, false, "", 0, "", 33);
        BoardPiece thirtyfour = new BoardPiece("Pennsylvania Ave.", 320, false, null, 0, false, "", 0, "", 34);
        BoardPiece thirtyfive = new BoardPiece("Short Line", 200, false, null, 0, false, "", 0, "", 35);
        BoardPiece thirtysix = new BoardPiece("Chance", 0, false, null, 0, false, "", 0, "", 36);
        BoardPiece thirtyseven = new BoardPiece("Park Place", 350, false, null, 0, false, "", 0, "", 37);
        BoardPiece thirtyeight = new BoardPiece("Luxury Tax", 0, false, null, 0, false, "", 0, "", 38);
        BoardPiece thirtynine = new BoardPiece("Boardwalk", 400, false, null, 0, false, "", 0, "", 39);

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

        ArrayList<BoardPiece> properties1 = new ArrayList<>();
        PlayerPiece P1 = new PlayerPiece("Trapezoid", 1500, false, 0, properties1, "▰", "free", 0, 0);
        ArrayList<BoardPiece> properties2 = new ArrayList<>();
        PlayerPiece P2 = new PlayerPiece("Diamond", 1500, false, 0, properties2, "◆", "free", 0, 0);
        ArrayList<BoardPiece> properties3 = new ArrayList<>();
        PlayerPiece P3 = new PlayerPiece("Circle", 1500, false, 0, properties3, "◕", "free", 0, 0);
        ArrayList<BoardPiece> properties4 = new ArrayList<>();
        PlayerPiece P4 = new PlayerPiece("Triangle", 1500, false, 0, properties4, "◭", "free", 0, 0);

        while(isGameOver) {
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
        System.out.println("|          | |   "+ board.find(21).data.getPrice() +"$   | |          | |   "+ board.find(23).data.getPrice() +"$   | |   "+ board.find(24).data.getPrice() +
                "$   | |   "+ board.find(25).data.getPrice() +"$   | |   "+ board.find(26).data.getPrice() +"$   | |   "+ board.find(27).data.getPrice() +"$   | |   "+ board.find(28).data.getPrice() +
                "$   | |   "+ board.find(29).data.getPrice() +"$   | |          |");
        System.out.println("└----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘");
        System.out.println("┌----------┐                                                                                                                      ┌----------┐");
        System.out.println("| New York |                                                                                                                      | Pacific  |");
        System.out.println("|    Ave   |                                                                                                                      |    Ave   |");
        System.out.println("|"+ printOccupants(board.find(19).data) +"|                                                                                                                      |"+ printOccupants(board.find(31).data) +"|");
        System.out.println("|   "+ board.find(19).data.getPrice() +"$   |                                                                                                                      |   "+ board.find(31).data.getPrice() +"$   |");
        System.out.println("└----------┘                                                                                                                      └----------┘");
        System.out.println("┌----------┐           ___ _  _   _   _  _  ___ ___                                                                               ┌----------┐");
        System.out.println("|Tennessee |          / __| || | /_\\ | \\| |/ __| __|                                                                              |   North  |");
        System.out.println("|    Ave   |         | (__| __ |/ _ \\| .` | (__| _|                                                                               | Caro. Ave|");
        System.out.println("|"+ printOccupants(board.find(18).data) +"|          \\___|_||_/_/ \\_\\_|\\_|\\___|___|                                                                              |"+ printOccupants(board.find(32).data) +"|");
        System.out.println("|   "+ board.find(18).data.getPrice() +"$   |                                                                                                                      |   "+ board.find(32).data.getPrice() +"$   |");
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
        System.out.println("|   "+ board.find(16).data.getPrice() +"$   |                                                                                                                      |   "+ board.find(34).data.getPrice() +"$   |");
        System.out.println("└----------┘                                                                                                                      └----------┘");
        System.out.println("┌----------┐                 .___  ___.   ______   .__   __.   ______   .______     ______    __      ____    ____                ┌----------┐");
        System.out.println("|   Penn.  |                 |   \\/   |  /  __  \\  |  \\ |  |  /  __  \\  |   _  \\   /  __  \\  |  |     \\   \\  /   /                |   Short  |");
        System.out.println("| Railroad |                 |  \\  /  | |  |  |  | |   \\|  | |  |  |  | |  |_)  | |  |  |  | |  |      \\   \\/   /                 | Line (rr)|");
        System.out.println("|"+ printOccupants(board.find(15).data) +"|                 |  |\\/|  | |  |  |  | |  . `  | |  |  |  | |   ___/  |  |  |  | |  |       \\_    _/                  |"+ printOccupants(board.find(35).data) +"|");
        System.out.println("|   "+ board.find(15).data.getPrice() +"$   |                 |  |  |  | |  `--'  | |  |\\   | |  `--'  | |  |      |  `--'  | |  `----.    |  |                    |   "+ board.find(35).data.getPrice() +"$   |");
        System.out.println("└----------┘                 |__|  |__|  \\______/  |__| \\__|  \\______/  | _|       \\______/  |_______|    |__|                    └----------┘");
        System.out.println("┌----------┐                                                                                                                      ┌----------┐");
        System.out.println("| Virginia |                                                                                                                      |  Chance  |");
        System.out.println("|    Ave   |                                                                                                                      |          |");
        System.out.println("|"+ printOccupants(board.find(14).data) +"|                                                                                                                      |"+ printOccupants(board.find(36).data) +"|");
        System.out.println("|   "+ board.find(14).data.getPrice() +"$   |                                                                                                                      |          |");
        System.out.println("└----------┘                                                                                                                      └----------┘");
        System.out.println("┌----------┐                                                                                                                      ┌----------┐");
        System.out.println("|  States  |                                                                                                                      |   Park   |");
        System.out.println("|    Ave   |                                                                                                                      |   Place  |");
        System.out.println("|"+ printOccupants(board.find(13).data) +"|                                                                                                                      |"+ printOccupants(board.find(37).data) +"|");
        System.out.println("|   "+ board.find(13).data.getPrice() +"$   |                                                                                                                      |   "+ board.find(37).data.getPrice() +"$   |");
        System.out.println("└----------┘                                                                                                                      └----------┘");
        System.out.println("┌----------┐                                                                                                                      ┌----------┐");
        System.out.println("| Electric |                                                                                                                      |  Luxury  |");
        System.out.println("|  Company |                                ___ ___  __  __ __  __ _   _ _  _ ___ _______   __   ___ _  _ ___ ___ _____           |    Tax   |");
        System.out.println("|"+ printOccupants(board.find(12).data) +"|                              / __/ _ \\|  \\/  |  \\/  | | | | \\| |_ _|_   _\\ \\ / /  / __| || | __/ __|_   _|           |"+ printOccupants(board.find(38).data) +"|");
        System.out.println("|   "+ board.find(12).data.getPrice() +"$   |                             | (_| (_) | |\\/| | |\\/| | |_| | .` || |  | |  \\ V /  | (__| __ | _|\\__ \\ | |             | Pay 100$ |");
        System.out.println("└----------┘                              \\___\\___/|_|  |_|_|  |_|\\___/|_|\\_|___| |_|   |_|    \\___|_||_|___|___/ |_|             └----------┘");
        System.out.println("┌----------┐                                                                                                                      ┌----------┐");
        System.out.println("|St Charles|                                                                                                                      |Boardwalk |");
        System.out.println("|   Place  |                                                                                                                      |          |");
        System.out.println("|"+ printOccupants(board.find(11).data) +"|                                                                                                                      |"+ printOccupants(board.find(39).data) +"|");
        System.out.println("|   "+ board.find(11).data.getPrice() +"$   |                                                                                                                      |   "+ board.find(39).data.getPrice() +"$   |");
        System.out.println("└----------┘                                                                                                                      └----------┘");
        System.out.println("┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐");
        System.out.println("|  JAIL &  | |   Conn.  | |  Vermont | |  Chance  | | Oriental | |  Reading | |  Income  | |  Baltic  | |Community | | Mediter. | |    GO    |");
        System.out.println("|  Just V. | |    Ave   | |    Ave   | |          | |    Ave   | | Railroad | |    Tax   | |    Ave   | |   Chest  | |   Ave    | |          |");
        System.out.println("|"+ printOccupants(board.find(10).data) +"| |"+ printOccupants(board.find(9).data) +"| |"+ printOccupants(board.find(8).data) +
                "| |"+ printOccupants(board.find(7).data) +"| |"+ printOccupants(board.find(6).data) +"| |"+ printOccupants(board.find(5).data) +
                "| |"+ printOccupants(board.find(4).data) +"| |"+ printOccupants(board.find(3).data) +"| |"+ printOccupants(board.find(2).data) +
                "| |"+ printOccupants(board.find(1).data) +"| |"+ printOccupants(board.find(0).data) +"|");
        System.out.println("|          | |   "+ board.find(9).data.getPrice() +"$   | |   "+ board.find(8).data.getPrice() +"$   | |          | |   "+ board.find(6).data.getPrice() +
                "$   | |   "+ board.find(5).data.getPrice() +"$   | | Pay 200$ | |    "+ board.find(3).data.getPrice() +"$   | |          | |    "+ board.find(1).data.getPrice() +"$   | |  +200$   |");
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
                return "   "+link.getOccupiedBy().substring(0,1)+"  "+link.getOccupiedBy().substring(1,2)+"   ";
            case 3:
                return "  "+link.getOccupiedBy().substring(0,1)+"    "+link.getOccupiedBy().substring(1,2)+"    "+link.getOccupiedBy().substring(2,3)+"  ";
            case 4:
                return "   "+link.getOccupiedBy().substring(0,1)+" "+link.getOccupiedBy().substring(1,2)+" "+link.getOccupiedBy().substring(2,3)+" "+link.getOccupiedBy().substring(3,4)+"  ";
        }
        return "          ";
    }

    public static void playerTurn(PlayerPiece P, CLL<BoardPiece> board){
        Random dice = new Random();
        int d1 = dice.nextInt(7);
        int d2 = dice.nextInt(7);
        int total = d1 + d2;

        if (P.getStatus().equals("free")) {
            Scanner in = new Scanner(System.in);
            System.out.println("You Rolled A " + total);
            if (P.getLocation() + total <= 39) {
                P.setLocation(P.getLocation() + total);
            }
            else{
                P.setLocation((P.getLocation() + total) - 40);
                P.setBalance(P.getBalance() + 200);
            }
            if (P.getLocation() == 30){
                P.setStatus("jail");
                P.setLocation(10);
                System.out.println("You Got Sent To Jail");
            }
            else{
                System.out.println("You Landed on " + board.find(P.getLocation()).data.getName());
            }

        }
    }

    public static void CommunityChest(PlayerPiece P, CLL<BoardPiece> board) {

    }
    public static void Chance(PlayerPiece P, CLL<BoardPiece> board){
        Random rand = new Random();
        int random = rand.nextInt(16);
        switch (random){
            case 1:
                board.find(P.getLocation()).data.setOccupiedBy(board.find(P.getLocation()).data.getOccupiedBy().replace(P.getPiece(), ""));
                P.setLocation(39);
                board.find(39).data.setOccupiedBy(P.getPiece());
                System.out.println("You Got Sent To Boardwalk");
                if (board.find(39).data.isPurchased()){
                    P.setBalance(P.getBalance() - board.find(39).data.getRent());
                    System.out.println("You Paid Rent");
                }
                else{
                    System.out.println("Would You Like To Purchase It?");
                    Scanner Scan = new Scanner(System.in);
                    if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                        P.setBalance(P.getBalance() - board.find(39).data.getPrice());
                        board.find(39).data.setOwner(P);
                        board.find(39).data.setPurchased(true);
                        P.getProperties().add(board.find(39).data);
                    }
                }
                break;
            case 2:
                board.find(P.getLocation()).data.setOccupiedBy(board.find(P.getLocation()).data.getOccupiedBy().replace(P.getPiece(), ""));
                P.setLocation(40);
                board.find(40).data.setOccupiedBy(P.getPiece());
                System.out.println("You Advanced To GO");
                P.setBalance(P.getBalance() + 200);
                break;
            case 3:
                board.find(P.getLocation()).data.setOccupiedBy(board.find(P.getLocation()).data.getOccupiedBy().replace(P.getPiece(), ""));
                if (P.getLocation() > 24){
                    P.setBalance(P.getBalance() + 200);
                }
                P.setLocation(24);
                board.find(24).data.setOccupiedBy(P.getPiece());
                System.out.println("You Got Sent To Illinois Ave.");
                if (board.find(24).data.isPurchased()){
                    P.setBalance(P.getBalance() - board.find(24).data.getRent());
                    System.out.println("You Paid Rent");
                }
                else{
                    System.out.println("Would You Like To Purchase It?");
                    Scanner Scan = new Scanner(System.in);
                    if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                        P.setBalance(P.getBalance() - board.find(24).data.getPrice());
                        board.find(24).data.setOwner(P);
                        board.find(24).data.setPurchased(true);
                        P.getProperties().add(board.find(24).data);
                    }
                }
                break;
            case 4:
                board.find(P.getLocation()).data.setOccupiedBy(board.find(P.getLocation()).data.getOccupiedBy().replace(P.getPiece(), ""));
                if (P.getLocation() > 11){
                    P.setBalance(P.getBalance() + 200);
                }
                P.setLocation(11);
                board.find(11).data.setOccupiedBy(P.getPiece());
                System.out.println("You Got Sent To St. Charles Place");
                if (board.find(11).data.isPurchased()){
                    P.setBalance(P.getBalance() - board.find(11).data.getRent());
                    System.out.println("You Paid Rent");
                }
                else{
                    System.out.println("Would You Like To Purchase It?");
                    Scanner Scan = new Scanner(System.in);
                    if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                        P.setBalance(P.getBalance() - board.find(11).data.getPrice());
                        board.find(11).data.setOwner(P);
                        board.find(11).data.setPurchased(true);
                        P.getProperties().add(board.find(11).data);
                    }
                }
                break;
            case 5:
            case 6:
                int reading = Math.abs(P.getLocation() - 5);
                int penn = Math.abs(P.getLocation() - 15);
                int BO = Math.abs(P.getLocation() - 25);
                int Short = Math.abs(P.getLocation() - 35);

                if (reading < penn && reading < BO && reading < Short && P.getLocation() > 5){
                    board.find(P.getLocation()).data.setOccupiedBy(board.find(P.getLocation()).data.getOccupiedBy().replace(P.getPiece(), ""));
                    P.setBalance(P.getBalance() + 200);
                    P.setLocation(5);
                    board.find(5).data.setOccupiedBy(P.getPiece());
                    System.out.println("You Got Sent To Reading Railroad");
                    if (board.find(5).data.isPurchased()){
                        P.setBalance(P.getBalance() - board.find(5).data.getRent() * board.find(5).data.getOwner().getRailroadsOwned() * 2);
                        System.out.println("You Paid Double The Rent");
                    }
                    else{
                        System.out.println("Would You Like To Purchase It?");
                        Scanner Scan = new Scanner(System.in);
                        if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                            P.setBalance(P.getBalance() - board.find(5).data.getPrice());
                            board.find(5).data.setOwner(P);
                            board.find(5).data.setPurchased(true);
                            P.getProperties().add(board.find(5).data);
                            P.setRailroadsOwned(P.getRailroadsOwned() + 1);
                        }
                    }
                }
                if (reading < penn && reading < BO && reading < Short){
                    board.find(P.getLocation()).data.setOccupiedBy(board.find(P.getLocation()).data.getOccupiedBy().replace(P.getPiece(), ""));
                    P.setLocation(5);
                    board.find(5).data.setOccupiedBy(P.getPiece());
                    System.out.println("You Got Sent To Reading Railroad");
                    if (board.find(5).data.isPurchased()){
                        P.setBalance(P.getBalance() - board.find(5).data.getRent() * board.find(5).data.getOwner().getRailroadsOwned() * 2);
                        System.out.println("You Paid Double The Rent");
                    }
                    else{
                        System.out.println("Would You Like To Purchase It?");
                        Scanner Scan = new Scanner(System.in);
                        if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                            P.setBalance(P.getBalance() - board.find(5).data.getPrice());
                            board.find(5).data.setOwner(P);
                            board.find(5).data.setPurchased(true);
                            P.getProperties().add(board.find(5).data);
                            P.setRailroadsOwned(P.getRailroadsOwned() + 1);
                        }
                    }
                }


                if (penn < reading && penn < BO && penn < Short && P.getLocation() > 15){
                    board.find(P.getLocation()).data.setOccupiedBy(board.find(P.getLocation()).data.getOccupiedBy().replace(P.getPiece(), ""));
                    P.setBalance(P.getBalance() + 200);
                    P.setLocation(15);
                    board.find(15).data.setOccupiedBy(P.getPiece());
                    System.out.println("You Got Sent To Pennsylvania Railroad");
                    if (board.find(15).data.isPurchased()){
                        P.setBalance(P.getBalance() - board.find(15).data.getRent() * board.find(15).data.getOwner().getRailroadsOwned() * 2);
                        System.out.println("You Paid Double The Rent");
                    }
                    else{
                        System.out.println("Would You Like To Purchase It?");
                        Scanner Scan = new Scanner(System.in);
                        if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                            P.setBalance(P.getBalance() - board.find(15).data.getPrice());
                            board.find(15).data.setOwner(P);
                            board.find(15).data.setPurchased(true);
                            P.getProperties().add(board.find(15).data);
                            P.setRailroadsOwned(P.getRailroadsOwned() + 1);
                        }
                    }
                }
                if (penn < reading && penn < BO && penn < Short){
                    board.find(P.getLocation()).data.setOccupiedBy(board.find(P.getLocation()).data.getOccupiedBy().replace(P.getPiece(), ""));
                    P.setLocation(15);
                    board.find(15).data.setOccupiedBy(P.getPiece());
                    System.out.println("You Got Sent To Pennsylvania Railroad");
                    if (board.find(15).data.isPurchased()){
                        P.setBalance(P.getBalance() - board.find(15).data.getRent() * board.find(15).data.getOwner().getRailroadsOwned() * 2);
                        System.out.println("You Paid Double The Rent");
                    }
                    else{
                        System.out.println("Would You Like To Purchase It?");
                        Scanner Scan = new Scanner(System.in);
                        if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                            P.setBalance(P.getBalance() - board.find(15).data.getPrice());
                            board.find(15).data.setOwner(P);
                            board.find(15).data.setPurchased(true);
                            P.getProperties().add(board.find(15).data);
                            P.setRailroadsOwned(P.getRailroadsOwned() + 1);
                        }
                    }
                }


                if (BO < reading && BO < penn && BO < Short && P.getLocation() > 25){
                    board.find(P.getLocation()).data.setOccupiedBy(board.find(P.getLocation()).data.getOccupiedBy().replace(P.getPiece(), ""));
                    P.setBalance(P.getBalance() + 200);
                    P.setLocation(25);
                    board.find(25).data.setOccupiedBy(P.getPiece());
                    System.out.println("You Got Sent To B. & O. Railroad");
                    if (board.find(25).data.isPurchased()){
                        P.setBalance(P.getBalance() - board.find(25).data.getRent() * board.find(25).data.getOwner().getRailroadsOwned() * 2);
                        System.out.println("You Paid Double The Rent");
                    }
                    else{
                        System.out.println("Would You Like To Purchase It?");
                        Scanner Scan = new Scanner(System.in);
                        if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                            P.setBalance(P.getBalance() - board.find(25).data.getPrice());
                            board.find(25).data.setOwner(P);
                            board.find(25).data.setPurchased(true);
                            P.getProperties().add(board.find(25).data);
                            P.setRailroadsOwned(P.getRailroadsOwned() + 1);
                        }
                    }
                }
                if (BO < reading && BO < penn && BO < Short){
                    board.find(P.getLocation()).data.setOccupiedBy(board.find(P.getLocation()).data.getOccupiedBy().replace(P.getPiece(), ""));
                    P.setLocation(25);
                    board.find(25).data.setOccupiedBy(P.getPiece());
                    System.out.println("You Got Sent To B. & O. Railroad");
                    if (board.find(25).data.isPurchased()){
                        P.setBalance(P.getBalance() - board.find(25).data.getRent() * board.find(25).data.getOwner().getRailroadsOwned() * 2);
                        System.out.println("You Paid Double The Rent");
                    }
                    else{
                        System.out.println("Would You Like To Purchase It?");
                        Scanner Scan = new Scanner(System.in);
                        if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                            P.setBalance(P.getBalance() - board.find(25).data.getPrice());
                            board.find(25).data.setOwner(P);
                            board.find(25).data.setPurchased(true);
                            P.getProperties().add(board.find(25).data);
                            P.setRailroadsOwned(P.getRailroadsOwned() + 1);
                        }
                    }
                }


                if (Short < reading && Short < penn && Short < BO && P.getLocation() > 35){
                    board.find(P.getLocation()).data.setOccupiedBy(board.find(P.getLocation()).data.getOccupiedBy().replace(P.getPiece(), ""));
                    P.setBalance(P.getBalance() + 200);
                    P.setLocation(35);
                    board.find(35).data.setOccupiedBy(P.getPiece());
                    System.out.println("You Got Sent To The Short Line");
                    if (board.find(35).data.isPurchased()){
                        P.setBalance(P.getBalance() - board.find(35).data.getRent() * board.find(35).data.getOwner().getRailroadsOwned() * 2);
                        System.out.println("You Paid Double The Rent");
                    }
                    else{
                        System.out.println("Would You Like To Purchase It?");
                        Scanner Scan = new Scanner(System.in);
                        if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                            P.setBalance(P.getBalance() - board.find(35).data.getPrice());
                            board.find(35).data.setOwner(P);
                            board.find(35).data.setPurchased(true);
                            P.getProperties().add(board.find(35).data);
                            P.setRailroadsOwned(P.getRailroadsOwned() + 1);
                        }
                    }
                }
                if (Short < reading && Short < penn && Short < BO){
                    board.find(P.getLocation()).data.setOccupiedBy(board.find(P.getLocation()).data.getOccupiedBy().replace(P.getPiece(), ""));
                    P.setLocation(35);
                    board.find(35).data.setOccupiedBy(P.getPiece());
                    System.out.println("You Got Sent To The Short Line");
                    if (board.find(35).data.isPurchased()){
                        P.setBalance(P.getBalance() - board.find(35).data.getRent() * board.find(35).data.getOwner().getRailroadsOwned() * 2);
                        System.out.println("You Paid Double The Rent");
                    }
                    else{
                        System.out.println("Would You Like To Purchase It?");
                        Scanner Scan = new Scanner(System.in);
                        if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                            P.setBalance(P.getBalance() - board.find(35).data.getPrice());
                            board.find(35).data.setOwner(P);
                            board.find(35).data.setPurchased(true);
                            P.getProperties().add(board.find(35).data);
                            P.setRailroadsOwned(P.getRailroadsOwned() + 1);
                        }
                    }
                }
                break;

            case 7:
                int Electricity = Math.abs(P.getLocation() - 12);
                int Water = Math.abs(P.getLocation() - 28);

                if (Electricity < Water && P.getLocation() > 12){
                    board.find(P.getLocation()).data.setOccupiedBy(board.find(P.getLocation()).data.getOccupiedBy().replace(P.getPiece(), ""));
                    P.setBalance(P.getBalance() + 200);
                    P.setLocation(12);
                    board.find(12).data.setOccupiedBy(P.getPiece());
                    System.out.println("You Got Sent To The Electric Company");
                    if (board.find(12).data.isPurchased()){
                        P.setBalance(P.getBalance() - board.find(12).data.getRent() * board.find(12).data.getOwner().getRailroadsOwned() * 2);
                        System.out.println("You Paid Double The Rent");
                    }
                    else{
                        System.out.println("Would You Like To Purchase It?");
                        Scanner Scan = new Scanner(System.in);
                        if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                            P.setBalance(P.getBalance() - board.find(12).data.getPrice());
                            board.find(12).data.setOwner(P);
                            board.find(12).data.setPurchased(true);
                            P.getProperties().add(board.find(12).data);
                        }
                    }
                }
                if (Electricity < Water){
                    board.find(P.getLocation()).data.setOccupiedBy(board.find(P.getLocation()).data.getOccupiedBy().replace(P.getPiece(), ""));
                    P.setLocation(12);
                    board.find(12).data.setOccupiedBy(P.getPiece());
                    System.out.println("You Got Sent To The Electric Company");
                    if (board.find(12).data.isPurchased()){
                        P.setBalance(P.getBalance() - board.find(12).data.getRent() * board.find(12).data.getOwner().getRailroadsOwned() * 2);
                        System.out.println("You Paid Double The Rent");
                    }
                    else{
                        System.out.println("Would You Like To Purchase It?");
                        Scanner Scan = new Scanner(System.in);
                        if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                            P.setBalance(P.getBalance() - board.find(12).data.getPrice());
                            board.find(12).data.setOwner(P);
                            board.find(12).data.setPurchased(true);
                            P.getProperties().add(board.find(12).data);
                        }
                    }
                }


                if (Electricity > Water && P.getLocation() > 28){
                    board.find(P.getLocation()).data.setOccupiedBy(board.find(P.getLocation()).data.getOccupiedBy().replace(P.getPiece(), ""));
                    P.setBalance(P.getBalance() + 200);
                    P.setLocation(28);
                    board.find(28).data.setOccupiedBy(P.getPiece());
                    System.out.println("You Got Sent To The Water Works");
                    if (board.find(28).data.isPurchased()){
                        P.setBalance(P.getBalance() - board.find(28).data.getRent() * board.find(28).data.getOwner().getRailroadsOwned() * 2);
                        System.out.println("You Paid Double The Rent");
                    }
                    else{
                        System.out.println("Would You Like To Purchase It?");
                        Scanner Scan = new Scanner(System.in);
                        if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                            P.setBalance(P.getBalance() - board.find(28).data.getPrice());
                            board.find(28).data.setOwner(P);
                            board.find(28).data.setPurchased(true);
                            P.getProperties().add(board.find(28).data);
                        }
                    }
                }
                if (Electricity > Water){
                    board.find(P.getLocation()).data.setOccupiedBy(board.find(P.getLocation()).data.getOccupiedBy().replace(P.getPiece(), ""));
                    P.setLocation(28);
                    board.find(28).data.setOccupiedBy(P.getPiece());
                    System.out.println("You Got Sent To Water Works");
                    if (board.find(28).data.isPurchased()){
                        P.setBalance(P.getBalance() - board.find(28).data.getRent() * board.find(28).data.getOwner().getRailroadsOwned() * 2);
                        System.out.println("You Paid Double The Rent");
                    }
                    else{
                        System.out.println("Would You Like To Purchase It?");
                        Scanner Scan = new Scanner(System.in);
                        if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                            P.setBalance(P.getBalance() - board.find(28).data.getPrice());
                            board.find(28).data.setOwner(P);
                            board.find(28).data.setPurchased(true);
                            P.getProperties().add(board.find(28).data);
                        }
                    }
                }

                break;
            case 8:
                System.out.println("The Bank Pays You A Dividend of $50");
                P.setBalance(P.getBalance() + 50);
                break;
            case 9:
                System.out.println("You Got A Get Out Of Jail Free Card");
                P.setGOOJF(P.getGOOJF() + 1);
                break;
            case 10:
                System.out.println("You Got Sent Back 3 Spaces (You do not pay rent)");
                board.find(P.getLocation()).data.setOccupiedBy(board.find(P.getLocation()).data.getOccupiedBy().replace(P.getPiece(), ""));
                P.setLocation(P.getLocation() - 3);
                board.find(P.getLocation()).data.setOccupiedBy(P.getPiece());
                break;
            case 11:
                System.out.println("You Got Sent To Jail");
                board.find(P.getLocation()).data.setOccupiedBy(board.find(P.getLocation()).data.getOccupiedBy().replace(P.getPiece(), ""));
                P.setLocation(10);
                board.find(P.getLocation()).data.setOccupiedBy(P.getPiece());
                P.setStatus("jail");
                break;
            case 12:
                System.out.println("Speeding Fine: 15$");
                P.setBalance(P.getBalance() - 15);
                break;
            case 13:
                board.find(P.getLocation()).data.setOccupiedBy(board.find(P.getLocation()).data.getOccupiedBy().replace(P.getPiece(), ""));
                if (P.getLocation() > 5) {
                    P.setBalance(P.getBalance() + 200);
                }
                    P.setLocation(5);
                    board.find(5).data.setOccupiedBy(P.getPiece());
                    System.out.println("You Got Sent To Reading Railroad");
                    if (board.find(5).data.isPurchased()){
                        P.setBalance(P.getBalance() - board.find(5).data.getRent() * board.find(5).data.getOwner().getRailroadsOwned());
                        System.out.println("You Paid Rent");
                    }
                    else{
                        System.out.println("Would You Like To Purchase It?");
                        Scanner Scan = new Scanner(System.in);
                        if (Scan.nextLine().toLowerCase(Locale.ROOT).equals("yes")){
                            P.setBalance(P.getBalance() - board.find(5).data.getPrice());
                            board.find(5).data.setOwner(P);
                            board.find(5).data.setPurchased(true);
                            P.getProperties().add(board.find(5).data);
                            P.setRailroadsOwned(P.getRailroadsOwned() + 1);
                        }
                    }
                break;
            case 14:
                System.out.println("Your building loan matures, You get 150$");
                P.setBalance(P.getBalance() + 150);
                break;
            case 15:
                break;
        }
    }
}

