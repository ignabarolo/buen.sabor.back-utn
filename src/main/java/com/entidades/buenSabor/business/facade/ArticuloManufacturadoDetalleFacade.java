package com.entidades.buenSabor.business.facade;

import com.entidades.buenSabor.business.facade.Base.BaseFacade;
import com.entidades.buenSabor.domain.dto.ArticuloManufacturadoDetalle.ArticuloManufacturadoDetalleCreateDto;
import com.entidades.buenSabor.domain.dto.ArticuloManufacturadoDetalle.ArticuloManufacturadoDetalleDto;
import com.entidades.buenSabor.domain.dto.ArticuloManufacturadoDetalle.ArticuloManufacturadoDetalleEditDto;

public interface ArticuloManufacturadoDetalleFacade extends BaseFacade<ArticuloManufacturadoDetalleDto, ArticuloManufacturadoDetalleCreateDto, ArticuloManufacturadoDetalleEditDto, Long> {
}
