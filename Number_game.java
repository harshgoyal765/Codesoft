import java.util.Scanner;
class range{
   public int generate(int max, int min){
     return (int)(Math.random()*(max-min+1));
   }
}
public class Number_game{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        range rg=new range();
        int TA=0;
        int win=0;

        while(true){
            System.out.println("enter the minimum number");
            int min=sc.nextInt();
            System.out.println("enter the maximum number");
            int max=sc.nextInt();
            sc.nextLine();
            int c=rg.generate(max,min);
            int A=0;

            while(true){
                System.out.println("Guess a number between "+min+" and "+max);
                int g=sc.nextInt();
                A++;

                if (g>c){
                    System.out.println("its Greater");
                }
                else if(g<c){
                    System.out.println("its Lower");
                }
                else{
                    System.out.println("Correct guess");
                    win++;
                    break;
                }
            }
            TA=TA+A;
            System.out.println("Attempt="+A);
            System.out.println("Wins"+win);
            double winerate=(double) win/TA*100;
            System.out.printf("your winerate is %.2f%%\n",winerate);
            System.out.println("Do you want to play again(y/n)");
            String PA=sc.next();
            if (!PA.equalsIgnoreCase("y")){
               sc.close();
               
               System.exit(0);
            }
            sc.nextLine();
        }
    }
}