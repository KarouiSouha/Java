import java.util.ArrayList;
public class CafeUtil {
    public int getStreakGoal() {
      int sum=0;
      for (int i = 1; i <= 10; i++) {
        sum += i;
    }
    return sum;
   }
    public double getOrderTotal(double[] prices) {
    double total = 0;
    for (double price : prices) {
        total += price;
    }
    return total;
   }
   public void displayMenu(ArrayList<String> menuItems){
    for(int i=0;i<menuItems.size();i++){
        System.out.printf("%d %s\n", i, menuItems.get(i));
    }
   }
   public void addCustomer(ArrayList<String> customers){
    System.out.println("Please enter your name:");
    String userName = System.console().readLine();
    System.out.println("Hello, " + userName + "!");
    int numberOfPeopleAhead = customers.size();
    System.out.println("There are " + numberOfPeopleAhead + " people in front of you");
    customers.add(userName);
    System.out.println(customers);
}
}
