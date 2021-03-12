--Designation 
INSERT INTO `defect-tracker`.`designation` (`id`, `designation_name`) VALUES ('1', 'SE');
INSERT INTO `defect-tracker`.`designation` (`id`, `designation_name`) VALUES ('2', 'SSE');
INSERT INTO `defect-tracker`.`designation` (`id`, `designation_name`) VALUES ('3', 'QA');
INSERT INTO `defect-tracker`.`designation` (`id`, `designation_name`) VALUES ('4', 'SQA');
INSERT INTO `defect-tracker`.`designation` (`id`, `designation_name`) VALUES ('5', 'TL');
INSERT INTO `defect-tracker`.`designation` (`id`, `designation_name`) VALUES ('6', 'PM');
--Project
INSERT INTO `defect-tracker`.`project` (`id`, `abbrevation`, `project_name`) VALUES ('1', 'SGIC', 'DefectTrackerSystem');
INSERT INTO `defect-tracker`.`project` (`id`, `abbrevation`, `project_name`) VALUES ('2', 'SGM', 'SuperMix');
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