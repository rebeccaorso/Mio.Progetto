drop database if exists `Gestione`;

CREATE DATABASE  IF NOT EXISTS `Gestione`;


CREATE TABLE `utente` (
  `utente_id` int NOT NULL AUTO_INCREMENT primary key,
  `nome` varchar(50) not NULL,
  `cognome` varchar(50) not NULL,
  `data_nascita` date not NULL,
  `comune residenza` varchar(40) DEFAULT NULL,
  `genere` varchar(15) NOT NULL,
  `email` varchar(30) not null unique,
  `password` varchar(20) not null
  );
  
  create table `attivita` (
  `attivita_id` int not null auto_increment primary key,
  `nome_attivita` varchar(50) not null,
  `stato` varchar(15),
  `data_creazione`datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `data_scadenza` date,
  `utente_id` int,
  `categoria_id` int
  );
  
  create table `scadenza` (
  `scadenza_id` int not null auto_increment primary key,
  `data_scadenza` date,
  `attivita_id` int not null
  );
  
  create table `categoria` (
  `categoria_id` int not null auto_increment primary key,
  `nome` varchar(20) not null,
  `colore` varchar(15)
  );
  
 alter table attivita
 add CONSTRAINT `fk_attivita_utente` FOREIGN KEY (`utente_id`) REFERENCES `utente` (`utente_id`) ON UPDATE CASCADE,
   add CONSTRAINT `fk_attivita_categoria` FOREIGN KEY (`categoria_id`) REFERENCES `categoria` (`categoria_id`) ON UPDATE CASCADE;
  
  alter table scadenza
  add CONSTRAINT `fk_scadenza_attivita` FOREIGN KEY (`attivita_id`) REFERENCES `attivita` (`attivita_id`) ON UPDATE CASCADE;