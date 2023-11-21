
public class Class {

    Student first;
    Student last;

    public void addStudent(String id, String name, int tr, int mat, int fen, int sos) {
        Student newS = new Student(id, name, tr, mat, fen, sos);
        if (isEmpty()) {
            first = newS;
        } else {
            last.next = newS;
            newS.prev = last;
        }
        last = newS;
    }

    public void addStudentAfterPrev(String id, String name, int tr, int mat, int fen, int sos, Student previos) {
        Student newS = new Student(id, name, tr, mat, fen, sos);
        if (isEmpty()) {
            first = newS;
            last = newS;
        } else {
            newS.next = previos.next;
            previos.next = newS;
            newS.prev = previos;
        }
    }

    public void removeWithId(String id) {
        if (isEmpty()) {
            System.out.println("--- EMPTY ---");
            return;
        } else {
            Student tmp = first;
            while (tmp != null) {
                if (tmp.id.equals(id)) {
                    if (tmp == first) {
                        first = first.next;
                        return;
                    } else if (tmp == last) {
                        last = last.prev;
                        return;
                    } else {
                        tmp.prev.next = tmp.next;
                        tmp.next.prev = tmp.prev;
                        tmp = null;
                        return;
                    }                       // silsem ne olur ???
                }
                tmp = tmp.next;
            }
            System.out.println("There is no that you are looking id");
            return;
        }
    }

    public void removeStudentAfterPrev(Student prev) {
        if (isEmpty()) {
            System.out.println("--- EMPTY ---");
            return;
        } else if(first == last){
            first = null;
            last = null;
            System.out.println("--- EMPTY ---");
            return;
        }else if (prev == first) {
            prev.next = prev.next.next;
            prev.next.prev = prev;
        } else if (prev == last) {
            System.out.println("There is no student after the last student.");
            return;
        } else {
            prev.next = prev.next.next;
            prev.next.prev = prev;
        }
    }

    public void print() {
        System.out.println("---------------------------");
        Student tmp = first;
        while (tmp != null) {
            System.out.println("id: " + tmp.id);
            System.out.println("name: " + tmp.name);
            System.out.println("Average: " + tmp.avegare);
            System.out.println("---------------------------");
            tmp = tmp.next;
        }
    }

    public boolean isEmpty() {
        if (first == null) {
            return true;
        } else {
            return false;
        }
    }

    public int sumOfAverages() {
        int sum = 0;
        if (isEmpty()) {
            System.out.println("--- EMPTY ---");
            return 0;
        } else {
            Student tmp = first;
            while (tmp != null) {
                sum += tmp.avegare;
                tmp = tmp.next;
            }
        }
        return sum;
    }

    public Student succesfull() {
        int top = 0;
        Student best = first;
        if (isEmpty()) {
            System.out.println("--- EMPTY ---");
            return null;
        } else {
            Student tmp = first;
            while (tmp != null) {
                if (tmp.avegare > top) {
                    top = tmp.avegare;
                    best = tmp;
                }
                tmp = tmp.next;
            }
        }
        return best;
    }

    public Student search(String id) {
        Student tmp = first;
        while (tmp != null) {
            if (tmp.id.equals(id)) {
                return tmp;
            }
            tmp = tmp.next;
        }
        return null;
    }
}
