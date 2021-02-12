package com.company;

public abstract class Hero implements HavingSuperAbility {
    private int heroesHealth;
    private int  heroesDamage;
    private String superpower;

    public int getHeroesHealth() {
        return heroesHealth;
    }

    public void setHeroesHealth(int heroesHealth) {
        this.heroesHealth = heroesHealth;
    }

    public int getHeroesDamage() {
        return heroesDamage;
    }

    public void setHeroesDamage(int heroesDamage) {
        this.heroesDamage = heroesDamage;
    }

    public String getSuperpower() {
        return superpower;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }


}
