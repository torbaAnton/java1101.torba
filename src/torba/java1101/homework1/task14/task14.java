package torba.java1101.homework1.task14;

public class task14 {
    //Напишите метод переводящий гривны в доллары по заданному курсу. В качестве аргументов передайте кол-во гривен и курс.
    public static void main(String[] args) {
        System.out.println("Получается долларов: "+getConvert(4800,0.036f));

    }
    public static float getConvert(float hryvnia, float rate){
        return hryvnia*rate;
    }
}