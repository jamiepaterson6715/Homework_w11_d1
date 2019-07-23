import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

        private WaterBottle waterbottle;

        @Before
        public void before() {
            waterbottle = new WaterBottle();
        }

        @Test
        public void canDrink() {
            waterbottle.drink();
            assertEquals(90, waterbottle.getVolume());
        }
        @Test

         public void canempty() {
            waterbottle.empty();
            assertEquals(0, waterbottle.getVolume());
        }

        @Test
        public void canfill() {
            waterbottle.fill();
            assertEquals( 100, waterbottle.getVolume());

        }


}





