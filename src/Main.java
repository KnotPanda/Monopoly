public class Main {

    public static void main(String[] args) {
        Board_CLL board = new Board_CLL();
        board.insert("Mediterranean Ave.", 60, false, null, 10, true, "", 30, " ", 1);
        board.insert("Community Chest", 0, false, null, 0, false, "Community Chest", 0, " ", 2);
        board.insert("Baltic Ave.", 60, false, null, 20, true, "", 30, " ", 3);
        board.insert("Income Tax", 0, false, null, 0, false, "", 0, " ", 4);
        board.insert("Reading Railroad", 200, false, null, 0, false, "", 0, " ", 5);
        board.insert("Oriental Ave.", 100, false, null, 0, false, "", 0, " ", 6);
        board.insert("Chance", 0, false, null, 0, false, "", 0, " ", 7);
        board.insert("Vermont Ave.", 100, false, null, 0, false, "", 0, " ", 8);
        board.insert("Connecticut Ave.", 120, false, null, 0, false, "", 0, " ", 9);
        board.insert("Jail/Just Visiting", 0, false, null, 0, false, "", 0, " ", 10);
        board.insert("St. Charles Place", 140, false, null, 0, false, "", 0, " ", 11);
        board.insert("Electric Company", 150, false, null, 0, false, "", 0, " ", 12);
        board.insert("States Ave.", 140, false, null, 0, false, "", 0, " ", 13);
        board.insert("Virginia Ave.", 160, false, null, 0, false, "", 0, " ", 14);
        board.insert("Pennsylvania Railroad", 200, false, null, 0, false, "", 0, " ", 15);
        board.insert("St. James Place", 180, false, null, 0, false, "", 0, " ", 16);
        board.insert("Community Chest", 0, false, null, 0, false, "", 0, " ", 17);
        board.insert("Tennessee Ave.", 180, false, null, 0, false, "", 0, " ", 18);
        board.insert("New York Ave.", 200, false, null, 0, false, "", 0, " ", 19);
        board.insert("Free Parking", 0, false, null, 0, false, "", 0, " ", 20);
        board.insert("Kentucky Ave.", 220, false, null, 0, false, "", 0, " ", 21);
        board.insert("Chance", 0, false, null, 0, false, "", 0, " ", 22);
        board.insert("Indiana Ave.", 220, false, null, 0, false, "", 0, " ", 23);
        board.insert("Illinois Ave.", 240, false, null, 0, false, "", 0, " ", 24);
        board.insert("B. & O. Railroad", 200, false, null, 0, false, "", 0, " ", 25);
        board.insert("Atlantic Ave.", 260, false, null, 0, false, "", 0, " ", 26);
        board.insert("Ventnor Ave.", 260, false, null, 0, false, "", 0, " ", 27);
        board.insert("Water Works", 150, false, null, 0, false, "", 0, " ", 28);
        board.insert("Marvin Gardens", 280, false, null, 0, false, "", 0, " ", 29);
        board.insert("Go To Jail", 0, false, null, 0, false, "", 0, " ", 30);
        board.insert("Pacific Ave.", 300, false, null, 0, false, "", 0, " ", 31);
        board.insert("North Carolina Ave.", 300, false, null, 0, false, "", 0, " ", 32);
        board.insert("Community Chest", 0, false, null, 0, false, "", 0, " ", 33);
        board.insert("Pennsylvania Ave.", 320, false, null, 0, false, "", 0, " ", 34);
        board.insert("Short Line", 200, false, null, 0, false, "", 0, " ", 35);
        board.insert("Chance", 0, false, null, 0, false, "", 0, " ", 36);
        board.insert("Park Place", 350, false, null, 0, false, "", 0, " ", 37);
        board.insert("Luxury Tax", 0, false, null, 0, false, "", 0, " ", 38);
        board.insert("Boardwalk", 400, false, null, 0, false, "", 0, " ", 39);

        printBoard(board);


    }
    public static void printBoard(Board_CLL board){
        System.out.println("┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐");
        System.out.println("|   Free   | | Kentucky | |  Chance  | | Indiana  | | Illinois | | B. & O.  | | Atlantic | | Ventnor  | |   Water  | |  Marvin  | |   GO TO  |");
        System.out.println("|  Parking | |    Ave   | |          | |    Ave   | |    Ave   | | Railroad | |    Ave   | |    Ave   | |   Works  | |  Gardens | |   JAIL   |");
        System.out.println("|    "+ board.find(20).occupiedBy +"     | |    "+ board.find(21).occupiedBy +"     | |    "+ board.find(22).occupiedBy +
                "     | |    "+ board.find(23).occupiedBy +"     | |    "+ board.find(24).occupiedBy +"     | |    "+ board.find(25).occupiedBy +
                "     | |    "+ board.find(26).occupiedBy +"     | |    "+ board.find(27).occupiedBy +"     | |    "+ board.find(28).occupiedBy +
                "     | |    "+ board.find(29).occupiedBy +"     | |    "+ board.find(30).occupiedBy +"     |");
        System.out.println("|          | |   "+ board.find(21).price +"$   | |          | |   "+ board.find(23).price +"$   | |   "+ board.find(24).price +
                "$   | |   "+ board.find(25).price +"$   | |   "+ board.find(26).price +"$   | |   "+ board.find(27).price +"$   | |   "+ board.find(28).price +
                "$   | |   "+ board.find(29).price +"$   | |          |");
        System.out.println("└----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘");
        System.out.println("┌----------┐                                                                                                                      ┌----------┐");
        System.out.println("| New York |                                                                                                                      | Pacific  |");
        System.out.println("|    Ave   |                                                                                                                      |    Ave   |");
        System.out.println("|    "+ board.find(19).occupiedBy +"     |                                                                                            " +
                "                          |    "+ board.find(31).occupiedBy +"     |");
        System.out.println("|   "+ board.find(19).price +"$   |                                                                                                                      |   "+ board.find(31).price +"$   |");
        System.out.println("└----------┘                                                                                                                      └----------┘");
        System.out.println("┌----------┐           ___ _  _   _   _  _  ___ ___                                                                               ┌----------┐");
        System.out.println("|Tennessee |          / __| || | /_\\ | \\| |/ __| __|                                                                              |   North  |");
        System.out.println("|    Ave   |         | (__| __ |/ _ \\| .` | (__| _|                                                                               | Caro. Ave|");
        System.out.println("|    "+ board.find(18).occupiedBy +"     |          \\___|_||_/_/ \\_\\_|\\_|\\___|___|                                                                              |    "+ board.find(32).occupiedBy +"     |");
        System.out.println("|   "+ board.find(18).price +"$   |                                                                                                                      |   "+ board.find(32).price +"$   |");
        System.out.println("└----------┘                                                                                                                      └----------┘");
        System.out.println("┌----------┐                                                                                                                      ┌----------┐");
        System.out.println("|Community |                                                                                                                      |Community |");
        System.out.println("|  Chest   |                                                                                                                      |  Chest   |");
        System.out.println("|    "+ board.find(17).occupiedBy +"     |                                                                                                                      |    "+ board.find(33).occupiedBy +"     |");
        System.out.println("|          |                                                                                                                      |          |");
        System.out.println("└----------┘                                                                                                                      └----------┘");
        System.out.println("┌----------┐                                                                                                                      ┌----------┐");
        System.out.println("| St. James|                                                                                                                      |   Penn.  |");
        System.out.println("|   Place  |                                                                                                                      |    Ave   |");
        System.out.println("|    "+ board.find(16).occupiedBy +"     |                                                                                                                      |    "+ board.find(34).occupiedBy +"     |");
        System.out.println("|   "+ board.find(16).price +"$   |                                                                                                                      |   "+ board.find(34).price +"$   |");
        System.out.println("└----------┘                                                                                                                      └----------┘");
        System.out.println("┌----------┐                 .___  ___.   ______   .__   __.   ______   .______     ______    __      ____    ____                ┌----------┐");
        System.out.println("|   Penn.  |                 |   \\/   |  /  __  \\  |  \\ |  |  /  __  \\  |   _  \\   /  __  \\  |  |     \\   \\  /   /                |   Short  |");
        System.out.println("| Railroad |                 |  \\  /  | |  |  |  | |   \\|  | |  |  |  | |  |_)  | |  |  |  | |  |      \\   \\/   /                 | Line (rr)|");
        System.out.println("|    "+ board.find(15).occupiedBy +"     |                 |  |\\/|  | |  |  |  | |  . `  | |  |  |  | |   ___/  |  |  |  | |  |       \\_    _/                  |    "+ board.find(35).occupiedBy +"     |");
        System.out.println("|   "+ board.find(15).price +"$   |                 |  |  |  | |  `--'  | |  |\\   | |  `--'  | |  |      |  `--'  | |  `----.    |  |                    |   "+ board.find(35).price +"$   |");
        System.out.println("└----------┘                 |__|  |__|  \\______/  |__| \\__|  \\______/  | _|       \\______/  |_______|    |__|                    └----------┘");
        System.out.println("┌----------┐                                                                                                                      ┌----------┐");
        System.out.println("| Virginia |                                                                                                                      |  Chance  |");
        System.out.println("|    Ave   |                                                                                                                      |          |");
        System.out.println("|    "+ board.find(14).occupiedBy +"     |                                                                                                                      |    "+ board.find(36).occupiedBy +"     |");
        System.out.println("|   "+ board.find(14).price +"$   |                                                                                                                      |          |");
        System.out.println("└----------┘                                                                                                                      └----------┘");
        System.out.println("┌----------┐                                                                                                                      ┌----------┐");
        System.out.println("|  States  |                                                                                                                      |   Park   |");
        System.out.println("|    Ave   |                                                                                                                      |   Place  |");
        System.out.println("|    "+ board.find(13).occupiedBy +"     |                                                                                                                      |    "+ board.find(37).occupiedBy +"     |");
        System.out.println("|   "+ board.find(13).price +"$   |                                                                                                                      |   "+ board.find(37).price +"$   |");
        System.out.println("└----------┘                                                                                                                      └----------┘");
        System.out.println("┌----------┐                                                                                                                      ┌----------┐");
        System.out.println("| Electric |                                                                                                                      |  Luxury  |");
        System.out.println("|  Company |                                ___ ___  __  __ __  __ _   _ _  _ ___ _______   __   ___ _  _ ___ ___ _____           |    Tax   |");
        System.out.println("|    "+ board.find(12).occupiedBy +"     |                              / __/ _ \\|  \\/  |  \\/  | | | | \\| |_ _|_   _\\ \\ / /  / __| || | __/ __|_   _|           |    "+ board.find(38).occupiedBy +"     |");
        System.out.println("|   "+ board.find(12).price +"$   |                             | (_| (_) | |\\/| | |\\/| | |_| | .` || |  | |  \\ V /  | (__| __ | _|\\__ \\ | |             | Pay 100$ |");
        System.out.println("└----------┘                              \\___\\___/|_|  |_|_|  |_|\\___/|_|\\_|___| |_|   |_|    \\___|_||_|___|___/ |_|             └----------┘");
        System.out.println("┌----------┐                                                                                                                      ┌----------┐");
        System.out.println("|St Charles|                                                                                                                      |Boardwalk |");
        System.out.println("|   Place  |                                                                                                                      |          |");
        System.out.println("|    "+ board.find(11).occupiedBy +"     |                                                                                                                      |    "+ board.find(39).occupiedBy +"     |");
        System.out.println("|   "+ board.find(11).price +"$   |                                                                                                                      |   "+ board.find(39).price +"$   |");
        System.out.println("└----------┘                                                                                                                      └----------┘");
        System.out.println("┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐");
        System.out.println("|  JAIL &  | |   Conn.  | |  Vermont | |  Chance  | | Oriental | |  Reading | |  Income  | |  Baltic  | |Community | | Mediter. | |    GO    |");
        System.out.println("|  Just V. | |    Ave   | |    Ave   | |          | |    Ave   | | Railroad | |    Tax   | |    Ave   | |   Chest  | |   Ave    | |          |");
        System.out.println("|    "+ board.find(10).occupiedBy +"     | |    "+ board.find(9).occupiedBy +"     | |    "+ board.find(8).occupiedBy +
                "     | |    "+ board.find(7).occupiedBy +"     | |    "+ board.find(6).occupiedBy +"     | |    "+ board.find(5).occupiedBy +
                "     | |    "+ board.find(4).occupiedBy +"     | |    "+ board.find(3).occupiedBy +"     | |    "+ board.find(2).occupiedBy +
                "     | |    "+ board.find(1).occupiedBy +"     | |  Collect |");
        System.out.println("|          | |   "+ board.find(9).price +"$   | |   "+ board.find(8).price +"$   | |          | |   "+ board.find(6).price +"$   | |   "+ board.find(5).price +"$   | | Pay 200$ | |    "+ board.find(3).price +"$   | |          | |    "+ board.find(1).price +"$   | |   200$   |");
        System.out.println("└----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘");
    }
}

