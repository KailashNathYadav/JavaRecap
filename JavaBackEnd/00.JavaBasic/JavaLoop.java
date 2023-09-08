public class JavaLoop {
    public static void main(String[] args) {
        //for , for-each , while , do-while , iterator
        for(int i = 1; i < 11 ; i ++){
            System.out.println(i);
        }

        int a = 10;
        while(a != 0){
            System.out.println(a);
            a --;
        }

        String[] arr = {"Satyam","Ankit","Shivam"};
        for(String name: arr)
            System.out.println(name);
        
        //Some loop control statement : break , continue
    }

}
