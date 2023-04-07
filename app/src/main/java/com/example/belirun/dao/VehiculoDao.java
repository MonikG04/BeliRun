package com.example.belirun.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.belirun.entidad.Vehiculo;

import java.util.List;

@Dao
public interface VehiculoDao {
    @Insert
    void insertAll(Vehiculo... vehiculo);

    @Update
    void updateAll(Vehiculo... vehiculo);

    @Query("UPDATE Vehiculo SET isDelete=1 WHERE vehiculoId=:id")
    void delete(int id);

    @Query("SELECT * FROM Vehiculo")
    List<Vehiculo> getAllVehiculos();
}