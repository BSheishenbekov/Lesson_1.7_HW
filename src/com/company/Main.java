package com.company;

public class Main {

    public static void main(String[] args) {

        HavingSuperAbility[] superAbilities = {Magic, Medic, Warrior};
        for (int i = 0; i < superAbilities.length; i++) {
            superAbilities[i].applySuperAbility();

        }
    }
}
