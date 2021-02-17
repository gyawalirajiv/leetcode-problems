package com.rajiv.premium.flatten2DVector;

//Implement an iterator to flatten a 2d vector.
//        Input: 2d vector =
//        [[1,2], [3], [4,5,6]]
//        Output:
//        [1,2,3,4,5,6]

import java.util.Iterator;
import java.util.List;

public class Flatten2DVector {
}

class Vector2D {

    int[][] list;
    int currentRow;
    int currentColumn;

    public Vector2D(int[][] v){
        this.list = v;
        currentRow = 0;
        currentColumn = 0;
    }

    public int next(){
        if(!hasNext()) return Integer.MIN_VALUE;

        if(currentColumn == list[currentRow].length - 1) {
            currentRow++;
            currentColumn = 0;
        }
        int temp = list[currentRow][currentColumn];
        currentColumn++;
        return temp;
    }

    public boolean hasNext(){
        if(currentRow == list.length - 1 && currentColumn == list[currentRow].length - 1) return false;
        return true;
    }
}

/**
 * Your Vector2D object will be instantiated and called as such:
 * Vector2D i = new Vector2D(vec2d);
 * while (i.hasNext()) v[f()] = i.next();
 */

class Vector2DIterator implements Iterator<Integer> {

    Iterator<List<Integer>> i;
    Iterator<Integer> j;

    public Vector2DIterator(List<List<Integer>> vec2d){
        i = vec2d.iterator();
    }

    @Override
    public boolean hasNext() {
        while((j == null || !j.hasNext()) && i.hasNext()){
            j = i.next().iterator();
        }
        return j != null && j.hasNext();
    }

    @Override
    public Integer next() {
        return j.next();
    }

}
