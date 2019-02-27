import javax.xml.crypto.Data;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Hero數:");
        int num=scn.nextInt();
        Hero heros[]=new Hero[num];
        for (int i=0;i<num;i++){
            System.out.println("Hero name");
            heros[i]=new Hero(scn.next());
        }
        String str="Y";
        while(str.equals("Y")||str.equals("y")) {
            System.out.println("1,Search by Name");
            System.out.println("2,Search by HP");
            System.out.println("3,EXIT");
            String choice=scn.next();
            switch (choice){
                case "1":
                    System.out.println("Name");
                    String heroName=scn.next();
                    boolean flag=false;
                    for (int i=0;i<num;i++){
                        if (heros[i].getName().equals(heroName)) {
                            heros[i].showInfo();
                            flag = true;
                        }
                    }
                    break;
                case "2":
                    System.out.println("Hp");
                    int hp=scn.nextInt();
                    for (int i=0;i<num;i++){
                        if (heros[i].getHp>=hp){
                            heros[i].showInfo();
                        }
                    }
                    break;
            }
        }

    }
}
