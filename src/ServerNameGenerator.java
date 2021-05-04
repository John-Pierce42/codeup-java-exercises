public class ServerNameGenerator {

    public static void main(String[] args) {


        String[] nouns = {"cat", "dog", "monkey", "dragon", "dude", "parrot", "hero", "plain","rocket", "car" };
        String[] adjectives = {"funny", "big", "silly", "flaming", "cool", "colorful", "fast", "quick", "staged", "slow"};


        System.out.println(adjectives[2]);
        System.out.println(nouns[2]);

//        System.out.print(randomElement(adjectives));
//        System.out.print(randomElement(nouns));
        System.out.println();
        System.out.println(randomElement(adjectives) + "-" + randomElement(nouns));

    }

    public static String randomElement(String[] word){
        return word[(int) (Math.random() * (word.length -1))];
    }

}
