import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadingFilesPerLine {
    public static void main(String[] args) {

    }

    public static List<String> read(String file) {
        ArrayList<String> fileName = new ArrayList<>();
        try {
            Files.lines(Paths.get(file)).forEach(filename -> fileName.add(filename));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return fileName;
    }
}