SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `friends`
-- ----------------------------
DROP TABLE IF EXISTS `friends`;
CREATE TABLE `friends` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) CHARACTER SET latin1 DEFAULT NULL,
  `city` varchar(64) CHARACTER SET latin1 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `friends`
-- ----------------------------
BEGIN;
INSERT INTO `friends` VALUES ('1', 'Mickey Mouse', 'Orlando'), ('2', 'Santa Claus', 'North Pole'), ('3', 'Bono', 'Dublin');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
