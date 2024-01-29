package main;

import modell.Feladat;
import nezet.CuiNezet;
import nezet.JopNezet;
import nezet.Nezet;
import vezerlo.CuiVezerlo;
import vezerlo.JopVezerlo;

public class LogikaiProgram {

    public static void main(String[] args) {
        new LogikaiProgram().ini();
    }
    
    public void ini(){
        Nezet nezet;
        Feladat modell = new Feladat();
        
//        nezet = new CuiNezet();
//        new CuiVezerlo((CuiNezet) nezet, modell);
        
        nezet = new JopNezet();
        new JopVezerlo((JopNezet) nezet, modell);
        
        
    }
}
