package com.bank.api.address;


import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class AddressService {
    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public String address(AddressEntity address) {
        if (address != null){
            addressRepository.save(address);
            return "Address has been saved!";
        }
        return "there was a error when saving the address";
    }
}
