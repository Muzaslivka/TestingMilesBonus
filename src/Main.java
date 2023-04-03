public class Main {
    public static void main(String[] args) {

        int costTicket = 13676;
        int amountTickets = 1;
        int sumOfTickets = amountTickets * costTicket;
        int milesForAccount = 20;
        int bonus = sumOfTickets / milesForAccount;

        System.out.println("Стоимость купленных билетов: " + sumOfTickets);
        System.out.println("Бонусные мили сотавили: " + bonus);
        System.out.println();
    }
}