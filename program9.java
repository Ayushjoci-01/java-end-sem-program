import java.util.*;;
public class program9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the string");
        String name=sc.nextLine();
        StringBuffer result=new StringBuffer();
        String vowel="aeiouAEIOU";
        for(int i=0;i<name.length();i++)
        {
            char ch=name.charAt(i);
            if(vowel.indexOf(ch)==-1)
            {
                result.append(ch);
            }
        }
        System.out.println("string after removing the vowels");
        System.out.println(result.toString());

    }
}
