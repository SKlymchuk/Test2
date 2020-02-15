import com.company.Controller;
import com.company.Model;
import com.company.View;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class testController {
    Model model = new Model();
    View view = new View();
    Random rand = new Random();

    @Test
    public void testRandom(){
        Controller a = new Controller(model, view);
        int[] n = new int[100000];
        System.out.println(n.length);

        for (int i = 0; i < n.length - 1; i++){
            n[i] = a.getRandValue(rand);
//            Assert.assertFalse(n[i] <= 0 || n[i] >= 100);
        }
        System.out.println(Arrays.toString(n));

    }
}

