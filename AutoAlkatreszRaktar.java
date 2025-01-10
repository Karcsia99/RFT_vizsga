import java.util.*;

public class AutoAlkatreszRaktar {

    private static Map<String, String> users = new HashMap<>(); // Felhasználók
    private static List<String> inventory = new ArrayList<>(); // Autóalkatrész-készlet
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        users.put("admin", "password123"); // Alapértelmezett felhasználó

        System.out.println("Üdvözöljük az autóalkatrész-készlet-kezelő rendszerben!");

        if (login()) {
            menu();
        } else {
            System.out.println("Túl sok sikertelen próbálkozás. Kilépés...");
        }
}

private static void menu() {
    
    while (true) {
        System.out.println("\nFőmenü:");
        System.out.println("1. Alkatrész hozzáadása");
        System.out.println("2. Alkatrész törlése");
        System.out.println("3. Alkatrészek megtekintése");
        System.out.println("4. Jelszó módosítása");
        System.out.println("5. Kilépés");
        System.out.print("Választás: ");

        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                addPart();
                break;
            case "2":
                deletePart();
                break;
            case "3":
                viewInventory();
                break;
            case "4":
                changePassword();
                break;
            case "5":
                System.out.println("Kilépés... Viszlát!");
                return;
            default:
                System.out.println("Érvénytelen választás.");
        }
    }
}

}
