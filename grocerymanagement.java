
import java.util.*;

class clrscr {
    public void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception E) {
            System.out.println(E);
        }
    }
}

class regislog extends clrscr // CLASS resgislog
{
    final String passf = "user";
    String u_name;
    String u_pass;
    String email;
    Long mob_no;
    char g;
    String l_name;
    String l_pass;

    Scanner ob = new Scanner(System.in);
    clrscr c1 = new clrscr();

    /*
     * public void login()
     * { cls();
     * String u_name;
     * String u_pass;
     * System.out.println("\t\t\t\t\t\t\tLOGIN\n");
     * System.out.println("Username: ");
     * u_name=ob.nextLine();
     * System.out.println("Password: ");
     * u_pass=ob.nextLine();
     * }
     */

    public void r_input() {
        // cls();
        System.out.print("User Name: ");
        u_name = ob.nextLine();

        System.out.print("Email id: ");
        email = ob.nextLine();

        System.out.print("Password: ");
        u_pass = ob.nextLine();

        System.out.print("Gender: ");
        g = ob.next().charAt(0);

        System.out.print("Mobile number: ");
        mob_no = ob.nextLong();
    }

    public void r_output() {
        // cls();
        System.out.println("\nName: " + u_name);
        System.out.println("Email id: " + email);
        System.out.println("Password: " + u_pass);
        System.out.println("Gender: " + g);
        System.out.println("Mobile number: " + mob_no);
    }

    public void login() {
        System.out.println("\t\t\t-----PLEASE ENTER THE LOGIN DETAILS-----\n");
        System.out.println("\nEnter user name: ");
        l_name = ob.next();

        System.out.println("\nEnter password: ");
        l_pass = ob.next();
    }
}

class order extends regislog {
    Scanner o1 = new Scanner(System.in);
    String p_name;
    int p_quan;

    void o_item() {
        System.out.println("Enter product name: ");
        p_name = o1.nextLine();
        System.out.println("Enter the quantity: ");
        p_quan = o1.nextInt();
    }
}

class menu extends order {
    Scanner sm1 = new Scanner(System.in);
    // regislog ob1;

    public void f_menu() {
        // cls();
        System.out.println("\t\t\t\t\t\t\tWELCOME TO THE MENU!!!!\n");
        System.out.println("\t\t\t\t\t\t\t\t1) HOME");
        System.out.println("\t\t\t\t\t\t\t\t2) Need Help");
        System.out.println("\t\t\t\t\t\t\t\t3) About us");
        System.out.println("\t\t\t\t\t\t\t\t4) Guide");
        System.out.println("\t\t\t\t\t\t\t\t5) Contact us");
        System.out.println("\t\t\t\t\t\t\t\t6) EXIT");

        System.out.print("\n\t\t\t\t\t\tEnter the number of the required menu you want: ");
        int opt = sm1.nextInt();

        switch (opt) {
            case 1:
                // cls();
                home();
                break;

            // case 2:
            // // cls();
            // foodm();
            // break;

            case 2:
                // cls();
                n_help();
                break;

            case 3:
                // cls();
                abtus();
                break;

            case 4:
                // cls();
                guide();
                break;

            case 5:
                // cls();
                cont_us();
                break;

            case 6:
                System.exit(0);
        }
    }

    void abtus() {
        // cls();
        System.out.print(
                "\nIndia's most convenient online grocery channel.Reliance Fresh and Smart makes your grocery shopping even simpler. No more hassles of sweating it out in crowded markets, grocery shops & supermarkets - now shop from the comfort of your home office or on the move.We offer you convenience of shopping everything that you need for your home - be it fresh fruits & vegetables, rice, dals, oil, packaged food, dairy item, frozen, pet food, household cleaning items & personal care products from a single virtual store.");
        System.out.println("\n");
        f_menu();

    }

    public void home() {
        // cls();
        System.out.println("\n\t\t\t\t\t\t\t\t--HOME--\n");
        System.out.print(
                "\t\t\t\t\t\t\t\t1) Groceries\n\t\t\t\t\t\t\t\t2) Fruits\n\t\t\t\t\t\t\t\t3) Kitchen Appliances\n\t\t\t\t\t\t4) <-- GO BACK\n\t\t\t\t\t\tEnter the number of the required menu you want: ");
        // Scanner S = new Scanner(System.in);
        int opt1 = sm1.nextInt();
        switch (opt1) {
            case 1:
                System.out.println(
                        "Bakery and Bread.\nMeat and Seafood.\nPasta and Rice.\nOils, Sauces, Salad Dressings, and Condiments.\nFrozen Foods.\nDairy, Cheese, and Eggs. ");
                break;

            case 2:
                System.out.println(
                        "Apple\nBanana\nAppricot\nMango\nKiwi\nPeaches\nCherry\nPulm\nDates\nCoconut\nAnd more!!");
                break;

            case 3:
                System.out.println(" ");
                break;

            case 4:
                f_menu();

            default:
                System.out.println(" ");
        }
    }

    void n_help() {
        // cls();
        System.out.println("FAQs Frequently Asked Questions:");
        System.out.println("\nCheck out this section to get answers for all the frequently asked questions.");
        System.out.println("1) Registration");
        System.out.println("2) How do I register?");
        System.out.println(
                "3) You can register by clicking on the \"Sign In\" section located at the top right corner on the home page.");
        System.out.println(
                "4) Please provide the required information in the form that appears and click on submit.We will send a one-time password (OTP) to verify your mobile number. Post verification, you can start shopping on JioMart.");
        System.out.println("5) Can I register multiple times using the same phone number/email ID?");
        System.out.println(
                "6) Each email ID/login ID and mobile number can only be associated with one customer account.");
        System.out.println("\n");
        f_menu();

    }

    void foodm() {
        // cls();
        System.out.println("\t\t\t\t\t\t\tFOOD MENU!!!!\n");
        System.out.println("\t\t\t\t\t\t\t\t1) Fish");
        System.out.println("\t\t\t\t\t\t\t\t2) Meat");
        System.out.println("\t\t\t\t\t\t\t\t3) Pizza");
        System.out.println("\t\t\t\t\t\t\t\t4) Burger");
        System.out.println("\t\t\t\t\t\t\t\t5) Pavbhaji");
        System.out.println("\t\t\t\t\t\t\t\t6) Pasta");
        System.out.println("\t\t\t\t\t\t\t\t7) Chinese");
        // int ch=sm1.nextInt();

        /*
         * switch(ch)
         * {
         * case 1:
         * cls();
         * fish();
         * order();
         * break;
         * 
         * case 2:
         * cls();
         * //meat();
         * break;
         * 
         * case 3:
         * cls();
         * //pizza();
         * //
         * break;
         * 
         * case 4:
         * cls();
         * //burgers();
         * break;
         * 
         * case 5:
         * cls();
         * //pavbhaji();
         * break;
         * 
         * case 6:
         * cls();
         * //pasta();
         * break;
         * 
         * case 7:
         * cls();
         * //chinese();
         * break;
         * 
         * case 8:
         * System.exit(0);
         * }
         */
    }

    public void myacc() {
        r_output();
        System.out.println("\n");
        f_menu();

    }

    void guide() {
        System.out.printf("Select your language:\nPress 1 for english\n2 for hindi\n3 for marathi : ");
        int opt2 = sm1.nextInt();
        if (opt2 == 1) {
            System.out.printf("Click to see how jiomart works https://youtu.be/Gi3AiZCoWKI");
        }

        else if (opt2 == 2) {
            System.out.printf("Jiomart कैसे काम करता है यह देखने के लिए क्लिक करें https://youtu.be/Gi3AiZCoWKI");
        } else if (opt2 == 3) {
            System.out.printf("Jiomart कसे काम करते हे पाहण्यासाठी क्लिक करा https://youtu.be/Gi3AiZCoWKI");
        }

        System.out.println("\n");
        f_menu();
    }

    void cont_us() {
        System.out.println("\n\t\t\t\t\t\t\t\tCONTACT US\n");
        System.out.println("\t\t\t\t\t\t\t1) WhatsApp us : 70003 70003 Call Us : 1800 890 1222.");
        System.out.println("\t\t\t\t\t\t\t2) Call Us : 1800 890 1222");
        System.out.println("\t\t\t\t\t\t\t3)8:00 AM to 8:00 PM, 365 days");

        System.out.println("\n");
        f_menu();
    }
}

public class grocerymanagement extends menu // MAIN CLASS
{
    public static void main(String args[]) {
        // Scanner main=new Scanner(System.in);
        clrscr c1 = new clrscr();
        menu m1 = new menu();
        regislog ob1 = new regislog();
        m1.f_menu();
        // int flag=0;

        // ob1.r_input();
        // ob1.login();

        // if(ob1.l_name.equals(ob1.u_name))
        // {

        // if(ob1.l_pass.equals(ob1.u_pass))
        // {
        // System.out.println("You have succesfully logged in!!!");
        // // c1.cls();
        // m1.f_menu();
        // }
        // }

        // else
        // {
        // System.out.println("OOPS!!!! INVALID Username or Password!!! PLEASE TRY
        // AGAIN!!!\n\n\n");
        // while(!(ob1.l_pass.equals(ob1.u_pass)))
        // {
        // ob1.login();
        // }
        // }
    }
}
