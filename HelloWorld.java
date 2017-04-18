/**
 * Created by nata on 16.04.2017.
 */
public class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Hello "+args[0]);
        String [] friends = new String[args.length];
        int n = args.length;
        int i = 0;
        for (String s:args){
            friends[i] = s;
            i++;
        }

        for (String s:friends)
            System.out.println("Hello " + s);

        for (i=0;i<friends.length;++i){
            System.out.println("I love "+ friends[i]);
        }



    }


}
