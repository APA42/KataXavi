package com.apa42.kata.xavi;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 * Created by APA42 on 07/05/15.
 */
public class HelloTest {

    private SUT my_sut;
    @Mock
    private Collaborator1 my_collaborator;

    @Before
    public void before(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void sayHelloTest() throws Exception {
        my_sut = new SUT(my_collaborator);

        String result = my_sut.sayHello();

        Assert.assertEquals(result, "hello");
    }

    @Test
    public void otherTest() {
        my_sut = new SUT(my_collaborator);
        Mockito.when(my_collaborator.getNombre()).thenReturn("42");

        String result = my_sut.sayWithCollaborator();

        Assert.assertEquals(result, "hello 42");
    }


}
