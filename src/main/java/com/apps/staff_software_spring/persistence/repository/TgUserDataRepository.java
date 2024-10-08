package com.apps.staff_software_spring.persistence.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.repository.ListCrudRepository;

import com.apps.staff_software_spring.persistence.entity.TgUserDataEntity;

public interface TgUserDataRepository extends ListCrudRepository<TgUserDataEntity, Integer> {
    // Ordenar por la columna idRegister
    List<TgUserDataEntity> findAllByOrderByIdRegister();

    // Buscar por la columna idRegister
    List<TgUserDataEntity> findAllByIdRegister(Integer idRegister);



    // Ordenar por la columna cdEmail
    List<TgUserDataEntity> findAllByOrderByCdEmail();

    // Buscar por la columna cdEmail
    List<TgUserDataEntity> findAllByCdEmailIgnoreCase(String cdEmail);

    // Buscar por la columna cdEmail ignorando mayusculas y minusculas
    List<TgUserDataEntity> findAllByCdEmailContainingIgnoreCase(String cdEmail);

    // Limitar la busqueda de registros por cdEmail
    TgUserDataEntity findFirstByCdEmail(String cdEmail);



    // Ordenar por la columna cdLogin
    List<TgUserDataEntity> findAllByOrderByCdLogin();

    // Buscar por la columna cdLogin
    List<TgUserDataEntity> findAllByCdLoginIgnoreCase(String cdLogin);

    // Buscar por la columna cdLogin ignorando mayusculas y minusculas
    List<TgUserDataEntity> findAllByCdLoginContainingIgnoreCase(String cdLogin);

    // Limitar la busqueda de registros por cdLogin
    TgUserDataEntity findFirstByCdLogin(String cdLogin);



    // Ordenar por la columna cdPassword
    List<TgUserDataEntity> findAllByOrderByCdPassword();

    // Buscar por la columna cdPassword
    List<TgUserDataEntity> findAllByCdPasswordIgnoreCase(String cdPassword);

    // Buscar por la columna cdPassword ignorando mayusculas y minusculas
    List<TgUserDataEntity> findAllByCdPasswordContainingIgnoreCase(String cdPassword);

    // Limitar la busqueda de registros por cdPassword
    TgUserDataEntity findFirstByCdPassword(String cdPassword);



    // Ordenar por la columna tgRoleData
    List<TgUserDataEntity> findAllByOrderByTgRoleData();

    // Buscar por la columna tgRoleData
    List<TgUserDataEntity> findAllByTgRoleData_IdRegister(Integer tgRoleData);



    // Buscar por fecha de creacion antes
    List<TgUserDataEntity> findAllByAdCreatedDateAfter(LocalDateTime adCreatedDate);

    // Buscar por fecha de creacion antes
    List<TgUserDataEntity> findAllByAdModifiedDateAfter(LocalDateTime adModifiedDate);
}
