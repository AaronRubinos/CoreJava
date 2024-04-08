class ConditionalStatements {
    public static void main(String[] args) {
        
        int x =8;
        int y =7;
        int z =9;

        if(x>y && x>z)  {   //false
            System.out.println(x);
        }
        else if(y>x && y>z) { //false
            System.out.println(y);
        }
        else    {
            System.out.println(z);
        }

        /* 
        if (x>10 && x<=20)   {  //11-20
            System.out.println("Hello");    
        }
        else    {
            System.out.println("Bye");
        }
        */

        //if else if
    }
}