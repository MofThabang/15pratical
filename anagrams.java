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
 //process and store word 
  public static void processWord(String word) {
    String signature = makingSignature(word);

    if (!dictionary.containsKey(signature)){
      ArrayList<String> List = new ArrayList<>():
        list.add(word);

      dictionary.put(signature,list);

    }else {
      dictionary.get(signature).add(word);
    }
  }

  
  // creation of signature
  public staic String makeSignature(String word){
    char[]letters = word.toCharArray();
    Array.sort(letters);
    return new String(letters);
  }

// print dictionary
  public static void printDictionary(){
    for(String key :dictionary.keySet()){
      ArrayList<String> words =dictionary.get(key);
      if (wrd.size() >=2){

        System.out.printIn(key +": " + words);
      }
    }
  }
    
  // generate Latex 
  public staic void writeLatexFile(String filename){
    try{
      PrintWriter writer = new PrintWriter(new FileWriter(filename));
    

            writer.println("\\documentclass{article}");
            writer.println("\\begin{document}");
            writer.println("\\section*{Dictionary of Anagrams}");
            writer.println("\\begin{itemize}");

            for (String key : dictionary.keySet()) {

                ArrayList<String> words = dictionary.get(key);

                if (words.size() >= 2) {

                    Collections.sort(words);

                    writer.print("\\item ");

                    for (String w : words) {
                        writer.print(w + " ");
                    }

                    writer.println();
                }
            }

            writer.println("\\end{itemize}");
            writer.println("\\end{document}");

            writer.close();

        } catch (IOException e) {

            System.out.println("Error writing LaTeX file.");

        }
    }

  
    
    
  
  

       
