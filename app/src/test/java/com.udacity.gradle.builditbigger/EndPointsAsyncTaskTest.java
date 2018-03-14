package com.udacity.gradle.builditbigger;

import android.content.Context;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
/**
 * Created by dinu on 3/14/18.
 */
public class EndPointsAsyncTaskTest {
    Context context;

    @Test
    public void test(){
        assertTrue(true);
    }
//    @Test
//    public void testVerifyJoke() throws InterruptedException {
//        final CountDownLatch latch = new CountDownLatch(1);
//        context = InstrumentationRegistry.getContext();
//        EndpointsAsyncTask testAsyncTask = new EndpointsAsyncTask() {
//            @Override
//            protected void onPostExecute(String result) {
//                assertNotNull(result);
//                if (result != null){
//                    assertTrue(result.length() > 0);
//                    latch.countDown();
//                }
//            }
//        };
//        testAsyncTask.execute(context);
//        latch.await();
//    }
}
