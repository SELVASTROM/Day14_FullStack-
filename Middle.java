import java.util.*;
 class Middle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        LinkedList<String> cities = new LinkedList<>();
         System.out.print("Enter the  now many city name you have to add :");
        int count=s.nextInt();s.nextLine();
        for(int i=0;i<count;i++){
            System.out.print("Enter the "+(i+1)+" city name :");
            cities.add(s.nextLine());
        }
        s.close();
        if ( cities== null || cities.isEmpty()) {
            System.out.println("List is empty.");
            return;
        }

        ListIterator<String> slow = cities.listIterator();
        ListIterator<String> fast = cities.listIterator();

        while (fast.hasNext()) {
            fast.next();
            if (fast.hasNext()) {
                fast.next();
                slow.next();
            }
        }

        // slow is now at the middle
        System.out.println("Middle city is: " + slow.next());
    }
}