package Lojas;

import Animais.Animal;
import Animais.Cachorro;

public class PetShop {

    public void darbanho(Animal animal) {
        animal.setEstadoDeEspirito("Limpo");
    }

    public void tosar(Cachorro animal) {
        animal.setEstadoDeEspirito("tosado");
    }

    public void deixarNoHotel(Animal animal) {
        animal.setEstadoDeEspirito("Descansando");
    }

}
