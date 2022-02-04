import java.util.ArrayList;
import java.util.List;

public class ageComputation {

    public int ageDifference(int age1, int age2){
        int agediff;
        List<String> agePair = new ArrayList<>();
        if(age1>age2)
             agediff=age1-age2;
            else
                agediff= age2-age1;
            return(agediff);
    }

    public String pair(int age1, int age2){
        return "{"+age1+","+age2+"}" ;
    }
}
