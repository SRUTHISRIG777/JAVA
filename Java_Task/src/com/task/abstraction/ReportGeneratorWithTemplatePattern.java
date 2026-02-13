package com.task.abstraction;
abstract class ReportGenerator{
	String report;
	
	public ReportGenerator(String report) {
		super();
		this.report = report;
	}
	public abstract void generateContent();
	public void openFile() {
		
	}
	public void writeContent() {
		
	}
	public void saveFile() {
		
	}
}
class PDFReport extends ReportGenerator{
	String blockText;

	public PDFReport(String report, String blockText) {
		super(report);
		this.blockText = blockText;
	}
	public void generateContent() {
		System.out.println("Generating PDF content with block text.");
	}
	public void openFile() {
		System.out.println("Opening PDF file.");
	}
	public void writeContent() {
		System.out.println("Writing content to PDF file.");
	}
	public void saveFile() {
		System.out.println("Saving PDF file.");
	}
}
class HTMLReport extends ReportGenerator{
	String markupContent;

	public HTMLReport(String report, String markupContent) {
		super(report);
		this.markupContent = markupContent;
	}
	public void generateContent() {
		System.out.println("Generating HTML content with markup.");
	}
	public void openFile() {
		System.out.println("Opening HTML file.");
	}
	public void writeContent() {
		System.out.println("Writing content to HTML file.");
	}
	public void saveFile() {
		System.out.println("Saving HTML file.");
	}
}
public class ReportGeneratorWithTemplatePattern {

	public static void main(String[] args) {
		ReportGenerator r1=new PDFReport("sample report","this is a sample block text");
		ReportGenerator r2=new HTMLReport("sample report","<h1> sample report </h1>");
         System.out.println("========pdf report======");
         r1.generateContent();
         r1.openFile();
         r1.writeContent();
         r1.saveFile();
         System.out.println("========HTML report======");
         r2.generateContent();
         r2.openFile();
         r2.writeContent();
         r2.saveFile();
         
	}

}
