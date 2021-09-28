package dataStructuresAndCollections.stack;

import dataStructuresAndCollections.stack.linkedList.Stack;

public class Main {
    public static void main(String[] args) {

// Javanın içerisinde olan Stack yapısının kullanımı
        /*
        Stack <Integer> stack = new Stack<Integer>();
        boolean result = stack.empty(); // Yığınımızı check edicek fonksiyon
        System.out.println("Is the Stack empty ? "+result);
        stack.push(12);
        stack.push(15);
        stack.push(17);
        System.out.println("top value : "+stack.peek());

                stack.pop();
        System.out.println("top value : "+stack.peek());
        System.out.println("search index "+stack.search(15));
        stack.pop();
        stack.pop();
        System.out.println("is the stack empty ? + "+stack.empty());*
        */

        /*
        Stack Array
        StackArray stack= new StackArray();
        if(stack.isEmpty()){
            System.out.println(" yıgın boş konumda");
        }
        stack.push(51);
        stack.push(61);
        System.out.println("yıgının ilk elemanı "+ stack.pop());
        stack.push(34);
        stack.push(33);
        System.out.println("yıgının ilk elemanı "+stack.pop());
        System.out.println("yıgının ilk elemanı "+stack.pop());
        System.out.println("yıgının şu anda en üstte hangi elemanı bulunuyor "+stack.peek());
        System.out.println("yıgının ilk elemanı "+stack.pop());
        if(stack.isEmpty()){
            System.out.println("stack tekrardan boş konuma getirilmiştir");
        }

        String word ="emirhan doğandemir";
        char[] wordArray= word.toCharArray();

        System.out.println("dizi array "+wordArray.length);
        for(int i=0;i<wordArray.length;i++){
            System.out.println(wordArray[i]);

        }
        //System.out.println(wordArray[18]); // index out of bounds exception
*/

        Stack stack= new Stack();
        if(stack.isEmpty()){
            System.out.println("Yıgın boş");
        }
        stack.push(51);
        stack.push(61);
        System.out.println("Yıgının ilk elemanı "+ stack.pop());
        stack.push(33);
        stack.push(34);
        System.out.println(" yıgının ilk elemanı "+ stack.pop());
        System.out.println(" yıgının ilk elemanı "+stack.pop());
        System.out.println("yıgında en üstte şu anda hangi eleman gözüküyor "+stack.peek());
        System.out.println("yıgının ilk elemanı "+stack.pop());
        if(stack.isEmpty()){
            System.out.println("yıgın boş konuma gelmiştir");
        }


    }


}
