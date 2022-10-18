public class Main {

    public static void main(String[] args) {

    }
    public void printBoard(Board_CLL board){
        System.out.println("┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐");
        System.out.println("|   Free   | | Kentucky | |  Chance  | | Indiana  | | Illinois | | B. & O.  | | Atlantic | | Ventnor  | |   Water  | |  Marvin  | |   GO TO  |");
        System.out.println("|  Parking | |    Ave   | |          | |    Ave   | |    Ave   | | Railroad | |    Ave   | |    Ave   | |   Works  | |  Gardens | |   JAIL   |");
        System.out.println("|    "+ board.find(20).occupiedBy +"     | |    "+ board.find(21).occupiedBy +"     | |     "+ board.find(22).occupiedBy +
                "     | |    "+ board.find(23).occupiedBy +"     | |    "+ board.find(24).occupiedBy +"     | |    "+ board.find(25).occupiedBy +
                "     | |    "+ board.find(26).occupiedBy +"     | |    "+ board.find(27).occupiedBy +"     | |    "+ board.find(28).occupiedBy +
                "     | |    "+ board.find(29).occupiedBy +"     | |    "+ board.find(30).occupiedBy +"     |");
        System.out.println("|   220$   | |   220$   | |          | |   220$   | |   240$   | |   200$   | |   260$   | |   260$   | |   150$   | |   280$   | |          |");
        System.out.println("└----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘");
        System.out.println("┌----------┐                                                                                                                      ┌----------┐");
        System.out.println("| New York |                                                                                                                      | Pacific  |");
        System.out.println("|    Ave   |                                                                                                                      |    Ave   |");
        System.out.println("|    "+ board.find(19).occupiedBy +"     |                                                                                                                      |    "+ board.find(31).occupiedBy +"     |");
        System.out.println("|   200$   |                                                                                                                      |   300$   |");
        System.out.println("└----------┘                                                                                                                      └----------┘");
        System.out.println("┌----------┐           ___ _  _   _   _  _  ___ ___                                                                               ┌----------┐");
        System.out.println("|Tennessee |          / __| || | /_\\ | \\| |/ __| __|                                                                            |   North  |");
        System.out.println("|    Ave   |         | (__| __ |/ _ \\| .` | (__| _|                                                                              | Caro. Ave|");
        System.out.println("|    "+ board.find(18).occupiedBy +"     |          \\___|_||_/_/ \\_\\_|\\_|\\___|___|                                                                         |    "+ board.find(32).occupiedBy +"     |");
        System.out.println("|   180$   |                                                                                                                      |   300$   |");
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
        System.out.println("|   180$   |                                                                                                                      |   320$   |");
        System.out.println("└----------┘                                                                                                                      └----------┘");
        System.out.println("┌----------┐                 .___  ___.   ______   .__   __.   ______   .______     ______    __      ____    ____                ┌----------┐");
        System.out.println("|   Penn.  |                 |   \\/   |  /  __  \\  |  \\ |  |  /  __  \\  |   _  \\   /  __  \\  |  |     \\   \\  /   /        |   Short  |");
        System.out.println("| Railroad |                 |  \\  /  | |  |  |  | |   \\|  | |  |  |  | |  |_)  | |  |  |  | |  |      \\   \\/   /             | Line (rr)|");
        System.out.println("|    "+ board.find(15).occupiedBy +"     |                 |  |\\/|  | |  |  |  | |  . `  | |  |  |  | |   ___/  |  |  |  | |  |       \\_    _/                |    "+ board.find(35).occupiedBy +"     |");
        System.out.println("|   200$   |                 |  |  |  | |  `--'  | |  |\\   | |  `--'  | |  |      |  `--'  | |  `----.    |  |                   |   200$   |");
        System.out.println("└----------┘                 |__|  |__|  \\______/  |__| \\__|  \\______/  | _|       \\______/  |_______|    |__|                └----------┘");
        System.out.println("┌----------┐                                                                                                                      ┌----------┐");
        System.out.println("| Virginia |                                                                                                                      |  Chance  |");
        System.out.println("|    Ave   |                                                                                                                      |          |");
        System.out.println("|    "+ board.find(14).occupiedBy +"     |                                                                                                                      |    "+ board.find(36).occupiedBy +"     |");
        System.out.println("|   160$   |                                                                                                                      |          |");
        System.out.println("└----------┘                                                                                                                      └----------┘");
        System.out.println("┌----------┐                                                                                                                      ┌----------┐");
        System.out.println("|  States  |                                                                                                                      |   Park   |");
        System.out.println("|    Ave   |                                                                                                                      |   Place  |");
        System.out.println("|    "+ board.find(13).occupiedBy +"     |                                                                                                                      |    "+ board.find(37).occupiedBy +"     |");
        System.out.println("|   140$   |                                                                                                                      |   350$   |");
        System.out.println("└----------┘                                                                                                                      └----------┘");
        System.out.println("┌----------┐                                                                                                                      ┌----------┐");
        System.out.println("| Electric |                                                                                                                      |  Luxury  |");
        System.out.println("|  Company |                                ___ ___  __  __ __  __ _   _ _  _ ___ _______   __   ___ _  _ ___ ___ _____           |    Tax   |");
        System.out.println("|    "+ board.find(12).occupiedBy +"     |                              / __/ _ \\|  \\/  |  \\/  | | | | \\| |_ _|_   _\\ \\ / /  / __| || | __/ __|_   _|     |    "+ board.find(38).occupiedBy +"     |");
        System.out.println("|   150$   |                              | (_| (_) | |\\/| | |\\/| | |_| | .` || |  | |  \\ V /  | (__| __ | _|\\__ \\ | |       | Pay 100$ |");
        System.out.println("└----------┘                              \\___\\___/|_|  |_|_|  |_|\\___/|_|\\_|___| |_|   |_|    \\___|_||_|___|___/ |_|        └----------┘");
        System.out.println("┌----------┐                                                                                                                      ┌----------┐");
        System.out.println("|St Charles|                                                                                                                      |Boardwalk |");
        System.out.println("|   Place  |                                                                                                                      |          |");
        System.out.println("|    "+ board.find(11).occupiedBy +"     |                                                                                                                      |    "+ board.find(39).occupiedBy +"     |");
        System.out.println("|   140$   |                                                                                                                      |   400$   |");
        System.out.println("└----------┘                                                                                                                      └----------┘");
        System.out.println("┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐ ┌----------┐");
        System.out.println("|  JAIL &  | |   Conn.  | |  Vermont | |  Chance  | | Oriental | |  Reading | |  Income  | |  Baltic  | |Community | | Mediter. | |    GO    |");
        System.out.println("|  Just V. | |    Ave   | |    Ave   | |          | |    Ave   | | Railroad | |    Tax   | |    Ave   | |   Chest  | |   Ave    | |          |");
        System.out.println("|    "+ board.find(10).occupiedBy +"     | |    "+ board.find(9).occupiedBy +"     | |     "+ board.find(8).occupiedBy +
                "     | |    "+ board.find(7).occupiedBy +"     | |    "+ board.find(6).occupiedBy +"     | |    "+ board.find(5).occupiedBy +
                "     | |    "+ board.find(4).occupiedBy +"     | |    "+ board.find(3).occupiedBy +"     | |    "+ board.find(2).occupiedBy +
                "     | |    "+ board.find(1).occupiedBy +"     | |  Collect |");
        System.out.println("|          | |   120$   | |   100$   | |          | |   100$   | |   200$   | | Pay 200$ | |    60$   | |          | |    60$   | |   200$   |");
        System.out.println("└----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘ └----------┘");
    }
}

