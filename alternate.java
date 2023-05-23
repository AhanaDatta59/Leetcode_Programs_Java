import java.util.*;
class alternate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 strings");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int g=0;
        String ans="",great="";
        if(s1.length()>=s2.length()){
        great=s1;
        g=s2.length();
        }
        else{
        g=s1.length();
        great=s2;
        }
        for(int i=0;i<g;i++){
            ans=ans+s1.charAt(i)+s2.charAt(i);
        }
        String f=great.substring(g);
     System.out.println(ans+f);
    }
}

       
