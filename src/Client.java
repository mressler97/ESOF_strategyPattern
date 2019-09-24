import java.util.Scanner;


public class Client {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Database db = new Database();


        System.out.println("Please provide selection of software(Relational, NoSQL, or Graph)");
        String strat = sc.nextLine();

        switch (strat) {
            case "Relational":
                db.setStoreStrategy(new Relational());
                db.store();

                System.out.println();
                System.out.println("dynamically switching strategy...");
                System.out.println();

                db.setStoreStrategy(new Graph());
                db.store();
                break;
            case "NoSQL":
                db.setStoreStrategy(new NoSQL());
                db.store();

                System.out.println();
                System.out.println("dynamically switching strategy...");
                System.out.println();

                db.setStoreStrategy(new Relational());
                db.store();
                break;
            case "Graph":
                db.setStoreStrategy(new Graph());
                db.store();

                System.out.println();
                System.out.println("dynamically switching strategy...");
                System.out.println();

                db.setStoreStrategy(new NoSQL());
                db.store();
                break;
            default:
                System.out.println("invalid entry");
                break;
        }

    }
}
