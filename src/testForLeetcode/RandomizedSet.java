package testForLeetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * @Classname RandomizedSet
 * @Description TODO
 * @Date 2019/11/25 2:32 下午
 * @Created by lipeijing
 */
public class RandomizedSet {

    private static Random random = new Random();

    private List<Integer> dataSet;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        dataSet = new ArrayList<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (dataSet.contains(val)) {
            return false;
        } else {
            dataSet.add(val);
            return true;
        }
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (dataSet.contains(val)) {
            dataSet.remove(dataSet.indexOf(val));
            return true;
        } else {
            return false;
        }
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return dataSet.get(random.nextInt(dataSet.size()));
    }

    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        System.out.println(obj.insert(1));
        System.out.println(obj.insert(2));
        System.out.println(obj.dataSet);
        System.out.println(obj.remove(2));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
