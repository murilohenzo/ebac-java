import java.util.ArrayList;
import java.util.List;

public class ExamplesJavaGenerics {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Murilo");
        stringList.add("1");
        print(stringList);
        System.out.println("First element for generic list = " + getFirstElement(stringList));
        removeElement(stringList, 1);

        List<Long> longList = new ArrayList<>();
        longList.add(1L);
        longList.add(2L);
        print(longList);
        System.out.println("First element for generic list = " + getFirstElement(longList));
        removeElement(longList, 1);

        System.out.println("############ REMOVE SECOND ELEMENT ############");
        print(stringList);
        print(longList);
    }

    public static <T> void print(List<T> list) {
        for (Object str:
             list) {
            System.out.println(str);
        }
    }

    public static <T> T getFirstElement(List<T> list) {
        return  list.get(0);
    }

    public static <T> void removeElement(List<T> list, int index) {
        list.remove(index);
    }
}