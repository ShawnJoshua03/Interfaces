import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ShortLister {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        int returnValue = chooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            try {
                Scanner scanner = new Scanner(selectedFile);
                ArrayList<String> words = new ArrayList<>();
                while (scanner.hasNext()) {
                    words.add(scanner.next());
                }
                Object[] shortWords = Utility.collectAll(words.toArray(), new ShortWordFilter());
                for (Object word : shortWords) {
                    System.out.println(word);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
