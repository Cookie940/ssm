package com.spring;

import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18NTest {

    @Test
    public void i18n(){
        //读取资源文件下的message资源文件,根据美式英语
        ResourceBundle rb = ResourceBundle.getBundle("i18n/messages/message", Locale.CANADA);
        System.out.println(rb.getString("info"));
    }
}
