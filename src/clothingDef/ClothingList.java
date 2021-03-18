package clothingDef;

import java.util.Scanner;

public class ClothingList {
    private Clothing start;
    private int length;

    public ClothingList(){
        start = new Clothing();
        this.length = 0;
    }

    // Methods I could use for the list:

    /**
     * Adds a clothing piece to the list
     * @param c is the clothing item
     */
    public void add(Clothing c){
        this.getStart().setNext(c);
        c.setPrev(this.getStart());
        this.length ++;

    }

    /**
     * Removes an element with the given name from the list
     * @param name identifier of the item to be removed
     * @throws NullPointerException could throw that exception idk lol
     */
    public void remove(String name) throws NullPointerException{
        try{
                if (start.getNext() == null){
                    System.out.println("No "+ name+ " found in the list!" );
                }
                else if (start.getName().equals(name)){
                    Clothing tmp1 = start.getNext();
                    Clothing tmp2 = start.getPrev();
                    start.getPrev().setNext(tmp1);
                    start.getNext().setPrev(tmp2);
                    this.length --;
                } else {
                    start = start.getNext();
                    this.remove(name);
                }
        } catch (NullPointerException e){
            System.out.println("Sorry didnt work!");
        }
    }

    /**
     * Sorts the list after color starting with black, brown, blue, violet, pink, red, orange, yellow, white
     */
    public void sortColor (){
        // TODO: sort list after color
        System.out.println("Your list is sorted!");
    }

    /**
     * Deletes all elements in a list so be careful to use this lol
     */
    public void deleteAll(){
        String allowance = "";
        do {
            System.out.println("Are you sure you want to delete all your clothes? (yes/no)");
            Scanner scan = new Scanner(System.in);
            allowance = scan.nextLine();
        } while (!allowance.equals("yes")&& !allowance.equals("no"));
        if (allowance.equals("yes")){
            this.start.setNext(null);
            this.length = 0;
            // TODO: delete all elements in the list
        } else {
            System.out.println("Your List will not be deleted!");
        }


    }

    public void printAllNames(){
        System.out.println("This list contains following items: ");
        while(start.getNext() != null){
            System.out.println(start.getName());
        }
    }


    public Clothing getStart() {
        return start;
    }
    public void setStart(Clothing start) {
        this.start = start;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
