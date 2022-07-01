package com.example.calculator.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(SpringExtension.class)
@WebMvcTest(CalculatorController.class)
public class CalculatorControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void messageWelcome() throws Exception {
        RequestBuilder request = get("/calculator/welcome");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("Welcome!", result.getResponse().getContentAsString());
    }

    @Test
    void addNumbers() throws Exception {
        Double n1 = 10.0;
        Double n2 = 10.0;
        String url = "/calculator/addNumbers?number1=" + n1 + "&number2=" + n2;

        RequestBuilder request = get(url);
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("20.0", result.getResponse().getContentAsString());
    }

    @Test
    void subNumbers() throws Exception {
        Double n1 = 10.0;
        Double n2 = 5.0;
        String url = "/calculator/subNumbers?number1=" + n1 + "&number2=" + n2;

        RequestBuilder request = get(url);
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("5.0", result.getResponse().getContentAsString());
    }

    @Test
    void divideNumbers() throws Exception {
        Double n1 = 10.0;
        Double n2 = 5.0;
        String url = "/calculator/divideNumbers?number1=" + n1 + "&number2=" + n2;

        RequestBuilder request = get(url);
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("2.0", result.getResponse().getContentAsString());
    }


    @Test
    void factorial() throws Exception {
        Integer factorial = 5;
        String url = "/calculator/factorial?factorial=" + factorial;

        RequestBuilder request = get(url);
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("120", result.getResponse().getContentAsString());
    }

    @Test
    void calculeDayBetweenDate() throws Exception {
        String localDate1 = "2022-07-01";
        String localDate2 = "2022-07-11";
        String url = "/calculator/calculeDayBetweenDate?localDate1=" + localDate1 + "&localDate2=" + localDate2;

        RequestBuilder request = get(url);
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("10", result.getResponse().getContentAsString());
    }

    @Test
    void integerToBinary() throws Exception {
        Integer n1 = 5;
        String url = "/calculator/integerToBinary?number1=" + 5;

        RequestBuilder request = get(url);
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("101", result.getResponse().getContentAsString());
    }

    @Test
    void integerToHexadecimal() throws Exception {
        Integer n1 = 5;
        String url = "/calculator/integerToHexadecimal?number1=" + 170;

        RequestBuilder request = get(url);
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("AA", result.getResponse().getContentAsString());
    }
}
