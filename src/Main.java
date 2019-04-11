import java.util.Random;

@SuppressWarnings("ALL")
public class Main {

    public static void main(String[] args) {
        String emailAddress = "john.doe.mis2016@ie.edu";
        String formattedEmailAddress = emailAddress.replace(".", "/");

        Random random = new Random();
        StringBuffer word = new StringBuffer("");
        int Random = random.nextInt(3);
        System.out.println("NUMBER IS : " + Random);

        switch (Random) {
            case 0:
                word.append('Y');

                break;
            case 1:
                word.append('F');
                break;

            case 2:
                word.append('T');
                break;


        }

        word.append('o');
        word.append('u');
        word.append('r');

        System.out.println(word + " " + formattedEmailAddress);
    }
}
