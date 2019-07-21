class Main{
    public static void main(String[] args) {
        String txt = "AABAACAADAABAAABAA"; 
        String pat = "AABA"; 
        search(txt, pat); 
    }


    public static void search(String text, String pat){
        int M = pat.length();
        int N = text.length();

        for (int i = 0; i <= N-M; i++) {
            int j;
            for (j = 0; j < M; j++) 
                if(text.charAt(i+j) != pat.charAt(j))
                break;

                if(j== M){
                    System.out.println("At index "+i);
                }
                
            
            
        }

    }
}