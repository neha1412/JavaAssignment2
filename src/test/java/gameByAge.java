import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class gameByAge {

    @Test
    public void groupByAge() {

        //Arrange
        ageComputation age = new ageComputation();
        int[] inputarray = {18, 20, 21, 21, 23};
        List<String> actualResult = new ArrayList<>();

        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("{18,20}");
        expectedOutput.add("{21,21,23}");
        expectedOutput.add("{20,21,21}");
        int i, j;

        //Act
        for (i = 0; i < inputarray.length; i++) {
            for (j = i + 1; j <inputarray.length; j++) {
                if (age.ageDifference(inputarray[i],inputarray[j]) <= 2)
                    actualResult.add(age.pair(inputarray[i],inputarray[j]));
            }
        }
        int k = 0;
        for (String expected : actualResult) {
            System.out.println(expected);

            //Assert
            Assert.assertEquals(actualResult.get(k++),expected);

        }
    }
}
