package shelter;


import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;


public class VirtualPetShelterTest {


VirtualPetShelter shelterUnderTest;
VirtualPet pet1;
VirtualPet pet2;


    @Before
    public void setUp() {
    shelterUnderTest = new VirtualPetShelter();
    pet1 = new VirtualPet("Fluffy", "Long hair poodle", 56,32,12);
    pet2 = new VirtualPet("Dover","Big Rottweiler",23,45,22);
}

    @Test
    public void shouldBeAbleToAddPetToShelter() {
    shelterUnderTest.addPet(pet1);
    VirtualPet retrievePet = shelterUnderTest.findPet(pet1.getPetName());
    assertThat(retrievePet).isEqualTo(pet1);

}

    @Test
    public void shouldBeAbleToRetrieveSpecificPet() {
        shelterUnderTest.addPet(pet2);
        VirtualPet retrievePet = shelterUnderTest.findPet(pet2.getPetName());
        assertThat(retrievePet).isEqualTo(pet2);

    }


    @Test
    public void shouldBeAbleToRetrieveAllShelterPets() {
        shelterUnderTest.addPet(pet1);
        shelterUnderTest.addPet(pet2);
        Collection<VirtualPet> shelterPets = shelterUnderTest.getAllPets();
        assertThat(shelterPets).contains(pet2, pet1);

    }
        @Test
        public void shouldBeAbleToAdoptAPet() {
            shelterUnderTest.addPet(pet1);
            shelterUnderTest.removePet(pet1);
            VirtualPet retrievedAccount = shelterUnderTest.findPet(pet1.getPetName());
            assertThat(retrievedAccount).isNull();
        }

        @Test
        public void shouldBeAbleToFeedAPetInShelter() {
            shelterUnderTest.addPet(pet1);
            shelterUnderTest.addPet(pet2);
            shelterUnderTest.feedPet(pet1.getPetName());
            shelterUnderTest.feedPet(pet2.getPetName());
            assertThat(pet1.getHungerBalance()).isEqualTo(60);
            assertThat(pet2.getHungerBalance()).isEqualTo(27);
        }
        @Test
        public void shouldBeAbleToWaterAPetInShelter() {
            shelterUnderTest.addPet(pet1);
            shelterUnderTest.addPet(pet2);
            shelterUnderTest.waterPet(pet1.getPetName());
            shelterUnderTest.waterPet(pet2.getPetName());
            assertThat(pet1.getThirstBalance()).isEqualTo(36);
            assertThat(pet2.getThirstBalance()).isEqualTo(49);
    }
        @Test
        public void shouldBeAbleToPlayWithAPetInShelter() {
            shelterUnderTest.addPet(pet1);
            shelterUnderTest.addPet(pet2);
            shelterUnderTest.playPet(pet1.getPetName());
            shelterUnderTest.playPet(pet2.getPetName());
            assertThat(pet1.getBoredomBalance()).isEqualTo(8);
            assertThat(pet2.getBoredomBalance()).isEqualTo(18);
    }

        @Test
        public void shouldSeeChangesToBalancesUsingTick() {
        shelterUnderTest.addPet(pet1);
        shelterUnderTest.addPet(pet2);
        shelterUnderTest.feedPet(pet1.getPetName());
        shelterUnderTest.feedPet(pet2.getPetName());
        assertThat(pet1.getHungerBalance()).isEqualTo(60);
        assertThat(pet2.getHungerBalance()).isEqualTo(27);
        assertThat(pet1.getThirstBalance()).isEqualTo(31);
    }






    }

