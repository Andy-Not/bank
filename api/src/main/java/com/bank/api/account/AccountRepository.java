package com.bank.api.account;

import com.bank.api.address.AddressEntity;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<AddressEntity, Integer> {
}
