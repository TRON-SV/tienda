package product;

import java.util.ArrayList;

import product.console.Console;
import product.tv.Tv;
public class ConsoleProductArchiever {
	public ArrayList<Console> consoleProductList = new ArrayList<Console>();
	public ArrayList<Tv> tvProductList = new ArrayList<Tv>();
	public ArrayList<Product> computerProductList = new ArrayList<Product>();
	
	//METHODS FOR CONSOLE PRODUCT TYPE
	public ArrayList<Console> getConsoleProductList() {
		return consoleProductList;
	}
	public void setConsoleProductList(ArrayList<Console> productList) {
		this.consoleProductList = consoleProductList;
	}
	public void addConsoleProductToList(Console product) {
		this.consoleProductList.add(product);
	}
	//METHODS FOR TV PRODUCT TYPE
	public ArrayList<Tv> getTvProductList() {
		return tvProductList;
	}
	public void setTvProductList(ArrayList<Tv> tvProductList) {
		this.tvProductList = tvProductList;
	}
	public void addTvProductToList(Tv tv) {
		this.tvProductList.add(tv);
	}
}
