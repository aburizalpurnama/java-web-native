package com.rizalpurnama.webnoframework.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KotaKabupaten {
    private String id;
    private String kode;
    private String nama;
    private Provinsi provinsi;
}
