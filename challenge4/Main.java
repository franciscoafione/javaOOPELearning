package challenge4;

public class Main {
    public static void main(String[] args) {
        Contact contactOne = new Contact("Lolo", new PhoneNumber("32555555555"));
        Contact contactTwo = new Contact("Molo", "molo@molo.com");
        Contact contactTree = new Contact("Malena", new PhoneNumber(48, "312551222"), "malena@male.com");

        System.out.println(contactOne);
        System.out.println(contactTwo);
        System.out.println(contactTree);
    }

}
