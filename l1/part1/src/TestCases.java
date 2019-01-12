import edu.calpoly.testy.Testy;

import java.util.*;

import static edu.calpoly.testy.Assert.*;

public class TestCases
{
    private static final double DELTA = 0.00001;

    private void testSimpleIf1()
    {
        assertEquals(1.7, SimpleIf.max(1.2, 1.7), DELTA);
    }

    private void testSimpleIf2()
    {
        assertEquals(9.0, SimpleIf.max(9.0, 3.2), DELTA);
    }

    private void testSimpleIf3() { assertEquals(5.0, SimpleIf.max(5.0, 2.2), DELTA); }

    private void testSimpleLoop1()
    {
        assertEquals(7, SimpleLoop.sum(3, 4));
    }

    private void testSimpleLoop2()
    {
        assertEquals(7, SimpleLoop.sum(-2, 4));
    }

    private void testSimpleLoop3()
    {
        assertEquals(10, SimpleLoop.sum(0,4));
    }

    private void testSimpleArray1()
    {
        /* What are those parameters?  They are newly allocated arrays
            with initial values. */
        assertEquals(
            new int[] {1, 4, 9},
            SimpleArray.squareAll(new int[] {1, 2, 3}));
    }

    private void testSimpleArray2()
    {
        assertEquals(
            new int[] {49, 25},
            SimpleArray.squareAll(new int[] {7, 5}));
    }

    private void testSimpleArray3()
    {
        assertEquals(
            new int[] {9, 36, 1, 225},
            SimpleArray.squareAll(new int[] {3, 6, 1, 15}));
    }

    private void testSimpleList1()
    {
        List<Integer> input =
            new LinkedList<Integer>(Arrays.asList(new Integer[] {1, 2, 3}));
        List<Integer> expected =
            new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 4, 9}));

        assertEquals(expected, SimpleList.squareAll(input));
    }

    private void testSimpleList2()
    {
        List<Integer> input =
                new LinkedList<Integer>(Arrays.asList(new Integer[] {7, 9, 11}));
        List<Integer> expected =
                new ArrayList<Integer>(Arrays.asList(new Integer[] {49, 81, 121}));

        assertEquals(expected, SimpleList.squareAll(input));
    }

    private void testBetterLoop1()
    {
        assertTrue(BetterLoop.contains(new int[] {7, 5}, 5));
    }

    private void testBetterLoop2()
    {
        assertTrue(BetterLoop.contains(new int[] {7, 5, 2, 4}, 4));
    }

    private void testBetterLoop3()
    {
        assertFalse(BetterLoop.contains(new int[] {7, 5, 2, 4}, 69));
    }

    private void testExampleMap1()
    {
        List<String> expected = Arrays.asList("Julie", "Zoe");
        Map<String, List<Course>> courseListsByStudent = new HashMap<>();

        courseListsByStudent.put("Julie",
            Arrays.asList(
                new Course("CPE 123", 4),
                new Course("CPE 101", 4),
                new Course("CPE 202", 4),
                new Course("CPE 203", 4),
                new Course("CPE 225", 4)));
        courseListsByStudent.put("Paul",
            Arrays.asList(
                new Course("CPE 101", 4),
                new Course("CPE 202", 4),
                new Course("CPE 203", 4),
                new Course("CPE 225", 4)));
        courseListsByStudent.put("Zoe",
            Arrays.asList(
                new Course("CPE 123", 4),
                new Course("CPE 203", 4),
                new Course("CPE 471", 4),
                new Course("CPE 473", 4),
                new Course("CPE 476", 4),
                new Course("CPE 572", 4)));

        /*
         * Why compare HashSets here?  Just so that the order of the
         * elements in the list is not important for this test.
         */
        assertEquals(new HashSet<>(expected),
            new HashSet<>(ExampleMap.highEnrollmentStudents(
                courseListsByStudent, 16)));
    }

    private void testExampleMap2()
    {
        List<String> expected = Arrays.asList("Mammen");
        Map<String, List<Course>> courseListsByStudent = new HashMap<>();

        courseListsByStudent.put("Staley",
                Arrays.asList(
                        new Course("CPE 357", 4),
                        new Course("CSC 305", 4),
                        new Course("CSC 437", 4)));
        courseListsByStudent.put("Taylor",
                Arrays.asList(
                        new Course("CPE 225", 4),
                        new Course("CPE 357", 4)));
        courseListsByStudent.put("Mammen",
                Arrays.asList(
                        new Course("CSC 101", 4),
                        new Course("CSC 102", 4),
                        new Course("CSC 203", 4),
                        new Course("CPE 357", 4)));

        /*
         * Why compare HashSets here?  Just so that the order of the
         * elements in the list is not important for this test.
         */
        assertEquals(new HashSet<>(expected),
                new HashSet<>(ExampleMap.highEnrollmentStudents(
                        courseListsByStudent, 12)));
    }

    public void runTests() {
        Testy.run(
                () -> testSimpleIf1(),
                () -> testSimpleIf2(),
                () -> testSimpleIf3(),
                () -> testSimpleLoop1(),
                () -> testSimpleLoop2(),
                () -> testSimpleLoop3(),
                () -> testSimpleArray1(),
                () -> testSimpleArray2(),
                () -> testSimpleArray3(),
                () -> testSimpleList1(),
                () -> testSimpleList2(),
                () -> testBetterLoop1(),
                () -> testBetterLoop2(),
                () -> testBetterLoop3(),
                () -> testExampleMap1(),
                () -> testExampleMap2()
        );
    }
}
