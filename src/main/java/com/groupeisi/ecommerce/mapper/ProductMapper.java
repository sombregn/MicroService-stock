package com.groupeisi.ecommerce.mapper;

import com.groupeisi.ecommerce.dto.ProductDto;
import com.groupeisi.ecommerce.entities.ProductEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ProductMapper {
    ProductEntity toProductEntity(ProductDto productDto) ;
    ProductDto toProductDto(ProductEntity productEntity) ;
}
