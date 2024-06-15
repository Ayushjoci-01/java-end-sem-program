/*efine a class Word Example having the followingdescription:
Data members/instance variables:
private String strdata: to store a sentence.
Parameterized Constructor WordExample(String) : Accept a
sentence which
may be terminated by either’.’, ‘? ’or’!’ only. The wordsmay be separated by
more than one blank space and are in UPPER CASE.
Member Methods:
void countWord(): Find the number of wordsbeginning and
ending with a vowel.
void placeWord(): Place the words which begin andend with a vowel at the
beginning, followed by the remaining words as they occur in the sentence*/
class WorldExample {
    private String strData;

    WorldExample(String sentence) {
        this.strData = sentence.trim().replaceAll("\\s+", " ");
    }

    public void count() {
        int count = 0;
        String words[] = strData.split("\\s+");
        for (String word : words) {
            // Check if the word starts and ends with vowels
            if (word.matches("[AEIOUaeiou]\\w*[AEIOUaeiou][.?!]?")) {
                count++;
            }
        }
        System.out.println("Number of words beginning and ending with vowels: " + count);
    }

    public void place() {
        StringBuilder result = new StringBuilder();
        String words[] = strData.split("\\s+");
        for (String word : words) {
            // Check if the word starts and ends with vowels
            if (word.matches("[AEIOUaeiou]\\w*[AEIOUaeiou][.?!]?")) {
                result.append(word).append(" ");
            }
        }

        System.out.println("Modified sentence: " + result.toString().trim());
    }
}

public class program11 {
    public static void main(String[] args) {
        WorldExample li = new WorldExample("HELLO  HOW ARE YOU ? I AM FINE.");
        li.count();
        li.place();
    }
}
