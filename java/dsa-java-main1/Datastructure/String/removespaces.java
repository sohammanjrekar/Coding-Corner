package String;

public class removespaces {
    public static void main(String[] args) {
        String str = "au bc ubc bci heogcww uah";

        str = str.replaceAll("\\s", "");

        System.out.println(str);
    }
}
