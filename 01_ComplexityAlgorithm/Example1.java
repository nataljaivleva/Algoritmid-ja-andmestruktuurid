public class Example1 {
    public static void main(String[] args) {
        String s="Hello, Java";
        long start=System.nanoTime();
        int len = s.length();
        String s2 = ""; 
        for (int i = 0; i < len; i++) {     
            char ch = s.charAt(i);  
            if (Character.isAlphabetic(ch)){           
                s2 += ch;  
            }        
        } 
        System.out.println(s2);
        long end=System.nanoTime();
        System.out.printf("Time: %d nanosec => %d ms\n",(end-start),(end-start)/1000000);

        
        start=System.nanoTime();
        len = s.length(); 
        StringBuilder sb = new StringBuilder();  
        for (int i = 0; i < len; i++) {     
            char ch = s.charAt(i);             
            if (Character.isAlphabetic(ch)){           
                sb.append(ch); 
            }      
        } 
        System.out.println(sb);
        end=System.nanoTime();
        System.out.printf("Time: %d nanosec => %d ms\n",(end-start),(end-start)/1000000);
    }
}