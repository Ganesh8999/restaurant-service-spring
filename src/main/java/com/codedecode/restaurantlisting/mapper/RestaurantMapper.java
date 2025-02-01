package com.codedecode.restaurantlisting.mapper;

import com.codedecode.restaurantlisting.entity.Restaurant;
import com.codedecode.restaurantlisting.dto.RestaurantDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RestaurantMapper {
    Restaurant mapRestaurantDTOToRestaurant(RestaurantDTO restaurantDTO);
    RestaurantDTO mapRestaurantToRestaurantDTO(Restaurant restaurant);

}
