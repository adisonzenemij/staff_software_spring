package com.apps.staff_software_spring.persistence.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.apps.staff_software_spring.persistence.audit.TgRoleDataListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tg_role_data")
@EntityListeners({AuditingEntityListener.class, TgRoleDataListener.class})
@Getter
@Setter
@NoArgsConstructor
public class TgRoleDataEntity extends AudiTableEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_register", nullable = true)
    private Integer idRegister;

    @Column(name = "az_created_at", nullable = false, columnDefinition = "DATETIME")
    private LocalDateTime azCreatedAt;

    @Column(name = "az_update_at", nullable = false, columnDefinition = "DATETIME")
    private LocalDateTime azUpdatedAt;

    @Column(name = "cd_name", nullable = false, length = 255, unique = false)
    private String cdName;

    //@OneToMany(mappedBy = "tgRoleData")
    //private List<TgUserDataEntity> tgUserData;


    @Override
    public String toString() {
        return "TgRoleDataEntity{" +
                "idRegister=" + idRegister +
                ", azCreatedAt=" + azCreatedAt +
                ", azUpdatedAt=" + azUpdatedAt +
                ", cdName='" + cdName + '\'' +
                '}';
    }
}