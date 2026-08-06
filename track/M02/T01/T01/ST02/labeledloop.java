public class labeledloop{
    public static void main(String[] args){
        ram:for(int i=1;i<=3;i++){
            ham:for(int j=1;j<=4;j++){
                if(i==2){
                    break ram;
                }
                System.out.println("i : " +i + " j : " + j);
            }
        }
    }
}