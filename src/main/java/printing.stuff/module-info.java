module printing.stuff {
	exports printing.spi;
	
	uses printing.spi.IPrinter;
	
	provides printing.spi.IPrinter with printing.nice_things.HelloPrinter;
	
}