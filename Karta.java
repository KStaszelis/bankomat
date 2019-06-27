public class Karta {
    private String [] numerKarty = {"ABC", "XYZ"};
    private int [] stanKonta = {10000, 1540};

    public boolean sprawdzKarte(String kartaKredytowa){
        boolean wynik = false;
        for(int i=0; i<numerKarty.length; i++) {
            if(kartaKredytowa.equals(numerKarty[i])){
                wynik = true;
            }
        }
        return wynik;
    }
    public int getStanKonta(String kartaKredytowa){
        int wynik = 0;
        for(int i=0; i<numerKarty.length; i++){
            if(kartaKredytowa.equals(numerKarty[i])){
                wynik = stanKonta[i];
            }
        }
        return wynik;
    }

    public void updateStanKonta(String kartaKredytowa, int plac){
        for(int i=0; i<numerKarty.length; i++) {
            if(kartaKredytowa.equals(numerKarty[i])){
                stanKonta[i] = stanKonta[i] - plac;
            }
        }
    }
}

