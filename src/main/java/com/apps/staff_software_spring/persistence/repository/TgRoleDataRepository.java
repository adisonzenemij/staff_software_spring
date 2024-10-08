package com.apps.staff_software_spring.persistence.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.repository.ListCrudRepository;

import com.apps.staff_software_spring.persistence.entity.TgRoleDataEntity;

public interface TgRoleDataRepository extends ListCrudRepository<TgRoleDataEntity, Integer> {
    // Ordenar por la columna idRegister
    List<TgRoleDataEntity> findAllByOrderByIdRegister();

    // Buscar por la columna idRegister
    List<TgRoleDataEntity> findAllByIdRegister(Integer idRegister);



    // Ordenar por la columna cdName
    List<TgRoleDataEntity> findAllByOrderByCdName();

    // Buscar por la columna cdName
    List<TgRoleDataEntity> findAllByCdNameIgnoreCase(String cdName);

    // Buscar por la columna cdName ignorando mayusculas y minusculas
    List<TgRoleDataEntity> findAllByCdNameContainingIgnoreCase(String cdName);

    // Limitar la busqueda de registros por cdName
    TgRoleDataEntity findFirstByCdName(String cdName);



    // Ordenar por la columna tgRoleGroup
    List<TgRoleDataEntity> findAllByOrderByTgRoleGroup();

    // Buscar por la columna tgRoleGroup
    List<TgRoleDataEntity> findAllByTgRoleGroup_IdRegister(Integer tgRoleGroup);



    // Buscar por fecha de creacion antes
    List<TgRoleDataEntity> findAllByAdCreatedDateAfter(LocalDateTime adCreatedDate);

    // Buscar por fecha de creacion antes
    List<TgRoleDataEntity> findAllByAdModifiedDateAfter(LocalDateTime adModifiedDate);
}
