public class AnimalMain {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        System.out.println("\nFor Tiger ");
        System.out.println(" "+ tiger.eats());
        System.out.println(" "+ tiger.sleep());

        System.out.println("\nFor Lion");
        System.out.println(" "+ lion.eats());
        System.out.println(" "+ lion.sleep());
    }

}
