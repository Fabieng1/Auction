import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            String nameProductMain = "";
            String categoryProductMain = "";
            String descriptionProductionMain = "";

            double priceProductMain = 0.0;

            Product product = new Product(nameProductMain, categoryProductMain, descriptionProductionMain, priceProductMain);

            Scanner scanner = new Scanner(System.in);

            System.out.println("Quel est le nom de votre produit ? ");
            nameProductMain = scanner.nextLine();

            // Faire un enum des catégories
            System.out.println("Dans quel catégorie est votre produit ?");
            categoryProductMain = scanner.nextLine();

            // Rendre obligatoire un nombre minimum de caractère
            System.out.println("Entrez une descripion de votre produit ");
            descriptionProductionMain = scanner.nextLine();

            // Contraindre le prix selon le type d'enchère
            System.out.println("Entrez le prix de votre produit ");
            priceProductMain = scanner.nextDouble();


        }
}