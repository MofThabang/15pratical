import java.io;
import java.util;

public class Anagrams {
  // storing signature by HashMap
private static HashMap<String, ArrayList<String>> dictionary = new HahMap<>();

  public satatic vid main(string[] args) {
    readFile("ulysses.text");
    printDictionary();
    writeLatexFile("theAnagrams.text");
  }
  
