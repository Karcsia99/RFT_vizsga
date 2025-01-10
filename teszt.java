private static boolean login() {
    
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

private static void addPart(){
    
    System.out.print("Add meg az alkatrész nevét: ");
    String part 