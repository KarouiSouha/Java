public class Cafejava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee=2.4;
        double latteCoffee=3.7;
        double cappucinoCoffee=2.7;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sum";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3= true;
        boolean isReadyOrder4 = false;
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // System.out.println(generalGreeting + customer1);Example:
        // System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	  if(isReadyOrder1){
            System.out.println(pendingMessage + customer1);
          }
          else{
            System.out.println(readyMessage + customer1);
          }

           if(isReadyOrder4){
            System.out.println(pendingMessage + customer4);
          }
          else{
            System.out.println(readyMessage + customer4);
          }
          System.out.println(displayTotalMessage + (latteCoffee*2));
                     if(isReadyOrder2){
            System.out.println(pendingMessage + customer2);
          }
          else{
            System.out.println(readyMessage + customer2);
          }

          System.out.println(displayTotalMessage+(latteCoffee-dripCoffee));
    }
}
