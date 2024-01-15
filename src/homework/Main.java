package homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
    Написать метод, принимающий два листа целых чисел одинаковой длины и возвращающий лист,
    содержащий элементы Yes или No, где значения на i-м месте зависит от того,
    равны ли элементы этих двух листов под номером i. Например, {1,2,3,4} и {5,2,3,8}
    вернет {No, Yes, Yes, No}
    Протестировать.
     */

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(68);
        list1.add(12);
        list1.add(99);
        list1.add(35);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(6);
        list2.add(12);
        list2.add(99);
        list2.add(87);

        List<String> newList = new ArrayList<>();

        newListOfTwoGenerated(list1, list2, newList);

        System.out.println(newList);

    }
        public static void newListOfTwoGenerated ( List<Integer>list1, List<Integer>list2, List<String> newList ){

            for (int i = 0; i<list1.size(); i++){
                if(list1.get(i).equals(list2.get(i))){
                    newList.add("Yes");
                }
                else newList.add("No");
            }
        }
}
