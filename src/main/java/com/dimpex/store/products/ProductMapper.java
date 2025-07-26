package com.dimpex.store.products;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mapping(source = "category.id", target = "categoryId")
    public ProductDto toDto(Product product);
    public Product toEntity(ProductDto productDto);
    @Mapping(target = "id", ignore = true)
    public void update(ProductDto request, @MappingTarget Product product);
}
