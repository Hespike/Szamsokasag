public class Szamsokasag {
    public static void main(String[] args) {
        int legtobbDb = 0;
        int legtobbErtek = 0;

        boolean tobbIsVan = false;

        for (int i = 0; i < args.length; i++) {
            int aktualisDb = 1;
            for (int j = i+1; j < args.length; j++) {
                if (Integer.parseInt(args[j]) == Integer.parseInt(args[i])) {
                    aktualisDb++;
                }
            }

            if (aktualisDb > legtobbDb) {
                legtobbDb = aktualisDb;
                legtobbErtek = Integer.parseInt(args[i]);
                tobbIsVan = false;
            } else if (aktualisDb == legtobbDb && legtobbErtek != Integer.parseInt(args[i])) {
                tobbIsVan = true;
            }
        }

        if (tobbIsVan) {
            System.out.println("Tobb ilyen szam is van");
        } else {
            System.out.println("Ebbol van a legtobb: " + legtobbErtek);
        }
    }
}
