package com.asd.addressserviceapi.repo;

import com.asd.addressserviceapi.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository< Address , String > {


}
