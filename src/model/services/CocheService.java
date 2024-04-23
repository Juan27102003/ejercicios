package model.services;

import model.entities.Coche;

import java.util.List;

public interface CocheService {
    List<Coche> findAll();
    List<Coche> findByCriteria(String marca,String modelo);
    Coche findById(String matricula);
    Coche save(Coche coche);
    void updateCoche(Coche coche);
    void delete(Coche coche);
}
