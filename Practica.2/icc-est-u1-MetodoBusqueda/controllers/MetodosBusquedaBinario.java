package controllers;

import models.Person;

public class MetodosBusquedaBinario {

    private Person[] personas;
    private showConsole pantalla;

    public MetodosBusquedaBinario(Person[] personas) {
        this.personas = personas;
        this.pantalla = new showConsole();
        pantalla.showConsole("Metodos de Busqueda Binario");

    }

    private int findPersonByCode(int code) {
        int bajo = 0;
        int alto = personas.length - 1;

        while (alto >= bajo) {
            int central = (alto + bajo) / 2;

            if (personas[central].getCode() == code) {
                return central;
            }
            if (personas[central].getCode() > code) {
                alto = central - 1; // izquierda
            } else {
                bajo = central + 1; // derecha

            }

        }
        return central - 1;

    }

    public void showPersonByCode() {
        int codeToFinde = pantalla.inputCode();
        int indexPerson = findPersonByCode(codeToFinde);
        if (indexPerson == -1) {
            pantalla.showMessage("Persona con codigo" + codeToFinde + "encontrada");
            pantalla.showMessage(personas[indexPerson].toString());
        }

    }

    public void showPersonByName() {
        String nameToFind = pantalla.inputName();

    }

    public void findPersonByCode() {
        return -1;

    }

}
