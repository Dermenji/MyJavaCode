package com.company.JAVAquestion1;

import java.util.concurrent.Semaphore;

/**
 * Created by fns02 on 5/23/2016.
 */
public class Test {
    // resourceManager is created and initialized correctly

/*

    //Acquire a limited resource
    SomeResource r = resourceManager.acquire();
    r.use();
//Now release the resource to be available for other users
    resourceManager.release(r);
*/

    //////////////////////////////////////Если метод use() небезопасен относительно исключений, то этот код может привести к тому, что ресурс не будет освобожден.

   /* SomeResource r = resourceManager.acquire();
    try {
        r.use();
    } catch (Exception e) {
        ...
    } finally {
        //Now release the resource to be available for other users
        resourceManager.release(r);
    }*/
}
