public class Hello {
    public static void main(String[] args) {
        String[] members = {
            "Harley",
            "Jeriel"
        };
        System.out.println("Hey world!");
        System.out.println("Harley");
        System.out.println("Members: ");
        for (String s : members) {
            System.out.println("\t" + s);
        }
    }
}
