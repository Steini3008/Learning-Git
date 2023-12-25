package printing.nice_things;

public class NicePrinter {
	private String message;
	
	public NicePrinter(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void printMessage(boolean withNewLine) {
		String appendix = (withNewLine) ? "\n" : ""
		System.out.print(this.message + appendix);
	}
	
	public static void main(String[] args) {
		NicePrinter np;
		switch (args.length) {
			case 2:
				np = new NicePrinter(args[1]);
				np.printMessage(true);
				break;
			case 1:
				np = new NicePrinter(args[0]);
				np.printMessage(true);
			case 0:
				np = new NicePrinter("Hallo Welt")
				np.printMessage(false);
		}
	}
				
				