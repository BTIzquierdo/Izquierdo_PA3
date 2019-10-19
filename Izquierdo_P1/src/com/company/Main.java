package com.company;
import java.security.SecureRandom;
import java.util.Scanner;


public class Main {
    public static void responses(int passing)
    {
        SecureRandom rando = new SecureRandom();

        int val1 = rando.nextInt(3);
        String[] positiveMessages = new String[4];
        String[] negativeMessages = new String[4];

        positiveMessages[0] = "Very good!";
        positiveMessages[1] = "Excellent!";
        positiveMessages[2] = "Nice work!";
        positiveMessages[3] = "Keep up the good work!";

        negativeMessages[0] = "No. Please try again.";
        negativeMessages[1] = "Wrong. Try once more.";
        negativeMessages[2] = "Don’t give up!";
        negativeMessages[3] = "No. Keep trying.";

        switch(passing)
        {
            case 1:
                System.out.println(positiveMessages[val1]);
                break;
            case 0:
                System.out.println(negativeMessages[val1]);
                break;
            default:
                System.out.println(negativeMessages[val1]);
                break;
        };
    }

    public static int question(int difficulty, int arithmatic)
    {
        int answer;
        SecureRandom rand = new SecureRandom();

        if (arithmatic == 5)
        {
            arithmatic = rand.nextInt(3) + 1;
        }

        int[] level = new int[4];

        level[0] = 8;
        level[1] = 98;
        level[2] = 998;
        level[3] = 9998;

        int val1 = rand.nextInt(level[difficulty - 1]) + 1;
        int val2 = rand.nextInt(level[difficulty - 1]) + 1;

        switch (arithmatic)
        {
            case 1:
                answer = val1 + val2;
                System.out.println("How much is " + val1 +" plus " + val2 + "?");
                break;
            case 2:
                answer = val1 - val2;
                System.out.println("How much is " + val1 +" minus " + val2 + "?");
                break;
            case 3:
                answer = val1 * val2;
                System.out.println("How much is " + val1 +" times " + val2 + "?");
                break;
            case 4:
                answer = val1 / val2;
                System.out.println("How much is " + val1 +" divided by " + val2 + "?");
                break;
            default:
                answer = val1 + val2;
                System.out.println("How much is " + val1 +" plus " + val2 + "?");
                break;
        }
        return answer;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        int userAnswer = 0;
        int correct = 0;
        int active = 1;

        System.out.println("What types of problems do you want? (1-5).");
        int arithmatic = scanner.nextInt();

        System.out.println("What difficulty would you like? (1-4).");
        int difficulty = scanner.nextInt() ;

        int trueAnswer = question(difficulty, arithmatic);
        while (active == 1)
        {
            for(int i = 0; i < 10; i++)
            {
                userAnswer = scanner.nextInt();
                if(userAnswer != trueAnswer)
                {
                    responses(0);
                    if (i < 9)
                    {
                        trueAnswer = question(difficulty, arithmatic);
                    }
                    userAnswer = 0;
                }
                if (userAnswer == trueAnswer)
                {
                    responses(1);
                    correct++;
                    if (i < 9)
                    {
                        trueAnswer = question(difficulty, arithmatic);
                    }
                    userAnswer = 0;
                }
            }
            if(correct > 7)
            {
                System.out.println("Congratulations, you are ready to go to the next level!\n");
                correct = 0;

                System.out.println("What types of problems do you want? (1-5).");
                arithmatic = scanner.nextInt();

                System.out.println("What difficulty would you like? (1-4).");
                difficulty = scanner.nextInt();

                trueAnswer = question(difficulty, arithmatic);
            }
            else
            {
                System.out.println("Please ask your teacher for extra help.\n");
                correct = 0;

                System.out.println("What types of problems do you want? (1-5).");
                arithmatic = scanner.nextInt();

                System.out.println("What difficulty would you like? (1-4).");
                difficulty = scanner.nextInt();

                trueAnswer = question(difficulty, arithmatic);
            }
        }
    }
}
