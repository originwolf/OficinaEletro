-- --------------------------------------------------------
-- Anfitrião:                    127.0.0.1
-- Versão do servidor:           5.7.19 - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Versão:              9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for oficinaeletro
CREATE DATABASE IF NOT EXISTS `oficinaeletro` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `oficinaeletro`;oficinaeletroestoque

-- Dumping structure for table oficinaeletro.aparelho
CREATE TABLE IF NOT EXISTS `aparelho` (
  `idAparelho` int(11) NOT NULL AUTO_INCREMENT,
  `nomeAparelho` varchar(45) NOT NULL,
  `marcaAparelho` varchar(45) DEFAULT NULL,
  `dataGarantia` date DEFAULT NULL,
  `dataRecebimentoAparelho` date NOT NULL,
  `Cliente_idCliente` int(11) NOT NULL,
  PRIMARY KEY (`idAparelho`,`Cliente_idCliente`),
  KEY `fk_Aparelho_Cliente1_idx` (`Cliente_idCliente`),
  CONSTRAINT `fk_Aparelho_Cliente1` FOREIGN KEY (`Cliente_idCliente`) REFERENCES `cliente` (`idCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- Dumping data for table oficinaeletro.aparelho: ~5 rows (approximately)
/*!40000 ALTER TABLE `aparelho` DISABLE KEYS */;
INSERT INTO `aparelho` (`idAparelho`, `nomeAparelho`, `marcaAparelho`, `dataGarantia`, `dataRecebimentoAparelho`, `Cliente_idCliente`) VALUES
	(1, 'AirFryer', 'Arno', '2018-06-14', '2018-06-14', 1),
	(2, 'Ferro Elétrico', 'Arno', '2019-08-30', '2018-06-13', 1),
	(3, 'Enceradeira', 'Mondial', '2019-08-30', '2018-06-16', 2),
	(5, 'Ferro elétrico', 'Arno', '2019-08-30', '2018-06-18', 2),
	(6, 'Aspirador', 'Arno', '2019-08-30', '2018-06-18', 3),
	(7, 'Churrasqueira Elétrica', 'Mondial', '0002-11-30', '2018-06-18', 4);
/*!40000 ALTER TABLE `aparelho` ENABLE KEYS */;

-- Dumping structure for table oficinaeletro.cliente
CREATE TABLE IF NOT EXISTS `cliente` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `nomeCliente` varchar(100) NOT NULL,
  `telefoneCliente` varchar(15) DEFAULT NULL,
  `cpfCliente` varchar(15) DEFAULT NULL,
  `ruaCliente` varchar(100) DEFAULT NULL,
  `numeroCasaCliente` varchar(5) DEFAULT NULL,
  `bairroCliente` varchar(45) DEFAULT 'Centro',
  `cidadeCliente` varchar(45) DEFAULT 'Machado',
  `ufCliente` varchar(45) DEFAULT 'MG',
  `emailCliente` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Dumping data for table oficinaeletro.cliente: ~3 rows (approximately)
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` (`idCliente`, `nomeCliente`, `telefoneCliente`, `cpfCliente`, `ruaCliente`, `numeroCasaCliente`, `bairroCliente`, `cidadeCliente`, `ufCliente`, `emailCliente`) VALUES
	(1, 'Pedro', '35998563930', '1234567891', 'Rua 1', '320', 'Bairro 1', 'Machado', 'MG', 'teste@teste.com'),
	(2, 'Luiza', '21965894569', '9876543219', 'Rua 2', '1010', 'Centro', 'Rio de Janeiro', 'SP', 'luiza@luiza.com'),
	(3, 'Leticia', '35989452465', '2345678912', 'Rua 4', '56', 'Centro', 'Machado', 'MG', 'aff@aff.com'),
	(4, 'Yuri', '35998988989', '7654321987', 'Rua Jardim', '429', 'Centro', 'Três Pontas', 'MG', 'yuri@yuri.com');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;

-- Dumping structure for table oficinaeletro.conserto
CREATE TABLE IF NOT EXISTS `conserto` (
  `idConserto` int(11) NOT NULL AUTO_INCREMENT,
  `precoConserto` float(6,2) DEFAULT NULL,
  `descricaoDefeito` varchar(100) NOT NULL,
  `consertoRealizado` varchar(100) NOT NULL,
  `dataConserto` date DEFAULT NULL,
  `Tecnico_idTecnico` int(11) NOT NULL,
  `Aparelho_idAparelho` int(11) NOT NULL,
  PRIMARY KEY (`idConserto`,`Tecnico_idTecnico`,`Aparelho_idAparelho`),
  KEY `fk_Conserto_Tecnico1_idx` (`Tecnico_idTecnico`),
  KEY `fk_Conserto_Aparelho1_idx` (`Aparelho_idAparelho`),
  CONSTRAINT `fk_Conserto_Aparelho1` FOREIGN KEY (`Aparelho_idAparelho`) REFERENCES `aparelho` (`idAparelho`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Conserto_Tecnico1` FOREIGN KEY (`Tecnico_idTecnico`) REFERENCES `tecnico` (`idTecnico`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Dumping data for table oficinaeletro.conserto: ~2 rows (approximately)
/*!40000 ALTER TABLE `conserto` DISABLE KEYS */;
INSERT INTO `conserto` (`idConserto`, `precoConserto`, `descricaoDefeito`, `consertoRealizado`, `dataConserto`, `Tecnico_idTecnico`, `Aparelho_idAparelho`) VALUES
	(1, 15.00, 'Cabo partido', 'Troca do cabo', '2018-06-16', 2, 2),
	(2, 15.00, 'Cabo partido', 'Troca do cabo', '2018-06-16', 2, 2),
	(3, 20.00, 'Resistencia queimada', 'Troca da resistencia', '2018-06-14', 2, 1);
/*!40000 ALTER TABLE `conserto` ENABLE KEYS */;

-- Dumping structure for table oficinaeletro.estoque
CREATE TABLE IF NOT EXISTS `estoque` (
  `idEstoque` int(11) NOT NULL AUTO_INCREMENT,
  `nomePeca` varchar(45) NOT NULL,
  `quantidadePeca` int(11) NOT NULL,
  `valorPeca` float(6,2) NOT NULL,
  PRIMARY KEY (`idEstoque`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Dumping data for table oficinaeletro.estoque: ~0 rows (approximately)
/*!40000 ALTER TABLE `estoque` DISABLE KEYS */;
INSERT INTO `estoque` (`idEstoque`, `nomePeca`, `quantidadePeca`, `valorPeca`) VALUES
	(1, 'Cabo elétrico', 60, 15.00),
	(2, 'Termostato', 59, 35.00);
/*!40000 ALTER TABLE `estoque` ENABLE KEYS */;

-- Dumping structure for table oficinaeletro.pecasconserto
CREATE TABLE IF NOT EXISTS `pecasconserto` (
  `Conserto_idConserto` int(11) NOT NULL,
  `Estoque_idEstoque` int(11) NOT NULL,
  `pecasUtilizadas` int(11) DEFAULT NULL,
  PRIMARY KEY (`Conserto_idConserto`,`Estoque_idEstoque`),
  KEY `fk_Conserto_has_Estoque_Estoque1_idx` (`Estoque_idEstoque`),
  KEY `fk_Conserto_has_Estoque_Conserto1_idx` (`Conserto_idConserto`),
  CONSTRAINT `fk_Conserto_has_Estoque_Conserto1` FOREIGN KEY (`Conserto_idConserto`) REFERENCES `conserto` (`idConserto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Conserto_has_Estoque_Estoque1` FOREIGN KEY (`Estoque_idEstoque`) REFERENCES `estoque` (`idEstoque`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table oficinaeletro.pecasconserto: ~0 rows (approximately)
/*!40000 ALTER TABLE `pecasconserto` DISABLE KEYS */;
/*!40000 ALTER TABLE `pecasconserto` ENABLE KEYS */;

-- Dumping structure for table oficinaeletro.tecnico
CREATE TABLE IF NOT EXISTS `tecnico` (
  `idTecnico` int(11) NOT NULL AUTO_INCREMENT,
  `nomeTecnico` varchar(100) NOT NULL,
  `cpfTecnico` varchar(15) NOT NULL,
  `rgTecnico` varchar(15) NOT NULL,
  `especialidadeTecnico` varchar(45) NOT NULL,
  `salarioTecnico` float(6,2) DEFAULT NULL,
  `carteiraTrabalho` varchar(45) DEFAULT NULL,
  `ruaTecnico` varchar(100) DEFAULT NULL,
  `numeroCasaTecnico` varchar(5) DEFAULT NULL,
  `bairroTecnico` varchar(45) DEFAULT 'Centro',
  `cidadeTecnico` varchar(45) DEFAULT 'Machado',
  `ufTecnico` char(2) DEFAULT 'MG',
  `emailTecnico` varchar(100) DEFAULT NULL,
  `telefoneTecnico` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idTecnico`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Dumping data for table oficinaeletro.tecnico: ~2 rows (approximately)
/*!40000 ALTER TABLE `tecnico` DISABLE KEYS */;
INSERT INTO `tecnico` (`idTecnico`, `nomeTecnico`, `cpfTecnico`, `rgTecnico`, `especialidadeTecnico`, `salarioTecnico`, `carteiraTrabalho`, `ruaTecnico`, `numeroCasaTecnico`, `bairroTecnico`, `cidadeTecnico`, `ufTecnico`, `emailTecnico`, `telefoneTecnico`) VALUES
	(1, 'Rodrigo', '1234567898', '9876543212', 'Eletrônico', 2500.00, '123456123456', 'Rua 1', '206', 'Medicina', 'Itajubá', 'MG', 'kiko@kiko.com', '35998654570'),
	(2, 'Pedro', '1234567891', '9876543219', 'Mecânico', 900.00, '654321654321', 'Rua 1', '320', 'Avenida', 'Itajubá', 'MG', NULL, NULL);
/*!40000 ALTER TABLE `tecnico` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
