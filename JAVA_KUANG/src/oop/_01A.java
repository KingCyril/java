package oop;

public class _01A {

    public static void main(String[] args) {

        int[] arr = {1,2,4,5,6};

        change(arr);
        System.out.println(arr);

        new _01A().add(1,4);
    }

    public static void change(int[] arr){
        arr[0] = 3;
        System.out.println(arr);
    }


    public void add(int a, int b){
        int c = a + b;
        print(c);
    }

    public void print(int c){
        System.out.println(c);
    }
}
