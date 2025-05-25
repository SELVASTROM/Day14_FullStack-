import java.util.*;
class Rotate {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        LinkedList<String> name=new LinkedList<>();
        System.out.print("Enter the number of city name you have to add :");
        int count=s.nextInt();s.nextLine();
        for(int i=0;i<count;i++){
            System.out.println("Enter the cities you have to add :");
            name.add(s.nextLine());
        }
        System.out.print("Enter the how many rotation you have to done :");
        int rotate=s.nextInt();s.nextLine();
        rotate=rotate%name.size();
        int start=0,end=name.size()-1;
        while (start<end) {
            String temp=name.get(start);
            name.set(start, name.get(end));
            name.set(end, temp);
            start++;
            end--;
        }
                    System.out.println("the array after rotation "+name);
                    s.close();  

    }
    
}
