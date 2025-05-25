import java.util.*;
class Palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        LinkedList<String> cityname=new LinkedList<>();
        System.out.print("Enter the  now many city name you have to add :");
        int count=s.nextInt();s.nextLine();
        for(int i=0;i<count;i++){
            System.out.print("Enter the "+(i+1)+" city name :");
            cityname.add(s.nextLine());
        }
        LinkedList<String> reverse=new LinkedList<>();
        for(int i=cityname.size()-1;i>=0;i--){
            reverse.add(cityname.get(i));
        }
        if(cityname.equals(reverse)){
            System.out.println("the list is palindrome");
        }else{
            System.out.println("it is not a palindrome");
        }
        s.close();
    }
}
