import java.util.*;
class Basic{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        LinkedList <String> students=new LinkedList<>();
        students.add("Selva");
        students.add("Murugan");
        students.add("ravanan");
        students.add("raman");
        students.add("keerthy");
        students.add("asif");
        System.out.println("The students list is here "+students);
        System.out.println("The first student name is "+students.getFirst());
        System.out.println("The last student name is "+students.getLast());
        students.set(2,"suriya");
        System.out.println("The updated list is "+students);
        //remove list
        students.remove("keerthy");
        students.remove(2);
        students.removeFirst();
        students.removeLast();
        System.out.println("The final list of the given student name is "+students);
        s.close();

    }
}