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
private static boolean login() {
        // GitHub Commit: Added login functionality by Dominika
        int attempts = 0;
        while (attempts < 3) {
            System.out.print("Felhasználónév: ");
            String username = scanner.nextLine();
            System.out.print("Jelszó: ");
            String password = scanner.nextLine();

            if (users.containsKey(username) && users.get(username).equals(password)) {
                System.out.println("Sikeres bejelentkezés!");
                return true;
            } else {
                System.out.println("Hibás felhasználónév vagy jelszó.");
                attempts++;
            }
        }
        return false;
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
private static void deletePart() {
    
    System.out.print("Add meg az alkatrész nevét, amit törölni szeretnél: ");
    String part = scanner.nextLine();
        if (inventory.remove(part)) {
            System.out.println("Az alkatrész törölve: " + part);
        } else {
            System.out.println("Az alkatrész nem található.");
        }
}
private static void changePassword() {
    // GitHub Commit: Added password change functionality by Károly
    System.out.print("Add meg a felhasználóneved: ");
    String username = scanner.nextLine();
    if (users.containsKey(username)) {
        System.out.print("Add meg az új jelszót: ");
        String newPassword = scanner.nextLine();
        users.put(username, newPassword);
        System.out.println("A jelszó sikeresen módosítva!");
    } else {
        System.out.println("Felhasználó nem található.");
    }
}

}
