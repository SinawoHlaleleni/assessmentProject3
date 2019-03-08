package assessmentProj3;

import org.junit.*;

import static org.junit.Assert.*;

public class BookTest {
    Book Bona;
    Book Magazine;

    @Before
    public void setUp() throws Exception {
        Bona = new Book.Builder()
                .pageNum(155)
                .title("Workout")
                .build();
        Magazine = new Book.Builder()
                .pageNum(155)
                .title("Workout")
                .build();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getPageNum()
    //ObjectEquality
    {
        Assert.assertEquals(Bona,Magazine);
    }

    @Test
    public void getTitle()
       //ObjectIdentity 1
    {
        Assert.assertNotSame(Bona,Magazine);
    }

    @Test(timeout = 10)
    public void equals()
    {//timeout
       while(true);
    }

    @Ignore
    @Test
    public void disAbility()
    {
        Assert.assertEquals(Bona,Magazine);
    }

    @Test(expected = AssertionError.class)
    public void Failer(){
        Assert.assertEquals(Bona,Magazine);
    }

}