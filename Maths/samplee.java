import java.util.Scanner;
public class samplee {
    public static void main(String[] args)
    {
        
        System.out.println("Hell");
        String name11="Mukesh";
        long dd=10l;
        float g=7.8f;
        /*System.out.println("Hell"+name);
        System.out.printf("Heel is %s\n",name);*/
        System.out.println((int)30.222);
        System.out.println((double)3);
        int intfromstring = Integer.parseInt("20");
        System.out.println(intfromstring);
        String name="Mukreeh patel";
        System.out.print(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("pat "));
        System.out.println(name.indexOf("3"));
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,6));
        System.out.println(Math.pow(2,3));
        System.out.println(Math.sqrt(144)); 

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name");
        String jo=sc.nextLine();
        //sc.nextInt(),sc.nextDouble()
        System.out.println(jo);
        int array[]={0,1,2,4,5,7,89};
        //int [][]array={{1,2},{5,6}}
        //int [] array=new int[10];
        array[2]=9;
        System.out.println(array[2]);
        System.out.println(array.length);
        //length is attribute not a method of array so we do not keep paranthesiis
        //learn arraylist//
        int sum=addnum(9,4);
        System.out.println(sum);
        boolean sumx=false;
        boolean sum1=true;
        if(sumx && sum1)
        {
            System.out.println("true");

        }
        else if(sumx || sum1)
        {
            System.out.println("false");
        }
        if ("dog".equals("cat")){
            System.out.println("stringsd are equal");
        }
        int []luck={3,5,6,7,9,9};
        for (int lucky : luck)
        {
            System.out.println(lucky);
        }
        //Book b1=new Book();
        //b1.title="Harry Potter";
        //b1.author="Jk rowling";
       // b1.readBook();
        //System.out.println(b1.title);
        //System.out.println(Book.stT);
        Book b2=new Book();
        System.out.println(b2.title);
        Book b3=new Book("Harry Potter","jh");
        System.out.println(b3.title);



    }
     

    public static int addnum(int x1,int x2)
{
    return x1+x2;
}
}
class Book 
{
    public String title;
    public String author;
    public static String stT="mY STATIC  attribute";
    //static means it will just belomg to Book class

    public void readBook(){
        System.out.println("Reading" +this.title+"by"+this.author);
    }
    //constructors
    public Book()
    {
        this.title="no title";
        this.author="no author";
    }
    public Book(String title,String author)
    {
        this.title=title;
    
    }
}

     