package T9.model.services;

import T9.model.entities.Coche;

import java.util.List;

public interface CocheService {
    List<Coche> findAll();
    List<Coche> findByCriteria(String marca,String modelo);
    Coche findById(String matricula);
    Coche save(Coche coche);
    void updateCoche(Coche coche);
    void delete(Coche coche);
}
