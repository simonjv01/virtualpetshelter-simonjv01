package shelter;

public class VirtualPet {

    private  int petHunger;
    private  int petThirst;
    private  int petBoredom;
    private    String petName;
    private    String petDescription;

    public VirtualPet (String localPetName, String localPetDescription, int localHungerNum, int localThirstNum, int localBoredomNum) {
        this.petName = localPetName;
        this.petDescription = localPetDescription;
        this.petHunger = localHungerNum;
        this.petThirst = localThirstNum;
        this.petBoredom = localBoredomNum;
    }

    public String getPetName() {
        return petName;
    }


    public String getPetDescription() {return petDescription;
    }

    public int getHungerBalance() {return petHunger;
    }

    public int getThirstBalance() {return petThirst;
    }

    public int getBoredomBalance() { return petBoredom;
    }

    public void feedPet(int hungerAmt) {

        petHunger += hungerAmt;
    }


    public void waterPet(int waterAmt) {

        petThirst += waterAmt;
    }

    public void playPet(int playAmt) {

        petBoredom -= playAmt;
    }

    public void tick(int addTickAmt) {

        petHunger -= addTickAmt;
        petThirst -= addTickAmt;
        petBoredom += addTickAmt;

    }

    public void displayBalances() {

        System.out.print(getPetName() + "\t |");
        System.out.print(getHungerBalance() + "\t\t |");
        System.out.print(getThirstBalance() + "\t\t |");
        System.out.print(getBoredomBalance() + "\t\t");
    }

    public String toString() {

         return petName + "  \t" +petDescription + "\t" + "Hunger Bal: " + petHunger + "\t" + "Thirst Bal: " + petThirst +
                 "\t" + "Boredom Bal: " + petBoredom + "\n";

    }


}






