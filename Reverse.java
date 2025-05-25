import java.util.*;
class Reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        LinkedList<String> name=new LinkedList<>();
        System.out.print("Enter the number of city name you have to add :");
        int count=s.nextInt();s.nextLine();
        for(int i=0;i<count;i++){
            System.out.println("Enter the cities you have to add :");
            name.add(s.nextLine());
        }
        LinkedList<String> Cityname=new LinkedList<>();
        for(int i=name.size()-1;i>=0;i--){
            Cityname.add(name.get(i));
        }
        System.out.println("The reversed list is :"+Cityname);

        s.close();
    }
    
}
