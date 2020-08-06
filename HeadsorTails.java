public class HeadsorTails{
    public static void main(String[] args){
        int count=0;
        System.out.println("Tossing a coin...");
        for(int i=0;i<3;i++){
        int r = new java.util.Random().nextInt(2);
        System.out.print("Round"+(i+1)+":");
        if(r == 0){
            System.out.println("Heads");
            count++;
        }
        else{
            System.out.println("Tails");
        }
        }
        System.out.println("Heads:"+count+",Tails:"+(3-count));
    }
} 