package product.tv;

import product.Product;

public class Tv extends Product{
	private String size;
	private boolean isSmart;
	public Tv(String size, boolean isSmart) {
		super();
		this.size = size;
		this.isSmart = isSmart;
	}
	//GETTER AND SETTERS
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public boolean isSmart() {
		return isSmart;
	}
	public void setSmart(boolean isSmart) {
		this.isSmart = isSmart;
	}
}
