package com.alvas;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {

		String rock = """
				    _______
				---'   ____)
				      (_____)
				      (_____)
				      (____)
				---.__(___)

				""";
		String paper = """
				    _______
				---'   ____)____
				          ______)
				          _______)
				         _______)
				---.__________)

				""";
		String scissors = """
				    _______
				---'   ____)____
				          ______)
				       __________)
				      (____)
				---.__(___)
				""";
		String[] image = { rock, paper, scissors };
		Scanner scanner = new Scanner(System.in);
		System.out.println("What do you choose? Type 0 for Rock, 1 for Paper or 2 for Scissors.");
		int user_choice = scanner.nextInt();

		if (user_choice >= 3 || user_choice < 0) {
			System.out.println("You typed an invalid number, you lose!");
		} else {
			System.out.println(image[user_choice]);
			// Getting input from the computer
			Random random = new Random();
			int computer_choice = random.nextInt(0, 2);
			System.out.println("Computer chose:");
			System.out.println(image[computer_choice]);

			if (user_choice == 0 && computer_choice == 2) {
				System.out.println("You win!");
			} else if (computer_choice == 0 && user_choice == 2) {
				System.out.println("You lose");
			} else if (computer_choice > user_choice) {
				System.out.println("You lose");
			} else if (user_choice > computer_choice) {
				System.out.println("You win!");
			} else if (computer_choice == user_choice) {
				System.out.println("It's a draw");
			}

		}
	}
}
