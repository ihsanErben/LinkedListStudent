import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Class x = new Class();
        boolean cikis = false;
        while (cikis == false) {
            System.out.println("0 - exit");
            System.out.println("1 - add");
            System.out.println("2 - add(prev)");
            System.out.println("3 - remove(id)");
            System.out.println("4 - remove(prev)");
            System.out.println("5 - sum of averages");
            System.out.println("6 - The most succesfull student");
            System.out.println("7 - print");
            System.out.print("choose an action: ");
            int action = input.nextInt();
            System.out.println("");
            switch (action) {

                case 0:
                    cikis = true;
                    break;
                case 1:
                    System.out.print("id: ");
                    String id = input.next();
                    System.out.print("name: ");
                    String name = input.next();
                    System.out.print("tr: ");
                    int tr = input.nextInt();
                    System.out.print("mat: ");
                    int mat = input.nextInt();
                    System.out.print("fen: ");
                    int fen = input.nextInt();
                    System.out.print("sos: ");
                    int sos = input.nextInt();
                    x.addStudent(id, name, tr, mat, fen, sos);
                    x.print();
                    break;
                case 2:
                    
                    System.out.print("enter a id: ");
                    String id2 = input.next();
                    Student prev = x.search(id2);
                    if(prev == null){
                        System.out.println("There is no like that id");
                        break;
                    }
                    System.out.print("id: ");
                    String id1 = input.next();
                    System.out.print("name: ");
                    String name1 = input.next();
                    System.out.print("tr: ");
                    int tr1 = input.nextInt();
                    System.out.print("mat: ");
                    int mat1 = input.nextInt();
                    System.out.print("fen: ");
                    int fen1 = input.nextInt();
                    System.out.print("sos: ");
                    int sos1 = input.nextInt();
                    x.addStudentAfterPrev(id1, name1, tr1, mat1, fen1, sos1, prev);
                    break;
                case 3:
                    System.out.print("id: ");
                    String id3 = input.next();
                    x.removeWithId(id3);
                    break;
                case 4:
                    System.out.print("enter a id: ");
                    String id4 = input.next();
                    Student prev2 = x.search(id4);
                    if(prev2 == null){
                        System.out.println("There is no like that id");
                        break;
                    }
                    x.removeStudentAfterPrev(prev2);
                    break;
                case 5:
                    System.out.println("Sum of the averages: " + x.sumOfAverages());
                    break;
                case 6:
                    Student succesfull = x.succesfull();
                    System.out.println("The most succesfull student:");
                    succesfull.bilgileriGoster();
                    break;
                case 7:
                    x.print();
                    break;
            }
            System.out.println("");
        }
        
    }
}
