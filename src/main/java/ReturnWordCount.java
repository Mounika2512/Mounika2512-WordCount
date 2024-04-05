public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String n){
        if (n == null || n.isEmpty()) {
                return 0;
            }
            String[] words = n.split("\\s+");
            return words.length;
        }
    
        public static void main(String[] args) {
            ReturnWordCount r= new ReturnWordCount();
            String sentence = "Hello Every one!";
            System.out.println("Word count: " + r.count(sentence));
        }
    }