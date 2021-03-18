package clothingDef; 

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
    private List<Bag> bags;
    private List<Accessoire> accessories;
    private List<Jewelry> jewelry;


    /**empty closet */
    public Closet(){
        this.tops = Collections.emptyList();
        this.bottoms = Collections.emptyList();
        this.dresses = Collections.emptyList();
        this.shoes = Collections.emptyList();
        this.bags = Collections.emptyList();
        this.accessories = Collections.emptyList();
        this.jewelry = Collections.emptyList();

    }
    /**Already full closet */
    public Closet(List<Top> tops, List<Bottom> bottoms, List<Dress> dresses,
            List<Shoe> shoes,  List<Bag> bags, List<Accessoire> accessories, List<Jewelry> jewelry){
        this.tops = tops; 
        this.bottoms = bottoms; 
        this.dresses = dresses; 
        this.shoes = shoes; 
        this.accessories = accessories;
        this.jewelry = jewelry;
        this.bags = bags;
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
    public List<Accessoire> getAccessories(){
        return this.accessories;
    }
    public void setAccessories(List<Accessoire> accessories){
        this.accessories = accessories;
    }
    public List<Jewelry> getJewelry(){
        return this.jewelry; 
    }
    public void setJewelry(List<Jewelry> jewelry){
        this.jewelry = jewelry; 
    }
    public List<Bag> getBags() {
        return bags;
    }
    public void setBags(List<Bag> bags) {
        this.bags = bags;
    }

    public void addItem(Clothing clothing){

    }

    /**
     * shows the current status of your closet
     * @throws NullPointerException
     */
    public void showStatus() throws  NullPointerException{
        try {
            System.out.println("=================== Status of Closet ===================");
            System.out.println("\tTops:\t\t\t" + this.getTops().size());
            System.out.println("\tBottoms:\t\t" + this.getBottoms().size());
            System.out.println("\tDresses:\t\t" + this.getDresses().size());
            System.out.println("\tShoes:\t\t\t" + this.getShoes().size());
            System.out.println("\tBags:\t\t\t"+ this.getBags().size());
            System.out.println("\tAccessories:\t" + this.getAccessories().size());
            System.out.println("\tJewelry:\t\t" + this.getJewelry().size());
            System.out.println("========================================================");
        } catch (NullPointerException e) {
            System.out.println("\t\tStatus did not work");
            System.out.println("========================================================");
        }

    }

    public static void main (String [] args){
        Closet c1 = new Closet();
        c1.showStatus();

    }
}