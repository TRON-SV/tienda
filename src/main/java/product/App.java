package product;

import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;

import product.console.Console;
import product.console.ConsoleProductFiller;
import product.console.ConsoleProductPrinter;
import product.tv.Tv;
import product.tv.TvProductFiller;

public class App {
	
	public static void printMenu(String[] options){
        for (String option : options){
            System.out.println(option);
        }
        System.out.print("Choose your option : ");
    }
	
    public static void main(String[] args) {
    	String[] options = {
    			"------------------",
    			"1- Insert Console Product",
		        "2- Insert TV Produt",
		        "3- Exit",
		};
    	Console consoleProduct = new Console(2,true);
    	//Tv TvProduct = new Tv();
        ConsoleProductArchiever consoleProductArchiever = new ConsoleProductArchiever();
        
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        while (option!=3){
            printMenu(options);
            try {
                option = scanner.nextInt();
                switch (option){
                    case 1: console(consoleProduct, consoleProductArchiever); break;
                    case 2: tv(TvProduct, consoleProductArchiever); break;
                    case 3: exit(0);
                }
            }
            catch (Exception ex){
                System.out.println("Please enter an integer value between 1 and " + options.length);
                scanner.next();
            }
        }
    }
// Options
    public static void console(Console consoleProduct, ConsoleProductArchiever consoleProductArchiever) {
    	//INSERTAMOS A LA LISTA UN PRODUCTO DE TIPO CONSOLA
    	ConsoleProductFiller consoleProductFiller = new ConsoleProductFiller(consoleProduct,consoleProductArchiever,"console",500, "Series X", "Xbox", 0.12);
    	ConsoleProductPrinter consoleProductPrinter = new ConsoleProductPrinter();
    	consoleProductPrinter.displayProductInfo(consoleProductArchiever);
    	consoleProduct.playVideoGame();
    }
    public static void tv(Tv tvProduct, ConsoleProductArchiever productArchiever) {
    	//INSERTAMOS A LA LISTA UN PRODUCTO DE TIPO TV
    	TvProductFiller productFiller = new TvProductFiller(tvProduct,productArchiever,"console",500, "Series X", "Xbox", 0.12, "42 pulgadas", true);
    	ProductPrinter productPrinter = new ProductPrinter();
    	productPrinter.displayProductInfo(productStore);
    }
    private static void option3() {
        System.out.println("Thanks for choosing option 3");
    }
}