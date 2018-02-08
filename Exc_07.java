package Exc_7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exc_07
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            list.add((int) (Math.random() * 15) + 1);
        }
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            list1.add((int) (Math.random() * 15) + 1);
        }
        System.out.println(list);
        System.out.println(list1);
        System.out.println(countCommon(list,list1));
    }

    public static int countCommon(List<Integer> list1, List<Integer> list2)
    {
        Set<Integer> set1 = new HashSet<>();
        set1.addAll(list1);
        set1.retainAll(list2);
        return set1.size();
    }
}