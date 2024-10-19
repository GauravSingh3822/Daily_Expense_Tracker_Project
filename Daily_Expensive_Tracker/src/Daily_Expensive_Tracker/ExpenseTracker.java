package Daily_Expensive_Tracker;
import java.util.*;
public class ExpenseTracker {
    List<String>Categories=new ArrayList<>();
    List<Double>Amount=new ArrayList<>();
    public void run(){
        System.out.print("Daily Expense Tracker");
        menu();
    }
    private void menu(){
        System.out.println("Expense Tracker Menu");
        System.out.println("===============================================================================");
        System.out.println("Select an Option (1-4)");
        System.out.println("1.Add Expense");
        System.out.println("2.View Expense");
        System.out.println("3.Total Expense");
        System.out.println("4.Exist");
        Scanner sc=new Scanner(System.in);
        int option=sc.nextInt();
        if(option==1){
            addExpensive();
            menu();
        } else if (option==2) {
            viewExpense();
            menu();

        } else if (option==3) {
            totalExpense();
            menu();
        }else if(option==4){
            exist();
        }else{
            System.out.println("Invalid Option..PLease Select Again");
            menu();
        }

    }

    private void addExpensive(){
        System.out.println("===============================================================================");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Expense Category:");
        String category=sc.nextLine();
        System.out.println("Enter Amount:");
        Double amount=sc.nextDouble();
        Categories.add(category);
        Amount.add(amount);
        System.out.println("Expense Added Sucessfully");
        System.out.println("===============================================================================");
    }
    private void viewExpense(){
        System.out.println("===============================================================================");
        if(Categories.isEmpty()==true){
            System.out.println("No expenses recorded");
        }else{
            System.out.println("Recorded Expense");
            for(int i=0;i<Categories.size();i++){
                System.out.println((i+1)+"."+Categories.get(i)+"--"+Amount.get(i));
            }
        }
        System.out.println("===============================================================================");
    }
    private void totalExpense(){
        System.out.println("===============================================================================");
        double total=0;
        for(double i=0;i< Amount.size();i++){
            total+=Amount.get((int) i);
        }
        System.out.println("Total Expense "+total);
        System.out.println("===============================================================================");
    }
    private void exist(){
        System.out.println("===============================================================================");
        System.out.println("Thankyou...");
        return;

    }
    public static void main(String[] args) {
        ExpenseTracker tracker=new ExpenseTracker();
        tracker.run();
    }
}
