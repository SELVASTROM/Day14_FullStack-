import java.util.*;
class Odd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
         LinkedList<String> cities = new LinkedList<>();
         System.out.print("Enter the  now many city name you have to add :");
        int count=s.nextInt();s.nextLine();
        for(int i=0;i<count;i++){
            System.out.print("Enter the "+(i+1)+" city name :");
            cities.add(s.nextLine());
        }
        LinkedList<String> oddcities=new LinkedList<>();
        for(int i=0;i<cities.size();i++){
            if(i%2==0){
                oddcities.add(cities.get(i));
            }
        }
        System.out.println("The result of the cities is listed "+oddcities);
        s.close();
    }
}
