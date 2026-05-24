package testing.mockito.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

class MockInitializationExample {

    private AutoCloseable closeable;

    @Mock
    private UserRepository repository;

    @InjectMocks
    private UserService service;

    @BeforeEach
    void setup() {

        /*
         Deprecated Mockito initialization.

         MockitoAnnotations
                 .initMocks(this);
        */

        /*
         Modern Mockito initialization.
         Recommended approach.
        */

        closeable =

                MockitoAnnotations
                        .openMocks(this);

    }

    @AfterEach
    void tearDown()
            throws Exception {

        closeable.close();

    }

    @Test
    void initializeMockObjects() {

        Mockito.when(

                repository.findName()

        ).thenReturn(

                "Backend Engineer"

        );

        String result =

                service.fetchUser();

        assertEquals(

                "Backend Engineer",
                result

        );

        Mockito.verify(
                repository
        ).findName();

    }

}

class UserService {

    private final UserRepository repository;

    UserService(
            UserRepository repository
    ) {

        this.repository =
                repository;

    }

    String fetchUser() {

        return repository.findName();

    }

}

class UserRepository {

    String findName() {

        return "REAL_USER";

    }

}