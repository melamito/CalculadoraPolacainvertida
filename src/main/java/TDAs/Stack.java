package TDAs;

import java.util.ArrayList;

public class Stack {
    //---- ATRIBUTOS -----
    private ArrayList<Integer> array;
    private int size;

    //----- CONSTRUCTOR -----
    public Stack(){
        this.array = new ArrayList<Integer>();
        this.size = 0;
    }

    //----- Metodos -----
    public void push(int data){
        array.add(data);
        size++;
        System.out.println(array);
    }

    public int pop(){
        size--;
        return array.remove(size);
    }

    public int top(){
        return array.get(size-1);
    }
}
