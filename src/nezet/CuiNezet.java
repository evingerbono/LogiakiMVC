package nezet;

import java.util.Scanner;

public class CuiNezet extends Nezet{
    private static final Scanner sc = new Scanner(System.in);
    
    @Override
    protected void nezetbeIr(String msg){
        System.out.print(msg);
    }
    
    @Override
    public int valasztas(String msg){
        nezetbeIr(msg);
        return sc.nextInt();
    }
}
