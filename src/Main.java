//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student victor = new Student("victor", 10, 4);
        System.out.println(victor.getMarks(1));
        System.out.println(victor.calcTotal());
    }
}