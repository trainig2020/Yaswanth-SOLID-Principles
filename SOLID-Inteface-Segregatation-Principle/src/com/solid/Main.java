package com.solid;

public class Main {
    
	public static void main(String[] args) {
		
		ExcelUser excelUser = new ExcelUser();
		excelUser.printingExcel();
		PdfUser pdfUser  = new PdfUser();
		pdfUser.printingPdf();
	}
}
