-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.3.16-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Copiando estrutura do banco de dados para oficinaeletro
DROP DATABASE IF EXISTS `oficinaeletro`;
CREATE DATABASE IF NOT EXISTS `oficinaeletro` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `oficinaeletro`;

-- Copiando estrutura para tabela oficinaeletro.aparelho
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

-- Copiando dados para a tabela oficinaeletro.aparelho: ~6 rows (aproximadamente)
/*!40000 ALTER TABLE `aparelho` DISABLE KEYS */;
INSERT INTO `aparelho` (`idAparelho`, `nomeAparelho`, `marcaAparelho`, `dataGarantia`, `dataRecebimentoAparelho`, `Cliente_idCliente`) VALUES
	(1, 'Panela de Arroz', 'Arno', '2019-01-12', '2019-01-12', 1),
	(2, 'Chapinha', 'Mallory', '2019-11-21', '2019-11-21', 1),
	(3, 'Tanquinho', 'Brastemp', '2019-08-30', '2019-08-30', 2),
	(5, 'Serra circular', 'Makita', '2019-08-30', '2019-08-30', 2),
	(6, 'Aspirador', 'Wallita', '2020-12-03', '2019-12-03', 1),
	(7, 'Acrilex', 'Acrilex', '2020-05-04', '2019-12-04', 3);
/*!40000 ALTER TABLE `aparelho` ENABLE KEYS */;

-- Copiando estrutura para tabela oficinaeletro.cliente
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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela oficinaeletro.cliente: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` (`idCliente`, `nomeCliente`, `telefoneCliente`, `cpfCliente`, `ruaCliente`, `numeroCasaCliente`, `bairroCliente`, `cidadeCliente`, `ufCliente`, `emailCliente`) VALUES
	(1, 'Ceila', '35995684635', '6545646456', 'Rua Jacaré', '69', 'Santa Luzia', 'Machado', 'MG', 'ceila@ceila.com'),
	(2, 'Celso', '35964548798', '8464894646', 'Rua Crocodilo', '24', 'Centro', 'Machado', 'MG', 'celso@celso.com'),
	(3, 'Josi', '35354351546', '8798789786', 'Rua Aligator', '11', 'Santo Antonio', 'Machado', 'MG', 'josi@josi.com');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;

-- Copiando estrutura para tabela oficinaeletro.conserto
CREATE TABLE IF NOT EXISTS `conserto` (
  `idConserto` int(11) NOT NULL AUTO_INCREMENT,
  `precoConserto` float(6,2) DEFAULT NULL,
  `dataConserto` date DEFAULT NULL,
  `Tecnico_idTecnico` int(11) NOT NULL,
  `Aparelho_idAparelho` int(11) NOT NULL,
  PRIMARY KEY (`idConserto`,`Tecnico_idTecnico`,`Aparelho_idAparelho`),
  KEY `fk_Conserto_Tecnico1_idx` (`Tecnico_idTecnico`),
  KEY `fk_Conserto_Aparelho1_idx` (`Aparelho_idAparelho`),
  CONSTRAINT `fk_Conserto_Aparelho1` FOREIGN KEY (`Aparelho_idAparelho`) REFERENCES `aparelho` (`idAparelho`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Conserto_Tecnico1` FOREIGN KEY (`Tecnico_idTecnico`) REFERENCES `tecnico` (`idTecnico`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela oficinaeletro.conserto: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `conserto` DISABLE KEYS */;
INSERT INTO `conserto` (`idConserto`, `precoConserto`, `dataConserto`, `Tecnico_idTecnico`, `Aparelho_idAparelho`) VALUES
	(1, 22.00, '2019-11-21', 2, 2),
	(2, 12.00, '2019-11-21', 2, 2),
	(3, 20.00, '2019-01-12', 2, 1);
/*!40000 ALTER TABLE `conserto` ENABLE KEYS */;

-- Copiando estrutura para tabela oficinaeletro.estoque
CREATE TABLE IF NOT EXISTS `estoque` (
  `idEstoque` int(11) NOT NULL AUTO_INCREMENT,
  `nomePeca` varchar(45) NOT NULL,
  `quantidadePeca` int(11) NOT NULL,
  `valorPeca` float(6,2) NOT NULL,
  PRIMARY KEY (`idEstoque`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela oficinaeletro.estoque: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `estoque` DISABLE KEYS */;
INSERT INTO `estoque` (`idEstoque`, `nomePeca`, `quantidadePeca`, `valorPeca`) VALUES
	(1, 'Chapa aquecedora', 60, 39.00),
	(2, 'Cabo', 59, 12.00),
	(4, 'Elba', 1, 3000.00);
/*!40000 ALTER TABLE `estoque` ENABLE KEYS */;

-- Copiando estrutura para tabela oficinaeletro.pecasconserto
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

-- Copiando dados para a tabela oficinaeletro.pecasconserto: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pecasconserto` DISABLE KEYS */;
/*!40000 ALTER TABLE `pecasconserto` ENABLE KEYS */;

-- Copiando estrutura para tabela oficinaeletro.resumo
CREATE TABLE IF NOT EXISTS `resumo` (
  `idResumo` int(11) NOT NULL AUTO_INCREMENT,
  `Cliente_idCliente` int(11) DEFAULT NULL,
  `Aparelho_idAparelho` int(11) DEFAULT NULL,
  `Venda_idVenda` int(11) DEFAULT NULL,
  PRIMARY KEY (`idResumo`),
  KEY `Cliente_idCliente` (`Cliente_idCliente`),
  KEY `Aparelho_idAparelho` (`Aparelho_idAparelho`),
  KEY `Venda_idVenda` (`Venda_idVenda`),
  CONSTRAINT `resumo_ibfk_1` FOREIGN KEY (`Cliente_idCliente`) REFERENCES `cliente` (`idCliente`),
  CONSTRAINT `resumo_ibfk_2` FOREIGN KEY (`Aparelho_idAparelho`) REFERENCES `aparelho` (`idAparelho`),
  CONSTRAINT `resumo_ibfk_3` FOREIGN KEY (`Venda_idVenda`) REFERENCES `venda` (`idVenda`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela oficinaeletro.resumo: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `resumo` DISABLE KEYS */;
INSERT INTO `resumo` (`idResumo`, `Cliente_idCliente`, `Aparelho_idAparelho`, `Venda_idVenda`) VALUES
	(1, 2, 1, 2);
/*!40000 ALTER TABLE `resumo` ENABLE KEYS */;

-- Copiando estrutura para tabela oficinaeletro.tecnico
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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela oficinaeletro.tecnico: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `tecnico` DISABLE KEYS */;
INSERT INTO `tecnico` (`idTecnico`, `nomeTecnico`, `cpfTecnico`, `rgTecnico`, `especialidadeTecnico`, `salarioTecnico`, `carteiraTrabalho`, `ruaTecnico`, `numeroCasaTecnico`, `bairroTecnico`, `cidadeTecnico`, `ufTecnico`, `emailTecnico`, `telefoneTecnico`) VALUES
	(2, 'Celso', '4212313213', '6546546546', 'Mecânico', 900.00, '654564564654', 'Rua Carne de Frango', '2424', 'Santa Luzia', 'Machado', 'MG', NULL, NULL),
	(3, 'Josi', '2123123121', '3513131233', 'Eletrico', 1800.00, '654654654654', 'Rua Carne de boi', '1111', 'Santo Antonio', 'Machado', 'MG', NULL, NULL);
/*!40000 ALTER TABLE `tecnico` ENABLE KEYS */;

-- Copiando estrutura para tabela oficinaeletro.venda
CREATE TABLE IF NOT EXISTS `venda` (
  `idVenda` int(11) NOT NULL AUTO_INCREMENT,
  `Cliente_idCliente` int(11) DEFAULT NULL,
  `dataVenda` date NOT NULL,
  PRIMARY KEY (`idVenda`),
  KEY `idCliente` (`Cliente_idCliente`),
  CONSTRAINT `venda_ibfk_1` FOREIGN KEY (`Cliente_idCliente`) REFERENCES `cliente` (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela oficinaeletro.venda: ~4 rows (aproximadamente)
/*!40000 ALTER TABLE `venda` DISABLE KEYS */;
INSERT INTO `venda` (`idVenda`, `Cliente_idCliente`, `dataVenda`) VALUES
	(2, 2, '2019-12-03'),
	(3, 2, '2019-12-05'),
	(4, 1, '2019-12-05'),
	(5, 1, '2019-12-12');
/*!40000 ALTER TABLE `venda` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
