create table perusahaan(
    id varchar (36),
    kode varchar (100) not null ,
    nama varchar (255) not null,
    primary key (id),
    unique (kode)
) Engine = InnoDB ;