package challenge5;

public class Main {
    public static void main(String[] args) {
        PasswordChangeEvent eventOne = new PasswordChangeEvent("123456789");
        AccountTransferEvent eventTwo = new AccountTransferEvent("987654321");
        MissedPaymentEvent eventThree = new MissedPaymentEvent("147258369");

        Event[] events = {eventOne, eventTwo, eventThree};

        for (Event e: events){
            System.out.println(e.getTimeStamp());
            e.process();
            System.out.println();
        }
    }
}
