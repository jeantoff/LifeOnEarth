package com.trolltech.games.model;

import java.util.Date;
import java.util.List;

/**
 * Created by jbouvard on 13/04/2017.
 */
public class LivingEntity {

    private String Name;
    private Date dateOfBirth;
    private boolean isAlive;
    private List<LivingEntityGene> genome;

    private WorldCoordinates position;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public WorldCoordinates getPosition() {
        return position;
    }

    public void setPosition(WorldCoordinates position) {
        this.position = position;
    }

    public List<LivingEntityGene> getGenome() {
        return genome;
    }

    public void setGenome(List<LivingEntityGene> genome) {
        this.genome = genome;
    }
}
