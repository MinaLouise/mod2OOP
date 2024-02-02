package com.company;

import java.util.List;
import java.util.*;

class Membership{
    Scanner input = new Scanner(System.in);
//    String memberName;
    List<String> donation = new ArrayList<>();
    String book;
    String donator;
    String membership;
    String isMember;

/*    public String membership(String[] args){
          this.memberName = memberName;
          return memberName;
      }*/

    public void donate(List<String> shelves){
        System.out.print("Title of book being donated: ");
        book = input.nextLine();
        System.out.print("Who is donating: ");
        donator = input.nextLine();
        System.out.print("Are you a member(Y/n): ");
        membership = input.nextLine();
        if (Objects.equals(membership, "Y")){
            isMember = " +";
        }else if(Objects.equals(membership, "n")) {
            isMember = " -";
        }
        donation.add(book);
        String donationInfo = book + " :donated by "+donator+isMember;
        shelves.add(donationInfo);
    }
}

//This allows you to modify to a list
public class Library {
    //static indicates a particular member as a part of a type instead of an instance.
    static Scanner input = new Scanner(System.in);
    //Like an empty '[<List>]' in Python
    static List<String> shelves = new ArrayList<>();
    static String book;
    static Membership member = new Membership();

    //Function that will be used in the main to add to the list created
    private static void update(){
        System.out.println("Please put a book on the shelves by typing the book title.");
        System.out.println("If you would like to donate type 'donate'.");
        book = input.nextLine();
        if (!Objects.equals(book, "donate")) {
            shelves.add(book);
        }
    }

    private static void displayBooks(){
        System.out.println("Books in the library: " + shelves);
    }

    //like running the main function in python
    public static void main(String[] args){
        while (true){
            //takes book input
            update();
            if(Objects.equals(book, "donate")){
                member.donate(shelves);
            }
            else if (Objects.equals(book, "quit")){
                break;
            }
            // Prints out raw list
            displayBooks();
        }


    }
}
