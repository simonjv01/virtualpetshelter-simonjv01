package shelter;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;



public class VirtualPetTest {


    VirtualPetShelter petTest;
    VirtualPet pet1;
    VirtualPet pet2;


    @Before
    public void setUp() {
        petTest = new VirtualPetShelter();
        pet1 = new VirtualPet("Fluffy", "Long hair poodle", 56,32,12);
        pet2 = new VirtualPet("Dover","Big Rottweiler",23,45,22);
    }

    @Test
    public void shouldBeAbleToGetPetName() {
        petTest.addPet(pet1);
        Assertions.assertThat(pet1.getPetName()).isEqualTo("Fluffy");

    }
    @Test
    public void shouldBeAbleToGetPetDescription() {
        petTest.addPet(pet1);
        Assertions.assertThat(pet1.getPetDescription()).isEqualTo("Long hair poodle");

    }
    @Test
    public void shouldBeAbleToGetHungerBalance() {
        petTest.addPet(pet1);
        Assertions.assertThat(pet1.getHungerBalance()).isEqualTo(56);

    }

    @Test
    public void shouldBeAbleToGetThirstBalance() {
        petTest.addPet(pet1);
        Assertions.assertThat(pet1.getThirstBalance()).isEqualTo(32);

    }

    @Test
    public void shouldBeAbleToGetBoredomBalance() {
        petTest.addPet(pet1);
        Assertions.assertThat(pet1.getBoredomBalance()).isEqualTo(12);

    }

}