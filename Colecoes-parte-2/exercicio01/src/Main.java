import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        exercicio01();
        exercicio02();
    }


    /*
    * exemplo: rodrigo, alex, kaio, caio, bia
    * */
    private static void exercicio01() {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        System.out.print("Adicione usurios separados por virgula\n ");
        String users = sc.nextLine();
        String[] userSplit = users.split(",");
        System.out.println(Arrays.stream(userSplit).sorted().collect(Collectors.toList()));
    }

    /*
     * exemplo: rodrigo - m, alex - m, bia - f, debora - f
     * */
    private static void exercicio02() {
        Scanner sc = new Scanner(System.in);
        Pattern patternMale = Pattern.compile("-\\s[Mm]+");
        Pattern patternFemale = Pattern.compile("-\\s[Ff]+");
        List<List<String>> users = new ArrayList<>();

        System.out.print("Adicione usurios com nome e sexo, separados por virgula\n ");
        String user = sc.nextLine();
        String[] userSplit = user.split(",");
        List <String> matchingArrayMale = Arrays.stream(userSplit).filter(patternMale.asPredicate()).collect(Collectors.toList());
        List <String> matchingArrayFemale = Arrays.stream(userSplit).filter(patternFemale.asPredicate()).collect(Collectors.toList());
        users.add(matchingArrayMale);
        users.add(matchingArrayFemale);

        System.out.println(users);
    }
}