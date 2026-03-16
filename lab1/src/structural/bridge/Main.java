package structural.bridge;

public class Main {
    public static void main(String[] args) {
        Book novelPDF = new Novel("The Great Gatsby", new PDFFormat());
        novelPDF.startReading();
        novelPDF.stopReading();

        Book encyclopediaAudio = new Encyclopedia("World History", new AudioFormat());
        encyclopediaAudio.startReading();
        encyclopediaAudio.stopReading();
    }
}
