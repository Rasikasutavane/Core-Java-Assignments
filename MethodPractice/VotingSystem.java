package practice;
import java.util.Scanner;

public class VotingSystem {

    public String checkVote(int age) {

        if(age >= 18 && age <= 120) {
            return "You are eligible for voting";
        } 
        else {
            return "You are not eligible for voting";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        VotingSystem v = new VotingSystem();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

       

        System.out.println(" Result :"+v.checkVote(age));
        sc.close();
    }
}