import java.util.*;
class Traverseing {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        LinkedList<String> colors=new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        for(int i=0;i<colors.size();i++){
            System.out.println("The colors of the index is "+colors.get(i));
        }
        for(String words:colors){
                System.out.println("The final output is "+words);
                s.close();

        }
    }
    
}
