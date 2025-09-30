
public class Counter{
    private final int Number;
    private int count;

    public Counter(int number){
        this.Number=number;
    }

    public int counter(){
        int result=Number;
        for(count=1; result>2;count++ ) { 
            result=result/2;
        }

        return count;
    }
    
}