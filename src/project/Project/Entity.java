/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package project.Project;

import java.util.ArrayList;

public abstract class Entity {
    private float health;
    private float healthCap;
    private float defense;
    private float strength;
    private float mana;
    private float manaCap;
    private String name;
    private int xCoordinate;
    private int yCoordinate;
    private static ArrayList<Entity> entityList = new ArrayList<>();
    
    
    public Entity(float HP, float DEF, float STR, float MANA, String Name) {
        health = HP;
        healthCap = HP;
        defense = DEF;
        strength = STR;
        mana = MANA;
        manaCap = MANA;
        name = Name;
        entityList.add(this);
    }
    

    
    public void attack(){}
    public void move(int newX, int newY){
        xCoordinate = newX;
        yCoordinate = newY;
    }
    public void defeat(){} 
//
    public float getHealth(){
        return health;
    }
    
    public void setHealth(float newHealth){
        health = newHealth;
    }
//
    public float getHealthCap(){
        return healthCap;
    }
    
    public void setHealthCap(float newHealthCap){
        healthCap = newHealthCap;
    }
//  
    public float getDefense(){
        return defense;
    }
    
    public void setDefense(float newDefense){
        defense = newDefense;
    }
    
//  
    public float getStrength(){
        return strength;
    }
    
    public void setStrength(float newStrength){
        strength = newStrength;
    }
//  
    public float getMana(){
        return mana;
    }
    
    public void setMana(float newMana){
        mana = newMana;
    }
//  
    public float getManaCap(){
        return manaCap;
    }
    
    public void setManaCap(float newManaCap){
        manaCap = newManaCap;
    }
//
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        name = newName;
    }
//
    
    public int getXCoordinate(){
        return xCoordinate;
    }
    
    public int getYCoordinate(){
        return yCoordinate;
    }
}
