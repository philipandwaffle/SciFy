import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class Menu {
    private String title;
    private String[] options;
    private int length;

    public Menu(String title, String[] options){
        this.title = title;
        this.options = options;
        this.length = title.length();
        for (String option: options) {
            int optLength = option.length();
            if(this.length < optLength + 4){
                this.length = optLength + 4;
            }
        }
    }

    public void display(){
        System.out.println(new String(new char[this.length]).replace("\0","-"));
        System.out.println(title);
        System.out.println();
        for (int i = 0; i < options.length; i++) {
            System.out.println(i + ".) " + options[i]);
        }
        System.out.println(new String(new char[this.length]).replace("\0","-"));
    }

    public int getChoice(){
        boolean invalid = true;
        int choice = -1;
        do {
            System.out.println("Please select a choice");
            Scanner in = new Scanner(System.in);
            String line = in.next();
            if(line.chars().allMatch(Character::isDigit)){
                choice = Integer.valueOf(line);
                if (choice > 0 && choice <= options.length){
                    invalid = false;
                    return choice;
                }
            }
            clear();
            System.out.println("Your choice was invalid");
            display();
        }while (invalid);
        return choice;
    }

    private void clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
