package objectModel.test;

import objectModel.Card;
import org.junit.Test;

/**
 * Created by tomas on 10/8/2017.
 */
public class TestCard {

    @Test
    public void testConstructor_validNameIn_noException() {
        Card c = new Card("test-card");
    }
}
