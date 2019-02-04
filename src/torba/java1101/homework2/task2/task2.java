package torba.java1101.homework2.task2;

public class task2 {
    /* 1. Вывести десятичные коды символов своего ФИО
 2. Перенести Фамилию в конец ФИО
 3. Развернуть строку ФИО задом наперед*/
    public static void main(String[] args) {
        form();
    }
    public static void form() {
        String FIO = "Торба Антон Андреевич";
        getDecimalLine(FIO);
        printNewLine();
        getReversedLine(FIO);
        printNewLine();
        getPermutedLine(FIO);
    }

    private static void getDecimalLine(String FIO) {
        for (int index = 0; index < FIO.length(); index++) {
            char character = FIO.charAt(index);
            if (character == ' ') {
                System.out.print("space(" + (int) character + ") ");
            } else {
                System.out.print((int) character + " ");
            }
        }
    }

    private static void getReversedLine(String FIO) {
        StringBuffer reversedLine = new StringBuffer(FIO.length());
        for (int index = FIO.length() - 1; index >= 0; index--) {
            char ch = FIO.charAt(index);
            reversedLine.append(ch);
        }
        System.out.print(reversedLine);
    }

    private static void getPermutedLine(String FIO) {
        StringBuffer line = new StringBuffer().append(FIO);
        int firstSpaceIndex = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
                firstSpaceIndex = i;
                break;
            }
        }
        String lastName = line.substring(0, firstSpaceIndex);
        line.delete(0, firstSpaceIndex + 1);
        line.append(' ').append(lastName);

        System.out.print(line);

    }

    private static void printNewLine() {
        System.out.println();
    }
}