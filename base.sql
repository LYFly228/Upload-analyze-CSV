ALTER TABLE `guoke-deepexi-product-center`.`pc_association_certificate` ADD COLUMN `tenant_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '租户号' AFTER `id`;

ALTER TABLE `guoke-deepexi-product-center`.`pc_association_certificate` ADD COLUMN `created_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '创建人' AFTER `tenant_id`;

ALTER TABLE `guoke-deepexi-product-center`.`pc_association_certificate` ADD COLUMN `creator_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '创建人id' AFTER `created_by`;

ALTER TABLE `guoke-deepexi-product-center`.`pc_association_certificate` ADD COLUMN `created_at` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' AFTER `creator_id`;

ALTER TABLE `guoke-deepexi-product-center`.`pc_association_certificate` ADD COLUMN `updated_by` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT 'updatedBy' AFTER `created_at`;

ALTER TABLE `guoke-deepexi-product-center`.`pc_association_certificate` ADD COLUMN `modifier_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '修改人id' AFTER `updated_by`;

ALTER TABLE `guoke-deepexi-product-center`.`pc_association_certificate` ADD COLUMN `updated_at` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'updatedAt' AFTER `modifier_id`;

ALTER TABLE `guoke-deepexi-product-center`.`pc_association_certificate` ADD COLUMN `dr` tinyint(1) NULL DEFAULT 0 COMMENT '删除标记  0 --存在   1 --已删除' AFTER `updated_at`;