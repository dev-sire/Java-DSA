import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        LinkedList linkList = new LinkedList();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Shopping Cart: Choose One of the Following Opitons");
        boolean sourceControl = true;
        while (sourceControl) {
            int choice;
            System.out.println("Choose One of the Options");
            System.out.println("1. Add Items");
            System.out.println("2. Remove Items");
            System.out.println("3. Check Items");
            System.out.println("4. Exit Program");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    input.nextLine();
                    System.out.print("Enter Item to Add: ");
                    String item = input.nextLine();
                    linkList.append(item);
                    break;
                }
                case 2: {
                    input.nextLine();
                    System.out.print("Enter Item to Remove: ");
                    String removeItem = input.nextLine();
                    linkList.remove(removeItem);
                    break;
                }
                case 3: {
                    System.out.print("Current List: ");
                    linkList.listIterator();
                    break;
                }
                case 4: {
                    System.out.print("Exiting...");
                    sourceControl = false;
                    break;
                }
                default:
                    System.out.println("INVALID CHOICE");
                    break;
            }
        }
        input.close();
    }
}
