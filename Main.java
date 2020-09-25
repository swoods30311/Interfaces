package com.company;

public class Main {

    public static void main(String[] args) {
        // Create Objects
        ShopKeeper shopKeeper = new ShopKeeper("Larry");
        TeaCup teacup = new TeaCup();
        String treehouse = "Treehouse";
        Person p1 = new Person("Spanky");

        // Loop through Objects
        Object[] objects = {shopKeeper, teacup, treehouse, p1};

        for (Object object : objects) {
            if (object instanceof Chattable) {
                String response = ((Chattable) object).chat();
                System.out.println(response);
            }
        }
        
        // Loop through Chattables
        Chattable[] chattables = {shopKeeper, teacup};

        for (Chattable chattable : chattables) {
            String response = chattable.chat();
            System.out.println(response);
        }
    }
}
