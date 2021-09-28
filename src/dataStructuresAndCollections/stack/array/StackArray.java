package dataStructuresAndCollections.stack.array;

public class StackArray {

    int capacity=100;
    public int stack[];
    public int stackIndex;

    public StackArray(){
        this.stack= new int[capacity];
        this.stackIndex=-1;
    }

    public boolean isEmpty(){
        if(stackIndex<0){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(stackIndex==capacity-1){
            return true;

        }else{
            return false;
        }
    }
    // yıgının üstüne yeni eleman koyma işlemi
    public int push(int newValue){
        if(isFull()){
            // stack full olduğu için yeni eleman eklenemez
            return -1;
        }
        else{
            stackIndex++;
            stack[stackIndex]=newValue;
            return 0;
        }
    }
    public int peek(){
        if(isEmpty()){
            // stack boş ise hata evrir
            System.out.println("stack underflow");
            return -1;
        }
        return stack[stackIndex];
    }
    // En üstteki elemanı çekmek için
    public int pop(){
        if(isEmpty()){
            // yığın boş ise hata döner
            System.out.println("stack underflow ");
            return -1;
        }
        int value= stack[stackIndex];//en üsteki elemanı value değişkenine atadım
        stackIndex--;
        return value;

    }

}
