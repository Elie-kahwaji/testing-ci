package com.example.demo.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(HelloController.class)
public class TestHomeController {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void whenSendNameSayHelloTest() throws Exception {
     mockMvc.perform(MockMvcRequestBuilders
                      .get("/hello").param("name", "elie")
                      .accept(MediaType.TEXT_PLAIN_VALUE))
         .andDo(print())
         .andExpect(status().isOk());
  }

  @Test
  public void whenNoNameBadRequest() throws Exception {
    mockMvc.perform(MockMvcRequestBuilders
                        .get("/hello")
                        .accept(MediaType.TEXT_PLAIN_VALUE))
        .andDo(print())
        .andExpect(status().isBadRequest());
  }

  @Test
  public void whenSendNameSayHelloTestfail() throws Exception {
    mockMvc.perform(MockMvcRequestBuilders
                        .get("/hello").param("name", "elie")
                        .accept(MediaType.TEXT_PLAIN_VALUE))
        .andDo(print())
        .andExpect(status().isBadRequest());
  }
}
