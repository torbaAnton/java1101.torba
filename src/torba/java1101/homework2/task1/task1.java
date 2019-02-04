package torba.java1101.homework2.task1;



//1. Вывести десятичные коды символов своего ФИО
public class task1 {
    public static void main(String[] args) {
        char [] arr2 = {'Т','о','р','б','а'};
        char [] arr1 = {'А','н','т','о','н'};
        char [] arr3 = {'А','н','д','р','е','е','в','и','ч'};
        System.out.println("Торба");
        for(int i=0;i<arr2.length;i++) {
            System.out.println((int) arr2[i]);
        }System.out.println("Антон");
        for(int i=0;i<arr1.length;i++){
            System.out.println((int)arr1[i]);
        }  System.out.println("Андреевич");
        for(int i=0;i<arr3.length;i++) {
            System.out.println((int) arr3[i]);
        }
    }
}
