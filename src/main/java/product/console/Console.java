package product.console;

import product.IPlayVideoGame;
import product.Product;

public class Console extends Product implements IPlayVideoGame{
	private Integer diskCapacity;
	private boolean diskReader;
	
	public Console(Integer diskCapacity, Boolean diskReader) {
		super();
		this.diskCapacity = diskCapacity;
		this.diskReader = diskReader;
	}

	public Integer getDiskCapacity() {
		return diskCapacity;
	}

	public void setDiskCapacity(Integer diskCapacity) {
		this.diskCapacity = diskCapacity;
	}

	public Boolean getDiskReader() {
		return diskReader;
	}

	public void setDiskReader(Boolean diskReader) {
		this.diskReader = diskReader;
	}

	public void playVideoGame() {
		System.out.println("Playing a video game...");
	}
}
