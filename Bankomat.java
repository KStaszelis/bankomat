import java.util.Scanner;

public class Bankomat {
    private String numerKarty;
    private Karta kartaKredytowa = new Karta();
    int choice = 0;
    private Scanner scanner = new Scanner(System.in);

    public void startBankomat() {
        System.out.println("Włóż kartę:");
        numerKarty = scanner.next();
        if(!kartaKredytowa.sprawdzKarte(numerKarty))
            System.out.println("Nie rozpoznano karty!");
        else{
            while(choice!= 3) {
                System.out.println(
                        "Wybierz operację" + "\n" +
                                "Aby sprawdzić stan konta wybierz [1]"+ "\n" +
                                "Aby wypłacić pieniądze wybierz [2]" + "\n" +
                                "Aby zakończyć wybierz [3]"
                );
                choice= operation(scanner.nextInt());
            }

        }

    }
    private void paycheck (int plac){
        if(plac<=kartaKredytowa.getStanKonta(numerKarty)){
            kartaKredytowa.updateStanKonta(numerKarty, plac);
            System.out.println("Wpłacono: " + plac + "\n");
        }
        else
            System.out.println("Zbyt mało środków na koncie. Wybierz inną opcję!  ");
    }
    private int operation(int a){
        switch (a){
            case 1:
                System.out.println("Masz na koncie " + kartaKredytowa.getStanKonta(numerKarty)+" zł" + "\n");
                break;
            case 2:
                System.out.println("Ile chcesz wypłacić?");
                paycheck(scanner.nextInt());
                break;
            case 3:
                System.out.println("Koniec!");
                break;
            default:
                System.out.println("Nie rozpoznano polecenia" + "\n");
        }
        return a;
    }
}

