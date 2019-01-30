package eu.napcode.gonoteit.ui.main;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import eu.napcode.gonoteit.MockRxSchedulers;
import eu.napcode.gonoteit.repository.user.UserRepository;
import eu.napcode.gonoteit.rx.RxSchedulers;

@RunWith(MockitoJUnitRunner.class)
public class MainViewModelTest {

    @Mock
    UserRepository userRepository;

    private MainViewModel mainViewModel;
    private RxSchedulers rxSchedulers = new MockRxSchedulers();

    @Before
    public void init() {
        this.mainViewModel = new MainViewModel(userRepository, rxSchedulers);
    }

    @Test
    public void testGetLoggedInUser() {
        userRepository.getLoggedInUser();

        Mockito.verify(userRepository).getLoggedInUser();
    }

    @Test
    public void testLogoutUser() {
        userRepository.logoutUser();

        Mockito.verify(userRepository).logoutUser();
    }
}