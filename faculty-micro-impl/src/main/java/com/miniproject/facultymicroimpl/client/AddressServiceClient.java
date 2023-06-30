package com.miniproject.facultymicroimpl.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.miniproject.facultymicroimpl.request.AddressRequest;
import com.miniproject.facultymicroimpl.response.AddressResponse;



@FeignClient(name = "address-service", url = "${address-service.url}", path = "/api/address")
public interface AddressServiceClient {
	
	@GetMapping("{id}")
  public AddressResponse getAddressById(@PathVariable("id") Long id);
	
	@PostMapping
	public ResponseEntity<AddressResponse> createAddress(@RequestBody AddressRequest request) ;
		
	@GetMapping("/{addressId}")
	public ResponseEntity<AddressResponse> getAddress(@PathVariable Long addressId) ;
		
	@PutMapping("{id}")
	public ResponseEntity<AddressResponse> updateAddress(@RequestBody AddressRequest request,@PathVariable Long id) ;


	@DeleteMapping("{id}")
	public void deleteAddress(@PathVariable Long id) ;
		

}
