// importing the FileWriter class
import java.io.FileWriter;

class Main1 {
    public static void main(String args[]) {

        // creates a multiline string using + operator
        // the string is a Java Program
        String program = "class JavaFile { " +
                "public static void main(String[] args) { " +
                "System.out.println(\"This is file\");"+
                "}"+
                "}";
        try {
            // Creates a Writer using FileWriter
            FileWriter output = new FileWriter("JavaFile.java");

            // Writes the program to file
            output.write(program);
            System.out.println("Data is written to the file.");

            // Closes the writer
            output.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}9