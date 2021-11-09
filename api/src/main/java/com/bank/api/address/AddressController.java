package com.bank.api.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private  AddressService addressService;

    @PostMapping("/addAddress")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> address(@RequestBody AddressDTO addressDTO){
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setCity(addressDTO.getCity());
        addressEntity.setStreet(addressDTO.getStreet());
        addressEntity.setState(addressDTO.getState());
        addressEntity.setZipCode(addressDTO.getZipCode());

        return new ResponseEntity(addressService.address(addressEntity), HttpStatus.OK);
    }

    @PutMapping("/updateAddress")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> update(@RequestBody AddressDTO addressUpdateDTO){
        AddressEntity updateAddressEntity = new AddressEntity();
        updateAddressEntity.setCity(addressUpdateDTO.getCity());
        updateAddressEntity.setStreet(addressUpdateDTO.getStreet());
        updateAddressEntity.setState(addressUpdateDTO.getState());
        updateAddressEntity.setZipCode(addressUpdateDTO.getZipCode());

        return new ResponseEntity(addressService.updateAddress(updateAddressEntity), HttpStatus.OK);
    }

}
