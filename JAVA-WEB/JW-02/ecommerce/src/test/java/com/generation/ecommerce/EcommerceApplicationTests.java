package com.generation.ecommerce;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultHandler;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.containsString;


@SpringBootTest
@AutoConfigureMockMvc
class EcommerceApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void pruebaGet() {
		this.mockMvc.perform(get("/miOtso/productos/"))
		.andDo( print() )
		.andExpect( status().isOk() )
		.andExpect( content().string(
				containsString("")
				) );
		
		
	}

	private void .andDo(ResultHandler print) {
		// TODO Auto-generated method stub
		
	}

	private void andExpect(ResultMatcher ok) {
		// TODO Auto-generated method stub
		
	}//PruebaGET
}
