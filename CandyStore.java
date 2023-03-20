import java.util.Scanner;

public class CandyStore {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        //Welcoming the user and telling them to input there name into the system 
        System.out.print("Welcome to the Candy Store! " + "Enter your name: ");
        String name = user.nextLine();
        //Asking for there age 
        System.out.print("What is your age, " + name + "? ");
        int age = user.nextInt();
        user.nextLine();
        //adding starter values
        String candy_type = "";
        double candy_amount = 0;
        double sub_total = 0;
        double tax_amount = 0.13;
        double after_tax = 0;
        double extra_amount = 0;
        double extra_amount1 = 0;
        double before_tax = 0;
        //adding item values
        double Reeses_Pieces = 2.50;
        double Skittles = 1.75;
        double Jubjubes = 0.50;
        double Lollipops = 0.50;
        double Lollipops_5 = 2.00;
        double Smarties = 1.50;
        while (true) {//while loop goes on and on and on until the person or user says quit! If not then the code is gonna go on aka a while loop
        System.out.print("Your options are: \n a) Reese's Pieces: $2.50 per 0.5 kg \n b) Skittles: $1.75 per 1 kg \n c) Jubjubes: $0.50 per 1 kg \n d) Lollipops: 1 for $0.50 or 5 for $2.00 \n e) Smarties: $1.50 per 1 kg \n Please write quit if you wanna leave or exist the store!");
        System.out.print('\n');
        System.out.print("Enter the candy type: ");     
        candy_type = user.nextLine();{
        if (candy_type.equals("quit")) {
            break;
        }
        System.out.print('\n');
        System.out.print("How many do you want to purchase?: ");
        candy_amount = user.nextDouble();
        user.nextLine();

            //if statement for Reeses_Pieces
            if (candy_type.equals("a")) {//the else if statement for Reeses Pieces aka option a
                sub_total = Reeses_Pieces * candy_amount * 2;
                System.out.print("\n");
                System.out.println("Total cost of " + candy_amount + " kg of Reese's Pieces is: $" + sub_total);
            }
            //else statement for Skittles
            else if (candy_type.equals("b")) {//the else if statement for Skittles aka option b
                sub_total = Skittles * candy_amount * 1;
                System.out.println("Total cost of " + candy_amount + " kg of Skittles is: $" + sub_total);
            }
            //else statement for Jubjubes
            else if (candy_type.equals("c")) {//the else if statement for Jubjubes aka option c
                sub_total = Jubjubes * 1 * candy_amount;
                System.out.println("Total cost of " + candy_amount + " kg of Jubjubes is: $" + sub_total);
            }
            //else statement for Smarties
            else if (candy_type.equals("e")) {//
                sub_total = Smarties * 1 * candy_amount;
                System.out.println("Total cost of " + candy_amount + " kg of Smarties is: $" + sub_total);
            }
            //All else statements for Lollipops, if its equal to more then etc
            else if (candy_type.equals("d")) { //the else if statement for lollopops aka option d
                if (candy_amount < 5) {
                    sub_total = Lollipops * candy_amount;
                }
                else if (candy_type.equals(5)) {
                    sub_total = Lollipops_5;
                }
                else if (candy_amount > 5) {
                    extra_amount =  candy_amount / 5;
                    extra_amount1 =  candy_amount % 5;
                    sub_total = (extra_amount *Lollipops_5) + (extra_amount1 *Lollipops) ;
                    System.out.println("Total cost of " + candy_amount + " of Lollipops is: $" + sub_total);
                }
            }
            else {//A else statement that tells the user that the thing they inputted is wrong or not in the system
                System.out.println("Pick your candy by writing the letter not candy name! it is beside each candy type, also please don't write random letters it won't work! " + "Let me start it a again " + name);
            }
             
                //After Tax amount/calculate all of the candy's before tax.
                before_tax += sub_total;
                after_tax += sub_total +(sub_total * tax_amount);

                //print statement for subtotal       
                System.out.println("\nYour subtotal is: $" + sub_total);
                System.out.print("\n");
    }
}

    //final amount with sub total/before tax and after tax/final amount
    System.out.println("\n" + "Here is your receipt:" + "\nYour total BEFORE TAX IS: $:" + before_tax);
    System.out.println("Your total amount is: $" + after_tax + " \nThanks for shopping at Candyland\n");
}
}

