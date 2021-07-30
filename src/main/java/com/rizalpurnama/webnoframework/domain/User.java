package com.rizalpurnama.webnoframework.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String id;
    private String nama;
    private String email;
    private String noHp;
    private String tanggalLahir;
    private String alamat;
    private KotaKabupaten kotaKabupaten;

}
