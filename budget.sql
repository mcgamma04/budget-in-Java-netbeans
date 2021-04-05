-- phpMyAdmin SQL Dump
-- version 4.1.6
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 18, 2016 at 09:39 AM
-- Server version: 5.6.16
-- PHP Version: 5.5.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `budget`
--

-- --------------------------------------------------------

--
-- Table structure for table `expenditure`
--

CREATE TABLE IF NOT EXISTS `expenditure` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tuition_fees` varchar(80) NOT NULL,
  `sales_form` varchar(80) NOT NULL,
  `development` varchar(80) NOT NULL,
  `cyber_cafe` varchar(80) NOT NULL,
  `hiring_of_classroom` varchar(80) NOT NULL,
  `rent_from_business` varchar(80) NOT NULL,
  `donation_from_ngo` varchar(80) NOT NULL,
  `non_statutory_fee` varchar(80) NOT NULL,
  `comp_training` varchar(80) NOT NULL,
  `fixed_deosit_interest` varchar(80) NOT NULL,
  `postal_charge` varchar(80) NOT NULL,
  `other` varchar(80) NOT NULL,
  `exam_expenses` varchar(80) NOT NULL,
  `staff_salary` varchar(80) NOT NULL,
  `legal_expenses` varchar(80) NOT NULL,
  `screening_expenses` varchar(80) NOT NULL,
  `casual_worker` varchar(80) NOT NULL,
  `comp_consumable` varchar(80) NOT NULL,
  `staff_welfare` varchar(80) NOT NULL,
  `refund_of_sch_fee` varchar(80) NOT NULL,
  `advertisement` varchar(80) NOT NULL,
  `miscellenous` varchar(80) NOT NULL,
  `total_university_income` varchar(80) NOT NULL,
  `total_university_expenditure` varchar(80) NOT NULL,
  `deficient` varchar(80) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `forecast`
--

CREATE TABLE IF NOT EXISTS `forecast` (
  `companyId` int(11) NOT NULL AUTO_INCREMENT,
  `companyName` varchar(56) NOT NULL,
  `business_typeA` varchar(35) NOT NULL,
  `business_typeB` varchar(35) NOT NULL,
  `external_factor1` varchar(80) NOT NULL,
  `external_factor2` varchar(90) NOT NULL,
  `ResultA` varchar(34) NOT NULL,
  `ResultB` varchar(34) NOT NULL,
  `Remarkks` text NOT NULL,
  PRIMARY KEY (`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fullname` varchar(50) NOT NULL,
  `username` varchar(70) NOT NULL,
  `password` varchar(45) NOT NULL,
  `email` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `fullname`, `username`, `password`, `email`) VALUES
(1, 'Adebayo Michael', 'mcgamma04', 'mike', 'mcgamma04@yahoo.com'),
(2, 'Awunufe Festus', 'festus209j', 'festus', 'festus@yahoo.com'),
(3, 'Nlegwu Obinneke', 'obi', 'obi', 'obi@yahoo.com'),
(4, 'mike', 'mike', 'mike', 'mike@yahoo.com'),
(5, 'Akpan James Stella', 'stella@yahoo.com', 'stella', 'Stella@yahoo.com');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
