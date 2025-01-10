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
