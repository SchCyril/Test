import java.io.*;

public class TestFile {

    public static void main(String[] args) {
        File file = new File("/home/cyril/dev/test/test.txt");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

            bw.write("Lundi");
            bw.newLine();
            bw.write("Mardi");
            bw.newLine();
            bw.write("Mercredi");
            bw.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
