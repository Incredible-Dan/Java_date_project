import com.dateclass.DateClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateClassTest {
    DateClass dateClass;

    @BeforeEach
    void setUp() {
        dateClass = new DateClass(22,2,2021);
    }

    @AfterEach
    void tearDown() {
        dateClass = null;
    }
    @Test
    void TestThatDateClassCanHaveThreeVariables(){
        int day = 27;
        int month = 2;
        int year = 2020;
        dateClass = new DateClass(month,day,year);
        assertNotNull(dateClass);
    }
    @Test
    void TestThatDateClassCan_Set_And_GetDay(){
        dateClass.setMonth(6);
        dateClass.setDay(30);
        assertEquals(30, dateClass.getDay());
    }

    @Test
    void TestThatDateClassCan_Set_And_GetMonth(){
        dateClass.setMonth(12);
        assertEquals(12, dateClass.getMonth());
    }
    @Test
    void TestThatDateClassCanSet_And_GetMonth(){
        dateClass.setYear(2021);
        assertEquals(2021, dateClass.getYear());
    }
    @Test
    void TestThatYearIsALeapYear(){
        boolean itsLeapYear = dateClass.isLeapYear(1992);
        assertTrue(itsLeapYear);

        itsLeapYear = dateClass.isLeapYear(2008);
        assertTrue(itsLeapYear);

    }
    @Test
    void TestThatDaysOfTheMonthIsThirtyOne_WhenMonthOfTheYearIsBetweenOneAndSeven(){
        dateClass.setMonth(1);
        dateClass.setDay(8);
        assertEquals(8, dateClass.getDay());

        dateClass.setMonth(3);
        dateClass.setDay(7);
        assertEquals(7, dateClass.getDay());

        dateClass.setMonth(5);
        dateClass.setDay(11);
        assertEquals(11, dateClass.getDay());

        dateClass.setMonth(5);
        dateClass.setDay(7);
        assertEquals(7, dateClass.getDay());

        dateClass.setMonth(8);
        dateClass.setDay(23);
        assertEquals(23, dateClass.getDay());

        dateClass.setMonth(12);
        dateClass.setDay(17);
        assertEquals(17, dateClass.getDay());

    }
    @Test
    void  TestThatDaysOfTheMonthIsThirty_WhenMonthOfTheYearIsBetweenOneAndTwelve(){
        dateClass.setMonth(2);
        dateClass.setDay(24);
        assertEquals(24,dateClass.getDay());

        dateClass.setMonth(4);
        dateClass.setDay(22);
        assertEquals(22,dateClass.getDay());

        dateClass.setMonth(6);
        dateClass.setDay(6);
        assertEquals(6,dateClass.getDay());

        dateClass.setMonth(8);
        dateClass.setDay(24);
        assertEquals(24,dateClass.getDay());

        dateClass.setMonth(4);
        dateClass.setDay(22);
        assertEquals(22,dateClass.getDay());

        dateClass.setMonth(6);
        dateClass.setDay(2);
        assertEquals(2,dateClass.getDay());
    }

    @Test
    void TestThatDateCanBeSetWhenYearIsLeapYearAndMonthIsFebruary(){
        dateClass.setDay(29);
        dateClass.setYear(2008);
        dateClass.setMonth(2);
//        assertEquals(29,dateClass.getDay());

        dateClass.setYear(1993);
        assertEquals(29,dateClass.getDay());

        dateClass.setYear(1999);
        assertEquals(29,dateClass.getDay());

    }
    @Test
    void TestThatDateCanBeSetWhenYearIsCommonYearAndMonthIsFebruary(){
        dateClass.setDay(15);
        dateClass.setMonth(2);
        dateClass.setYear(2021);
        assertEquals(29,dateClass.getDay());
    }
}