import java.util.Random;
import java.util.Arrays;

public class MorelIpsum
{
    private String[] words = {"morel ipsum", "crimini", "portabella", "maitake", "shiitake", "enoki", "oyster", "beech", "chanterelle", "boletus edulis", "cantharellus cibarius", "cantharellus tubaeformis", "clitocybe nuda", "cortinarius caperatus", "craterellus cornucopioides", "grifola frondosa", "gyromitra esculenta", "hericium erinaceus", "hydnum repandum", "lactarius deliciosus", "morchella", "tricholoma matsutake", "amanita caesarea", "armillaria mellea", "boletus badius", "chroogomphus rutilus", "calvatia gigantea", "calocybe gambosa", "clavariaceae", "clavulinaceae", "coprinus comatus", "fistulina hepatica", "cortinarius variicolor", "hygrophorus chrysodon", "lactarius salmonicolor", "lactarius volemus", "lactarius subdulcis", "laetiporus sulphureus", "leccinum aurantiacum", "leccinum scabrum", "lepiota procera", "amanita muscaria", "coprinopsis atramentaria", "gyromitra esculenta", "verpa bohemica", "auricularia auricula-judae", "suillus bovinus", "suillus granulatus", "suillus luteus", "suillus tomentosus", "tricholoma terreum", "rhizopogon luteolus", "russula", "sparassis crispa"};

    public static int randInt(int min, int max) {
        Random rand = new Random();

        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    static void shuffle(String[] array) {
        int n = array.length;

        for (int i = 0; i < array.length; i++) {
            int random = i + (int) (Math.random() * (n - i));

            String randomElement = array[random];
            array[random] = array[i];
            array[i] = randomElement;
        }
    }

    public String BuildSentence()
    {
        int i = randInt(3, 9);

        shuffle(words);

        String[] wordSublist = Arrays.copyOfRange(words, 0, i);

        StringBuilder sentence = new StringBuilder();

        for (String word : wordSublist) {
            sentence.append(word + " ");
        }

        String prettySentence = (sentence.substring(0, 1).toUpperCase() + sentence.substring(1)).trim() + ". ";

        return prettySentence;
    }

    public StringBuilder BuildParagraph()
    {
        int n = randInt(3, 5);

        StringBuilder paragraph = new StringBuilder();

        for (int i=0; i < n; i++) {
            String sentence = BuildSentence();
            paragraph.append(sentence);
        }

        // Output in console so we see what was generated
        System.out.println(paragraph);

        return paragraph;
    }

    public MorelIpsum()
    {
        BuildParagraph();
    }

    public static void main(String[] args)
    {
        new MorelIpsum();
    }
}
