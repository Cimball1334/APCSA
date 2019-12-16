//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

public class Fibonacci {
    private int length;
    private int[] sequence;


    public Fibonacci() {
        setVars(99);
    }

    public Fibonacci(int size) {
        setVars(size);
    }

    public void setVars(int size) {
        length = size;
        int num = 0;
        int num2 = 1;
        int num3 = 0;
        sequence = new int[length + 1];
        for (int i = 0; i < length; i++) {
            num3 = num + num2;
            num = num2;
            num2 = num3;
            sequence[i] = num;
        }
    }

    public int getLength(){
        return length;
    }

    public int getValueAtIndex(int index) {
        index++;
        if(index > length || index < 0){
            return -1;
        }
        return sequence[index];
    }
}