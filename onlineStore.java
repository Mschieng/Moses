import java.util.Scanner;

public class onlineStore{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        //set the minimum age for purchasing the item
        int minimumAge = 18;
        System.out.println("welcome to the online store");
        System.out.print("Enter your age?");
        //read customer's age input
        int customerAge = scanner.nextInt();
        System.out.print("Enter the age rating of the item");
        //read item's age rating input
        int itemAgeRating = scanner.nextInt(); 
        //check if the customer meets the age requirement for the item.
        
        if (customerAge>=minimumAge && customerAge>=itemAgeRating){
            System.out.println("congragulations! You can purchase the item");
        }else{
            System.out.println("Sorry, you are not eligible to purchase this item due to age restriction");

        scanner.close();        }

        }
    }


