--insert into LEGAL_ENTITY (REG_CODE, NAME) values ('41202013815','IK');
--insert into LEGAL_ENTITY (REG_CODE, NAME) values ('40008223126','NEW LATVIAN BALLET');
insert into LEGAL_ENTITY(REG_CODE,SEPA,NAME,NAME_BEFORE_QUOTES,NAME_IN_QUOTES,NAME_AFTER_QUOTES,WITHOUT_QUOTES,REG_TYPE,REGTYPE_TEXT,TYPE,
                         TYPE_TEXT,REGISTERED,TERMINATED,CLOSED,ADDRESS,INDEX,ADDRESS_ID,REGION,CITY,ATVK,REGISTRATION_TERM) select * from CSVREAD('classpath:/register_short_comma.csv');
insert into BENEFICIAL_OWNER(ID,LEGAL_ENTITY_REGISTRATION_NUMBER,FORENAME,SURNAME,LATVIAN_IDENTITY_NUMBER,
BIRTHDATE,NATIONALITY,RESIDENCE,REGISTERED_ON,LAST_MODIFIED_AT) select * from CSVREAD('classpath:/beneficial_owners_short_comma.csv');
--create table BENEFICIAL_OWNER as select * from CSVREAD('classpath:/beneficial_owners_short_comma.csv')

--id,legal_entity_registration_number,
--forename,surname,latvian_identity_number_masked,birth_date,nationality,residence,registered_on,last_modified_at



--insert into BENEFICIAL_OWNER  (ID,NAME , LEGAL_ENTITY_REG_CODE) values (1, 'Elchin' ,'40008223126');
--insert into BENEFICIAL_OWNER  (ID,NAME , LEGAL_ENTITY_REG_CODE) values (2, 'Zafar' ,'40008223126');


