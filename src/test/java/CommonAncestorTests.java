import org.junit.Assert;
import org.junit.Test;

//Was hoping to use junit 5 with parametrised tests + Assert J but platform only allows junit 4
public class CommonAncestorTests {
    @Test
    public void exampleTestCase() {
        Assert.assertEquals("this is an example", "this is an example");
    }

    @Test
    public void run_inputs13And15_returns3() {
        int index1 = 13;
        int index2 = 15;
        int expectedFirstCommonAncestorAncestor = 3;

        int actualFirstCommonAncestor = Solution.run(index1, index2);

        Assert.assertEquals(expectedFirstCommonAncestorAncestor, actualFirstCommonAncestor);
    }

    @Test
    public void run_inputs11And13_returns1() {
        int index1 = 11;
        int index2 = 13;
        int expectedFirstCommonAncestorAncestor = 1;

        int actualFirstCommonAncestor = Solution.run(index1, index2);

        Assert.assertEquals(expectedFirstCommonAncestorAncestor, actualFirstCommonAncestor);
    }

    @Test
    public void run_inputs10And11_returns5() {
        int index1 = 10;
        int index2 = 11;
        int expectedFirstCommonAncestorAncestor = 5;

        int actualFirstCommonAncestor = Solution.run(index1, index2);

        Assert.assertEquals(expectedFirstCommonAncestorAncestor, actualFirstCommonAncestor);
    }

    @Test
    public void run_inputs0And0_returnsMinus1() {
        int index1 = 0;
        int index2 = 0;
        int expectedFirstCommonAncestorAncestor = -1;

        int actualFirstCommonAncestor = Solution.run(index1, index2);

        Assert.assertEquals(expectedFirstCommonAncestorAncestor, actualFirstCommonAncestor);
    }

    @Test
    public void run_inputs1And0_returns1() {
        int index1 = 0;
        int index2 = 0;
        int expectedFirstCommonAncestorAncestor = 1;

        int actualFirstCommonAncestor = Solution.run(index1, index2);

        Assert.assertEquals(expectedFirstCommonAncestorAncestor, actualFirstCommonAncestor);
    }

    @Test
    public void run_inputs0And1_returns1() {
        int index1 = 1;
        int index2 = 1;
        int expectedFirstCommonAncestorAncestor = 1;

        int actualFirstCommonAncestor = Solution.run(index1, index2);

        Assert.assertEquals(expectedFirstCommonAncestorAncestor, actualFirstCommonAncestor);
    }

    @Test
    public void run_inputs2And0_returns2() {
        int index1 = 2;
        int index2 = 0;
        int expectedFirstCommonAncestorAncestor = 2;

        int actualFirstCommonAncestor = Solution.run(index1, index2);

        Assert.assertEquals(expectedFirstCommonAncestorAncestor, actualFirstCommonAncestor);
    }

    @Test
    public void run_inputs0And2_returns2() {
        int index1 = 0;
        int index2 = 2;
        int expectedFirstCommonAncestorAncestor = 2;

        int actualFirstCommonAncestor = Solution.run(index1, index2);

        Assert.assertEquals(expectedFirstCommonAncestorAncestor, actualFirstCommonAncestor);
    }

    @Test
    public void run_inputsMinus1And1_returns1() {
        int index1 = -1;
        int index2 = 1;
        int expectedFirstCommonAncestorAncestor = 1;

        int actualFirstCommonAncestor = Solution.run(index1, index2);

        Assert.assertEquals(expectedFirstCommonAncestorAncestor, actualFirstCommonAncestor);
    }

    @Test
    public void run_inputs1AndMinus1_returns1() {
        int index1 = 1;
        int index2 = -1;
        int expectedFirstCommonAncestorAncestor = 1;

        int actualFirstCommonAncestor = Solution.run(index1, index2);

        Assert.assertEquals(expectedFirstCommonAncestorAncestor, actualFirstCommonAncestor);
    }
}
