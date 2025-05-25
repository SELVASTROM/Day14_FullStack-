import java.util.*;
class Remove {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        LinkedList<String> cityname=new LinkedList<>();
        System.out.print("Enter the no of cities you have to add :");
        int count=s.nextInt();s.nextLine();
        for(int i=1;i<=count;i++){
            System.out.println("Enter the "+i+" city name : ");
            cityname.add(s.nextLine());
        } 
        LinkedList<String> newcity = new LinkedList<>();
        for(String name:cityname){
            if(!newcity.contains(name)) {
                newcity.add(name);
            }
        }
        System.out.println("The list without duplicates is "+newcity);
        s.close();
    }
    
}
