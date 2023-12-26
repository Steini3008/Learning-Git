module printing.stuff {
	exports printing.nice_things;
	
	uses printing.nice_things.INicePrinter;
	
	provides printing.nice_things.INicePrinter with printing.nice_things.HelloPrinter;
	
}