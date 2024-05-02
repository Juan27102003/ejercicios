package T9.model.dao;

import T9.model.entities.Coche;

import java.util.List;

public interface CocheDao {
    List<Coche> findAll();
    List<Coche> findByCriteria(String marca,String modelo);
    Coche findById(String matricula);
    Coche save(Coche coche);
    void updateCoche(Coche coche);
    void delete(Coche coche);

}
