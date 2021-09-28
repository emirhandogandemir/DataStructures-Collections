package dataStructuresAndCollections.stack.linkedList;

public class Stack {
    private StackNode ust;
    public Stack(){
        this.ust=null;
    }
    public void push(int data){// yıgına eleman ekleme işlemi burada gerçekleştiriliyor
        StackNode node= new StackNode(data);
        node.next=ust;
        ust=node;
    }
    public boolean isEmpty(){
        if(ust==null){
            return true;

        }else{
            return false;
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack underflow");// boş yığın demek oluyor yani
            return -1;

        }
        return ust.data;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack underflow ");// boş yığın
            return -1;
        }
        int value=ust.data;
        //
        ust=ust.next;
        return value;
    }

}

