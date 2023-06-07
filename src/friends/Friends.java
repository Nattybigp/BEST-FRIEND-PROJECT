/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package friends;

import java.util.Scanner;

/**
 *
 * @author Keith
 */
public class Friends {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Keith keith = new Keith("Keith");
        Nathanael nathanael = new Nathanael("Nathanael");
        boolean isNathanael = false;
        String response;

        while (true) {
            System.out.println(keith.getName() + ": Hello. Are you Nathanael?");
            response = scanner.nextLine().trim().toLowerCase();

            if (response.equals("yes")) {
                isNathanael = true;
                System.out.println("Nathanael: " + response);
                while (true) {
                    System.out.println(keith.getName() + ": Haha! Hello Nathanael :) Are you my best friend (Keith's best friend)");
                    response = scanner.nextLine().trim().toLowerCase();
                    System.out.println("Nathanael: " + response);

                    if (response.equals("yes")) {
                        nathanael.addFriendPoint();
                        keith.setIsBestFriendsWithNathanael(true);
                        if (keith.isBestFriendsWithNathanael) {
                            System.out.println("Confirmed! Keith is now best friends with Nathanael!");
                        }
                        System.out.println(keith.getName() + ": I'm glad we are friends. You are my best friend. I love you. I love you so much");
                        System.out.println("\nBest Friend Points: " + nathanael.getBestFriendPoints() + "\n\n");
                        break;
                    } else if (response.equals("sure")) {
                        System.out.println(keith.getName() + ": Oh so you're a 'sure' guy now huh!?? ANSWER YES OR NO DUDE!!!!!");
                    } else if (response.equals("no")) {
                        System.out.println(keith.getName() + ": Well what the fuck then!? I hate you!!!! GOODBYE!!!!");
                        break;
                    } else if (response.contains("fuck") || response.contains("shit") || response.contains("cunt") || response.contains("arse")
                            || response.contains("ass") || response.contains("bitch") || response.contains("whore")) {
                        System.out.println(keith.getName() + ": pwease dwon't swear at mwe natty p :(");
                    } else {
                        System.out.println(keith.getName() + ": Be normal and respond yes or no dude.");
                    }
                }

                if (response.equals("no")) {
                    break;
                }

            } else if (response.equals("no")) {
                System.out.println(keith.getName() + ": Then I do not want to speak with you.");
                break;
            } else {
                System.out.println(keith.getName() + ": Be normal and respond yes or no dude.");
            }

            if (isNathanael) {
                System.out.println("Nathanael: " + response);
            }
        }

        scanner.close();
    }
}
