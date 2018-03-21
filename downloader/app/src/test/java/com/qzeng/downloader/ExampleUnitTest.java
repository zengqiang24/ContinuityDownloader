package com.qzeng.downloader;

import android.util.Log;

import org.junit.Test;

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
    }
    @Test
    public void testFileEntity_toStringMethod(){
        FileEntity fileEntity = new FileEntity("12", "name", "http://ass.xx.xx", 123.3);
        assertEquals("FileEntity(id=12, name=name, url=http://ass.xx.xx, size=123.3)",fileEntity.toString());
    }
}