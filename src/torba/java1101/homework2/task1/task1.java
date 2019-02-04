package torba.java1101.homework2.task1;

//1. Вывести десятичные коды символов своего ФИО
//2. Перенести Фамилию в конец ФИО
//3. Развернуть строку ФИО задом наперед
public class task1 {
    public static void main(String[] args) {
        String name1 = "Торба";
        String name2 = "Антон";
        String name3 = "Андреевич";
        char [] arr2 = {'Т','о','р','б','а'};
        char [] arr1 = {'А','н','т','о','н'};
        char [] arr3 = {'А','н','д','р','е','е','в','и','ч'};
        System.out.print("Торба ");
        for(int i=0;i<arr2.length;i++) {
            System.out.print((int) arr2[i]+" ");
        }System.out.print("Антон ");
        for(int i=0;i<arr1.length;i++){
            System.out.print((int)arr1[i]+" ");
        }  System.out.print("Андреевич ");
        for(int i=0;i<arr3.length;i++) {
            System.out.print((int) arr3[i]+" ");
        }
        getReverse();
        StringBuffer sb2 = new StringBuffer();
        sb2.append(name2).append(" "+name3).append(" "+name1);
        System.out.println(sb2);
    }
    public static void getReverse() {
        String name = "Торба Антон Андреевич";
        StringBuffer sb = new StringBuffer(name);
        sb.reverse();
        System.out.println("\n" + sb);
    }
}
