package paket;

public class Student implements Comparable<Student>{

    private int index;
    private String ime;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public Student(int index, String ime) {
        this.index = index;
        this.ime = ime;
    }

    @Override
    public int compareTo(Student o) {
        if(this.index < o.index) {
            return 1;
        }
        else if(this.index > o.index) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
