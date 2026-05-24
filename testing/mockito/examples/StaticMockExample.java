package testing.mockito.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

class StaticMockExample {

    @Test
    void mockStaticMethod() {

        try (

                MockedStatic<StaticUtility>
                        utilities =

                        Mockito.mockStatic(
                                StaticUtility.class
                        )

        ) {

            utilities.when(
                    StaticUtility::getEnvironment
            ).thenReturn(
                    "TEST"
            );

            String result =
                    StaticUtility.getEnvironment();

            assertEquals(
                    "TEST",
                    result
            );

        }

    }

}

class StaticUtility {

    static String getEnvironment() {

        return "PRODUCTION";

    }

}