
package titkosiras;
import java.util.Scanner;

public class Titkosiras {
    static final String ABC="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String atalakit(String s){
        String uj="";
        char c;
        for (int i = 0; i < s.length(); i++) {
            c=s.charAt(i);
            switch(c){
                case 'Á':
                    c='A'; break;
                case 'É':
                    c='E'; break;
                case 'Í':
                    c='I'; break;
                case 'Ó': case 'Ö': case 'Ő':
                    c='O'; break;
                case 'Ú':  case 'Ü': case 'Ű':
                    c='U'; break;
            }
            if(ABC.indexOf(c)>-1)
                uj+=c;
        }
        return uj;
    }
    
    private static void kiir(){
        Scanner bill=new Scanner(System.in,"CP1250");
        String be;
        while(true){
            System.out.println("Szoveg: ");
            be=bill.nextLine().toUpperCase();
            if(be.equals(""))
                break;
            String at=atalakit(be);
            System.out.println("Atalakitva: "+at);
        }
    }
    public static void main(String[] args) {
        kiir();
    }
    
}
