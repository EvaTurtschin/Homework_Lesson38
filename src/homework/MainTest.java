package homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    List<Integer> list1;
    List<Integer> list2;
    List<String> newList;

    @BeforeEach
    public void setUp(){
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        newList = new ArrayList<>();
    }
    @Test
    public void test_EmptyLists (){
        Main.newListOfTwoGenerated(list1, list2, newList);
        assertTrue(newList.isEmpty());
    }
    @Test
    public void test_EqualSizeLists (){
        list1.add(0);
        list1.add(1);

        list2.add(0);
        list2.add(1);

        List <String> expected = new ArrayList<>();
        expected.add("Yes");
        expected.add("Yes");

        Main.newListOfTwoGenerated(list1, list2, newList);
        assertEquals(expected, newList);
    }
    @Test
    public void test_CompletelyDifferentLists (){
        list1.add(8);
        list1.add(14);
        list1.add(0);

        list2.add(9);
        list2.add(10);
        list2.add(5);

        List <String> expected = new ArrayList<>();
        expected.add("No");
        expected.add("No");
        expected.add("No");

        Main.newListOfTwoGenerated(list1, list2, newList);
        assertEquals(expected,newList);
    }
    @Test
    public void test_CompletelyEqualLists(){
        list1.add(8);
        list1.add(14);
        list1.add(0);

        list2.add(8);
        list2.add(14);
        list2.add(0);

        List <String> expected = new ArrayList<>();
        expected.add("Yes");
        expected.add("Yes");
        expected.add("Yes");

        Main.newListOfTwoGenerated(list1, list2, newList);
        assertEquals(expected,newList);
    }



}