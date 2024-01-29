package vezerlo;

import modell.Feladat;
import modell.Lada;

public abstract class Vezerlo {
    private Feladat modell;
    private Lada[] ladak;

    public Vezerlo(Feladat modell) {
        this.modell = modell;
        this.ladak = modell.getLadak();
    }

    public abstract void mutat();
    
    public Feladat getModell() {
        return modell;
    }
    
    protected String feladatOsszeallito() {
        String str = "";
        for (Lada lada : ladak) {
            String anyag = lada.getAnyag() + ": ";
            String felirat = lada.getFelirat();
            str += anyag + felirat + "\n";
        }
        return str;
    }

    protected String eredmenyOsszeallito(int valasztas) {
        Lada lada = ladak[valasztas];
        String str = "";
        if(lada.isKincs()){
            str = "talált, a kincset a(z) ";
        }else{
            str = "nem talált, a kincset nem a(z) ";
        }
        return str + lada.getAnyag() + " rejti ";
    }
}
