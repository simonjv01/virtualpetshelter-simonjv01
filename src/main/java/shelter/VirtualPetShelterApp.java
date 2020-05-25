package shelter;

import java.util.Scanner;



public class VirtualPetShelterApp {


    public static void main(String[] args) {

        VirtualPetShelter shelterPets = new VirtualPetShelter();


        Scanner input = new Scanner(System.in);
        VirtualPet joey = new VirtualPet("Joey", "A friendly St. Bernard", 83, 34, 23);
        VirtualPet johnny = new VirtualPet("Johnny", "A bit nervous, but kind", 69, 49, 2);
        VirtualPet deedee = new VirtualPet("Dee Dee", "Probably didn't start with many legs", 39, 18, 88);
        VirtualPet tommy = new VirtualPet("Tommy", "Has one eye", 59, 19, 37);

        shelterPets.addPet(joey);
        shelterPets.addPet(johnny);
        shelterPets.addPet(deedee);
        shelterPets.addPet(tommy);


        System.out.println("Thank you for visiting Big Al's Virtual Pet Shelter and Delicatessen!");
        System.out.println("This is the status of your pets:");
        System.out.println();
        System.out.println("Name\t |Hunger\t |Thirst\t |Boredom");
        System.out.println("---------|-----------|-----------|-------");
        joey.displayBalances();
        System.out.println();
        johnny.displayBalances();
        System.out.println();
        deedee.displayBalances();
        System.out.println();
        tommy.displayBalances();
        System.out.println();
        System.out.println();


        do {
            System.out.println("What would you like to do next?");
            System.out.println();
            System.out.println("1. Feed a pet");
            System.out.println("2. Water a pet");
            System.out.println("3. Play with a pet");
            System.out.println("4. Adopt a pet");
            System.out.println("5. Admit a pet");
            System.out.println("6. quit");
            String option = input.nextLine();


            if (option.equals("1")) {
                System.out.println("Which pet do you want to feed? Please choose one:");
                System.out.println(shelterPets.getAllPets());
                String feedPet = input.nextLine();
                System.out.println("You fed " + feedPet);
                shelterPets.feedPet(feedPet);
            } else if (option.equals("2")) {
                System.out.println("Which pet do you want to water? Please choose one:");
                System.out.println(shelterPets.getAllPets());
                String waterPet = input.nextLine();
                System.out.println("You watered " + waterPet);
                shelterPets.waterPet(waterPet);
            } else if (option.equals("3")) {
                System.out.println("Which pet do you want to play with? Please choose one:");
                System.out.println(shelterPets.getAllPets());
                String playWithPet = input.nextLine();
                System.out.println("You played with " + playWithPet);
                shelterPets.playPet(playWithPet);
            } else if (option.equals("4")) {
                System.out.println("Which pet would you like to adopt? Please choose one:");
                System.out.println(shelterPets.getAllPets());
                String adoptAPet = input.nextLine();
                shelterPets.findPet(adoptAPet);
                System.out.println("You adopted " + adoptAPet);
                shelterPets.removePet(shelterPets.findPet(adoptAPet));
            } else if (option.equals("5")) {
                System.out.println("What is the name of the pet you want to admit?");
                String admitAPet = input.nextLine();
                VirtualPet admitPet1 = new VirtualPet(admitAPet,"New pet",25,25,25);
                shelterPets.addPet(admitPet1);
            } else {
                System.out.println("Thank you for visiting Virtual Pet Shelter, goodbye!");
                System.exit(0);

            }
            
        } while (true);
    }
}






