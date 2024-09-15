public class Student {
    private String name;
    private double mark1;
    private double mark2;

    public Student(){
        this.name = null;
        this.mark1 = 0;
        this.mark2 = 0;
    }

    public Student(String name, double mark1, double mark2){
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }
    public double getMarks(int markNumber) {
        if (markNumber == 1) {
            return this.mark1;
        } else {
            return this.mark2;
        }
    }

    public double calcTotal(){
            double r = this.mark1 + this.mark2;
            return r;

        }
    }
