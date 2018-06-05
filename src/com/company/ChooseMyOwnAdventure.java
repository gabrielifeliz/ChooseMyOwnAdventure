package com.company;

import java.util.Scanner;

public class ChooseMyOwnAdventure {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String decision;

        System.out.println("WELCOME TO THE BEST TINY ADVENTURE!\n");

        System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the\n" +
                "\"kitchen\"?");
        System.out.print("> "); decision = keyboard.nextLine();

        if (decision.equalsIgnoreCase("upstairs")) {

            System.out.println("\nUpstairs you see a hallway.  At the end of the hallway is the master\n" +
                    "\"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like\n" +
                    "to go?");
            System.out.print("> "); decision = keyboard.nextLine();

            if (decision.equalsIgnoreCase("bedroom")) {

                System.out.println("\nYou are in a plush bedroom, with expensive-looking hardwood furniture.  The\n" +
                        "bed is unmade.  In the back of the room, the closet door is ajar.  Would you\n" +
                        "like to open the door? (\"yes\" or \"no\")");
                System.out.print("> "); decision = keyboard.nextLine();

                if (decision.equalsIgnoreCase("no")) {
                    System.out.println("\n" +
                            "Well, then I guess you'll never know what was in there.  Thanks for playing,\n" +
                            "I'm tired of making nested if statements.");

                } else if (decision.equalsIgnoreCase("yes")) {

                }


            } else if (decision.equalsIgnoreCase("bathroom")) {

            }

        } else if (decision.equalsIgnoreCase("kitchen")) {

            System.out.println("\nThere is a long countertop with dirty dishes everywhere.  Off to one side\n" +
                    "there is, as you'd expect, a refrigerator. You may open the \"refrigerator\"\n" +
                    "or look in a \"cabinet\".");
            System.out.print("> "); decision = keyboard.nextLine();

            if (decision.equalsIgnoreCase("refrigerator")) {

                System.out.print("\nInside the refrigerator you see food and stuff.  It looks pretty nasty.\n" +
                        "Would you like to eat some of the food? (\"yes\" or \"no\")\n");
                System.out.print("> "); decision = keyboard.nextLine();

                if (decision.equalsIgnoreCase("no")) {
                    System.out.println("\nYou die of starvation... eventually.");

                } else if (decision.equalsIgnoreCase("yes")) {
                    System.out.println("\nYou die of starvation... eventually.");
                }

            } else if (decision.equalsIgnoreCase("cabinet")) {

            }

        }

    }
}
