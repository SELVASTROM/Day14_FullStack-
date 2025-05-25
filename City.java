import java.util.*;
class City {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        LinkedList<String> cityname=new LinkedList<>();
        System.out.print("Enter the  now many city name you have to add :");
        int count=s.nextInt();s.nextLine();
        for(int i=0;i<count;i++){
            System.out.print("Enter the "+(i+1)+" city name :");
            String Name=s.nextLine();
            cityname.add(Name);
        }
        cityname.addFirst("Tiruppur");
        cityname.addLast("Tutocorin");
        cityname.set(2,"Coimbatore");
        for(String Names:cityname){
            System.out.println("The city names you have to add remaing after the operation is "+Names);
        }
        s.close();
    }
    
}
