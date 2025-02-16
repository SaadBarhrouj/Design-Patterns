import strategy.IStrategy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean fin=false;
        Context context = new Context();
        Scanner scanner = new Scanner(System.in);
        while (!fin){
            System.out.println("Donner La Strategy que vous souhaitez ");
            String choix = scanner.nextLine();
            Class c= Class.forName(choix);
           IStrategy strategy = (IStrategy) c.newInstance();
           context.setStrategy(strategy);
           context.process();
        }

    }
}
