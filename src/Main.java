public class Main {

    public static void main(String[] args) {
        CLL<BoardPiece> board = new CLL<>();
        BoardPiece one  = new BoardPiece("Mediterranean Ave.", 60, false, null, 10, true, "", 30, "", 1);
        BoardPiece two  = new BoardPiece("Community Chest", 0, false, null, 0, false, "Community Chest", 0, "", 2);
        BoardPiece three  = new BoardPiece("Baltic Ave.", 60, false, null, 20, true, "", 30, "", 3);
        BoardPiece four  = new BoardPiece("Income Tax", 0, false, null, 0, false, "", 0, "", 4);
        BoardPiece five  = new BoardPiece("Reading Railroad", 200, false, null, 0, false, "", 0, "", 5);
        BoardPiece six  = new BoardPiece("Oriental Ave.", 100, false, null, 0, false, "", 0, "", 6);
        BoardPiece seven  = new BoardPiece("Chance", 0, false, null, 0, false, "", 0, "", 7);
        BoardPiece eight  = new BoardPiece("Vermont Ave.", 100, false, null, 0, false, "", 0, "", 8);
        BoardPiece nine  = new BoardPiece("Connecticut Ave.", 120, false, null, 0, false, "", 0, "", 9);
        BoardPiece ten  = new BoardPiece("Jail/Just Visiting", 0, false, null, 0, false, "", 0, "", 10);
        BoardPiece eleven  = new BoardPiece("St. Charles Place", 140, false, null, 0, false, "", 0, "", 11);
        BoardPiece twelve  = new BoardPiece("Electric Company", 150, false, null, 0, false, "", 0, "", 12);
        BoardPiece thirteen  = new BoardPiece("States Ave.", 140, false, null, 0, false, "", 0, "", 13);
        BoardPiece fourteen  = new BoardPiece("Virginia Ave.", 160, false, null, 0, false, "", 0, "", 14);
        BoardPiece fifteen  = new BoardPiece("Pennsylvania Railroad", 200, false, null, 0, false, "", 0, "", 15);
        BoardPiece sixteen  = new BoardPiece("St. James Place", 180, false, null, 0, false, "", 0, "", 16);
        BoardPiece seventeen  = new BoardPiece("Community Chest", 0, false, null, 0, false, "", 0, "", 17);
        BoardPiece eighteen  = new BoardPiece("Tennessee Ave.", 180, false, null, 0, false, "", 0, "", 18);
        BoardPiece nineteen  = new BoardPiece("New York Ave.", 200, false, null, 0, false, "", 0, "", 19);
        BoardPiece twenty  = new BoardPiece("Free Parking", 0, false, null, 0, false, "", 0, "", 20);
        BoardPiece twentyone  = new BoardPiece("Kentucky Ave.", 220, false, null, 0, false, "", 0, "", 21);
        BoardPiece twentytwo  = new BoardPiece("Chance", 0, false, null, 0, false, "", 0, "", 22);
        BoardPiece twentythree  = new BoardPiece("Indiana Ave.", 220, false, null, 0, false, "", 0, "", 23);
        BoardPiece twentyfour  = new BoardPiece("Illinois Ave.", 240, false, null, 0, false, "", 0, "", 24);
        BoardPiece twentyfive  = new BoardPiece("B. & O. Railroad", 200, false, null, 0, false, "", 0, "", 25);
        BoardPiece twentysix  = new BoardPiece("Atlantic Ave.", 260, false, null, 0, false, "", 0, "", 26);
        BoardPiece twentyseven  = new BoardPiece("Ventnor Ave.", 260, false, null, 0, false, "", 0, "", 27);
        BoardPiece twentyeight  = new BoardPiece("Water Works", 150, false, null, 0, false, "", 0, "", 28);
        BoardPiece twentynine  = new BoardPiece("Marvin Gardens", 280, false, null, 0, false, "", 0, "", 29);
        BoardPiece thirty  = new BoardPiece("Go To Jail", 0, false, null, 0, false, "", 0, "", 30);
        BoardPiece thirtyone  = new BoardPiece("Pacific Ave.", 300, false, null, 0, false, "", 0, "", 31);
        BoardPiece thirtytwo  = new BoardPiece("North Carolina Ave.", 300, false, null, 0, false, "", 0, "", 32);
        BoardPiece thirtythree  = new BoardPiece("Community Chest", 0, false, null, 0, false, "", 0, "", 33);
        BoardPiece thirtyfour  = new BoardPiece("Pennsylvania Ave.", 320, false, null, 0, false, "", 0, "", 34);
        BoardPiece thirtyfive  = new BoardPiece("Short Line", 200, false, null, 0, false, "", 0, "", 35);
        BoardPiece thirtysix  = new BoardPiece("Chance", 0, false, null, 0, false, "", 0, "", 36);
        BoardPiece thirtyseven  = new BoardPiece("Park Place", 350, false, null, 0, false, "", 0, "", 37);
        BoardPiece thirtyeight  = new BoardPiece("Luxury Tax", 0, false, null, 0, false, "", 0, "", 38);
        BoardPiece thirtynine  = new BoardPiece("Boardwalk", 400, false, null, 0, false, "", 0, "", 39);

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

        printBoard(board);
    }
    public static void printBoard(CLL<BoardPiece> board){
        System.out.println("┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐");
        System.out.println("|   Free   | | Kentucky | |  Chance  | | Indiana  | | Illinois | | B. & O.  | | Atlantic | | Ventnor  | |   Water  | |  Marvin  | |   GO TO  |");
        System.out.println("|  Parking | |    Ave   | |          | |    Ave   | |    Ave   | | Railroad | |    Ave   | |    Ave   | |   Works  | |  Gardens | |   JAIL   |");
        System.out.println("|"+ printOccupants(board.find(20)) +"| |"+ printOccupants(board.find(21)) +"| |"+ printOccupants(board.find(22)) +
                "| |"+ printOccupants(board.find(23)) +"| |"+ printOccupants(board.find(24)) +"| |"+ printOccupants(board.find(25)) +
                "| |"+ printOccupants(board.find(26)) +"| |"+ printOccupants(board.find(27)) +"| |"+ printOccupants(board.find(28)) +
                "| |"+ printOccupants(board.find(29)) +"| |"+ printOccupants(board.find(30)) +"|");
        System.out.println("|          | |   "+ board.find(21).getPrice() +"$   | |          | |   "+ board.find(23).getPrice() +"$   | |   "+ board.find(24).getPrice() +
                "$   | |   "+ board.find(25).getPrice() +"$   | |   "+ board.find(26).getPrice() +"$   | |   "+ board.find(27).getPrice() +"$   | |   "+ board.find(28).getPrice() +
                "$   | |   "+ board.find(29).getPrice() +"$   | |          |");
        System.out.println("└----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘");
        System.out.println("┌----------┐                                                                                                                      ┌----------┐");
        System.out.println("| New York |                                                                                                                      | Pacific  |");
        System.out.println("|    Ave   |                                                                                                                      |    Ave   |");
        System.out.println("|"+ printOccupants(board.find(19)) +"|                                                                                                                      |"+ printOccupants(board.find(31)) +"|");
        System.out.println("|   "+ board.find(19).getPrice() +"$   |                                                                                                                      |   "+ board.find(31).getPrice() +"$   |");
        System.out.println("└----------┘                                                                                                                      └----------┘");
        System.out.println("┌----------┐           ___ _  _   _   _  _  ___ ___                                                                               ┌----------┐");
        System.out.println("|Tennessee |          / __| || | /_\\ | \\| |/ __| __|                                                                              |   North  |");
        System.out.println("|    Ave   |         | (__| __ |/ _ \\| .` | (__| _|                                                                               | Caro. Ave|");
        System.out.println("|"+ printOccupants(board.find(18)) +"|          \\___|_||_/_/ \\_\\_|\\_|\\___|___|                                                                              |"+ printOccupants(board.find(32)) +"|");
        System.out.println("|   "+ board.find(18).getPrice() +"$   |                                                                                                                      |   "+ board.find(32).getPrice() +"$   |");
        System.out.println("└----------┘                                                                                                                      └----------┘");
        System.out.println("┌----------┐                                                                                                                      ┌----------┐");
        System.out.println("|Community |                                                                                                                      |Community |");
        System.out.println("|  Chest   |                                                                                                                      |  Chest   |");
        System.out.println("|"+ printOccupants(board.find(17)) +"|                                                                                                                      |"+ printOccupants(board.find(33)) +"|");
        System.out.println("|          |                                                                                                                      |          |");
        System.out.println("└----------┘                                                                                                                      └----------┘");
        System.out.println("┌----------┐                                                                                                                      ┌----------┐");
        System.out.println("| St. James|                                                                                                                      |   Penn.  |");
        System.out.println("|   Place  |                                                                                                                      |    Ave   |");
        System.out.println("|"+ printOccupants(board.find(16)) +"|                                                                                                                      |"+ printOccupants(board.find(34)) +"|");
        System.out.println("|   "+ board.find(16).getPrice() +"$   |                                                                                                                      |   "+ board.find(34).getPrice() +"$   |");
        System.out.println("└----------┘                                                                                                                      └----------┘");
        System.out.println("┌----------┐                 .___  ___.   ______   .__   __.   ______   .______     ______    __      ____    ____                ┌----------┐");
        System.out.println("|   Penn.  |                 |   \\/   |  /  __  \\  |  \\ |  |  /  __  \\  |   _  \\   /  __  \\  |  |     \\   \\  /   /                |   Short  |");
        System.out.println("| Railroad |                 |  \\  /  | |  |  |  | |   \\|  | |  |  |  | |  |_)  | |  |  |  | |  |      \\   \\/   /                 | Line (rr)|");
        System.out.println("|"+ printOccupants(board.find(15)) +"|                 |  |\\/|  | |  |  |  | |  . `  | |  |  |  | |   ___/  |  |  |  | |  |       \\_    _/                  |"+ printOccupants(board.find(35)) +"|");
        System.out.println("|   "+ board.find(15).getPrice() +"$   |                 |  |  |  | |  `--'  | |  |\\   | |  `--'  | |  |      |  `--'  | |  `----.    |  |                    |   "+ board.find(35).getPrice() +"$   |");
        System.out.println("└----------┘                 |__|  |__|  \\______/  |__| \\__|  \\______/  | _|       \\______/  |_______|    |__|                    └----------┘");
        System.out.println("┌----------┐                                                                                                                      ┌----------┐");
        System.out.println("| Virginia |                                                                                                                      |  Chance  |");
        System.out.println("|    Ave   |                                                                                                                      |          |");
        System.out.println("|"+ printOccupants(board.find(14)) +"|                                                                                                                      |"+ printOccupants(board.find(36)) +"|");
        System.out.println("|   "+ board.find(14).getPrice() +"$   |                                                                                                                      |          |");
        System.out.println("└----------┘                                                                                                                      └----------┘");
        System.out.println("┌----------┐                                                                                                                      ┌----------┐");
        System.out.println("|  States  |                                                                                                                      |   Park   |");
        System.out.println("|    Ave   |                                                                                                                      |   Place  |");
        System.out.println("|"+ printOccupants(board.find(13)) +"|                                                                                                                      |"+ printOccupants(board.find(37)) +"|");
        System.out.println("|   "+ board.find(13).getPrice() +"$   |                                                                                                                      |   "+ board.find(37).getPrice() +"$   |");
        System.out.println("└----------┘                                                                                                                      └----------┘");
        System.out.println("┌----------┐                                                                                                                      ┌----------┐");
        System.out.println("| Electric |                                                                                                                      |  Luxury  |");
        System.out.println("|  Company |                                ___ ___  __  __ __  __ _   _ _  _ ___ _______   __   ___ _  _ ___ ___ _____           |    Tax   |");
        System.out.println("|"+ printOccupants(board.find(12)) +"|                              / __/ _ \\|  \\/  |  \\/  | | | | \\| |_ _|_   _\\ \\ / /  / __| || | __/ __|_   _|           |"+ printOccupants(board.find(38)) +"|");
        System.out.println("|   "+ board.find(12).getPrice() +"$   |                             | (_| (_) | |\\/| | |\\/| | |_| | .` || |  | |  \\ V /  | (__| __ | _|\\__ \\ | |             | Pay 100$ |");
        System.out.println("└----------┘                              \\___\\___/|_|  |_|_|  |_|\\___/|_|\\_|___| |_|   |_|    \\___|_||_|___|___/ |_|             └----------┘");
        System.out.println("┌----------┐                                                                                                                      ┌----------┐");
        System.out.println("|St Charles|                                                                                                                      |Boardwalk |");
        System.out.println("|   Place  |                                                                                                                      |          |");
        System.out.println("|"+ printOccupants(board.find(11)) +"|                                                                                                                      |"+ printOccupants(board.find(39)) +"|");
        System.out.println("|   "+ board.find(11).getPrice() +"$   |                                                                                                                      |   "+ board.find(39).getPrice() +"$   |");
        System.out.println("└----------┘                                                                                                                      └----------┘");
        System.out.println("┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐");
        System.out.println("|  JAIL &  | |   Conn.  | |  Vermont | |  Chance  | | Oriental | |  Reading | |  Income  | |  Baltic  | |Community | | Mediter. | |    GO    |");
        System.out.println("|  Just V. | |    Ave   | |    Ave   | |          | |    Ave   | | Railroad | |    Tax   | |    Ave   | |   Chest  | |   Ave    | |          |");
        System.out.println("|"+ printOccupants(board.find(10)) +"| |"+ printOccupants(board.find(9)) +"| |"+ printOccupants(board.find(8)) +
                "| |"+ printOccupants(board.find(7)) +"| |"+ printOccupants(board.find(6)) +"| |"+ printOccupants(board.find(5)) +
                "| |"+ printOccupants(board.find(4)) +"| |"+ printOccupants(board.find(3)) +"| |"+ printOccupants(board.find(2)) +
                "| |"+ printOccupants(board.find(1)) +"| |  Collect |");
        System.out.println("|          | |   "+ board.find(9).getPrice() +"$   | |   "+ board.find(8).getPrice() +"$   | |          | |   "+ board.find(6).getPrice() +"$   | |   "+ board.find(5).getPrice() +"$   | | Pay 200$ | |    "+ board.find(3).getPrice() +"$   | |          | |    "+ board.find(one).getPrice(1) +"$   | |   200$   |");
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
}

