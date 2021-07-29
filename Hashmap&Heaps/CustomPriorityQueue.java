import java.util.Collections;
import java.util.PriorityQueue;

public class CustomPriorityQueue {
    public static class Student implements Comparable<Student> {
        String name;
        int marks;

        Student() {

        }

        Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        // +ve -> this>other
        // -ve -> this<other
        // 0 -> this==other

        public int compareTo(Student o) {
            // if (this.marks < o.marks) {
            //     return -1;
            // } else if (this.marks > o.marks) {
            //     return 1;
            // } else {
            //     return 0;
            // }

            if(this.marks!=o.marks){
                return this.marks-o.marks;
            }else{
                return -(this.name.compareTo(o.name));
            }

        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(new Student("A", 70));
        pq.add(new Student("B", 90));
        pq.add(new Student("C", 70));
        pq.add(new Student("D", 95));
        pq.add(new Student("E", 70));
        pq.add(new Student("F", 70));

        while (pq.size() > 0) {
            Student st = pq.remove();
            System.out.println(st.name + "-> " + st.marks);
        }
    }

}
