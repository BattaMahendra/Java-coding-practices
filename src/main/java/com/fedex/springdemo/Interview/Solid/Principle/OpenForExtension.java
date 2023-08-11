package com.fedex.springdemo.Interview.Solid.Principle;

class InvoiceDAO1{
	Invoice invoice;
	public InvoiceDAO1(Invoice invoice) {
		this.invoice = invoice;
	}
	public void saveToDb() {
		
	}
	public void saveToFile() {
		
	}
}
//Here in the above case to have a new method we changed/modified
//the existing class which was previously tested and deployed
//Rather we can extend instead of modifying
interface FileSaver{
	public void save();
}
class DataBaseInvoiceDAO implements FileSaver{

	@Override
	public void save() {
		// Save it to DB
		
	}
	
}
class FileInvoiceDAO implements FileSaver{

	@Override
	public void save() {
		// Save it to a file
		
	}
	
}
public class OpenForExtension {

}
