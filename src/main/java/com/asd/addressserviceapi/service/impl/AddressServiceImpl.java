package com.asd.addressserviceapi.service.impl;

import com.asd.addressserviceapi.dto.request.AddressRequestDto;
import com.asd.addressserviceapi.dto.response.AddressResponseDto;
import com.asd.addressserviceapi.entity.Address;
import com.asd.addressserviceapi.repo.AddressRepo;
import com.asd.addressserviceapi.service.AddressService;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepo addressRepo;

    public AddressServiceImpl(AddressRepo addressRepo) {
        this.addressRepo = addressRepo;
    }

    @Override
    public void saveAddress(AddressRequestDto dto) {

        addressRepo.save( new Address( dto.getId(), dto.getCountry(), dto.getCity() ) );

    }

    @Override
    public AddressResponseDto findAddress(String id) {

        var selectedAddress = addressRepo.findById( id );

            if ( selectedAddress.isEmpty() ) {
                throw  new RuntimeException( "Not Found" );
            }
        return new AddressResponseDto(
                selectedAddress.get().getId(),
                selectedAddress.get().getCountry(),
                selectedAddress.get().getCity()
        );
    }
}
