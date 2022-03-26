package Quiz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataTest {
    private Data studentsData = new Data();
    @BeforeEach
    void setUp() {
        Quiz quiz1 = new Quiz(90,"A-");
        Quiz quiz2 = new Quiz(95, "A");
        studentsData.add(quiz1);
        studentsData.add(quiz2);
    }
    @Test
    void getAverage() {
        Assertions.assertEquals(93,studentsData.getAverage());
    }
    @Test
    void getMaximum() {
        Assertions.assertEquals(95,studentsData.getHighestScore().getMeasure());
    }
}