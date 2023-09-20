import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void test1() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.setCurrentVolume(50);

        int actual = radio.getCurrentVolume();
        int expected = 50;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.setCurrentVolume(101);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void test6() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test7() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test8() {
        Radio radio = new Radio();

        int actual = radio.getCurrentStation();

        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test9() {
        Radio radio = new Radio();

        int actual = radio.getCurrentVolume();

        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test10() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test11() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test12() {
        Radio radio = new Radio();

        int initialVolume = radio.getCurrentVolume();
        Assertions.assertEquals(0, initialVolume);

        radio.increaseVolume();

        int afterIncrease = radio.getCurrentVolume();
        Assertions.assertEquals(1, afterIncrease);
    }

    @Test
    public void test13() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int initialVolume = radio.getCurrentVolume();
        Assertions.assertEquals(100, initialVolume);

        radio.increaseVolume();
        radio.increaseVolume();

        int afterIncrease = radio.getCurrentVolume();
        Assertions.assertEquals(100, afterIncrease);
    }

    @Test
    public void test14() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int initialVolume = radio.getCurrentVolume();
        Assertions.assertEquals(0, initialVolume);

        radio.decreaseVolume();
        radio.decreaseVolume();

        int afterDecrease = radio.getCurrentVolume();
        Assertions.assertEquals(0, afterDecrease);
    }

    @Test
    public void test15() {
        Radio radio = new Radio();


        radio.setCurrentVolume(50);

        int initialVolume = radio.getCurrentVolume();
        Assertions.assertEquals(50, initialVolume);

        radio.increaseVolume();

        int afterIncrease = radio.getCurrentVolume();
        Assertions.assertEquals(51, afterIncrease);
    }

    @Test
    public void test16() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);

        int initialVolume = radio.getCurrentVolume();
        Assertions.assertEquals(50, initialVolume);

        radio.decreaseVolume();

        int afterDecrease = radio.getCurrentVolume();
        Assertions.assertEquals(49, afterDecrease);
    }

    @Test
    public void test17() {
        Radio radio = new Radio();

        radio.setCurrentStation(3);

        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test18() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);

        int initialVolume = radio.getCurrentVolume();
        Assertions.assertEquals(50, initialVolume);

        radio.decreaseVolume();

        int afterDecrease = radio.getCurrentVolume();
        Assertions.assertEquals(49, afterDecrease);
    }

    @Test
    public void test19() {
        Radio radio = new Radio(5);
        radio.setCurrentVolume(105);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }


}
