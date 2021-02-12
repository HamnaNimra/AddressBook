import AddressBook.AddressBookRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmokeTest {

    @Autowired
    private AddressBookRepository addressBookRepository;

    @Test
    public void contextLoads() throws Exception {
        Assertions.assertThat(addressBookRepository).isNotNull();
    }
}