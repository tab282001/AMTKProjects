package factorial;

public class FactorialClass {
    public int fact (int input)
    {
        int fact = 1;
        for(int i=1; i<=input;i++){
            fact = fact * i;
        }
        return(fact);
    }
    public int factRec( int input){
        if(input<=1)return 1;
        return ( factRec(input-1)*input);

    }

}
