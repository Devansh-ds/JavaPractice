class egg {

}

public class arraylist {
    public static void main (String[] args) {
        ArrayList<egg> mylist = new ArrayList<egg>();
        egg s = new egg();
        egg g = new egg();

        mylist.add(s);
        mylist.add(g);

        int size = mylist.size();
        boolean isit = mylist.contains(s);
        int index = mylist.indexOf(s);
        boolean empty = mylist.isEmpty();
        System.out.println(mylist);
        
    }
}
