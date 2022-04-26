package product.tv;
import product.ConsoleProductArchiever;
import product.IDisplayProductInfo;

public class TvProductPrinter implements IDisplayProductInfo {
	public void displayProductInfo(ConsoleProductArchiever productArchiever) {
		for(int i=0; i<productArchiever.tvProductList.size(); i++) {
			System.out.println(productArchiever.tvProductList.get(i).getId());
			System.out.println(productArchiever.tvProductList.get(i).getProductType());
			System.out.println(productArchiever.tvProductList.get(i).getPrice());
			System.out.println(productArchiever.tvProductList.get(i).getSerie());
			System.out.println(productArchiever.tvProductList.get(i).getBrand());
			System.out.println(productArchiever.tvProductList.get(i).getTax());
			System.out.println(productArchiever.tvProductList.get(i).getSize());
		}	
	}
}
