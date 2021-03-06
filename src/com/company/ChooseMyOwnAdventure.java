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
                    System.out.println("\n" +
                            "You open the closet... And you find a furry, innocent rabbit. Nothing to worry about");
                }
            } else if (decision.equalsIgnoreCase("bathroom")) {
                System.out.println("\nIt is difficult to get in but you put effort strength to open the door.\n" +
                        "When you were finally inside the bathroom, the door closed and you got locked in.\n" +
                        "In the bathtub, you see a saw and a nail polish remover.\n" +
                        "You thinking you can use one of these items to open the bathroom's door. \n" +
                        "Would you choose the \"saw\" or the \"nail polish remover\" to find a way out of the bathroom?");
                System.out.print("> "); decision = keyboard.nextLine();
                if (decision.equalsIgnoreCase("saw")) {
                    System.out.println("\nThe saw turns out to be made out of plastic..." +
                            "As a result, it broke as you tried to create an opening on the door.\n" +
                            "Because you're trapped, you will not continue in the adventure.\n" +
                            "Come back to play next time!");

                } else if (decision.equalsIgnoreCase("nail polish remover")) {
                    System.out.println("\n You successfully leave the bathroom and continue onto the adventure!");
                }
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
                    System.out.println("\nCongrats. You don't starve. \nYour stomach hurts but you can still continue the quest.");
                }

            } else if (decision.equalsIgnoreCase("cabinet")) {
                System.out.println("You looked in a cabinet... And a serpent bites your right hand and leaves the cabinet.\n" +
                "The venom spreads through your body. Luckily, there are two medicines inside the same cabinet.\n" +
                        "The problem is that they are not labeled. So you must take a crucial decision.\n" +
                        "Would you take \"medicine one\" or \"medicine two\"?");
                System.out.print("> "); decision = keyboard.nextLine();

                if (decision.equalsIgnoreCase("medicine one")) {
                    System.out.println("\n This pill turned out to be a painkiller. " +
                            "You don't suffer as much but you will unfortunately die. :(");
                } else if (decision.equalsIgnoreCase("medicine two")) {
                    System.out.println("\n You survived with this pill. Great choice!");
                }
            }

        }

    }
}
