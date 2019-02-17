import java.util.Scanner;


public class questions {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i < 4; i++){
            String[] questions= {"a", "b", "c", "d"};
            System.out.println(questions[i]);

            Scanner points = new Scanner(System.in);
            int number = points.nextInt();
            total += number;

        }

    System.out.println("合計点数は"+total+"なので.....");

    if(total < 1){
        System.out.println("Sun");
    }else if(total < 5){
        System.out.println("of");
    }else if(total < 10){
        System.out.println("a");
    }else{
        System.out.println("bitch");
    }
    }
}
