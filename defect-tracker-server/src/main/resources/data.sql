--Designation 
INSERT INTO `defect-tracker`.`designation` (`id`, `designation_name`) VALUES ('1', 'Associate Software Engineer');
INSERT INTO `defect-tracker`.`designation` (`id`, `designation_name`) VALUES ('1', 'Software Engineer');
INSERT INTO `defect-tracker`.`designation` (`id`, `designation_name`) VALUES ('2', 'Senoir Software Engineer');
INSERT INTO `defect-tracker`.`designation` (`id`, `designation_name`) VALUES ('5', 'Associate Technical Lead');
INSERT INTO `defect-tracker`.`designation` (`id`, `designation_name`) VALUES ('5', 'Technical Lead');
INSERT INTO `defect-tracker`.`designation` (`id`, `designation_name`) VALUES ('3', 'Associate Quality Assurance Engineer');
INSERT INTO `defect-tracker`.`designation` (`id`, `designation_name`) VALUES ('3', 'Quality Assurance Engineer');
INSERT INTO `defect-tracker`.`designation` (`id`, `designation_name`) VALUES ('4', 'Senior Quality Assurance Engineer');
INSERT INTO `defect-tracker`.`designation` (`id`, `designation_name`) VALUES ('6', 'Project Manager');
--Priority
INSERT INTO `defect-tracker`.`priority` (`id`, `priority_name`) VALUES ('1', 'Low');
INSERT INTO `defect-tracker`.`priority` (`id`, `priority_name`) VALUES ('2', 'Medium');
INSERT INTO `defect-tracker`.`priority` (`id`, `priority_name`) VALUES ('3', 'High');
--Severity
INSERT INTO `defect-tracker`.`severity` (`id`, `severity_name`) VALUES ('1', 'Low');
INSERT INTO `defect-tracker`.`severity` (`id`, `severity_name`) VALUES ('2', 'Medium');
INSERT INTO `defect-tracker`.`severity` (`id`, `severity_name`) VALUES ('3', 'High');
--Defect Status
INSERT INTO `defect-tracker`.`defect_status` (`id`, `defect_status_name`) VALUES ('1', 'New');
INSERT INTO `defect-tracker`.`defect_status` (`id`, `defect_status_name`) VALUES ('2', 'Open');
INSERT INTO `defect-tracker`.`defect_status` (`id`, `defect_status_name`) VALUES ('3', 'Closed');
INSERT INTO `defect-tracker`.`defect_status` (`id`, `defect_status_name`) VALUES ('4', 'Fixed');
INSERT INTO `defect-tracker`.`defect_status` (`id`, `defect_status_name`) VALUES ('5', 'Reopen');
INSERT INTO `defect-tracker`.`defect_status` (`id`, `defect_status_name`) VALUES ('6', 'Reject');
--Defect Type
INSERT INTO `defect-tracker`.`defecttype` (`id`, `defect_type_name`) VALUES ('1', 'UI');
INSERT INTO `defect-tracker`.`defecttype` (`id`, `defect_type_name`) VALUES ('2', 'CR');