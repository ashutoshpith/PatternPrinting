class Main{
    public static void main(String[] args) {
        // String txt = "AABAACAADAABAAABAA"; 
        // String pat = "AABA";  
        String txt = "ABCEABCDABCEABCD";  
        String pat = "ABCD";  
        search(txt, pat); 
    }


    public static void search(String text, String pat){
        int M = pat.length();
        int N = text.length();
        int i=0;
          while(i<=N-M) {
            int j;
            for (j = 0; j < M; j++) 
                if(text.charAt(i+j) != pat.charAt(j))
                break;

                if(j == M){
                    System.out.println("At index "+i);
                    i = i+M;
                }
                else if( j==0)
                i = i+1;
                else
                i = i+j;
                
            
            
        }

    }
}