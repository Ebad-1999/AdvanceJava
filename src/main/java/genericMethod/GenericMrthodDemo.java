package genericMethod;

public class GenericMrthodDemo {

    public static void main(String[] args) {

        GenericMrthodDemo obj1 = new GenericMrthodDemo();

        Integer [] intArr = {2, 5, 7, 99, 4};
        Double [] doubleArr = {6.7, 5.9, 7.0};
       String [] stringArr = {"Hello", "Generics"};
        obj1.print((intArr));
        obj1.print(doubleArr);
        obj1.print(stringArr);

    }
//    public void print (Integer[] arr){
//        //
//    }
//    public void print (Double[] arr){
//        //
//    }

    //Generic Method
    public <T> void print(T[] array){
        for(T t: array){
            System.out.print(t);
        }
    }
}
