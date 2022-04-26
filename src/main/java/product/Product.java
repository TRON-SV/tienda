package product;

import java.util.ArrayList;
import java.util.UUID;

public abstract class Product {
	private UUID id;
	private String productType;
	private double price;
	private String serie;
	private String brand;
	private double tax;
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID uuid) {
		this.id = uuid;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
}