package utilities;

import org.junit.Test;

import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class CarMileageTests {

        @Test
        public void testTooSmall() {
            assertEquals(0, CarMileage.isInteresting(3, new int[]{1337, 256}));
        }
        @Test
        public void noAwesomePhrasesTest(){
            assertEquals(0, CarMileage.isInteresting(102, new int[]{}));
        }
        @Test
        public void allZeros(){
            assertEquals(2, CarMileage.isInteresting(9000, new int[]{}));
        }
        @Test
        public void allZeros1(){
            assertEquals(1, CarMileage.isInteresting(8999, new int[]{}));
        }
        @Test
        public void allSame(){
            assertEquals(2, CarMileage.isInteresting(9999, new int[]{}));
        }
        @Test
        public void allSame1(){
            assertEquals(1, CarMileage.isInteresting(9997, new int[]{}));
        }
        @Test
        public void dinker(){
            assertEquals(2, CarMileage.isInteresting(543210, new int[]{}));
        }
        @Test
        public void dinker1(){
            assertEquals(1, CarMileage.isInteresting(543209, new int[]{}));
        }
        @Test
        public void inker(){
            assertEquals(2, CarMileage.isInteresting(123456, new int[]{}));
        }
        @Test
        public void inker1(){
            assertEquals(1, CarMileage.isInteresting(123455, new int[]{}));
        }

        @Test
        public void testAlmostAwesome() {
            assertEquals(1, CarMileage.isInteresting(1336, new int[]{1337, 256}));
        }

        @Test
        public void testAwesome() {
            assertEquals(2, CarMileage.isInteresting(1337, new int[]{1337, 256}));
        }

        @Test
        public void testFarNotInteresting() {
            assertEquals(0, CarMileage.isInteresting(11208, new int[]{1337, 256}));
        }

        @Test
        public void testAlmostInteresting() {
            assertEquals(1, CarMileage.isInteresting(11209, new int[]{1337, 256}));
        }

        @Test
        public void testInteresting() {
            assertEquals(2, CarMileage.isInteresting(12344321, new int[]{1337, 256}));
        }

    }

