
public class Student {

    String id;
    String name;
    int tr;
    int mat;
    int fen;
    int sos;
    int avegare;

    Student next;
    Student prev;

    public Student(String id, String name, int tr, int mat, int fen, int sos) {
        this.id = id;
        this.name = name;
        this.tr = tr;
        this.mat = mat;
        this.fen = fen;
        this.sos = sos;
        this.avegare = (tr * 4 + mat * 5 + fen * 3 + sos * 3);
    }
    
    public void bilgileriGoster(){
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("average: " + avegare);
    }
}
