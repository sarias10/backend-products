package com.sergio.curso.springboot.backend.backend_products.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sergio.curso.springboot.backend.backend_products.entities.Product;

// implementa un patron especial HateOas asi que la respuesta json tiene varios atributos que no nos importan
// ayuda a crear endpoints rapidos sin mucha logica detras
// es un rest controller CRUD pero implementado de forma automatica
// cuando invoquemos la ruta products con GET va a llamar al metodo findAll()
// si pasamos el GET con un ID, va a llamar findById()
// si pasamos un POST a secas va a llamar un save()
// si pasamos un PUT va a llamar un save() pero para modificar
// si pasamos un DELETE va a eliminar
@RepositoryRestResource(path = "products")
public interface ProductRepository extends CrudRepository<Product, Long> {
 
}
