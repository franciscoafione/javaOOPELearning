package challenge4;

public class PhoneNumber {
    private int countryCode;
    private String number;

    public PhoneNumber(String phoneNumber){
        if(phoneNumber.length() > 10){
            this.countryCode = Integer.parseInt(phoneNumber.substring(0, phoneNumber.length() - 10));
            this.number = phoneNumber.substring(phoneNumber.length()-10);
        } else {
            this.countryCode = 1;
            this.number = phoneNumber;
        }
    }

    public PhoneNumber(int countryCode, String number){
        this.countryCode = countryCode;
        this.number = number;
    }

    @Override
    public String toString() {
        return "PhoneNumber{"+
                "countryCode='"+ countryCode +
                ", phoneNumber="+ number + '\'' +
                '}';
    }
}
