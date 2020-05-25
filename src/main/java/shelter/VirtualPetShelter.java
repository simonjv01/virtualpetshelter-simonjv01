package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String , VirtualPet> shelterPets = new HashMap<>();




    public void addPet(VirtualPet pet) {
        shelterPets.put(pet.getPetName(), pet);
    }


    public VirtualPet findPet(String shelterPetName) {
        return shelterPets.get(shelterPetName);
    }

    public Collection<VirtualPet> getAllPets() {
        return shelterPets.values();
    }

    public void removePet(VirtualPet pet) {
        shelterPets.remove(pet.getPetName());
    }


    public void feedPet(String petName) {
        int feedAmt = 5;
        VirtualPet subtractFeedBalance = findPet(petName);
        subtractFeedBalance.feedPet(feedAmt);
        tick(petName);
    }


    public void waterPet(String petName) {
        int waterAmt = 5;
        VirtualPet subtractThirstBalance = findPet(petName);
        subtractThirstBalance.waterPet(waterAmt);
        tick(petName);
    }

    public void playPet(String petName) {
        int playAmt = 5;
        VirtualPet subtractBoredomBalance = findPet(petName);
        subtractBoredomBalance.playPet(playAmt);
        tick(petName);
    }

    private void tick(String petName) {
        int addTickAmt = 1;
        VirtualPet addToPetBalances = findPet(petName);
        addToPetBalances.tick(addTickAmt);
    }


}
