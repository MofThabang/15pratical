import java.io;
import java.util;

public class Anagrams {
  // storing signature by HashMap
private static HashMap<String, ArrayList<String>> dictionary = new HahMap<>();

  public satatic vid main(string[] args) {
    readFile("ulysses.text");
    printDictionary();
    writeLatexFile("theAnagrams.tex");
  }
  // read file and process the word

  public static void readFile(String filename){
    try{
      bufferedReader reader = new BufferedReader( new FileReader(filename));
      String line;
    
           while ((line = reader.readLine()) != null) {

                String[] words = line.split("\\s+");

                for (String w : words) {

                    w = cleanWord(w);

                    if (w.length() > 0) {
                        processWord(w);
                    }
                }
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
     //clean punctuation
  public static String cleanWord(String word){
    word = word.replaceAll("[.,;:-!_],"");

    return word.toLowerCase();
  }
