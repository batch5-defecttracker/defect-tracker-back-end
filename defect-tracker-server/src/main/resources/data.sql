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
--Module
INSERT INTO `defect-tracker`.`module` (`id`, `module_name`, `project_id`) VALUES ('1', 'UI_Project_Add', '1');
INSERT INTO `defect-tracker`.`module` (`id`, `module_name`, `project_id`) VALUES ('2', 'B_UIX_Project', '2');
--SubModule
INSERT INTO `defect-tracker`.`submodule` (`id`, `submodule_name`, `module_id`) VALUES ('1', 'UI_1', '1');
INSERT INTO `defect-tracker`.`submodule` (`id`, `submodule_name`, `module_id`) VALUES ('2', 'UI_X', '2');
--Priority
INSERT INTO `defect-tracker`.`priority` (`id`, `priority_name`) VALUES ('1', 'Low');
INSERT INTO `defect-tracker`.`priority` (`id`, `priority_name`) VALUES ('2', 'Medium');
INSERT INTO `defect-tracker`.`priority` (`id`, `priority_name`) VALUES ('3', 'High');
--Severity
INSERT INTO `defect-tracker`.`severity` (`id`, `severity_name`) VALUES ('1', 'Low');
INSERT INTO `defect-tracker`.`severity` (`id`, `severity_name`) VALUES ('2', 'Medium');
INSERT INTO `defect-tracker`.`severity` (`id`, `severity_name`) VALUES ('3', 'High');
--Defect Status
INSERT INTO `defect-tracker`.`defect_status` (`id`, `defect_status_name`) VALUES ('1', 'Low');
INSERT INTO `defect-tracker`.`defect_status` (`id`, `defect_status_name`) VALUES ('2', 'Medium');
INSERT INTO `defect-tracker`.`defect_status` (`id`, `defect_status_name`) VALUES ('3', 'High');
--Defect Type
INSERT INTO `defect-tracker`.`defecttype` (`id`, `defect_type_name`) VALUES ('1', 'UI');
INSERT INTO `defect-tracker`.`defecttype` (`id`, `defect_type_name`) VALUES ('2', 'CR');