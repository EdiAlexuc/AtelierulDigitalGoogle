package Functional.CodeChallenge2;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.Predicate;

public class Producer {
    @Test
    public void predicate_1(){
        Predicate<String> p1 = s -> s.isEmpty();
        Predicate<String> notPredicate = p1.negate();

        Assert.assertFalse(notPredicate.test(""));
        Assert.assertTrue(notPredicate.test("Not empty"));
    }

    @Test
    public void predicate_2() {
        Predicate<String> p1 = s -> s!= null;
        Predicate<String> p2 = s -> !s.isEmpty();
        Predicate<String> p3 = null;

        Assert.assertFalse(p3.test(""));
        Assert.assertFalse(p3.test(null));
        Assert.assertTrue(p3.test("Not empty!"));
    }
}
