package com.cecot.bigdata.dummy.rest;

import java.util.Date;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import com.cecot.bigdata.dummy.entity.Customer;


@RestController
public class CustomerController {

	@GetMapping("/dummy")
	public void greeting(HttpServletResponse response) throws IOException {
		response.setContentType("text/csv");
		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
        String currentDateTime = dateFormatter.format(new Date());
		
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=dummy_" + currentDateTime + ".csv";
        response.setHeader(headerKey, headerValue);
		
		List<Customer> lcustomer = new ArrayList<Customer>();
		
		lcustomer.add(new Customer());
		lcustomer.add(new Customer());
		lcustomer.add(new Customer());
		
        ICsvBeanWriter csvWriter = new CsvBeanWriter(response.getWriter(), CsvPreference.STANDARD_PREFERENCE);
        
        String[] csvHeader = {"idClient", "nomClient", "cognomClient", "TelefonClient", "dirrecioClient","dataAlta","dataBaixa","motiuBaixa","numCompres","canalComunicacio"};
        String[] nameMapping = {"idClient", "nomClient", "cognomClient", "TelefonClient", "dirrecioClient","dataAlta","dataBaixa","motiuBaixa","numCompres","canalComunicacio"};
        
        csvWriter.writeHeader(csvHeader);
        
        for (Customer customer : lcustomer) {
            csvWriter.write(customer, nameMapping);
        }
        csvWriter.close();
	}
}
