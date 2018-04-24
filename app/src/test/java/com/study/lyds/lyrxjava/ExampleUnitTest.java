package com.study.lyds.lyrxjava;

import android.util.Log;

import org.junit.Test;

import io.reactivex.Observable;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);

        Observable.just(2,3,4,5)
                .contains(3)
                .subscribe(aBoolean -> Log.d("JG",aBoolean.toString()));
    }
}