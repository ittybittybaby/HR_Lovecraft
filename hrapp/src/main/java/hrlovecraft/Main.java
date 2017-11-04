package hrlovecraft;

import hrlovecraft.menus.*;

public class Main {


    public static void main(String[] args) {

        MenuPrompts.getMenu().printWelcomeMessage();

        while(true){
                MainMenu.getInstance().display();
        }
    }
}
