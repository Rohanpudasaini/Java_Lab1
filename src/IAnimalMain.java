public class IAnimalMain {
    public static void main(String[] args) {
        ITiger Itiger = new ITiger();
        ILion Ilion = new ILion();
        System.out.println("\nFor ITiger ");
        System.out.println(" "+ Itiger.eats());
        System.out.println(" "+ Itiger.sleep());

        System.out.println("\nFor ILion");
        System.out.println(" "+ Ilion.eats());
        System.out.println(" "+ Ilion.sleep());
        
}
}
