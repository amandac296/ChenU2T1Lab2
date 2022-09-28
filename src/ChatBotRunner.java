public class ChatBotRunner {
    public static void main(String[] args){
       ChatBot debbie = new ChatBot("Debbie", 19);
       debbie.greeting("Amanda");
       debbie.weather();
       System.out.println("Did you know that there's going to be 17 inches of snow tomorrow which is also " + debbie.convertFeetToMeters(17) + (" meters of snow so be careful."));
       debbie.favoriteNumber(20);
       System.out.println("Do you know that our numbers plus 1 is " + debbie.addNumbers(19,20,1) + "! " + debbie.goodbye());
       System.out.println(debbie.numberProduct(10));
       debbie.printColor("purple");
    }
}
