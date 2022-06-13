import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SorterTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void lichyVystupSorter() {
        Sorter lichyVystupSorter=  new Sorter("1,2,3,4,5,6,7,8,9,10,11");
        assertEquals("1,3,5,7,9,11",lichyVystupSorter.getSortedNumber());

    }
    void lichyVystupStringSorter() {
        Sorter lichyVystupSorter=  new Sorter("1,2,3,4,5,6,adasd,7,8,9,10,11");
        assertEquals("1,3,5,7,9,11",lichyVystupSorter.getSortedNumber());

    }

    @Test
    void getSortedNumber2() {
    }
}