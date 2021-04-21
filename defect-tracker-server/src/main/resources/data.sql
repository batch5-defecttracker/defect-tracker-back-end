--Designation 
INSERT INTO `defect-tracker`.`designation` (`id`, `designation_name`) VALUES ('1', 'SE');
INSERT INTO `defect-tracker`.`designation` (`id`, `designation_name`) VALUES ('2', 'SSE');
INSERT INTO `defect-tracker`.`designation` (`id`, `designation_name`) VALUES ('3', 'QA');
INSERT INTO `defect-tracker`.`designation` (`id`, `designation_name`) VALUES ('4', 'SQA');
INSERT INTO `defect-tracker`.`designation` (`id`, `designation_name`) VALUES ('5', 'TL');
INSERT INTO `defect-tracker`.`designation` (`id`, `designation_name`) VALUES ('6', 'PM');
--Employee
INSERT INTO `defect-tracker`.`employee` (`id`, `address`, `contact_number`, `email`, `first_name`, `gender`, `image`, `last_name`, `nic`, `time_stamp`, `designation_id`) VALUES ('1', 'Vavuniya', '077123456', 'email@gmail.com', 'Thanuraj', 'male', 'file1', 'Sivakumar', '953031417V', '2021-02-03 00:00:00', '1');
INSERT INTO `defect-tracker`.`employee` (`id`, `address`, `contact_number`, `email`, `first_name`, `gender`, `image`, `last_name`, `nic`, `time_stamp`, `designation_id`) VALUES ('2', 'Colombo', '011', 'c@gmail.com', 'Thanu', 'male', 'file1', 'Raj', '953031417V', '2021-02-03 00:00:00', '2');
INSERT INTO `defect-tracker`.`employee` (`id`, `address`, `contact_number`, `email`, `first_name`, `gender`, `image`, `last_name`, `nic`, `time_stamp`, `designation_id`) VALUES ('3', 'Jaffna', '021', 'j@gmail.com', 'John', 'male', 'file1', 'Wick', '953031417V', '2021-02-03 00:00:00', '3');
INSERT INTO `defect-tracker`.`employee` (`id`, `address`, `contact_number`, `email`, `first_name`, `gender`, `image`, `last_name`, `nic`, `time_stamp`, `designation_id`) VALUES ('4', 'Mannar', '022', 'm@gmail.com', 'Abraham', 'male', 'file1', 'Wanda', '953031417V', '2021-02-03 00:00:00', '4');
INSERT INTO `defect-tracker`.`employee` (`id`, `address`, `contact_number`, `email`, `first_name`, `gender`, `image`, `last_name`, `nic`, `time_stamp`, `designation_id`) VALUES ('5', 'kilinochi', '021', 'k@gmail.com', 'Ann', 'female', 'file1', 'Liza', '953031417V', '2021-02-03 00:00:00', '5');
INSERT INTO `defect-tracker`.`employee` (`id`, `address`, `contact_number`, `email`, `first_name`, `gender`, `image`, `last_name`, `nic`, `time_stamp`, `designation_id`) VALUES ('6', 'anuradhpura', '025', 'a@gmail.com', 'Liza', 'female', 'file1', 'Ann', '953031417V', '2021-02-03 00:00:00', '6');
INSERT INTO `defect-tracker`.`employee` (`id`, `address`, `contact_number`, `email`, `first_name`, `gender`, `image`, `last_name`, `nic`, `time_stamp`, `designation_id`) VALUES ('7', 'galle', '029', 'g@gmail.com', 'Stark', 'male', 'file1', 'Tony', '953031417V', '2021-02-03 00:00:00', '1');
--Priority
INSERT INTO `defect-tracker`.`priority` (`id`, `priority_name`) VALUES ('1', 'Low');
INSERT INTO `defect-tracker`.`priority` (`id`, `priority_name`) VALUES ('2', 'Medium');
INSERT INTO `defect-tracker`.`priority` (`id`, `priority_name`) VALUES ('3', 'High');
--Severity
INSERT INTO `defect-tracker`.`severity` (`id`, `severity_name`) VALUES ('1', 'Low');
INSERT INTO `defect-tracker`.`severity` (`id`, `severity_name`) VALUES ('2', 'Medium');
INSERT INTO `defect-tracker`.`severity` (`id`, `severity_name`) VALUES ('3', 'High');
--Defect Status
INSERT INTO `defect-tracker`.`defect_status` (`id`, `defect_status_name`) VALUES ('1', 'Open');
INSERT INTO `defect-tracker`.`defect_status` (`id`, `defect_status_name`) VALUES ('2', 'Closed');
INSERT INTO `defect-tracker`.`defect_status` (`id`, `defect_status_name`) VALUES ('3', 'Fixed');
INSERT INTO `defect-tracker`.`defect_status` (`id`, `defect_status_name`) VALUES ('4', 'Reopen');
INSERT INTO `defect-tracker`.`defect_status` (`id`, `defect_status_name`) VALUES ('5', 'Reject');
--Defect Type
INSERT INTO `defect-tracker`.`defecttype` (`id`, `defect_type_name`) VALUES ('1', 'UI');
INSERT INTO `defect-tracker`.`defecttype` (`id`, `defect_type_name`) VALUES ('2', 'CR');