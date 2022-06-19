package com.example.unitest;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void testIsFIOValid() {
        String testLogin = "login";
        String testPassword = "PASS1234@";
        String testFIO = "Aksenov Andrew Alekseevich";
        String testEmail = "isip_a.a.aksenov@mpt.ru";

        Assert.assertThat(String.format("Неверен логин %s",testLogin), Utilits.Login(testLogin), is(true));
        Assert.assertThat(String.format("Неверен пароль %s",testPassword), Utilits.Password(testPassword), is(true));
        Assert.assertThat(String.format("Неверен ФИО %s",testFIO), Utilits.checkFIOValidity(testFIO), is(true));
        Assert.assertThat(String.format("Неверен email %s",testEmail), Utilits.checkEmailForValidity(testEmail), is(true));
    }
}