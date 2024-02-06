package challenge5;

public class MissedPaymentEvent extends AbstractEvent{
    public MissedPaymentEvent(String id){
        super(id);
    }

    @Override
    public void process(){
        System.out.println("Customer " + " missed their payment." +
        " Sending a bill to the customer.");
    }
}
