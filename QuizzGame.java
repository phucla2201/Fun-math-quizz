import java.util.*;
public class QuizzGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int score,ans1,ans2,ans3,ans4,ans5,ans6,ans7,ans8,ans9,ans10;
		score=0;
		//question 1: What is the 
		System.out.println("Hello, let's play a game. If you win 15 scores, you win. If you don't, don't be mad and try again.");
		System.out.println("1st question: What will you get from half of 8?");
		System.out.println("1.3     2.4     3.2     4.0");
		ans1=in.nextInt();
		if (ans1==2){
			score++;
			System.out.println("Good job, you're right.");
			System.out.println("Your score is: "+score);
		}else {
			score = score-4;
			System.out.println("Wrong, you're bad.");
			System.out.println("Your score is: "+score);
		}
		System.out.println("Question 2: What is 65x100+10x658/2 ?");
		System.out.println("1. 25486     2. 15876     3. 9890     4. 9790");
		ans2=in.nextInt();
		if (ans2==4){
			score++;
			System.out.println("Good job, you're right.");
			System.out.println("Your score is: "+score);
		}else {
			score = score-4;
			System.out.println("Wrong, you're bad.");
			System.out.println("Your score is: "+score);
		}
		System.out.println("Question 3: What 15672299+15875335-15672299-15875335+1? ");
		System.out.println("1. 21873659226     2.1      3. 8564752382    4. 0");
		ans3=in.nextInt();
		if (ans3==2){
			score++;
			System.out.println("Good job, you're right.");
			System.out.println("Your score is: "+score);
		}else {
			score = score-4;
			System.out.println("Wrong, you're bad.");
			System.out.println("Your score is: "+score);
		}
		System.out.println("Question 4: What is the root of this equation y=3x+1");
		System.out.println("1. -1/3    2. 2     3. 3     4. 4/3");
		ans4=in.nextInt();
		if (ans4==1){
			score++;
			System.out.println("Good job, you're right.");
			System.out.println("Your score is: "+score);
		}else {
			score = score-4;
			System.out.println("Wrong, you're bad.");
			System.out.println("Your score is: "+score);
		}
		System.out.println("Question 5: What is the result of 0^2 + 1^0 - 1^1?");
		System.out.println("1. 0     2. 5     3. 4");
		ans5=in.nextInt();
		if (ans5==1){
			score++;
			System.out.println("Good job, you're right.");
			System.out.println("Your score is: "+score);
		}else {
			score = score-4;
			System.out.println("Wrong, you're bad.");
			System.out.println("Your score is: "+score);
		}
		System.out.println("Question 6: What how many roots does 3x^2+10x-2=0");
		System.out.println(" 1. 0      2. 1      3. 2 ");
		ans6=in.nextInt();
		if (ans6==3){
			score++;
			System.out.println("Good job, you're right.");
			System.out.println("Your score is: "+score);
		}else {
			score = score-4;
			System.out.println("Wrong, you're bad.");
			System.out.println("Your score is: "+score);
		}
		System.out.println("Question 7: How many possible answer for equation 0=x^4+8x^2+4?");
		System.out.println("1. 1     2. 2    3. 0");
		ans7=in.nextInt();
		if (ans7==3){
			score++;
			System.out.println("Good job, you're right.");
			System.out.println("Your score is: "+score);
		}else {
			score = score-4;
			System.out.println("Wrong, you're bad.");
			System.out.println("Your score is: "+score);
		}
		System.out.println("Question 8: What is the zero of the parabola y=3(x+2)^2-12?");
		System.out.println("1.(4,0)  2. (0,0)   3. (4,0) and (0,0)");
		ans8=in.nextInt();
		if (ans8==3){
			score++;
			System.out.println("Good job, you're right.");
			System.out.println("Your score is: "+score);
		}else {
			score = score-4;
			System.out.println("Wrong, you're bad.");
			System.out.println("Your score is: "+score);
		}
		System.out.println("Question 9: What the result of half divided by half?");
		System.out.println("1.  1      2. 1/4    3. 2");
		ans9=in.nextInt();
		if (ans9==1){
			score++;
			System.out.println("Good job, you're right.");
			System.out.println("Your score is: "+score);
		}else {
			score = score-4;
			System.out.println("Wrong, you're bad.");
			System.out.println("Your score is: "+score);
		}
		System.out.println("Question 10: What is the result of expression (1+2+3+4+5+....+97+98+99+100?");
		System.out.println("1. 5050    2. 4850    3.3560   4. I don't know");
		ans10=in.nextInt();
		if (ans10==1){
			score++;
			System.out.println("Good job, you're right.");
			System.out.println("Your score is: "+score);
		}else {
			score = score-4;
			System.out.println("Wrong, you're bad.");
			System.out.println("Your score is: "+score);
			in.close();
		}
		System.out.println("Thank you for playing!!!");
	}
}
