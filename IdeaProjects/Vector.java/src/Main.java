import java.util.Vector;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      Vector list = new Vector();
      list.addElement("ram");
      list.addElement("sita");
      list.addElement("gita");
        System.out.println("Array elements are"+list);
        list.insertElementAt("hh",0);
        System.out.println("Array elements are"+list);
        }
    }
