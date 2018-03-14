package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
/**
 * Created by dinu on 3/14/18.
 */
@RunWith(AndroidJUnit4.class)
public class EndPointsAsyncTaskTest {
    Context context;

    public EndPointsAsyncTaskTest(){

    }

    @Test
    public void dinutest(){
        assertTrue(true);
    }


    @Test
    public void testVerifyJoke() throws InterruptedException {
        final CountDownLatch latch = new CountDownLatch(1);
        context = InstrumentationRegistry.getContext();
        EndpointsAsyncTask testAsyncTask = new EndpointsAsyncTask() {
            @Override
            protected void onPostExecute(String result) {
                assertNotNull(result);
                if (result != null){
                    assertTrue(result.length() > 0);
                    latch.countDown();
                }
            }
        };
        testAsyncTask.execute(context);
        latch.await();
    }
}
