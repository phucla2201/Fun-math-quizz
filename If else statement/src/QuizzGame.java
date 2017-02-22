import java.util.*;
public class QuizzGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int score,ans1,ans2,ans3,ans4,ans5,ans6,ans7,ans8,ans9k,ans10,ans11,ans12,ans13,ans14,ans15;
		score=0;
		//question 1: What is the 
		System.out.println("Hello, let's play a game. If you win 15 scores, you win. If you don't, don't be mad and try again.");
		System.out.println("1st question: What will you get from half of 8?");
		System.out.println("1.3     2.4     3.2     4.0");
		ans1=in.nextInt();
		if (ans1==1){
			score++;
			System.out.println("Good job, you're right.");
			System.out.println("Your score is: "+score);
		}else {
			score--;
			System.out.println("Wrong, you're bad.");
			System.out.println("Your score is: "+score);
		}
	}

}
