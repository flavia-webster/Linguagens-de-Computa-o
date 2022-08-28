import java.util.Scanner;

public class App{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        Item item = new Item();

        // a := (aux - 1) * 100 / 20

        String operacao=sc.nextLine();
        System.out.println();

        operacao=operacao.replace("(", "( ").trim();
        operacao=operacao.replace(")", " )").trim();

        System.out.println("\nString Final:"+operacao);
        String[] arrayOp = operacao.split("\\s+");

        for(int i =0; i<arrayOp.length;i++){
            System.out.println(arrayOp[i]);
        }

        // for(int i =0; i<arrayOp.length;i++){
        //     item.add((settoken???),arrayOp[i],i);
        // }


        sc.close();
    }
}