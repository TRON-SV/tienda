package product.tv;
import java.util.UUID;

import product.ConsoleProductArchiever;

public class TvProductFiller {
	public TvProductFiller(Tv tvProduct, ConsoleProductArchiever consoleProductArchiever, String producType,double price,
			String serie,String brand,double tax,String size, boolean isSmart) {
		tvProduct.setId(UUID.randomUUID());
		tvProduct.setProductType(producType);
		tvProduct.setPrice(price);
		tvProduct.setSerie(serie);
		tvProduct.setBrand(brand);
		tvProduct.setTax(tax);
		tvProduct.setSize(size);
		tvProduct.setSmart(isSmart);
		consoleProductArchiever.addTvProductToList(tvProduct);
	}
}
