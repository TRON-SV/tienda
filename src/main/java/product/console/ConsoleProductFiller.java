package product.console;

import java.util.UUID;

import product.ConsoleProductArchiever;

public class ConsoleProductFiller {
	public ConsoleProductFiller(Console product, ConsoleProductArchiever productArchiever, String producType,double price,String serie,String brand,double tax) {
		product.setId(UUID.randomUUID());
		product.setProductType(producType);
		product.setPrice(price);
		product.setSerie(serie);
		product.setBrand(brand);
		product.setTax(tax);
		product.setDiskCapacity(512);
		product.setDiskReader(true);
		productArchiever.addConsoleProductToList(product);
	}
}
