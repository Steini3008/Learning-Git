package printing.nice_things;

import printing.spi.IPrinter;

public class HelloPrinter implements IPrinter {
	private String message;
	
	public HelloPrinter() {}
	
	public HelloPrinter(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void printMessage() {
		this.printMessage(true);
	}
	
	public void printMessage(boolean withNewLine) {
		String appendix = (withNewLine) ? "\n" : "";
		System.out.print(this.message + appendix);
	}
	
	public static void main(String[] args) {
		HelloPrinter hiPrinter = new HelloPrinter();
		String greeting = "Hallo";
		for (String hiRecipient : args) {
			hiPrinter.setMessage(greeting + " " + hiRecipient);
			hiPrinter.printMessage();
		}
	}
	
}
				
				