import java.util.Scanner;


public class questions {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i < 4; i++){
            String[] questions= {"東京好き？", "PHP好き？", "laravel好き？", "Vue.js好き？"};
            System.out.println(questions[i]);
            System.out.println("該当する数値を入力してください");
            System.out.println("1:いまいち, 2:うーん, 3:そこそこ, 4:いいね！");

            Scanner points = new Scanner(System.in);
            int number = points.nextInt();
            total += number;

        }

    System.out.println("合計点数は"+total+"なので.....");

    if(total < 3){
        System.out.println("出直せ〜！");
    }else if(total < 6){
        System.out.println("ふ〜ん");
    }else if(total < 9){
        System.out.println("おおお");
    }else{
        System.out.println("やるやん！");
    }
    }
}
