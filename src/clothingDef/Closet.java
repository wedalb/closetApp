

import java.util.*;
/**
 * Closet is a List of Tops and Bottoms 
 * 
 */
public class Closet {
    private List<Top> tops; 
    private List<Bottom> bottoms; 
    private List<Dress> dresses; 
    private List<Shoe> shoes; 
    private List<Accessoire> accessoires; 
    private List<Jewelry> jewelry; 

    /**empty closet */
    public Closet(){}
    /**Already full closet */
    public Closet(List<Top> tops, List<Bottom> bottoms, List<Dress> dresses,
            List<Shoe> shoes, List<Accessoire> accessoires, List<Jewelry> jewelry){
        this.tops = tops; 
        this.bottoms = bottoms; 
        this.dresses = dresses; 
        this.shoes = shoes; 
        this.accessoires = accessoires; 
        this.jewelry = jewelry; 
    }


    // Getter and Setter for Closet Attributes
    public List<Top> getTops(){
        return this.tops; 
    }
    public void setTops(List<Top> tops){
        this.tops = tops; 
    }
    public List<Bottom> getBottoms(){
        return this.bottoms; 
    }
    public void setBottoms(List<Bottom> bottoms){
        this.bottoms = bottoms; 
    }
    public List<Dress> getDresses(){
        return this.dresses; 
    }
    public void setDresses(List<Dress> dresses){
        this.dresses = dresses; 
    }
    public List<Shoe> getShoes(){
        return this.shoes; 
    }
    public void setShoes(List<Shoe> shoes){
        this.shoes = shoes; 
    }
    public List<Accessoire> getAccessoires(){
        return this.accessoires; 
    }
    public void setAccessoires(List<Accessoire> accessoires){
        this.accessoires = accessoires; 
    }
    public List<Jewelry> getJewelry(){
        return this.jewelry; 
    }
    public void setJewelry(List<Jewelry> jewelry){
        this.jewelry = jewelry; 
    }

    public void statusCloset(){
        System.out.println("===================Status of Closet================");
        System.out.println("\tTops: " + tops.size());
        System.out.println("\tBottoms: " + bottoms.size());
        System.out.println("\tDresses: " + dresses.size());
        System.out.println("\tShoes: " + shoes.size());
        System.out.println("\tAccessoires: " + accessoires.size());
        System.out.println("\tJewelry: " + jewelry.size());
    }

    public static void main (String [] args){

    }
}