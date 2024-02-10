package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    // WRITE THE SORTSTACK METHOD HERE //
//    public static void sortStack(Stack stack){
//        Stack<Integer> tempStack = new Stack<>();
//        while(!stack.isEmpty()){
//            Integer topNumber = (Integer) stack.pop();
//            if(tempStack.isEmpty()){
//                tempStack.push(topNumber);
//            }else{
//                while(tempStack.isEmpty() || (topNumber.compareTo( tempStack.peek() ) > 0) ){
//                    stack.push( (Integer)tempStack.pop() );
//                }
//                tempStack.push(topNumber);
//            }
//        }
//        stack = tempStack;
//
//    }

////////////////////////    /////////////////////////////
    public static void sortStack(Stack<Integer> stack){
        Stack<Integer> tempStack = new Stack<>();
        while(!stack.isEmpty()){
            int topNumber = stack.pop();
                while(!tempStack.isEmpty() && topNumber < tempStack.peek() ){
                    stack.push(tempStack.pop());
                }
                tempStack.push(topNumber);
        }

        while (!tempStack.isEmpty()) {
        stack.push(tempStack.pop());
    }
    }
////////////////////////////////////////////////
    //ANSWER
//public static void sortStack(Stack<Integer> stack) {
//    Stack<Integer> additionalStack = new Stack<>();
//    while (!stack.isEmpty()) {
//        int temp = stack.pop();
//        while (!additionalStack.isEmpty() && additionalStack.peek() > temp) {
//            stack.push(additionalStack.pop());
//        }
//        additionalStack.push(temp);
//    }
//    while (!additionalStack.isEmpty()) {
//        stack.push(additionalStack.pop());
//    }
//}

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("The sortStack method takes a single argument, a Stack object.  " +
                "\nThe method should sort the elements in the stack in ascending order " +
                "\n(the lowest value will be at the top of the stack) " +
                "\nusing only one additional stack.  The function should use the pop, push, peek, and isEmpty methods " +
                "\nof the Stack object.");
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Before sorting:");
        stack.printStack();

        sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();

        /*
            EXPECTED OUTPUT:
            ----------------
            Before sorting:
            4
            1
            5
            2
            3

            After sorting:
            1
            2
            3
            4
            5

        */

    }
}