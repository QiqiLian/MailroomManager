//Qiqi Lian
//113187306
//Recitation 4

import java.util.*;
import java.util.EmptyStackException;



/**
 * This method sets the capacity of the stack to be 7 and count is tracking the number of students into the stack
 */
public class PackageStack {
    private final int CAPACITY = 7;
    private int count = 0;

    private Stack <Package> stack = new Stack();


    /**
     * @param x this method checks the if the stack is full first, it will throw an Exception first, otherwise it would add student
     * into the specified stack
     * @throws FullStackException
     */
    public void push(Package x) throws FullStackException {
        if (count > CAPACITY) {
            throw new FullStackException();
        }
        else if (count < CAPACITY) {
            stack.push(x);
            count++;

        }

    }

    /** This method would check if the stack is empty first to determine whether if there are students to pop
     * otherwise if its not empty it would pop the specified student
     * @return
     * @throws EmptyStackException
     */
    public Package pop() throws EmptyStackException {
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
        count--;
        return stack.pop();




    }

    /** This method is to peek in the specified stack
     * @return
     */
    public Package peek() {
        return stack.peek();

    }

    /** This boolean method checks if the stack is full
     * @return
     */
    public boolean isFull() {
        isFull();

        return false;
    }

    /** This boolean method checks if the stack is empty
     * @return
     */
    public boolean isEmpty() {
        if (count ==0){
            return true;
        }

        return false;
    }

    /**
     * @return This method checks the amount of packages added into a specified stack
     */
    public int getCount() {
        return this.count;
    }


    /**
     * @return This method returns the stack into String
     */
    @Override
    public String toString() {
        return " " + stack  ;
    }
}


