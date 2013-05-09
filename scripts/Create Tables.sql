-----------------------------------------------------------------------
-- TABELA ESTADO 
-----------------------------------------------------------------------
create table "Estado"
(
  "EstadoID" integer not null,
  "IBGE" character(2) not null,
  "Sigla" character(2) not null,
  "Descricao" character(30) not null,    
  constraint "EstadoPK" primary key ("EstadoID" )
);
-----------------------------------------------------------------------

-----------------------------------------------------------------------
-- TABELA MUNICIPIO
-----------------------------------------------------------------------
create table "Municipio"
(
  "MunicipioID" integer not null,
  "IBGE" character(7) not null,
  "Descricao" character(50) not null, 
  "EstadoID" integer not null, 
  constraint "MunicipioPK" primary key ("MunicipioID" ),
  constraint "MunicipioEstadoFK" foreign key ("EstadoID") references "Estado" ("EstadoID") match simple on update no action on delete cascade
);
-----------------------------------------------------------------------
