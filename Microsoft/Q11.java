public class Q11 {
    static ArrayList<String> generate(int N)
    {
        ArrayList<String> al = new ArrayList<String>();
        for(int i=1; i<=N; i++){
            String binary = Integer.toBinaryString(i);
            al.add(binary);
        }
        return al;
    }
}
    

