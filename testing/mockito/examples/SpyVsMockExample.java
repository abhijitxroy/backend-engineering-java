package testing.mockito.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;

class SpyVsMockExample {

    @Mock
    private List<String> mockList;

    @Spy
    private List<String> spyList =
            new ArrayList<>();

    @Test
    void mockVsSpy() {

        List<String> mocked =

                Mockito.mock(
                        ArrayList.class
                );

        mocked.add(
                "Mockito"
        );

        assertEquals(
                0,
                mocked.size()
        );

        List<String> spied =

                Mockito.spy(
                        new ArrayList<>()
                );

        spied.add(
                "Mockito"
        );

        assertEquals(
                1,
                spied.size()
        );

        Mockito.doReturn(
                10
        ).when(
                spied
        ).size();

        assertEquals(
                10,
                spied.size()
        );

    }

}